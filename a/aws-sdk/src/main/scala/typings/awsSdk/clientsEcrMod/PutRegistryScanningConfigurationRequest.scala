package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRegistryScanningConfigurationRequest extends StObject {
  
  /**
    * The scanning rules to use for the registry. A scanning rule is used to determine which repository filters are used and at what frequency scanning will occur.
    */
  var rules: js.UndefOr[RegistryScanningRuleList] = js.undefined
  
  /**
    * The scanning type to set for the registry. When a registry scanning configuration is not defined, by default the BASIC scan type is used. When basic scanning is used, you may specify filters to determine which individual repositories, or all repositories, are scanned when new images are pushed to those repositories. Alternatively, you can do manual scans of images with basic scanning. When the ENHANCED scan type is set, Amazon Inspector provides automated vulnerability scanning. You may choose between continuous scanning or scan on push and you may specify filters to determine which individual repositories, or all repositories, are scanned.
    */
  var scanType: js.UndefOr[ScanType] = js.undefined
}
object PutRegistryScanningConfigurationRequest {
  
  inline def apply(): PutRegistryScanningConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRegistryScanningConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRegistryScanningConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setRules(value: RegistryScanningRuleList): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: RegistryScanningRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setScanType(value: ScanType): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
  }
}
