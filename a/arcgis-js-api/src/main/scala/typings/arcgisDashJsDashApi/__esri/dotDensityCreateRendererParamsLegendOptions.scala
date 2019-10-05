package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dotDensityCreateRendererParamsLegendOptions extends Object {
  /**
    * Indicates the unit represented by each dot in the legend. For example, in a population density map, you might set the value of `people` to this param. The output renderer would display `1 dot = 300 people` in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-dotDensity.html#createRenderer)
    */
  var unit: js.UndefOr[String] = js.undefined
}

object dotDensityCreateRendererParamsLegendOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    unit: String = null
  ): dotDensityCreateRendererParamsLegendOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[dotDensityCreateRendererParamsLegendOptions]
  }
}

