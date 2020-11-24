package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewInfoObject extends js.Object {
  
  @JSName("InfoPath.ViewInfoObject_typekey")
  var InfoPathDotViewInfoObject_typekey: ViewInfoObject = js.native
  
  var IsDefault: Boolean = js.native
  
  val Name: String = js.native
}
object ViewInfoObject {
  
  @scala.inline
  def apply(InfoPathDotViewInfoObject_typekey: ViewInfoObject, IsDefault: Boolean, Name: String): ViewInfoObject = {
    val __obj = js.Dynamic.literal(IsDefault = IsDefault.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ViewInfoObject_typekey")(InfoPathDotViewInfoObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewInfoObject]
  }
  
  @scala.inline
  implicit class ViewInfoObjectOps[Self <: ViewInfoObject] (val x: Self) extends AnyVal {
    
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
    def setInfoPathDotViewInfoObject_typekey(value: ViewInfoObject): Self = this.set("InfoPath.ViewInfoObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("IsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
