package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedResource extends js.Object {
  
  @JSName("Access.SharedResource_typekey")
  var AccessDotSharedResource_typekey: SharedResource = js.native
  
  def Delete(): Unit = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Type: AcResourceType = js.native
}
object SharedResource {
  
  @scala.inline
  def apply(
    AccessDotSharedResource_typekey: SharedResource,
    Delete: () => Unit,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Parent: js.Any,
    Type: AcResourceType
  ): SharedResource = {
    val __obj = js.Dynamic.literal(Delete = js.Any.fromFunction0(Delete), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SharedResource_typekey")(AccessDotSharedResource_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedResource]
  }
  
  @scala.inline
  implicit class SharedResourceOps[Self <: SharedResource] (val x: Self) extends AnyVal {
    
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
    def setAccessDotSharedResource_typekey(value: SharedResource): Self = this.set("Access.SharedResource_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AcResourceType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
