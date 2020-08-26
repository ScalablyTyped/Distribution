package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveLink extends js.Object {
  var activeLink: Null = js.native
}

object ActiveLink {
  @scala.inline
  def apply(activeLink: Null): ActiveLink = {
    val __obj = js.Dynamic.literal(activeLink = activeLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveLink]
  }
  @scala.inline
  implicit class ActiveLinkOps[Self <: ActiveLink] (val x: Self) extends AnyVal {
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
    def setActiveLink(value: Null): Self = this.set("activeLink", value.asInstanceOf[js.Any])
  }
  
}

