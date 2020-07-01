package typings.absintheSocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notifier[Variables, Result] extends js.Object {
  var activeObservers: js.Array[Observer[Variables, Result]]
  var canceledObservers: js.Array[Observer[Variables, Result]]
  var isActive: Boolean
  var operationType: GqlOperationType
  var request: GqlRequest[Variables]
  var requestStatus: RequestStatus
  var subscriptionId: js.UndefOr[String] = js.undefined
}

object Notifier {
  @scala.inline
  def apply[Variables, Result](
    activeObservers: js.Array[Observer[Variables, Result]],
    canceledObservers: js.Array[Observer[Variables, Result]],
    isActive: Boolean,
    operationType: GqlOperationType,
    request: GqlRequest[Variables],
    requestStatus: RequestStatus,
    subscriptionId: String = null
  ): Notifier[Variables, Result] = {
    val __obj = js.Dynamic.literal(activeObservers = activeObservers.asInstanceOf[js.Any], canceledObservers = canceledObservers.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestStatus = requestStatus.asInstanceOf[js.Any])
    if (subscriptionId != null) __obj.updateDynamic("subscriptionId")(subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notifier[Variables, Result]]
  }
}

