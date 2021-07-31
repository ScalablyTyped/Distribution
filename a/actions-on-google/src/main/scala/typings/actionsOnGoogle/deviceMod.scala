package typings.actionsOnGoogle

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2Device
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/device", "Device")
  @js.native
  /** @hidden */
  class Device () extends StObject {
    def this(device: GoogleActionsV2Device) = this()
    
    /**
      * If granted permission to device's location in previous intent, returns device's
      * location (see {@link Permission|conv.ask(new Permission)}).
      * @public
      */
    var location: js.UndefOr[GoogleActionsV2Location] = js.native
  }
}
