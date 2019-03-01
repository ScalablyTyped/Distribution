package typings
package autoprefixerDashCoreLib.autoprefixerDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var browsers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
  var remove: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    browsers: js.Array[java.lang.String] = null,
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    remove: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (browsers != null) __obj.updateDynamic("browsers")(browsers)
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[Config]
  }
}

