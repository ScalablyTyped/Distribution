package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualVariablesResultColor extends Object {
  /**
    * The color scheme used by the visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var colorScheme: ColorScheme
  /**
    * A color visual variable configured based on the statistics of the data and the given basemap and scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#VisualVariablesResult)
    */
  var visualVariable: ColorVariable
}

object VisualVariablesResultColor {
  @scala.inline
  def apply(
    colorScheme: ColorScheme,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    visualVariable: ColorVariable
  ): VisualVariablesResultColor = {
    val __obj = js.Dynamic.literal(colorScheme = colorScheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), visualVariable = visualVariable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VisualVariablesResultColor]
  }
}

