package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedResource extends StObject {
  
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
  implicit class SharedResourceMutableBuilder[Self <: SharedResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotSharedResource_typekey(value: SharedResource): Self = StObject.set(x, "Access.SharedResource_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AcResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
