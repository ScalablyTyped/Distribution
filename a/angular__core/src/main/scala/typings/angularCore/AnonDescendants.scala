package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescendants extends js.Object {
  var descendants: js.UndefOr[Boolean] = js.undefined
  var read: js.UndefOr[js.Any] = js.undefined
}

object AnonDescendants {
  @scala.inline
  def apply(descendants: js.UndefOr[Boolean] = js.undefined, read: js.Any = null): AnonDescendants = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(descendants)) __obj.updateDynamic("descendants")(descendants.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescendants]
  }
}

