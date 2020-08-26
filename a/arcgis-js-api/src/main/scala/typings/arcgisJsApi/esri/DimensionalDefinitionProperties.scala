package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionalDefinitionProperties extends js.Object {
  /**
    * The dimension associated with the variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#dimensionName)
    */
  var dimensionName: js.UndefOr[String] = js.native
  /**
    * Indicates whether the values indicate slices (rather than ranges).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#isSlice)
    *
    * @default false
    */
  var isSlice: js.UndefOr[Boolean] = js.native
  /**
    * An array of single values or tuples [min, max] each defining a range of valid values along the specified dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#values)
    */
  var values: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.native
  /**
    * The required variable name by which to filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-DimensionalDefinition.html#variableName)
    */
  var variableName: js.UndefOr[String] = js.native
}

object DimensionalDefinitionProperties {
  @scala.inline
  def apply(): DimensionalDefinitionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionalDefinitionProperties]
  }
  @scala.inline
  implicit class DimensionalDefinitionPropertiesOps[Self <: DimensionalDefinitionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDimensionName(value: String): Self = this.set("dimensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionName: Self = this.set("dimensionName", js.undefined)
    @scala.inline
    def setIsSlice(value: Boolean): Self = this.set("isSlice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSlice: Self = this.set("isSlice", js.undefined)
    @scala.inline
    def setValuesVarargs(value: (Double | js.Array[Double])*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[Double | js.Array[Double]]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    @scala.inline
    def setVariableName(value: String): Self = this.set("variableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableName: Self = this.set("variableName", js.undefined)
  }
  
}

