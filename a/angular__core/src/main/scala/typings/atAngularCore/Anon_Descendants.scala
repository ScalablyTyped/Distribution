package typings.atAngularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Descendants extends js.Object {
  var descendants: js.UndefOr[Boolean] = js.undefined
  var read: js.UndefOr[js.Any] = js.undefined
}

object Anon_Descendants {
  @scala.inline
  def apply(descendants: js.UndefOr[Boolean] = js.undefined, read: js.Any = null): Anon_Descendants = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(descendants)) __obj.updateDynamic("descendants")(descendants)
    if (read != null) __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[Anon_Descendants]
  }
}

