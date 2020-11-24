package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureLinesCollection extends js.Object {
  
  val Count: Double = js.native
  
  @JSName("InfoPath.SignatureLinesCollection_typekey")
  var InfoPathDotSignatureLinesCollection_typekey: SignatureLinesCollection = js.native
  
  def Item(varIndex: js.Any): SignatureLineObject = js.native
}
object SignatureLinesCollection {
  
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotSignatureLinesCollection_typekey: SignatureLinesCollection,
    Item: js.Any => SignatureLineObject
  ): SignatureLinesCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.SignatureLinesCollection_typekey")(InfoPathDotSignatureLinesCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureLinesCollection]
  }
  
  @scala.inline
  implicit class SignatureLinesCollectionOps[Self <: SignatureLinesCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotSignatureLinesCollection_typekey(value: SignatureLinesCollection): Self = this.set("InfoPath.SignatureLinesCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => SignatureLineObject): Self = this.set("Item", js.Any.fromFunction1(value))
  }
}
