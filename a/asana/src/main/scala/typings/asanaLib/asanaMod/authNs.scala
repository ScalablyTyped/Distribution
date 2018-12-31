package typings
package asanaLib.asanaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asana", "auth")
@js.native
object authNs extends js.Object {
  var App: asanaLib.asanaMod.asanaNs.authNs.AppStatic = js.native
  var BaseBrowserFlow: asanaLib.asanaMod.asanaNs.authNs.BaseBrowserFlowStatic = js.native
  var BasicAuthenticator: asanaLib.asanaMod.asanaNs.authNs.BasicAuthenticatorStatic = js.native
  var ChromeExtensionFlow: asanaLib.asanaMod.asanaNs.authNs.ChromeExtensionFlowStatic = js.native
  var NativeFlow: asanaLib.asanaMod.asanaNs.authNs.NativeFlowStatic = js.native
  var OauthAuthenticator: asanaLib.asanaMod.asanaNs.authNs.OauthAuthenticatorStatic = js.native
  var OauthError: asanaLib.asanaMod.asanaNs.authNs.OauthErrorStatic = js.native
  var PopupFlow: asanaLib.asanaMod.asanaNs.authNs.PopupFlowStatic = js.native
  var RedirectFlow: asanaLib.asanaMod.asanaNs.authNs.RedirectFlowStatic = js.native
  /**
    * Auto-detects the type of Oauth flow to use that's appropriate to the
    * environment.
    *
    * @returns {Function|null} The type of Oauth flow to use, or null if no
    *     appropriate type could be determined.
    * @param env
    * @return
    */
  def autoDetect(env: js.Any): js.Function = js.native
}

