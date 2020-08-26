package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultOpenAll extends js.Object {
  var defaultOpenAll: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[Boolean] = js.native
}

object DefaultOpenAll {
  @scala.inline
  def apply(): DefaultOpenAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultOpenAll]
  }
  @scala.inline
  implicit class DefaultOpenAllOps[Self <: DefaultOpenAll] (val x: Self) extends AnyVal {
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
    def setDefaultOpenAll(value: Boolean): Self = this.set("defaultOpenAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpenAll: Self = this.set("defaultOpenAll", js.undefined)
    @scala.inline
    def setLocale(value: Boolean): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
  
}

