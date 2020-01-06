package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FulfillmentActivity extends js.Object {
  /**
    *  A description of the Lambda function that is run to fulfill the intent. 
    */
  var codeHook: js.UndefOr[CodeHook] = js.native
  /**
    *  How the intent should be fulfilled, either by running a Lambda function or by returning the slot data to the client application. 
    */
  var `type`: FulfillmentActivityType = js.native
}

object FulfillmentActivity {
  @scala.inline
  def apply(`type`: FulfillmentActivityType, codeHook: CodeHook = null): FulfillmentActivity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (codeHook != null) __obj.updateDynamic("codeHook")(codeHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfillmentActivity]
  }
}

