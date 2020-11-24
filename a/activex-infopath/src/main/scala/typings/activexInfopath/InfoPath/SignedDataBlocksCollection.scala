package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedDataBlocksCollection extends js.Object {
  
  val Count: Double = js.native
  
  @JSName("InfoPath.SignedDataBlocksCollection_typekey")
  var InfoPathDotSignedDataBlocksCollection_typekey: SignedDataBlocksCollection = js.native
  
  def Item(varIndex: js.Any): SignedDataBlockObject = js.native
}
object SignedDataBlocksCollection {
  
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotSignedDataBlocksCollection_typekey: SignedDataBlocksCollection,
    Item: js.Any => SignedDataBlockObject
  ): SignedDataBlocksCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.SignedDataBlocksCollection_typekey")(InfoPathDotSignedDataBlocksCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedDataBlocksCollection]
  }
  
  @scala.inline
  implicit class SignedDataBlocksCollectionOps[Self <: SignedDataBlocksCollection] (val x: Self) extends AnyVal {
    
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
    def setInfoPathDotSignedDataBlocksCollection_typekey(value: SignedDataBlocksCollection): Self = this.set("InfoPath.SignedDataBlocksCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => SignedDataBlockObject): Self = this.set("Item", js.Any.fromFunction1(value))
  }
}
