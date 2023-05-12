package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessorInfo extends StObject {
  
  /**
    * The architectures supported by the instance type.
    */
  var SupportedArchitectures: js.UndefOr[ArchitectureTypeList] = js.undefined
  
  /**
    * Indicates whether the instance type supports AMD SEV-SNP. If the request returns amd-sev-snp, AMD SEV-SNP is supported. Otherwise, it is not supported.
    */
  var SupportedFeatures: js.UndefOr[SupportedAdditionalProcessorFeatureList] = js.undefined
  
  /**
    * The speed of the processor, in GHz.
    */
  var SustainedClockSpeedInGhz: js.UndefOr[ProcessorSustainedClockSpeed] = js.undefined
}
object ProcessorInfo {
  
  inline def apply(): ProcessorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessorInfo] (val x: Self) extends AnyVal {
    
    inline def setSupportedArchitectures(value: ArchitectureTypeList): Self = StObject.set(x, "SupportedArchitectures", value.asInstanceOf[js.Any])
    
    inline def setSupportedArchitecturesUndefined: Self = StObject.set(x, "SupportedArchitectures", js.undefined)
    
    inline def setSupportedArchitecturesVarargs(value: ArchitectureType*): Self = StObject.set(x, "SupportedArchitectures", js.Array(value*))
    
    inline def setSupportedFeatures(value: SupportedAdditionalProcessorFeatureList): Self = StObject.set(x, "SupportedFeatures", value.asInstanceOf[js.Any])
    
    inline def setSupportedFeaturesUndefined: Self = StObject.set(x, "SupportedFeatures", js.undefined)
    
    inline def setSupportedFeaturesVarargs(value: SupportedAdditionalProcessorFeature*): Self = StObject.set(x, "SupportedFeatures", js.Array(value*))
    
    inline def setSustainedClockSpeedInGhz(value: ProcessorSustainedClockSpeed): Self = StObject.set(x, "SustainedClockSpeedInGhz", value.asInstanceOf[js.Any])
    
    inline def setSustainedClockSpeedInGhzUndefined: Self = StObject.set(x, "SustainedClockSpeedInGhz", js.undefined)
  }
}
