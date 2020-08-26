package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortalItemResourceProperties extends js.Object {
  /**
    * Path of the resource relative to `{ITEM}/resources/`. Resource paths may include subfolders, but are always specified relative to the item resources endpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#path)
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html) that owns the resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItemResource.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.native
}

object PortalItemResourceProperties {
  @scala.inline
  def apply(): PortalItemResourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalItemResourceProperties]
  }
  @scala.inline
  implicit class PortalItemResourcePropertiesOps[Self <: PortalItemResourceProperties] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPortalItem(value: PortalItemProperties): Self = this.set("portalItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortalItem: Self = this.set("portalItem", js.undefined)
  }
  
}

