package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.exclusive
import typings.arcgisJsApi.arcgisJsApiStrings.independent
import typings.arcgisJsApi.arcgisJsApiStrings.inherited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLayerProperties
  extends LayerProperties
     with LayersMixinProperties
     with PortalLayerProperties {
  /**
    * Indicates how to manage the visibility of the children layers. Possible values are described in the table below.
    *
    * Value | Description
    * ------|------------
    * independent | Each child layer manages its visibility independent from other layers.
    * inherited | Each child layer's visibility matches the [GroupLayer’s visibility](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visible).
    * exclusive | Only one child layer is visible at a time.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visibilityMode)
    */
  var visibilityMode: js.UndefOr[independent | inherited | exclusive] = js.native
}

object GroupLayerProperties {
  @scala.inline
  def apply(): GroupLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLayerProperties]
  }
  @scala.inline
  implicit class GroupLayerPropertiesOps[Self <: GroupLayerProperties] (val x: Self) extends AnyVal {
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
    def setVisibilityMode(value: independent | inherited | exclusive): Self = this.set("visibilityMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibilityMode: Self = this.set("visibilityMode", js.undefined)
  }
  
}

