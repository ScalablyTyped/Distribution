package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifyResultProperties extends js.Object {
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#displayFieldName)
    */
  var displayFieldName: js.UndefOr[String] = js.native
  /**
    * An identified feature from the map service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#feature)
    */
  var feature: js.UndefOr[GraphicProperties] = js.native
  /**
    * Unique ID of the layer that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#layerId)
    */
  var layerId: js.UndefOr[Double] = js.native
  /**
    * The layer name that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyResult.html#layerName)
    */
  var layerName: js.UndefOr[String] = js.native
}

object IdentifyResultProperties {
  @scala.inline
  def apply(): IdentifyResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentifyResultProperties]
  }
  @scala.inline
  implicit class IdentifyResultPropertiesOps[Self <: IdentifyResultProperties] (val x: Self) extends AnyVal {
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
    def setDisplayFieldName(value: String): Self = this.set("displayFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayFieldName: Self = this.set("displayFieldName", js.undefined)
    @scala.inline
    def setFeature(value: GraphicProperties): Self = this.set("feature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
    @scala.inline
    def setLayerId(value: Double): Self = this.set("layerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    @scala.inline
    def setLayerName(value: String): Self = this.set("layerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerName: Self = this.set("layerName", js.undefined)
  }
  
}

