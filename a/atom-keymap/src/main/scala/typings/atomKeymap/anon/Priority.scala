package typings.atomKeymap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Priority extends js.Object {
  var priority: js.UndefOr[Double] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
}

object Priority {
  @scala.inline
  def apply(priority: js.UndefOr[Double] = js.undefined, watch: js.UndefOr[Boolean] = js.undefined): Priority = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Priority]
  }
}

