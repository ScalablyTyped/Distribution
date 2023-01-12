package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePackagingGroupRequest extends StObject {
  
  /**
    * The ID of the MediaPackage VOD PackagingGroup resource to delete.
    */
  var Id: string
}
object DeletePackagingGroupRequest {
  
  inline def apply(Id: string): DeletePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePackagingGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePackagingGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
