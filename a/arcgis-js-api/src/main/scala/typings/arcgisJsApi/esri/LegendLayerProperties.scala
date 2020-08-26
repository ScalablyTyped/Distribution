package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendLayerProperties extends js.Object {
  /**
    * The id of the operational layer to include in the printout's legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html#layerId)
    */
  var layerId: js.UndefOr[String] = js.native
  /**
    * The ids of the sublayers to include in the printout's legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html#subLayerIds)
    */
  var subLayerIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The title of the feature layer. Use this property to modify feature layer name in the legend for the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html#title)
    */
  var title: js.UndefOr[String] = js.native
}

object LegendLayerProperties {
  @scala.inline
  def apply(): LegendLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendLayerProperties]
  }
  @scala.inline
  implicit class LegendLayerPropertiesOps[Self <: LegendLayerProperties] (val x: Self) extends AnyVal {
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
    def setLayerId(value: String): Self = this.set("layerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    @scala.inline
    def setSubLayerIdsVarargs(value: String*): Self = this.set("subLayerIds", js.Array(value :_*))
    @scala.inline
    def setSubLayerIds(value: js.Array[String]): Self = this.set("subLayerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubLayerIds: Self = this.set("subLayerIds", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

