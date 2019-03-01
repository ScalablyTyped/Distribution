package typings
package avvioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_After extends js.Object {
  var after: js.UndefOr[java.lang.String] = js.undefined
  var ready: js.UndefOr[java.lang.String] = js.undefined
  var use: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_After {
  @scala.inline
  def apply(after: java.lang.String = null, ready: java.lang.String = null, use: java.lang.String = null): Anon_After = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[Anon_After]
  }
}

