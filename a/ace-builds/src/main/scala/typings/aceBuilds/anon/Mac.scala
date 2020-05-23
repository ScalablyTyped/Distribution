package typings.aceBuilds.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mac extends js.Object {
  var mac: js.UndefOr[String] = js.undefined
  var win: js.UndefOr[String] = js.undefined
}

object Mac {
  @scala.inline
  def apply(mac: String = null, win: String = null): Mac = {
    val __obj = js.Dynamic.literal()
    if (mac != null) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (win != null) __obj.updateDynamic("win")(win.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mac]
  }
}

