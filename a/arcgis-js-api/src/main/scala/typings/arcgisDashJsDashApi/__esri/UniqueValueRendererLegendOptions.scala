package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniqueValueRendererLegendOptions extends Object {
  /**
    * Describes the variable driving the visualization. This is displayed as the title of the corresponding renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) and takes precedence over a [field alias](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#alias) or [valueExpressionTitle](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpressionTitle).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#legendOptions)
    */
  var title: js.UndefOr[String] = js.undefined
}

object UniqueValueRendererLegendOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    title: String = null
  ): UniqueValueRendererLegendOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[UniqueValueRendererLegendOptions]
  }
}

