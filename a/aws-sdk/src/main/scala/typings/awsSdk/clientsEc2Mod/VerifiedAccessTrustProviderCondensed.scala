package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessTrustProviderCondensed extends StObject {
  
  /**
    * The description of trust provider.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The type of device-based trust provider.
    */
  var DeviceTrustProviderType: js.UndefOr[typings.awsSdk.clientsEc2Mod.DeviceTrustProviderType] = js.undefined
  
  /**
    * The type of trust provider (user- or device-based).
    */
  var TrustProviderType: js.UndefOr[typings.awsSdk.clientsEc2Mod.TrustProviderType] = js.undefined
  
  /**
    * The type of user-based trust provider.
    */
  var UserTrustProviderType: js.UndefOr[typings.awsSdk.clientsEc2Mod.UserTrustProviderType] = js.undefined
  
  /**
    * The ID of the trust provider.
    */
  var VerifiedAccessTrustProviderId: js.UndefOr[String] = js.undefined
}
object VerifiedAccessTrustProviderCondensed {
  
  inline def apply(): VerifiedAccessTrustProviderCondensed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessTrustProviderCondensed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessTrustProviderCondensed] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceTrustProviderType(value: DeviceTrustProviderType): Self = StObject.set(x, "DeviceTrustProviderType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTrustProviderTypeUndefined: Self = StObject.set(x, "DeviceTrustProviderType", js.undefined)
    
    inline def setTrustProviderType(value: TrustProviderType): Self = StObject.set(x, "TrustProviderType", value.asInstanceOf[js.Any])
    
    inline def setTrustProviderTypeUndefined: Self = StObject.set(x, "TrustProviderType", js.undefined)
    
    inline def setUserTrustProviderType(value: UserTrustProviderType): Self = StObject.set(x, "UserTrustProviderType", value.asInstanceOf[js.Any])
    
    inline def setUserTrustProviderTypeUndefined: Self = StObject.set(x, "UserTrustProviderType", js.undefined)
    
    inline def setVerifiedAccessTrustProviderId(value: String): Self = StObject.set(x, "VerifiedAccessTrustProviderId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessTrustProviderIdUndefined: Self = StObject.set(x, "VerifiedAccessTrustProviderId", js.undefined)
  }
}
