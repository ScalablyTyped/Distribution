package typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleMod

import typings.actionsDashOnDashGoogle.dialogflowDashAppMod.DialogflowAppOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "ApiAiApp")
@js.native
class ApiAiApp protected ()
  extends typings.actionsDashOnDashGoogle.dialogflowDashAppMod.DialogflowApp {
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
  def this(options: DialogflowAppOptions) = this()
}

