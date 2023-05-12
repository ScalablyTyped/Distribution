package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectorFeatureConfiguration extends StObject {
  
  /**
    * Additional configuration for a resource.
    */
  var AdditionalConfiguration: js.UndefOr[DetectorAdditionalConfigurations] = js.undefined
  
  /**
    * The name of the feature.
    */
  var Name: js.UndefOr[DetectorFeature] = js.undefined
  
  /**
    * The status of the feature.
    */
  var Status: js.UndefOr[FeatureStatus] = js.undefined
}
object DetectorFeatureConfiguration {
  
  inline def apply(): DetectorFeatureConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorFeatureConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectorFeatureConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAdditionalConfiguration(value: DetectorAdditionalConfigurations): Self = StObject.set(x, "AdditionalConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAdditionalConfigurationUndefined: Self = StObject.set(x, "AdditionalConfiguration", js.undefined)
    
    inline def setAdditionalConfigurationVarargs(value: DetectorAdditionalConfiguration*): Self = StObject.set(x, "AdditionalConfiguration", js.Array(value*))
    
    inline def setName(value: DetectorFeature): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
