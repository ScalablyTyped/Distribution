package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.ElevationProfileLineGroun
import typings.arcgisJsApi.anon.ElevationProfileLineViewP
import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.imperial
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationProfileViewModelProperties extends StObject {
  
  /**
  		 * When the spatial reference is projected (other than web mercator) and the path is shorter than this threshold, distances will be computed planimetrically.
  		 *
  		 * @default 100000
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#geodesicDistanceThreshold)
  		 */
  var geodesicDistanceThreshold: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Whether the graphic used as [input](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile.html#input) is highlighted.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#highlightEnabled)
  		 */
  var highlightEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The position, in the range [0, 1], being hovered in the graph.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#hoveredChartPosition)
  		 */
  var hoveredChartPosition: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The input path along which elevation will be queried in order to generate an elevation profile.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#input)
  		 */
  var input: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
  		 * Collection of elevation profile lines which are to be generated and displayed in the widget's chart.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#profiles)
  		 */
  var profiles: js.UndefOr[
    CollectionProperties[
      ElevationProfileLineGroun | typings.arcgisJsApi.anon.ElevationProfileLineInput | typings.arcgisJsApi.anon.ElevationProfileLineQuery | ElevationProfileLineViewP
    ]
  ] = js.undefined
  
  /**
  		 * Whether the chart should use a uniform scale for the X and Y axes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#uniformChartScaling)
  		 */
  var uniformChartScaling: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Unit system (imperial, metric) or specific unit used for displaying the elevation and distance values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#unit)
  		 */
  var unit: js.UndefOr[
    imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
  
  /**
  		 * List of available units and unit systems (imperial, metric) for displaying the elevation and distance values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#unitOptions)
  		 */
  var unitOptions: js.UndefOr[
    js.Array[
      imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ]
  ] = js.undefined
  
  /**
  		 * A reference to the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileViewModel.html#view)
  		 */
  var view: js.UndefOr[SceneViewPropertiestype3d | MapViewPropertiestype2d] = js.undefined
}
object ElevationProfileViewModelProperties {
  
  inline def apply(): ElevationProfileViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElevationProfileViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationProfileViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setGeodesicDistanceThreshold(value: Double): Self = StObject.set(x, "geodesicDistanceThreshold", value.asInstanceOf[js.Any])
    
    inline def setGeodesicDistanceThresholdUndefined: Self = StObject.set(x, "geodesicDistanceThreshold", js.undefined)
    
    inline def setHighlightEnabled(value: Boolean): Self = StObject.set(x, "highlightEnabled", value.asInstanceOf[js.Any])
    
    inline def setHighlightEnabledUndefined: Self = StObject.set(x, "highlightEnabled", js.undefined)
    
    inline def setHoveredChartPosition(value: Double): Self = StObject.set(x, "hoveredChartPosition", value.asInstanceOf[js.Any])
    
    inline def setHoveredChartPositionUndefined: Self = StObject.set(x, "hoveredChartPosition", js.undefined)
    
    inline def setInput(value: GraphicProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setProfiles(
      value: CollectionProperties[
          ElevationProfileLineGroun | typings.arcgisJsApi.anon.ElevationProfileLineInput | typings.arcgisJsApi.anon.ElevationProfileLineQuery | ElevationProfileLineViewP
        ]
    ): Self = StObject.set(x, "profiles", value.asInstanceOf[js.Any])
    
    inline def setProfilesUndefined: Self = StObject.set(x, "profiles", js.undefined)
    
    inline def setProfilesVarargs(
      value: (ElevationProfileLineGroun | typings.arcgisJsApi.anon.ElevationProfileLineInput | typings.arcgisJsApi.anon.ElevationProfileLineQuery | ElevationProfileLineViewP)*
    ): Self = StObject.set(x, "profiles", js.Array(value*))
    
    inline def setUniformChartScaling(value: Boolean): Self = StObject.set(x, "uniformChartScaling", value.asInstanceOf[js.Any])
    
    inline def setUniformChartScalingUndefined: Self = StObject.set(x, "uniformChartScaling", js.undefined)
    
    inline def setUnit(
      value: imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitOptions(
      value: js.Array[
          imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
        ]
    ): Self = StObject.set(x, "unitOptions", value.asInstanceOf[js.Any])
    
    inline def setUnitOptionsUndefined: Self = StObject.set(x, "unitOptions", js.undefined)
    
    inline def setUnitOptionsVarargs(
      value: (imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`)*
    ): Self = StObject.set(x, "unitOptions", js.Array(value*))
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setView(value: SceneViewPropertiestype3d | MapViewPropertiestype2d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
