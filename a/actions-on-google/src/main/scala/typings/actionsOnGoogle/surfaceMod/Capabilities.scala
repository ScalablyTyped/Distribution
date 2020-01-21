package typings.actionsOnGoogle.surfaceMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2Capability
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/surface", "Capabilities")
@js.native
/** @hidden */
class Capabilities () extends js.Object {
  def this(list: js.Array[GoogleActionsV2Capability]) = this()
  /**
    * List of surface capabilities of user device.
    * @public
    */
  var list: js.Array[GoogleActionsV2Capability] = js.native
  /**
    * Returns true if user device has a given surface capability.
    * @public
    */
  def has(capability: SurfaceCapability): Boolean = js.native
}

