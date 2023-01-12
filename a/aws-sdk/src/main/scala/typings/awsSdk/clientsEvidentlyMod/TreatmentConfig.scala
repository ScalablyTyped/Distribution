package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreatmentConfig extends StObject {
  
  /**
    * A description for this treatment.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The feature that this experiment is testing.
    */
  var feature: FeatureName
  
  /**
    * A name for this treatment.
    */
  var name: TreatmentName
  
  /**
    * The name of the variation to use as this treatment in the experiment.
    */
  var variation: VariationName
}
object TreatmentConfig {
  
  inline def apply(feature: FeatureName, name: TreatmentName, variation: VariationName): TreatmentConfig = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreatmentConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreatmentConfig] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFeature(value: FeatureName): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setName(value: TreatmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVariation(value: VariationName): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
  }
}
