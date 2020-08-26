package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshOnWindowFocus extends js.Object {
  var refreshOnWindowFocus: js.UndefOr[Boolean] = js.native
}

object RefreshOnWindowFocus {
  @scala.inline
  def apply(): RefreshOnWindowFocus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshOnWindowFocus]
  }
  @scala.inline
  implicit class RefreshOnWindowFocusOps[Self <: RefreshOnWindowFocus] (val x: Self) extends AnyVal {
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
    def setRefreshOnWindowFocus(value: Boolean): Self = this.set("refreshOnWindowFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshOnWindowFocus: Self = this.set("refreshOnWindowFocus", js.undefined)
  }
  
}

