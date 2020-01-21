package typings.avvio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfter extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var ready: js.UndefOr[String] = js.undefined
  var use: js.UndefOr[String] = js.undefined
}

object AnonAfter {
  @scala.inline
  def apply(after: String = null, ready: String = null, use: String = null): AnonAfter = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfter]
  }
}

