package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistrictSearchOptions extends js.Object {
  var extensions: js.UndefOr[String] = js.native
  var level: String = js.native
  var showbiz: js.UndefOr[Boolean] = js.native
  var subdistrict: js.UndefOr[Double] = js.native
}

object DistrictSearchOptions {
  @scala.inline
  def apply(level: String): DistrictSearchOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistrictSearchOptions]
  }
  @scala.inline
  implicit class DistrictSearchOptionsOps[Self <: DistrictSearchOptions] (val x: Self) extends AnyVal {
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
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensions(value: String): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setShowbiz(value: Boolean): Self = this.set("showbiz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowbiz: Self = this.set("showbiz", js.undefined)
    @scala.inline
    def setSubdistrict(value: Double): Self = this.set("subdistrict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdistrict: Self = this.set("subdistrict", js.undefined)
  }
  
}

