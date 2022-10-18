package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePackagingGroupRequest extends StObject {
  
  var Authorization: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.Authorization] = js.undefined
  
  /**
    * The ID of a MediaPackage VOD PackagingGroup resource.
    */
  var Id: string
}
object UpdatePackagingGroupRequest {
  
  inline def apply(Id: string): UpdatePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePackagingGroupRequest]
  }
  
  extension [Self <: UpdatePackagingGroupRequest](x: Self) {
    
    inline def setAuthorization(value: Authorization): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
