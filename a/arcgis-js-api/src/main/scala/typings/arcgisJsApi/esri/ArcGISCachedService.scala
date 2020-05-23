package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISCachedService extends js.Object {
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
    */
  var copyright: String
  /**
    * The spatial reference of the layer as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#spatialReference)
    */
  val spatialReference: SpatialReference
  /**
    * Contains information about the tiling scheme for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    */
  var tileInfo: TileInfo
}

object ArcGISCachedService {
  @scala.inline
  def apply(copyright: String, spatialReference: SpatialReference, tileInfo: TileInfo): ArcGISCachedService = {
    val __obj = js.Dynamic.literal(copyright = copyright.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], tileInfo = tileInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISCachedService]
  }
}

