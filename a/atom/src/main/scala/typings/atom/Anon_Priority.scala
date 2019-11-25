package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Priority extends js.Object {
  var priority: js.UndefOr[Double] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
}

object Anon_Priority {
  @scala.inline
  def apply(priority: Int | Double = null, watch: js.UndefOr[Boolean] = js.undefined): Anon_Priority = {
    val __obj = js.Dynamic.literal()
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Priority]
  }
}

