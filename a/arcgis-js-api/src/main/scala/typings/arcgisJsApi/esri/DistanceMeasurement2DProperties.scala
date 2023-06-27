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

trait DistanceMeasurement2DProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/DistanceMeasurement2D#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#iconClass)
  		 */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
  		 * Unit system (imperial, metric) or specific unit used for displaying the distance values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#unit)
  		 */
  var unit: js.UndefOr[
    imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
  
  /**
  		 * List of available units and unit systems (imperial, metric) for displaying the distance values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#unitOptions)
  		 */
  var unitOptions: js.UndefOr[
    js.Array[
      imperial | metric | millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ]
  ] = js.undefined
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#view)
  		 */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DistanceMeasurement2D.html#viewModel)
  		 */
  var viewModel: js.UndefOr[DistanceMeasurement2DViewModelProperties] = js.undefined
}
object DistanceMeasurement2DProperties {
  
  inline def apply(): DistanceMeasurement2DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceMeasurement2DProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistanceMeasurement2DProperties] (val x: Self) extends AnyVal {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
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
    
    inline def setViewModel(value: DistanceMeasurement2DViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
