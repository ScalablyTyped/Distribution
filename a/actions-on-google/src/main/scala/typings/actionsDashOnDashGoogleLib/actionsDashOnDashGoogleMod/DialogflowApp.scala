package typings
package actionsDashOnDashGoogleLib.actionsDashOnDashGoogleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "DialogflowApp")
@js.native
class DialogflowApp protected ()
  extends actionsDashOnDashGoogleLib.dialogflowDashAppMod.DialogflowApp {
  /**
    * Constructor for DialogflowApp object.
    * To be used in the Dialogflow fulfillment webhook logic.
    *
    * @example
    * const DialogflowApp = require('actions-on-google').DialogflowApp;
    * const app = new DialogflowApp({request: request, response: response,
    *   sessionStarted:sessionStarted});
    *
    * @dialogflow
    */
  def this(options: actionsDashOnDashGoogleLib.dialogflowDashAppMod.DialogflowAppOptions) = this()
}

