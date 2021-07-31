package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait colorCreateAgeRendererParamsLegendOptions
  extends StObject
     with Object {
  
  /**
    * Indicates whether to include the age renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var showLegend: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The title used to represent the age color ramp in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var title: js.UndefOr[String] = js.undefined
}
object colorCreateAgeRendererParamsLegendOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): colorCreateAgeRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[colorCreateAgeRendererParamsLegendOptions]
  }
  
  @scala.inline
  implicit class colorCreateAgeRendererParamsLegendOptionsMutableBuilder[Self <: colorCreateAgeRendererParamsLegendOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
