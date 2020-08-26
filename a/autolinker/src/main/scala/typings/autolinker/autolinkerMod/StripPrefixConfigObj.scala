package typings.autolinker.autolinkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripPrefixConfigObj extends js.Object {
  var scheme: js.UndefOr[Boolean] = js.native
  var www: js.UndefOr[Boolean] = js.native
}

object StripPrefixConfigObj {
  @scala.inline
  def apply(): StripPrefixConfigObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripPrefixConfigObj]
  }
  @scala.inline
  implicit class StripPrefixConfigObjOps[Self <: StripPrefixConfigObj] (val x: Self) extends AnyVal {
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
    def setScheme(value: Boolean): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    @scala.inline
    def setWww(value: Boolean): Self = this.set("www", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWww: Self = this.set("www", js.undefined)
  }
  
}

