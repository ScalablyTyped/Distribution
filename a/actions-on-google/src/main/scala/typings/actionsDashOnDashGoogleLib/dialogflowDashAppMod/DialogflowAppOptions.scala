package typings
package actionsDashOnDashGoogleLib.dialogflowDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DialogflowAppOptions extends js.Object {
  /** Express HTTP request object. */
  var request: expressLib.expressMod.eNs.Request
  /** Express HTTP response object. */
  var response: expressLib.expressMod.eNs.Response
  /**
       * Function callback when session starts.
       * Only called if webhook is enabled for welcome/triggering intents, and
       * called from Web Simulator or Google Home device (i.e., not Dialogflow simulator).
       */
  var sessionStarted: js.UndefOr[js.Function0[_]] = js.undefined
}

