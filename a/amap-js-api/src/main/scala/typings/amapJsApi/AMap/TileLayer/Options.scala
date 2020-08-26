package typings.amapJsApi.AMap.TileLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typings.amapJsApi.AMap.Layer.Options {
  /**
    * 是否在高清屏下进行清晰度适配
    */
  var detectRetina: js.UndefOr[Boolean] = js.native
  /**
    * 取图错误时的代替地址
    */
  var errorUrl: js.UndefOr[String] = js.native
  /**
    * 获取图块取图地址
    */
  var getTileUrl: js.UndefOr[
    String | (js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String])
  ] = js.native
  /**
    * 图层的透明度
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * 切片大小
    */
  var tileSize: js.UndefOr[Double] = js.native
  /**
    * 切片取图地址(自1.3版本起，该属性与getTileUrl属性合并)
    */
  var tileUrl: js.UndefOr[String] = js.native
  /**
    * 图层叠加的顺序值
    */
  var zIndex: js.UndefOr[Double] = js.native
  /**
    * 支持的缩放级别范围
    */
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setDetectRetina(value: Boolean): Self = this.set("detectRetina", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectRetina: Self = this.set("detectRetina", js.undefined)
    @scala.inline
    def setErrorUrl(value: String): Self = this.set("errorUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorUrl: Self = this.set("errorUrl", js.undefined)
    @scala.inline
    def setGetTileUrlFunction3(value: (/* x */ Double, /* y */ Double, /* level */ Double) => String): Self = this.set("getTileUrl", js.Any.fromFunction3(value))
    @scala.inline
    def setGetTileUrl(value: String | (js.Function3[/* x */ Double, /* y */ Double, /* level */ Double, String])): Self = this.set("getTileUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetTileUrl: Self = this.set("getTileUrl", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    @scala.inline
    def setTileUrl(value: String): Self = this.set("tileUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileUrl: Self = this.set("tileUrl", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    @scala.inline
    def setZooms(value: js.Tuple2[Double, Double]): Self = this.set("zooms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZooms: Self = this.set("zooms", js.undefined)
  }
  
}

