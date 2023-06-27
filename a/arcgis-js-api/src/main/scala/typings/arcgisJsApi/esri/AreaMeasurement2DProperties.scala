package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`square-centimeters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-decimeters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-inches`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-millimeters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.acres
import typings.arcgisJsApi.arcgisJsApiStrings.ares
import typings.arcgisJsApi.arcgisJsApiStrings.hectares
import typings.arcgisJsApi.arcgisJsApiStrings.imperial
import typings.arcgisJsApi.arcgisJsApiStrings.metric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMeasurement2DProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/AreaMeasurement2D#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#iconClass)
  		 */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
  		 * Unit system (imperial, metric) or specific unit used for displaying the area values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#unit)
  		 */
  var unit: js.UndefOr[
    imperial | metric | `square-millimeters` | `square-centimeters` | `square-decimeters` | `square-meters` | `square-kilometers` | `square-inches` | `square-feet` | `square-yards` | `square-miles` | `square-us-feet` | acres | ares | hectares
  ] = js.undefined
  
  /**
  		 * List of available units and unit systems (imperial, metric) for displaying the area values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#unitOptions)
  		 */
  var unitOptions: js.UndefOr[
    js.Array[
      imperial | metric | `square-millimeters` | `square-centimeters` | `square-decimeters` | `square-meters` | `square-kilometers` | `square-inches` | `square-feet` | `square-yards` | `square-miles` | `square-us-feet` | acres | ares | hectares
    ]
  ] = js.undefined
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#view)
  		 */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement2D.html#viewModel)
  		 */
  var viewModel: js.UndefOr[AreaMeasurement2DViewModel] = js.undefined
}
object AreaMeasurement2DProperties {
  
  inline def apply(): AreaMeasurement2DProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaMeasurement2DProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AreaMeasurement2DProperties] (val x: Self) extends AnyVal {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setUnit(
      value: imperial | metric | `square-millimeters` | `square-centimeters` | `square-decimeters` | `square-meters` | `square-kilometers` | `square-inches` | `square-feet` | `square-yards` | `square-miles` | `square-us-feet` | acres | ares | hectares
    ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitOptions(
      value: js.Array[
          imperial | metric | `square-millimeters` | `square-centimeters` | `square-decimeters` | `square-meters` | `square-kilometers` | `square-inches` | `square-feet` | `square-yards` | `square-miles` | `square-us-feet` | acres | ares | hectares
        ]
    ): Self = StObject.set(x, "unitOptions", value.asInstanceOf[js.Any])
    
    inline def setUnitOptionsUndefined: Self = StObject.set(x, "unitOptions", js.undefined)
    
    inline def setUnitOptionsVarargs(
      value: (imperial | metric | `square-millimeters` | `square-centimeters` | `square-decimeters` | `square-meters` | `square-kilometers` | `square-inches` | `square-feet` | `square-yards` | `square-miles` | `square-us-feet` | acres | ares | hectares)*
    ): Self = StObject.set(x, "unitOptions", js.Array(value*))
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: AreaMeasurement2DViewModel): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
