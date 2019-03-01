package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEProvider
// see http://docs.angularjs.org/api/ng.$sceProvider
///////////////////////////////////////////////////////////////////////////
trait ISCEProvider extends IServiceProvider {
  def enabled(value: scala.Boolean): scala.Unit
}

object ISCEProvider {
  @scala.inline
  def apply($get: js.Any, enabled: js.Function1[scala.Boolean, scala.Unit]): ISCEProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$get")($get)
    __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[ISCEProvider]
  }
}

