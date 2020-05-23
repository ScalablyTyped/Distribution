package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionalDefinitionProperties extends js.Object {
  /**
    * The dimension associated with the variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#dimensionName)
    */
  var dimensionName: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the values indicate slices (rather than ranges).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#isSlice)
    *
    * @default false
    */
  var isSlice: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of single values or tuples [min, max] each defining a range of valid values along the specified dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#values)
    */
  var values: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
  /**
    * The required variable name by which to filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#variableName)
    */
  var variableName: js.UndefOr[String] = js.undefined
}

object DimensionalDefinitionProperties {
  @scala.inline
  def apply(
    dimensionName: String = null,
    isSlice: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[Double | js.Array[Double]] = null,
    variableName: String = null
  ): DimensionalDefinitionProperties = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName.asInstanceOf[js.Any])
    if (!js.isUndefined(isSlice)) __obj.updateDynamic("isSlice")(isSlice.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (variableName != null) __obj.updateDynamic("variableName")(variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionalDefinitionProperties]
  }
}

