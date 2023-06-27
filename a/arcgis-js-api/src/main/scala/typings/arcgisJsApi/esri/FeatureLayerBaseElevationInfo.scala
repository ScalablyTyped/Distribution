package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`absolute-height`
import typings.arcgisJsApi.arcgisJsApiStrings.`on-the-ground`
import typings.arcgisJsApi.arcgisJsApiStrings.`relative-to-ground`
import typings.arcgisJsApi.arcgisJsApiStrings.`relative-to-scene`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerBaseElevationInfo extends StObject {
  
  /**
  		 * Defines how to override a feature's Z-value based on its attributes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#elevationInfo)
  		 */
  var featureExpressionInfo: js.UndefOr[FeatureLayerBaseElevationInfoFeatureExpressionInfo] = js.undefined
  
  /**
  		 * Defines how the feature is placed with respect to the terrain surface or 3D objects in the scene.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#elevationInfo)
  		 */
  var mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`
  
  /**
  		 * An elevation offset, which is added to the vertical position of the feature.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#elevationInfo)
  		 */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The unit for `featureExpressionInfo` and `offset` values.
  		 *
  		 * [Read more...](global.html#unit)
  		 */
  var unit: js.UndefOr[feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards] = js.undefined
}
object FeatureLayerBaseElevationInfo {
  
  inline def apply(mode: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`): FeatureLayerBaseElevationInfo = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerBaseElevationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureLayerBaseElevationInfo] (val x: Self) extends AnyVal {
    
    inline def setFeatureExpressionInfo(value: FeatureLayerBaseElevationInfoFeatureExpressionInfo): Self = StObject.set(x, "featureExpressionInfo", value.asInstanceOf[js.Any])
    
    inline def setFeatureExpressionInfoUndefined: Self = StObject.set(x, "featureExpressionInfo", js.undefined)
    
    inline def setMode(value: `on-the-ground` | `relative-to-ground` | `absolute-height` | `relative-to-scene`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setUnit(value: feet_ | meters_ | kilometers_ | miles_ | `us-feet` | yards): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
