package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backwards extends js.Object {
  var backwards: js.UndefOr[Boolean] = js.undefined
}

object Backwards {
  @scala.inline
  def apply(backwards: js.UndefOr[Boolean] = js.undefined): Backwards = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backwards)) __obj.updateDynamic("backwards")(backwards.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backwards]
  }
}

