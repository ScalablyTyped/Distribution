package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autoscroll extends js.Object {
  var autoscroll: js.UndefOr[Boolean] = js.undefined
}

object Anon_Autoscroll {
  @scala.inline
  def apply(autoscroll: js.UndefOr[Boolean] = js.undefined): Anon_Autoscroll = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoscroll)) __obj.updateDynamic("autoscroll")(autoscroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Autoscroll]
  }
}

