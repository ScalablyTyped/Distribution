package typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleMod

import typings.actionsDashOnDashGoogle.actionsDashSdkDashAppMod.ActionsSdkAppOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "ActionsSdkAssistant")
@js.native
class ActionsSdkAssistant protected ()
  extends typings.actionsDashOnDashGoogle.actionsDashSdkDashAppMod.ActionsSdkApp {
  /**
    * Constructor for ActionsSdkApp object.
    * To be used in the Actions SDK HTTP endpoint logic.
    *
    * @example
    * const ActionsSdkApp = require('actions-on-google').ActionsSdkApp;
    * const app = new ActionsSdkApp({request: request, response: response,
    *   sessionStarted:sessionStarted});
    *
    * @actionssdk
    */
  def this(options: ActionsSdkAppOptions) = this()
}

