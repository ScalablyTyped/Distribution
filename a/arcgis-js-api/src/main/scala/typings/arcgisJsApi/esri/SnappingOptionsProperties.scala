package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnappingOptionsProperties extends StObject {
  
  /**
  		 * Snapping distance for snapping in pixels.
  		 *
  		 * @default 5
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html#distance)
  		 */
  var distance: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Global configuration to turn snapping on or off.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html#enabled)
  		 */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Global configuration option to turn feature snapping on or off.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html#featureEnabled)
  		 */
  var featureEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * List of sources for feature snapping.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html#featureSources)
  		 */
  var featureSources: js.UndefOr[CollectionProperties[FeatureSnappingLayerSourceProperties]] = js.undefined
  
  /**
  		 * Global configuration option to turn self snapping (within one feature while either drawing or reshaping) on or off.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html#selfEnabled)
  		 */
  var selfEnabled: js.UndefOr[Boolean] = js.undefined
}
object SnappingOptionsProperties {
  
  inline def apply(): SnappingOptionsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnappingOptionsProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnappingOptionsProperties] (val x: Self) extends AnyVal {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFeatureEnabled(value: Boolean): Self = StObject.set(x, "featureEnabled", value.asInstanceOf[js.Any])
    
    inline def setFeatureEnabledUndefined: Self = StObject.set(x, "featureEnabled", js.undefined)
    
    inline def setFeatureSources(value: CollectionProperties[FeatureSnappingLayerSourceProperties]): Self = StObject.set(x, "featureSources", value.asInstanceOf[js.Any])
    
    inline def setFeatureSourcesUndefined: Self = StObject.set(x, "featureSources", js.undefined)
    
    inline def setFeatureSourcesVarargs(value: FeatureSnappingLayerSourceProperties*): Self = StObject.set(x, "featureSources", js.Array(value*))
    
    inline def setSelfEnabled(value: Boolean): Self = StObject.set(x, "selfEnabled", value.asInstanceOf[js.Any])
    
    inline def setSelfEnabledUndefined: Self = StObject.set(x, "selfEnabled", js.undefined)
  }
}
