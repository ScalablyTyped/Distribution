package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppDetails extends StObject {
  
  /**
    * The name of the app.
    */
  var AppName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AppName] = js.undefined
  
  /**
    * The type of app.
    */
  var AppType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AppType] = js.undefined
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DomainId] = js.undefined
  
  /**
    * The name of the space.
    */
  var SpaceName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SpaceName] = js.undefined
  
  /**
    * The status.
    */
  var Status: js.UndefOr[AppStatus] = js.undefined
  
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.UserProfileName] = js.undefined
}
object AppDetails {
  
  inline def apply(): AppDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppDetails] (val x: Self) extends AnyVal {
    
    inline def setAppName(value: AppName): Self = StObject.set(x, "AppName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "AppName", js.undefined)
    
    inline def setAppType(value: AppType): Self = StObject.set(x, "AppType", value.asInstanceOf[js.Any])
    
    inline def setAppTypeUndefined: Self = StObject.set(x, "AppType", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    inline def setSpaceName(value: SpaceName): Self = StObject.set(x, "SpaceName", value.asInstanceOf[js.Any])
    
    inline def setSpaceNameUndefined: Self = StObject.set(x, "SpaceName", js.undefined)
    
    inline def setStatus(value: AppStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    inline def setUserProfileNameUndefined: Self = StObject.set(x, "UserProfileName", js.undefined)
  }
}
