package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudUniqueValueRendererColorUniqueValueInfos extends Object {
  /**
    * The color used to represent points whose value matches `values`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var color: Color_ = js.native
  /**
    * Label used to describe points matched to the unique value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * A unique combination of values that will be represented with the given `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var values: js.Array[String] = js.native
}

object PointCloudUniqueValueRendererColorUniqueValueInfos {
  @scala.inline
  def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    values: js.Array[String]
  ): PointCloudUniqueValueRendererColorUniqueValueInfos = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudUniqueValueRendererColorUniqueValueInfos]
  }
  @scala.inline
  implicit class PointCloudUniqueValueRendererColorUniqueValueInfosOps[Self <: PointCloudUniqueValueRendererColorUniqueValueInfos] (val x: Self) extends AnyVal {
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
    def setColor(value: Color_): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

