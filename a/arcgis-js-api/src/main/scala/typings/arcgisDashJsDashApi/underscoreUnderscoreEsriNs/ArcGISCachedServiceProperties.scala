package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISCachedServiceProperties extends js.Object {
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  /**
    * Contains information about the tiling scheme for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISCachedService.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.undefined
}

object ArcGISCachedServiceProperties {
  @scala.inline
  def apply(copyright: String = null, tileInfo: TileInfoProperties = null): ArcGISCachedServiceProperties = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (tileInfo != null) __obj.updateDynamic("tileInfo")(tileInfo)
    __obj.asInstanceOf[ArcGISCachedServiceProperties]
  }
}

