package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`hide-children`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hide
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationLayerProperties
  extends LayerProperties
     with ArcGISCachedServiceProperties
     with PortalLayerProperties {
  /**
    * URL pointing to the Elevation layer resource on an ArcGIS Image Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
}

object ElevationLayerProperties {
  @scala.inline
  def apply(
    copyright: String = null,
    fullExtent: ExtentProperties = null,
    id: String = null,
    listMode: show | hide | `hide-children` = null,
    opacity: Int | Double = null,
    portalItem: PortalItemProperties = null,
    tileInfo: TileInfoProperties = null,
    title: String = null,
    url: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ElevationLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (id != null) __obj.updateDynamic("id")(id)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (tileInfo != null) __obj.updateDynamic("tileInfo")(tileInfo)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ElevationLayerProperties]
  }
}

