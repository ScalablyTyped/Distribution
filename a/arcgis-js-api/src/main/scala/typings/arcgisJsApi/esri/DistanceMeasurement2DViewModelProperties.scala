package typings.arcgisJsApi.esri

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

trait DistanceMeasurement2DViewModelProperties extends StObject {
  
  /**
  		 * When the coordinate sustem is projected (other than web mercator) then distances less than this threshold will be computed planimetrically.
  		 *
  		 * @default 100000
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#geodesicDistanceThreshold)
  		 */
  var geodesicDistanceThreshold: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Unit system (imperial, metric) or specific unit used for displaying the distance values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unit)
  		 */
  var unit: js.UndefOr[
    imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
  
  /**
  		 * List of available units and unit systems (imperial, metric) for displaying the distance values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#unitOptions)
  		 */
  var unitOptions: js.UndefOr[
    js.Array[
      imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ]
  ] = js.undefined
  
  /**
  		 * The view from which the widget will operate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D-DistanceMeasurement2DViewModel.html#view)
  		 */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}
object DistanceMeasurement2DViewModelProperties {
  
  inline def apply(): DistanceMeasurement2DViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceMeasurement2DViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistanceMeasurement2DViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setGeodesicDistanceThreshold(value: Double): Self = StObject.set(x, "geodesicDistanceThreshold", value.asInstanceOf[js.Any])
    
    inline def setGeodesicDistanceThresholdUndefined: Self = StObject.set(x, "geodesicDistanceThreshold", js.undefined)
    
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
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
