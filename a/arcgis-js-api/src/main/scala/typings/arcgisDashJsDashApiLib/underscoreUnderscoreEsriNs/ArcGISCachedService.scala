package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISCachedService extends js.Object {
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
    */
  var copyright: java.lang.String
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
  def apply(copyright: java.lang.String, spatialReference: SpatialReference, tileInfo: TileInfo): ArcGISCachedService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copyright")(copyright)
    __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.updateDynamic("tileInfo")(tileInfo)
    __obj.asInstanceOf[ArcGISCachedService]
  }
}

