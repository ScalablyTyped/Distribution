package typings.antd.anchorAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorState extends js.Object {
  var activeLink: Null | String = js.native
}

object AnchorState {
  @scala.inline
  def apply(): AnchorState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorState]
  }
  @scala.inline
  implicit class AnchorStateOps[Self <: AnchorState] (val x: Self) extends AnyVal {
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
    def setActiveLink(value: String): Self = this.set("activeLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveLinkNull: Self = this.set("activeLink", null)
  }
  
}

