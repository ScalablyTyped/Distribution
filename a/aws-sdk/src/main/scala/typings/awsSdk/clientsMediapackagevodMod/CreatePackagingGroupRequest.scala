package typings.awsSdk.clientsMediapackagevodMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePackagingGroupRequest extends StObject {
  
  var Authorization: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.Authorization] = js.undefined
  
  var EgressAccessLogs: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.EgressAccessLogs] = js.undefined
  
  /**
    * The ID of the PackagingGroup.
    */
  var Id: string
  
  var Tags: js.UndefOr[typings.awsSdk.clientsMediapackagevodMod.Tags] = js.undefined
}
object CreatePackagingGroupRequest {
  
  inline def apply(Id: string): CreatePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackagingGroupRequest]
  }
  
  extension [Self <: CreatePackagingGroupRequest](x: Self) {
    
    inline def setAuthorization(value: Authorization): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
    
    inline def setEgressAccessLogs(value: EgressAccessLogs): Self = StObject.set(x, "EgressAccessLogs", value.asInstanceOf[js.Any])
    
    inline def setEgressAccessLogsUndefined: Self = StObject.set(x, "EgressAccessLogs", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
