package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessTrustProvider extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the Amazon Web Services Verified Access trust provider.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The options for device-identity trust provider.
    */
  var DeviceOptions: js.UndefOr[typings.awsSdk.clientsEc2Mod.DeviceOptions] = js.undefined
  
  /**
    * The type of device-based trust provider.
    */
  var DeviceTrustProviderType: js.UndefOr[typings.awsSdk.clientsEc2Mod.DeviceTrustProviderType] = js.undefined
  
  /**
    * The last updated time.
    */
  var LastUpdatedTime: js.UndefOr[String] = js.undefined
  
  /**
    * The options for an OpenID Connect-compatible user-identity trust provider.
    */
  var OidcOptions: js.UndefOr[typings.awsSdk.clientsEc2Mod.OidcOptions] = js.undefined
  
  /**
    * The identifier to be used when working with policy rules.
    */
  var PolicyReferenceName: js.UndefOr[String] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of Verified Access trust provider.
    */
  var TrustProviderType: js.UndefOr[typings.awsSdk.clientsEc2Mod.TrustProviderType] = js.undefined
  
  /**
    * The type of user-based trust provider.
    */
  var UserTrustProviderType: js.UndefOr[typings.awsSdk.clientsEc2Mod.UserTrustProviderType] = js.undefined
  
  /**
    * The ID of the Amazon Web Services Verified Access trust provider.
    */
  var VerifiedAccessTrustProviderId: js.UndefOr[String] = js.undefined
}
object VerifiedAccessTrustProvider {
  
  inline def apply(): VerifiedAccessTrustProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessTrustProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessTrustProvider] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceOptions(value: DeviceOptions): Self = StObject.set(x, "DeviceOptions", value.asInstanceOf[js.Any])
    
    inline def setDeviceOptionsUndefined: Self = StObject.set(x, "DeviceOptions", js.undefined)
    
    inline def setDeviceTrustProviderType(value: DeviceTrustProviderType): Self = StObject.set(x, "DeviceTrustProviderType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTrustProviderTypeUndefined: Self = StObject.set(x, "DeviceTrustProviderType", js.undefined)
    
    inline def setLastUpdatedTime(value: String): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setOidcOptions(value: OidcOptions): Self = StObject.set(x, "OidcOptions", value.asInstanceOf[js.Any])
    
    inline def setOidcOptionsUndefined: Self = StObject.set(x, "OidcOptions", js.undefined)
    
    inline def setPolicyReferenceName(value: String): Self = StObject.set(x, "PolicyReferenceName", value.asInstanceOf[js.Any])
    
    inline def setPolicyReferenceNameUndefined: Self = StObject.set(x, "PolicyReferenceName", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrustProviderType(value: TrustProviderType): Self = StObject.set(x, "TrustProviderType", value.asInstanceOf[js.Any])
    
    inline def setTrustProviderTypeUndefined: Self = StObject.set(x, "TrustProviderType", js.undefined)
    
    inline def setUserTrustProviderType(value: UserTrustProviderType): Self = StObject.set(x, "UserTrustProviderType", value.asInstanceOf[js.Any])
    
    inline def setUserTrustProviderTypeUndefined: Self = StObject.set(x, "UserTrustProviderType", js.undefined)
    
    inline def setVerifiedAccessTrustProviderId(value: String): Self = StObject.set(x, "VerifiedAccessTrustProviderId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessTrustProviderIdUndefined: Self = StObject.set(x, "VerifiedAccessTrustProviderId", js.undefined)
  }
}
