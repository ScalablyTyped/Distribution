package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationLayerProperties
  extends LayerProperties
     with ArcGISCachedServiceProperties
     with PortalLayerProperties {
  /**
    * The [image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#properties-summary) are exposed on the ElevationLayer class directly, this property gives access to all information returned by the elevation image service. This property is useful if working in an application built using an older version of the API which requires access to elevation image service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  /**
    * URL pointing to the Elevation layer resource on an ArcGIS Image Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object ElevationLayerProperties {
  @scala.inline
  def apply(): ElevationLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElevationLayerProperties]
  }
  @scala.inline
  implicit class ElevationLayerPropertiesOps[Self <: ElevationLayerProperties] (val x: Self) extends AnyVal {
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
    def setSourceJSON(value: js.Any): Self = this.set("sourceJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceJSON: Self = this.set("sourceJSON", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

