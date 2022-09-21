package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureEffectLayer extends StObject {
  
  /**
    * The featureEffect can be used to draw attention features of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureEffectLayer.html#featureEffect)
    */
  var featureEffect: FeatureEffect
}
object FeatureEffectLayer {
  
  inline def apply(featureEffect: FeatureEffect): FeatureEffectLayer = {
    val __obj = js.Dynamic.literal(featureEffect = featureEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureEffectLayer]
  }
  
  extension [Self <: FeatureEffectLayer](x: Self) {
    
    inline def setFeatureEffect(value: FeatureEffect): Self = StObject.set(x, "featureEffect", value.asInstanceOf[js.Any])
  }
}
