package typings.angular.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var requireBase: js.UndefOr[Boolean] = js.native
  var rewriteLinks: js.UndefOr[Boolean] = js.native
}

object Enabled {
  @scala.inline
  def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  @scala.inline
  implicit class EnabledOps[Self <: Enabled] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setRequireBase(value: Boolean): Self = this.set("requireBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireBase: Self = this.set("requireBase", js.undefined)
    @scala.inline
    def setRewriteLinks(value: Boolean): Self = this.set("rewriteLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRewriteLinks: Self = this.set("rewriteLinks", js.undefined)
  }
  
}

