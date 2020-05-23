package typings.amapJsApi.AMap.TileLayer.Flexible

import typings.amapJsApi.AMap.Map
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.amapJsApi.AMap.TileLayer.Options {
  /**
    * 内存中缓存的切片的数量上限
    */
  var cacheSize: js.UndefOr[Double] = js.undefined
  /**
    * 创建切片回调
    * @param x 横坐标
    * @param y 纵坐标
    * @param z 层级
    * @param success 成功回调
    * @param fail 失败回调
    */
  var createTile: js.UndefOr[
    js.Function5[
      /* x */ Double, 
      /* y */ Double, 
      /* z */ Double, 
      /* success */ js.Function1[/* tile */ HTMLImageElement | HTMLCanvasElement, Unit], 
      /* fail */ js.Function0[Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * 是否显示
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cacheSize: js.UndefOr[Double] = js.undefined,
    createTile: (/* x */ Double, /* y */ Double, /* z */ Double, /* success */ js.Function1[/* tile */ HTMLImageElement | HTMLCanvasElement, Unit], /* fail */ js.Function0[Unit]) => Unit = null,
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    errorUrl: String = null,
    getTileUrl: String | (js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String]) = null,
    map: Map = null,
    opacity: js.UndefOr[Double] = js.undefined,
    tileSize: js.UndefOr[Double] = js.undefined,
    tileUrl: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined,
    zooms: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (createTile != null) __obj.updateDynamic("createTile")(js.Any.fromFunction5(createTile))
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina.get.asInstanceOf[js.Any])
    if (errorUrl != null) __obj.updateDynamic("errorUrl")(errorUrl.asInstanceOf[js.Any])
    if (getTileUrl != null) __obj.updateDynamic("getTileUrl")(getTileUrl.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSize)) __obj.updateDynamic("tileSize")(tileSize.get.asInstanceOf[js.Any])
    if (tileUrl != null) __obj.updateDynamic("tileUrl")(tileUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

