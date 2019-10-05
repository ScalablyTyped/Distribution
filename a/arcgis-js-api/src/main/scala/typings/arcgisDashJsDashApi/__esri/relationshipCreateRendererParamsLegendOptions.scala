package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait relationshipCreateRendererParamsLegendOptions extends Object {
  /**
    * Indicates whether to include the renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    */
  var showLegend: js.UndefOr[Boolean] = js.undefined
  /**
    * The title used to describe the renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    */
  var title: js.UndefOr[String] = js.undefined
}

object relationshipCreateRendererParamsLegendOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    showLegend: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): relationshipCreateRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(showLegend)) __obj.updateDynamic("showLegend")(showLegend)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[relationshipCreateRendererParamsLegendOptions]
  }
}

