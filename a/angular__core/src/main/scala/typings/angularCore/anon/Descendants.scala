package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Descendants extends js.Object {
  var descendants: js.UndefOr[Boolean] = js.undefined
  var read: js.UndefOr[js.Any] = js.undefined
}

object Descendants {
  @scala.inline
  def apply(descendants: js.UndefOr[Boolean] = js.undefined, read: js.Any = null): Descendants = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(descendants)) __obj.updateDynamic("descendants")(descendants.get.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descendants]
  }
}

