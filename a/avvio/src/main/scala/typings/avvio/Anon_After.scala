package typings.avvio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var ready: js.UndefOr[String] = js.undefined
  var use: js.UndefOr[String] = js.undefined
}

object Anon_After {
  @scala.inline
  def apply(after: String = null, ready: String = null, use: String = null): Anon_After = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(ready.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_After]
  }
}

