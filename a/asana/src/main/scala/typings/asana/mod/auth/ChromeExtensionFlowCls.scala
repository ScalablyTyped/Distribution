package typings.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asana", "auth.ChromeExtensionFlow")
@js.native
class ChromeExtensionFlowCls protected () extends ChromeExtensionFlow {
  /**
    * An Oauth flow that runs in a Chrome browser extension and requests user
    * authorization by opening a temporary tab to prompt the user.
    * @param {Object} options See `BaseBrowserFlow` for options, plus the below:
    * @options {String} [receiverPath] Full path and filename from the base
    *     directory of the extension to the receiver page. This is an HTML file
    *     that has been made web-accessible, and that calls the receiver method
    *     `Asana.auth.ChromeExtensionFlow.runReceiver();`.
    * @constructor
    */
  def this(options: js.Any) = this()
}
