package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLaunchProfileRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The description.
    */
  var description: js.UndefOr[LaunchProfileDescription] = js.undefined
  
  /**
    * The Launch Profile ID.
    */
  var launchProfileId: String
  
  /**
    * The version number of the protocol that is used by the launch profile. The only valid version is "2021-03-31".
    */
  var launchProfileProtocolVersions: js.UndefOr[LaunchProfileProtocolVersionList] = js.undefined
  
  /**
    * The name for the launch profile.
    */
  var name: js.UndefOr[LaunchProfileName] = js.undefined
  
  /**
    * A configuration for a streaming session.
    */
  var streamConfiguration: js.UndefOr[StreamConfigurationCreate] = js.undefined
  
  /**
    * Unique identifiers for a collection of studio components that can be used with this launch profile.
    */
  var studioComponentIds: js.UndefOr[LaunchProfileStudioComponentIdList] = js.undefined
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object UpdateLaunchProfileRequest {
  
  inline def apply(launchProfileId: String, studioId: String): UpdateLaunchProfileRequest = {
    val __obj = js.Dynamic.literal(launchProfileId = launchProfileId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLaunchProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLaunchProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: LaunchProfileDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLaunchProfileId(value: String): Self = StObject.set(x, "launchProfileId", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileProtocolVersions(value: LaunchProfileProtocolVersionList): Self = StObject.set(x, "launchProfileProtocolVersions", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileProtocolVersionsUndefined: Self = StObject.set(x, "launchProfileProtocolVersions", js.undefined)
    
    inline def setLaunchProfileProtocolVersionsVarargs(value: LaunchProfileProtocolVersion*): Self = StObject.set(x, "launchProfileProtocolVersions", js.Array(value*))
    
    inline def setName(value: LaunchProfileName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStreamConfiguration(value: StreamConfigurationCreate): Self = StObject.set(x, "streamConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStreamConfigurationUndefined: Self = StObject.set(x, "streamConfiguration", js.undefined)
    
    inline def setStudioComponentIds(value: LaunchProfileStudioComponentIdList): Self = StObject.set(x, "studioComponentIds", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentIdsUndefined: Self = StObject.set(x, "studioComponentIds", js.undefined)
    
    inline def setStudioComponentIdsVarargs(value: String*): Self = StObject.set(x, "studioComponentIds", js.Array(value*))
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
