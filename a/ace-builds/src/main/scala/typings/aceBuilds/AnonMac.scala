package typings.aceBuilds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMac extends js.Object {
  var mac: js.UndefOr[String] = js.undefined
  var win: js.UndefOr[String] = js.undefined
}

object AnonMac {
  @scala.inline
  def apply(mac: String = null, win: String = null): AnonMac = {
    val __obj = js.Dynamic.literal()
    if (mac != null) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (win != null) __obj.updateDynamic("win")(win.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMac]
  }
}

