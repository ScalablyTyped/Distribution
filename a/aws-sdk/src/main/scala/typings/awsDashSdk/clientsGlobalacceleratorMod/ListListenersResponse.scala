package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListListenersResponse extends js.Object {
  /**
    * The list of listeners for an accelerator.
    */
  var Listeners: js.UndefOr[typings.awsDashSdk.clientsGlobalacceleratorMod.Listeners] = js.undefined
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object ListListenersResponse {
  @scala.inline
  def apply(Listeners: Listeners = null, NextToken: GenericString = null): ListListenersResponse = {
    val __obj = js.Dynamic.literal()
    if (Listeners != null) __obj.updateDynamic("Listeners")(Listeners)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListListenersResponse]
  }
}

