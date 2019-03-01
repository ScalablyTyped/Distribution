package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capability extends js.Object {
  /** Name of the capability. */
  var name: SurfaceCapabilities
}

object Capability {
  @scala.inline
  def apply(name: SurfaceCapabilities): Capability = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Capability]
  }
}

