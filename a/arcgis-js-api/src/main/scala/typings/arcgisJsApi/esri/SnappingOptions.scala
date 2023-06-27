package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnappingOptions
  extends StObject
     with Accessor {
  
  /**
  		 * Snapping distance for snapping in pixels.
  		 *
  		 * @default 5
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html#distance)
  		 */
  var distance: Double = js.native
  
  /**
  		 * Global configuration to turn snapping on or off.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html#enabled)
  		 */
  var enabled: Boolean = js.native
  
  /**
  		 * Global configuration option to turn feature snapping on or off.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html#featureEnabled)
  		 */
  var featureEnabled: Boolean = js.native
  
  /**
  		 * List of sources for feature snapping.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html#featureSources)
  		 */
  var featureSources: Collection[FeatureSnappingLayerSource] = js.native
  
  /**
  		 * Global configuration option to turn self snapping (within one feature while either drawing or reshaping) on or off.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html#selfEnabled)
  		 */
  var selfEnabled: Boolean = js.native
}
