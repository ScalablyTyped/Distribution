package typings.actionsOnGoogle

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2Device
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/device", JSImport.Namespace)
@js.native
object deviceMod extends js.Object {
  @js.native
  /** @hidden */
  class Device () extends js.Object {
    def this(device: GoogleActionsV2Device) = this()
    /**
      * If granted permission to device's location in previous intent, returns device's
      * location (see {@link Permission|conv.ask(new Permission)}).
      * @public
      */
    var location: js.UndefOr[GoogleActionsV2Location] = js.native
  }
  
}

