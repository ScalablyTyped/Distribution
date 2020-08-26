package typings.amapJsApi.AMap.TileLayer.WMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typings.amapJsApi.AMap.TileLayer.Flexible.Options {
  /**
    * 地图级别切换时，不同级别的图片是否进行混合
    */
  var blend: js.UndefOr[Boolean] = js.native
  /**
    * OGC标准的WMS地图服务的GetMap接口的参数
    */
  var params: Params = js.native
  /**
    * wms服务的url地址
    */
  var url: String = js.native
}

object Options {
  @scala.inline
  def apply(params: Params, url: String): Options = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
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
    def setParams(value: Params): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlend(value: Boolean): Self = this.set("blend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlend: Self = this.set("blend", js.undefined)
  }
  
}

