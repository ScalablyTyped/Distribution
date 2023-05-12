package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectorFeatureConfigurationResult extends StObject {
  
  /**
    * Additional configuration for a resource.
    */
  var AdditionalConfiguration: js.UndefOr[DetectorAdditionalConfigurationResults] = js.undefined
  
  /**
    * Indicates the name of the feature that can be enabled for the detector.
    */
  var Name: js.UndefOr[DetectorFeatureResult] = js.undefined
  
  /**
    * Indicates the status of the feature that is enabled for the detector.
    */
  var Status: js.UndefOr[FeatureStatus] = js.undefined
  
  /**
    * The timestamp at which the feature object was updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object DetectorFeatureConfigurationResult {
  
  inline def apply(): DetectorFeatureConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorFeatureConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectorFeatureConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setAdditionalConfiguration(value: DetectorAdditionalConfigurationResults): Self = StObject.set(x, "AdditionalConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAdditionalConfigurationUndefined: Self = StObject.set(x, "AdditionalConfiguration", js.undefined)
    
    inline def setAdditionalConfigurationVarargs(value: DetectorAdditionalConfigurationResult*): Self = StObject.set(x, "AdditionalConfiguration", js.Array(value*))
    
    inline def setName(value: DetectorFeatureResult): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
