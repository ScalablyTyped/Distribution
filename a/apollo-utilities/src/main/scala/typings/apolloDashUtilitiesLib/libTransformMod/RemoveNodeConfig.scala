package typings
package apolloDashUtilitiesLib.libTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveNodeConfig[N] extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  var test: js.UndefOr[js.Function1[/* node */ N, scala.Boolean]] = js.undefined
}

object RemoveNodeConfig {
  @scala.inline
  def apply[N](
    name: java.lang.String = null,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    test: js.Function1[/* node */ N, scala.Boolean] = null
  ): RemoveNodeConfig[N] = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[RemoveNodeConfig[N]]
  }
}

