package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSigningPlatformResponse extends StObject {
  
  /**
    * The category type of the target signing platform.
    */
  var category: js.UndefOr[Category] = js.undefined
  
  /**
    * The display name of the target signing platform.
    */
  var displayName: js.UndefOr[DisplayName] = js.undefined
  
  /**
    * The maximum size (in MB) of the payload that can be signed by the target platform.
    */
  var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined
  
  /**
    * A list of partner entities that use the target signing platform.
    */
  var partner: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the target signing platform.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  
  /**
    * A flag indicating whether signatures generated for the signing platform can be revoked.
    */
  var revocationSupported: js.UndefOr[bool] = js.undefined
  
  /**
    * A list of configurations applied to the target platform at signing.
    */
  var signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined
  
  /**
    * The format of the target platform's signing image.
    */
  var signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined
  
  /**
    * The validation template that is used by the target signing platform.
    */
  var target: js.UndefOr[String] = js.undefined
}
object GetSigningPlatformResponse {
  
  inline def apply(): GetSigningPlatformResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSigningPlatformResponse]
  }
  
  extension [Self <: GetSigningPlatformResponse](x: Self) {
    
    inline def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMaxSizeInMB(value: MaxSizeInMB): Self = StObject.set(x, "maxSizeInMB", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeInMBUndefined: Self = StObject.set(x, "maxSizeInMB", js.undefined)
    
    inline def setPartner(value: String): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
    
    inline def setPartnerUndefined: Self = StObject.set(x, "partner", js.undefined)
    
    inline def setPlatformId(value: PlatformId): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
    inline def setPlatformIdUndefined: Self = StObject.set(x, "platformId", js.undefined)
    
    inline def setRevocationSupported(value: bool): Self = StObject.set(x, "revocationSupported", value.asInstanceOf[js.Any])
    
    inline def setRevocationSupportedUndefined: Self = StObject.set(x, "revocationSupported", js.undefined)
    
    inline def setSigningConfiguration(value: SigningConfiguration): Self = StObject.set(x, "signingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSigningConfigurationUndefined: Self = StObject.set(x, "signingConfiguration", js.undefined)
    
    inline def setSigningImageFormat(value: SigningImageFormat): Self = StObject.set(x, "signingImageFormat", value.asInstanceOf[js.Any])
    
    inline def setSigningImageFormatUndefined: Self = StObject.set(x, "signingImageFormat", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
