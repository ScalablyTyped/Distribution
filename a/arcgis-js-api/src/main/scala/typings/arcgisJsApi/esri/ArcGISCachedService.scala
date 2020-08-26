package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArcGISCachedService extends js.Object {
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
    */
  var copyright: String = js.native
  /**
    * The spatial reference of the layer as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#spatialReference)
    */
  val spatialReference: SpatialReference = js.native
  /**
    * Contains information about the tiling scheme for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    */
  var tileInfo: TileInfo = js.native
}

object ArcGISCachedService {
  @scala.inline
  def apply(copyright: String, spatialReference: SpatialReference, tileInfo: TileInfo): ArcGISCachedService = {
    val __obj = js.Dynamic.literal(copyright = copyright.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], tileInfo = tileInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISCachedService]
  }
  @scala.inline
  implicit class ArcGISCachedServiceOps[Self <: ArcGISCachedService] (val x: Self) extends AnyVal {
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
    def setSpatialReference(value: SpatialReference): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileInfo(value: TileInfo): Self = this.set("tileInfo", value.asInstanceOf[js.Any])
  }
  
}

