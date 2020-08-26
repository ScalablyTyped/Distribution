package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindResultProperties extends js.Object {
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#displayFieldName)
    */
  var displayFieldName: js.UndefOr[String] = js.native
  /**
    * The found feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#feature)
    */
  var feature: js.UndefOr[GraphicProperties] = js.native
  /**
    * The name of the field that contains the search text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#foundFieldName)
    */
  var foundFieldName: js.UndefOr[String] = js.native
  /**
    * Unique ID of the layer that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#layerId)
    */
  var layerId: js.UndefOr[Double] = js.native
  /**
    * The layer name that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#layerName)
    */
  var layerName: js.UndefOr[String] = js.native
  /**
    * The value of the `foundFieldName` in the feature's attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#value)
    */
  var value: js.UndefOr[String] = js.native
}

object FindResultProperties {
  @scala.inline
  def apply(): FindResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindResultProperties]
  }
  @scala.inline
  implicit class FindResultPropertiesOps[Self <: FindResultProperties] (val x: Self) extends AnyVal {
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
    def setFoundFieldName(value: String): Self = this.set("foundFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFoundFieldName: Self = this.set("foundFieldName", js.undefined)
    @scala.inline
    def setLayerId(value: Double): Self = this.set("layerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    @scala.inline
    def setLayerName(value: String): Self = this.set("layerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerName: Self = this.set("layerName", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

