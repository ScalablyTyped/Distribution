package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebTileLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties
     with PortalLayerProperties {
  /**
    * The attribution information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * A string of subDomain names where tiles are served to speed up tile retrieval. If subDomains are specified, the [urlTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#urlTemplate) should include a `{subDomain}` place holder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#subDomains)
    */
  var subDomains: js.UndefOr[js.Array[String]] = js.native
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.native
  /**
    * URL template for the hosted tiles. The `urlTemplate` should contain a `{subDomain}` place holder if [subDomains](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#subDomains) are specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#urlTemplate)
    */
  var urlTemplate: js.UndefOr[String] = js.native
}

object WebTileLayerProperties {
  @scala.inline
  def apply(): WebTileLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebTileLayerProperties]
  }
  @scala.inline
  implicit class WebTileLayerPropertiesOps[Self <: WebTileLayerProperties] (val x: Self) extends AnyVal {
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
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setSubDomainsVarargs(value: String*): Self = this.set("subDomains", js.Array(value :_*))
    @scala.inline
    def setSubDomains(value: js.Array[String]): Self = this.set("subDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubDomains: Self = this.set("subDomains", js.undefined)
    @scala.inline
    def setTileInfo(value: TileInfoProperties): Self = this.set("tileInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileInfo: Self = this.set("tileInfo", js.undefined)
    @scala.inline
    def setUrlTemplate(value: String): Self = this.set("urlTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlTemplate: Self = this.set("urlTemplate", js.undefined)
  }
  
}

