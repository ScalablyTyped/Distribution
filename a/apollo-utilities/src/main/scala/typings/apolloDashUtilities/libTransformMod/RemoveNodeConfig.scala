package typings.apolloDashUtilities.libTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveNodeConfig[N] extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var test: js.UndefOr[js.Function1[/* node */ N, Boolean]] = js.undefined
}

object RemoveNodeConfig {
  @scala.inline
  def apply[N](
    name: String = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    test: /* node */ N => Boolean = null
  ): RemoveNodeConfig[N] = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction1(test))
    __obj.asInstanceOf[RemoveNodeConfig[N]]
  }
}

