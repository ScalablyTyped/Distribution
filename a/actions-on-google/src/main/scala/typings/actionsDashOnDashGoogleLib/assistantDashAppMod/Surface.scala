package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Surface extends js.Object {
  /** Capabilities of the surface. */
  var capabilities: js.Array[Capability]
}

object Surface {
  @scala.inline
  def apply(capabilities: js.Array[Capability]): Surface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capabilities")(capabilities)
    __obj.asInstanceOf[Surface]
  }
}

