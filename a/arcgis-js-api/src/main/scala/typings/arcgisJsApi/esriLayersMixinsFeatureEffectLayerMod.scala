package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FeatureEffect
import typings.arcgisJsApi.esri.FeatureEffectLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsFeatureEffectLayerMod {
  
  @JSImport("esri/layers/mixins/FeatureEffectLayer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FeatureEffectLayer {
    
    /**
    		 * The featureEffect can be used to draw attention features of interest.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureEffectLayer.html#featureEffect)
    		 */
    /* CompleteClass */
    var featureEffect: FeatureEffect = js.native
  }
}
