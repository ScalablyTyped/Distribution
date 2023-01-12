package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedResource extends StObject {
  
  /* private */ @JSName("Access.SharedResource_typekey")
  var AccessDotSharedResource_typekey: SharedResource
  
  def Delete(): Unit
  
  def IsMemberSafe(dispid: Double): Boolean
  
  var Name: String
  
  val Parent: Any
  
  val Type: AcResourceType
}
object SharedResource {
  
  inline def apply(
    AccessDotSharedResource_typekey: SharedResource,
    Delete: () => Unit,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Parent: Any,
    Type: AcResourceType
  ): SharedResource = {
    val __obj = js.Dynamic.literal(Delete = js.Any.fromFunction0(Delete), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SharedResource_typekey")(AccessDotSharedResource_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedResource] (val x: Self) extends AnyVal {
    
    inline def setAccessDotSharedResource_typekey(value: SharedResource): Self = StObject.set(x, "Access.SharedResource_typekey", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: AcResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
