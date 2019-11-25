package typings.apolloDashUtilities.libTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNodeConfig[N] extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var test: js.UndefOr[js.Function1[/* node */ N, Boolean]] = js.undefined
}

object GetNodeConfig {
  @scala.inline
  def apply[N](name: String = null, test: /* node */ N => Boolean = null): GetNodeConfig[N] = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction1(test))
    __obj.asInstanceOf[GetNodeConfig[N]]
  }
}

