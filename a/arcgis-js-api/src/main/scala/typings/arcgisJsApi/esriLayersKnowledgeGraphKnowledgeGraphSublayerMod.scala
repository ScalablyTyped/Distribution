package typings.arcgisJsApi

import typings.arcgisJsApi.arcgisJsApiStrings.`color-burn`
import typings.arcgisJsApi.arcgisJsApiStrings.`color-dodge`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-over`
import typings.arcgisJsApi.arcgisJsApiStrings.`hard-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`soft-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`vivid-light`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.color
import typings.arcgisJsApi.arcgisJsApiStrings.darken
import typings.arcgisJsApi.arcgisJsApiStrings.difference
import typings.arcgisJsApi.arcgisJsApiStrings.exclusion
import typings.arcgisJsApi.arcgisJsApiStrings.hue
import typings.arcgisJsApi.arcgisJsApiStrings.invert
import typings.arcgisJsApi.arcgisJsApiStrings.lighten
import typings.arcgisJsApi.arcgisJsApiStrings.lighter
import typings.arcgisJsApi.arcgisJsApiStrings.luminosity
import typings.arcgisJsApi.arcgisJsApiStrings.minus
import typings.arcgisJsApi.arcgisJsApiStrings.multiply
import typings.arcgisJsApi.arcgisJsApiStrings.normal
import typings.arcgisJsApi.arcgisJsApiStrings.overlay
import typings.arcgisJsApi.arcgisJsApiStrings.plus
import typings.arcgisJsApi.arcgisJsApiStrings.reflect
import typings.arcgisJsApi.arcgisJsApiStrings.saturation
import typings.arcgisJsApi.arcgisJsApiStrings.screen
import typings.arcgisJsApi.arcgisJsApiStrings.xor
import typings.arcgisJsApi.esri.Effect
import typings.arcgisJsApi.esri.FeatureReductionBinning
import typings.arcgisJsApi.esri.FeatureReductionCluster
import typings.arcgisJsApi.esri.FeatureReductionSelection
import typings.arcgisJsApi.esri.KnowledgeGraphSublayer
import typings.arcgisJsApi.esri.KnowledgeGraphSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersKnowledgeGraphKnowledgeGraphSublayerMod {
  
  @JSImport("esri/layers/knowledgeGraph/KnowledgeGraphSublayer", JSImport.Namespace)
  @js.native
  /**
  		 * A KnowledgeGraphSublayer is a sublayer of a [KnowledgeGraphLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KnowledgeGraphLayer.html#layers) that contains all instances of a named type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html)
  		 */
  open class ^ ()
    extends StObject
       with KnowledgeGraphSublayer {
    def this(properties: KnowledgeGraphSublayerProperties) = this()
    
    /**
    		 * Blend modes are used to blend layers together to create an interesting effect in a layer, or even to produce what seems like a new layer.
    		 *
    		 * @default normal
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#blendMode)
    		 */
    /* CompleteClass */
    var blendMode: average | `color-burn` | `color-dodge` | color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor = js.native
    
    /**
    		 * Effect provides various filter functions that can be performed on the layer to achieve different visual effects similar to how image filters work.
    		 *
    		 * @default null
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#effect)
    		 */
    /* CompleteClass */
    var effect: Effect = js.native
    
    /**
    		 * Configures the method for reducing the number of point features in the view.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureReductionLayer.html#featureReduction)
    		 */
    /* CompleteClass */
    var featureReduction: FeatureReductionBinning | FeatureReductionCluster | FeatureReductionSelection = js.native
  }
}
