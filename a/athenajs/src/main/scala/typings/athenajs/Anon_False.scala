package typings.athenajs

import typings.athenajs.athenajsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var loop: js.UndefOr[`false`] = js.undefined
  var pan: js.UndefOr[Boolean] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(loop: `false` = null, pan: js.UndefOr[Boolean] = js.undefined): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(pan)) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

