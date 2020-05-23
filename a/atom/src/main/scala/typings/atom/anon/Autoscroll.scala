package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autoscroll extends js.Object {
  var autoscroll: js.UndefOr[Boolean] = js.undefined
}

object Autoscroll {
  @scala.inline
  def apply(autoscroll: js.UndefOr[Boolean] = js.undefined): Autoscroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoscroll)) __obj.updateDynamic("autoscroll")(autoscroll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoscroll]
  }
}

