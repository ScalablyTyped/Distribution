package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualVariablesResultColor
  extends stdLib.Object {
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
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    visualVariable: ColorVariable
  ): VisualVariablesResultColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colorScheme")(colorScheme)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("visualVariable")(visualVariable)
    __obj.asInstanceOf[VisualVariablesResultColor]
  }
}

