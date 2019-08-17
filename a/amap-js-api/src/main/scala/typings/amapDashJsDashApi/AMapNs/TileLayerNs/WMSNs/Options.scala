package typings.amapDashJsDashApi.AMapNs.TileLayerNs.WMSNs

import typings.amapDashJsDashApi.AMapNs.Map
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.amapDashJsDashApi.AMapNs.TileLayerNs.FlexibleNs.Options {
  /**
    * 地图级别切换时，不同级别的图片是否进行混合
    */
  var blend: js.UndefOr[Boolean] = js.undefined
  /**
    * OGC标准的WMS地图服务的GetMap接口的参数
    */
  var params: Params
  /**
    * wms服务的url地址
    */
  var url: String
}

object Options {
  @scala.inline
  def apply(
    params: Params,
    url: String,
    blend: js.UndefOr[Boolean] = js.undefined,
    cacheSize: Int | Double = null,
    createTile: (/* x */ Double, /* y */ Double, /* z */ Double, /* success */ js.Function1[/* tile */ HTMLImageElement | HTMLCanvasElement, Unit], /* fail */ js.Function0[Unit]) => Unit = null,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    errorUrl: String = null,
    getTileUrl: String | (js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String]) = null,
    map: Map = null,
    opacity: Int | Double = null,
    tileSize: Int | Double = null,
    tileUrl: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null,
    zooms: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal(params = params, url = url)
    if (!js.isUndefined(blend)) __obj.updateDynamic("blend")(blend)
    if (cacheSize != null) __obj.updateDynamic("cacheSize")(cacheSize.asInstanceOf[js.Any])
    if (createTile != null) __obj.updateDynamic("createTile")(js.Any.fromFunction5(createTile))
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina)
    if (errorUrl != null) __obj.updateDynamic("errorUrl")(errorUrl)
    if (getTileUrl != null) __obj.updateDynamic("getTileUrl")(getTileUrl.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileUrl != null) __obj.updateDynamic("tileUrl")(tileUrl)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms)
    __obj.asInstanceOf[Options]
  }
}

