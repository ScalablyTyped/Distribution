package typings
package apolloDashUtilitiesLib.libTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNodeConfig[N] extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var test: js.UndefOr[js.Function1[/* node */ N, scala.Boolean]] = js.undefined
}

object GetNodeConfig {
  @scala.inline
  def apply[N](name: java.lang.String = null, test: js.Function1[/* node */ N, scala.Boolean] = null): GetNodeConfig[N] = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[GetNodeConfig[N]]
  }
}

