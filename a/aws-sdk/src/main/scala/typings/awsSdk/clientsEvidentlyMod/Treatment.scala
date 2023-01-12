package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Treatment extends StObject {
  
  /**
    * The description of the treatment.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The feature variation used for this treatment. This is a key-value pair. The key is the feature name, and the value is the variation name.
    */
  var featureVariations: js.UndefOr[FeatureToVariationMap] = js.undefined
  
  /**
    * The name of this treatment.
    */
  var name: TreatmentName
}
object Treatment {
  
  inline def apply(name: TreatmentName): Treatment = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Treatment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Treatment] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFeatureVariations(value: FeatureToVariationMap): Self = StObject.set(x, "featureVariations", value.asInstanceOf[js.Any])
    
    inline def setFeatureVariationsUndefined: Self = StObject.set(x, "featureVariations", js.undefined)
    
    inline def setName(value: TreatmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
