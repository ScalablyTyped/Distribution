package typings.amapDashJsDashApi.AMap.TileLayer

import typings.amapDashJsDashApi.AMap.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.amapDashJsDashApi.AMap.Layer.Options {
  /**
    * 是否在高清屏下进行清晰度适配
    */
  var detectRetina: js.UndefOr[Boolean] = js.undefined
  /**
    * 取图错误时的代替地址
    */
  var errorUrl: js.UndefOr[String] = js.undefined
  /**
    * 获取图块取图地址
    */
  var getTileUrl: js.UndefOr[
    String | (js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String])
  ] = js.undefined
  /**
    * 图层的透明度
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * 切片大小
    */
  var tileSize: js.UndefOr[Double] = js.undefined
  /**
    * 切片取图地址(自1.3版本起，该属性与getTileUrl属性合并)
    */
  var tileUrl: js.UndefOr[String] = js.undefined
  /**
    * 图层叠加的顺序值
    */
  var zIndex: js.UndefOr[Double] = js.undefined
  /**
    * 支持的缩放级别范围
    */
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    detectRetina: js.UndefOr[Boolean] = js.undefined,
    errorUrl: String = null,
    getTileUrl: String | (js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String]) = null,
    map: Map = null,
    opacity: Int | Double = null,
    tileSize: Int | Double = null,
    tileUrl: String = null,
    zIndex: Int | Double = null,
    zooms: js.Tuple2[Double, Double] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectRetina)) __obj.updateDynamic("detectRetina")(detectRetina)
    if (errorUrl != null) __obj.updateDynamic("errorUrl")(errorUrl)
    if (getTileUrl != null) __obj.updateDynamic("getTileUrl")(getTileUrl.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (tileUrl != null) __obj.updateDynamic("tileUrl")(tileUrl)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zooms != null) __obj.updateDynamic("zooms")(zooms)
    __obj.asInstanceOf[Options]
  }
}

