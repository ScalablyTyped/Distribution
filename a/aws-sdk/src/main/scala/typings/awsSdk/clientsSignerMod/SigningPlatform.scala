package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningPlatform extends StObject {
  
  /**
    * The category of a code signing platform.
    */
  var category: js.UndefOr[Category] = js.undefined
  
  /**
    * The display name of a code signing platform.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum size (in MB) of code that can be signed by a code signing platform.
    */
  var maxSizeInMB: js.UndefOr[MaxSizeInMB] = js.undefined
  
  /**
    * Any partner entities linked to a code signing platform.
    */
  var partner: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of a code signing; platform.
    */
  var platformId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether revocation is supported for the platform.
    */
  var revocationSupported: js.UndefOr[bool] = js.undefined
  
  /**
    * The configuration of a code signing platform. This includes the designated hash algorithm and encryption algorithm of a signing platform.
    */
  var signingConfiguration: js.UndefOr[SigningConfiguration] = js.undefined
  
  var signingImageFormat: js.UndefOr[SigningImageFormat] = js.undefined
  
  /**
    * The types of targets that can be signed by a code signing platform.
    */
  var target: js.UndefOr[String] = js.undefined
}
object SigningPlatform {
  
  inline def apply(): SigningPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningPlatform]
  }
  
  extension [Self <: SigningPlatform](x: Self) {
    
    inline def setCategory(value: Category): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMaxSizeInMB(value: MaxSizeInMB): Self = StObject.set(x, "maxSizeInMB", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeInMBUndefined: Self = StObject.set(x, "maxSizeInMB", js.undefined)
    
    inline def setPartner(value: String): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
    
    inline def setPartnerUndefined: Self = StObject.set(x, "partner", js.undefined)
    
    inline def setPlatformId(value: String): Self = StObject.set(x, "platformId", value.asInstanceOf[js.Any])
    
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
