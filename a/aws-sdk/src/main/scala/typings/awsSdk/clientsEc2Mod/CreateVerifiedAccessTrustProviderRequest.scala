package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVerifiedAccessTrustProviderRequest extends StObject {
  
  /**
    * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the Verified Access trust provider.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The options for a device-based trust provider. This parameter is required when the provider type is device.
    */
  var DeviceOptions: js.UndefOr[CreateVerifiedAccessTrustProviderDeviceOptions] = js.undefined
  
  /**
    * The type of device-based trust provider. This parameter is required when the provider type is device.
    */
  var DeviceTrustProviderType: js.UndefOr[typings.awsSdk.clientsEc2Mod.DeviceTrustProviderType] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The options for a OpenID Connect-compatible user-identity trust provider. This parameter is required when the provider type is user.
    */
  var OidcOptions: js.UndefOr[CreateVerifiedAccessTrustProviderOidcOptions] = js.undefined
  
  /**
    * The identifier to be used when working with policy rules.
    */
  var PolicyReferenceName: String
  
  /**
    * The tags to assign to the Verified Access trust provider.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The type of trust provider.
    */
  var TrustProviderType: typings.awsSdk.clientsEc2Mod.TrustProviderType
  
  /**
    * The type of user-based trust provider. This parameter is required when the provider type is user.
    */
  var UserTrustProviderType: js.UndefOr[typings.awsSdk.clientsEc2Mod.UserTrustProviderType] = js.undefined
}
object CreateVerifiedAccessTrustProviderRequest {
  
  inline def apply(PolicyReferenceName: String, TrustProviderType: TrustProviderType): CreateVerifiedAccessTrustProviderRequest = {
    val __obj = js.Dynamic.literal(PolicyReferenceName = PolicyReferenceName.asInstanceOf[js.Any], TrustProviderType = TrustProviderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVerifiedAccessTrustProviderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVerifiedAccessTrustProviderRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceOptions(value: CreateVerifiedAccessTrustProviderDeviceOptions): Self = StObject.set(x, "DeviceOptions", value.asInstanceOf[js.Any])
    
    inline def setDeviceOptionsUndefined: Self = StObject.set(x, "DeviceOptions", js.undefined)
    
    inline def setDeviceTrustProviderType(value: DeviceTrustProviderType): Self = StObject.set(x, "DeviceTrustProviderType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTrustProviderTypeUndefined: Self = StObject.set(x, "DeviceTrustProviderType", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setOidcOptions(value: CreateVerifiedAccessTrustProviderOidcOptions): Self = StObject.set(x, "OidcOptions", value.asInstanceOf[js.Any])
    
    inline def setOidcOptionsUndefined: Self = StObject.set(x, "OidcOptions", js.undefined)
    
    inline def setPolicyReferenceName(value: String): Self = StObject.set(x, "PolicyReferenceName", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setTrustProviderType(value: TrustProviderType): Self = StObject.set(x, "TrustProviderType", value.asInstanceOf[js.Any])
    
    inline def setUserTrustProviderType(value: UserTrustProviderType): Self = StObject.set(x, "UserTrustProviderType", value.asInstanceOf[js.Any])
    
    inline def setUserTrustProviderTypeUndefined: Self = StObject.set(x, "UserTrustProviderType", js.undefined)
  }
}
