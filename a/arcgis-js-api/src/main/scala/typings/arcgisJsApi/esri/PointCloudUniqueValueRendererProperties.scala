package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typings.arcgisJsApi.arcgisJsApiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudUniqueValueRendererProperties extends PointCloudRendererProperties {
  /**
    * Each element in the array is an object that matches a unique value with a specific color. Features with equal values to those specified here will be assigned the associated color. For example, you may choose to visualize points representing low vegetation with a green color and points representing power lines with a gray color. Each object has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var colorUniqueValueInfos: js.UndefOr[js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos]] = js.native
  /**
    * The name of the field whose values are used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.native
  /**
    * A transform that is applied to the field value before evaluating the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#fieldTransformType)
    *
    * @default null
    */
  var fieldTransformType: js.UndefOr[none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`] = js.native
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[PointCloudUniqueValueRendererLegendOptions] = js.native
}

object PointCloudUniqueValueRendererProperties {
  @scala.inline
  def apply(): PointCloudUniqueValueRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudUniqueValueRendererProperties]
  }
  @scala.inline
  implicit class PointCloudUniqueValueRendererPropertiesOps[Self <: PointCloudUniqueValueRendererProperties] (val x: Self) extends AnyVal {
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
    def setColorUniqueValueInfosVarargs(value: PointCloudUniqueValueRendererColorUniqueValueInfos*): Self = this.set("colorUniqueValueInfos", js.Array(value :_*))
    @scala.inline
    def setColorUniqueValueInfos(value: js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos]): Self = this.set("colorUniqueValueInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorUniqueValueInfos: Self = this.set("colorUniqueValueInfos", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setFieldTransformType(value: none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`): Self = this.set("fieldTransformType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldTransformType: Self = this.set("fieldTransformType", js.undefined)
    @scala.inline
    def setLegendOptions(value: PointCloudUniqueValueRendererLegendOptions): Self = this.set("legendOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendOptions: Self = this.set("legendOptions", js.undefined)
  }
  
}

