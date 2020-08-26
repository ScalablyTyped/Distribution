package typings.amapJsApi.AMap.Rectangle

import typings.amapJsApi.AMap.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[ExtraData]
  extends typings.amapJsApi.AMap.Polygon.Options[ExtraData] {
  /**
    * 矩形的范围
    */
  var bounds: js.UndefOr[Bounds] = js.native
}

object Options {
  @scala.inline
  def apply[ExtraData](): Options[ExtraData] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[ExtraData]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], ExtraData] (val x: Self with Options[ExtraData]) extends AnyVal {
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
    def setBounds(value: Bounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
  }
  
}

