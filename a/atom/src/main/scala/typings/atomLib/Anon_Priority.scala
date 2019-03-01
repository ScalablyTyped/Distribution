package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Priority extends js.Object {
  var priority: js.UndefOr[scala.Double] = js.undefined
  var watch: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Priority {
  @scala.inline
  def apply(priority: scala.Int | scala.Double = null, watch: js.UndefOr[scala.Boolean] = js.undefined): Anon_Priority = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[Anon_Priority]
  }
}

