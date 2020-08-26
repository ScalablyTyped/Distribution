package typings.amapJsApi.AMap.TileLayer.Flexible

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typings.amapJsApi.AMap.TileLayer.Options {
  /**
    * 内存中缓存的切片的数量上限
    */
  var cacheSize: js.UndefOr[Double] = js.native
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
  ] = js.native
  /**
    * 是否显示
    */
  var visible: js.UndefOr[Boolean] = js.native
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
    def setCacheSize(value: Double): Self = this.set("cacheSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheSize: Self = this.set("cacheSize", js.undefined)
    @scala.inline
    def setCreateTile(
      value: (/* x */ Double, /* y */ Double, /* z */ Double, /* success */ js.Function1[/* tile */ HTMLImageElement | HTMLCanvasElement, Unit], /* fail */ js.Function0[Unit]) => Unit
    ): Self = this.set("createTile", js.Any.fromFunction5(value))
    @scala.inline
    def deleteCreateTile: Self = this.set("createTile", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

