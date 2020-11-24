package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputParameterCollection extends js.Object {
  
  val Count: Double = js.native
  
  @JSName("InfoPath.InputParameterCollection_typekey")
  var InfoPathDotInputParameterCollection_typekey: InputParameterCollection = js.native
  
  def Item(varIndex: js.Any): InputParameterObject = js.native
}
object InputParameterCollection {
  
  @scala.inline
  def apply(
    Count: Double,
    InfoPathDotInputParameterCollection_typekey: InputParameterCollection,
    Item: js.Any => InputParameterObject
  ): InputParameterCollection = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.updateDynamic("InfoPath.InputParameterCollection_typekey")(InfoPathDotInputParameterCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParameterCollection]
  }
  
  @scala.inline
  implicit class InputParameterCollectionOps[Self <: InputParameterCollection] (val x: Self) extends AnyVal {
    
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
    def setInfoPathDotInputParameterCollection_typekey(value: InputParameterCollection): Self = this.set("InfoPath.InputParameterCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any => InputParameterObject): Self = this.set("Item", js.Any.fromFunction1(value))
  }
}
