package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppRequest extends StObject {
  
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
    * The name of the space.
    */
  var SpaceName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SpaceName] = js.undefined
  
  /**
    * The user profile name. If this value is not set, then SpaceName must be set.
    */
  var UserProfileName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.UserProfileName] = js.undefined
}
object DescribeAppRequest {
  
  inline def apply(AppName: AppName, AppType: AppType, DomainId: DomainId): DescribeAppRequest = {
    val __obj = js.Dynamic.literal(AppName = AppName.asInstanceOf[js.Any], AppType = AppType.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAppRequest] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: AppName): Self = StObject.set(x, "AppName", value.asInstanceOf[js.Any])
    
    inline def setAppType(value: AppType): Self = StObject.set(x, "AppType", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setSpaceName(value: SpaceName): Self = StObject.set(x, "SpaceName", value.asInstanceOf[js.Any])
    
    inline def setSpaceNameUndefined: Self = StObject.set(x, "SpaceName", js.undefined)
    
    inline def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    inline def setUserProfileNameUndefined: Self = StObject.set(x, "UserProfileName", js.undefined)
  }
}
