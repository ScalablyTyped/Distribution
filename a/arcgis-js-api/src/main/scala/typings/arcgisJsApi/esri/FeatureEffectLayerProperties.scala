package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureEffectLayerProperties extends StObject {
  
  /**
    * The featureEffect can be used to draw attention features of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureEffectLayer.html#featureEffect)
    */
  var featureEffect: js.UndefOr[FeatureEffectProperties] = js.undefined
}
object FeatureEffectLayerProperties {
  
  inline def apply(): FeatureEffectLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureEffectLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureEffectLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setFeatureEffect(value: FeatureEffectProperties): Self = StObject.set(x, "featureEffect", value.asInstanceOf[js.Any])
    
    inline def setFeatureEffectUndefined: Self = StObject.set(x, "featureEffect", js.undefined)
  }
}
