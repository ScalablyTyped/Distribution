package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationSurfaceMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/surface", "Surface")
@js.native
/** @hidden */
class Surface () extends js.Object {
  def this(surface: GoogleActionsV2Surface) = this()
  /** @public */
  var capabilities: Capabilities = js.native
  /**
    * Checks if surface has an attribute like a capability
    *
    * @example
    * ```javascript
    *
    * app.intent('Default Welcome Intent', conv => {
    *   if (conv.surface.has('actions.capability.AUDIO_OUTPUT')) {
    *     conv.ask('You can hear me! How are you?')
    *   } else {
    *     conv.ask('You can read this! How are you?')
    *   }
    * })
    * ```
    *
    * @param attribute An attribute like SurfaceCapability
    * @public
    */
  def has(attribute: SurfaceCapability): Boolean = js.native
}

