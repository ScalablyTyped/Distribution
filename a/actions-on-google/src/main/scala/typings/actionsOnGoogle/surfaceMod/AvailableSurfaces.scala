package typings.actionsOnGoogle.surfaceMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/surface", "AvailableSurfaces")
@js.native
class AvailableSurfaces protected () extends js.Object {
  /** @hidden */
  def this(list: js.Array[GoogleActionsV2Surface]) = this()
  /** @public */
  var capabilities: AvailableSurfacesCapabilities = js.native
  /** @public */
  var list: js.Array[Surface] = js.native
  /**
    * Checks if available surfaces has an attribute like a capability
    *
    * @example
    * ```javascript
    *
    * app.intent('Default Welcome Intent', conv => {
    *   if (conv.available.surfaces.has('actions.capability.SCREEN_OUTPUT')) {
    *     conv.ask('You have a device that can view images! How are you?')
    *   } else {
    *     conv.ask('You do not have a device that can view images! How are you?')
    *   }
    * })
    * ```
    *
    * @param attribute An attribute like SurfaceCapability
    * @public
    */
  def has(attribute: SurfaceCapability): Boolean = js.native
}

