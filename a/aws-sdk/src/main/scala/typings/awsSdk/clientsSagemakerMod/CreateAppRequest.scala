package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppRequest extends StObject {
  
  /**
    * The name of the app.
    */
  var AppName: typings.awsSdk.clientsSagemakerMod.AppName
  
  /**
    * The type of app.
    */
  var AppType: typings.awsSdk.clientsSagemakerMod.AppType
  
  /**
    * The domain ID.
    */
  var DomainId: typings.awsSdk.clientsSagemakerMod.DomainId
  
  /**
    * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.  The value of InstanceType passed as part of the ResourceSpec in the CreateApp call overrides the value passed as part of the ResourceSpec configured for the user profile or the domain. If InstanceType is not specified in any of those three ResourceSpec values for a KernelGateway app, the CreateApp call fails with a request validation error. 
    */
  var ResourceSpec: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ResourceSpec] = js.undefined
  
  /**
    * The name of the space. If this value is not set, then UserProfileName must be set.
    */
  var SpaceName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SpaceName] = js.undefined
  
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The user profile name. If this value is not set, then SpaceName must be set.
    */
  var UserProfileName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.UserProfileName] = js.undefined
}
object CreateAppRequest {
  
  inline def apply(AppName: AppName, AppType: AppType, DomainId: DomainId): CreateAppRequest = {
    val __obj = js.Dynamic.literal(AppName = AppName.asInstanceOf[js.Any], AppType = AppType.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppRequest] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: AppName): Self = StObject.set(x, "AppName", value.asInstanceOf[js.Any])
    
    inline def setAppType(value: AppType): Self = StObject.set(x, "AppType", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setResourceSpec(value: ResourceSpec): Self = StObject.set(x, "ResourceSpec", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecUndefined: Self = StObject.set(x, "ResourceSpec", js.undefined)
    
    inline def setSpaceName(value: SpaceName): Self = StObject.set(x, "SpaceName", value.asInstanceOf[js.Any])
    
    inline def setSpaceNameUndefined: Self = StObject.set(x, "SpaceName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    inline def setUserProfileNameUndefined: Self = StObject.set(x, "UserProfileName", js.undefined)
  }
}
