package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerDescription extends js.Object {
  /**
    * The listener.
    */
  var Listener: js.UndefOr[typings.awsDashSdk.clientsElbMod.Listener] = js.undefined
  /**
    * The policies. If there are no policies enabled, the list is empty.
    */
  var PolicyNames: js.UndefOr[typings.awsDashSdk.clientsElbMod.PolicyNames] = js.undefined
}

object ListenerDescription {
  @scala.inline
  def apply(Listener: Listener = null, PolicyNames: PolicyNames = null): ListenerDescription = {
    val __obj = js.Dynamic.literal()
    if (Listener != null) __obj.updateDynamic("Listener")(Listener)
    if (PolicyNames != null) __obj.updateDynamic("PolicyNames")(PolicyNames)
    __obj.asInstanceOf[ListenerDescription]
  }
}

