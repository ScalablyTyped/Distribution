package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  /**
    * The endpoint of the subscription.
    */
  var EndPoint: js.UndefOr[SubscriptionEndPointType] = js.undefined
  /**
    * The protocol of the subscription.
    */
  var Protocol: js.UndefOr[SubscriptionProtocolType] = js.undefined
  /**
    * The ID of the subscription.
    */
  var SubscriptionId: js.UndefOr[IdType] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(
    EndPoint: SubscriptionEndPointType = null,
    Protocol: SubscriptionProtocolType = null,
    SubscriptionId: IdType = null
  ): Subscription = {
    val __obj = js.Dynamic.literal()
    if (EndPoint != null) __obj.updateDynamic("EndPoint")(EndPoint)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (SubscriptionId != null) __obj.updateDynamic("SubscriptionId")(SubscriptionId)
    __obj.asInstanceOf[Subscription]
  }
}

