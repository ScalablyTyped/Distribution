package typings.absintheSocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notifier[Variables, Result] extends js.Object {
  var activeObservers: js.Array[Observer[Variables, Result]] = js.native
  var canceledObservers: js.Array[Observer[Variables, Result]] = js.native
  var isActive: Boolean = js.native
  var operationType: GqlOperationType = js.native
  var request: GqlRequest[Variables] = js.native
  var requestStatus: RequestStatus = js.native
  var subscriptionId: js.UndefOr[String] = js.native
}

object Notifier {
  @scala.inline
  def apply[Variables, Result](
    activeObservers: js.Array[Observer[Variables, Result]],
    canceledObservers: js.Array[Observer[Variables, Result]],
    isActive: Boolean,
    operationType: GqlOperationType,
    request: GqlRequest[Variables],
    requestStatus: RequestStatus
  ): Notifier[Variables, Result] = {
    val __obj = js.Dynamic.literal(activeObservers = activeObservers.asInstanceOf[js.Any], canceledObservers = canceledObservers.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestStatus = requestStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notifier[Variables, Result]]
  }
  @scala.inline
  implicit class NotifierOps[Self <: Notifier[_, _], Variables, Result] (val x: Self with (Notifier[Variables, Result])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveObserversVarargs(value: (Observer[Variables, Result])*): Self = this.set("activeObservers", js.Array(value :_*))
    @scala.inline
    def setActiveObservers(value: js.Array[Observer[Variables, Result]]): Self = this.set("activeObservers", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanceledObserversVarargs(value: (Observer[Variables, Result])*): Self = this.set("canceledObservers", js.Array(value :_*))
    @scala.inline
    def setCanceledObservers(value: js.Array[Observer[Variables, Result]]): Self = this.set("canceledObservers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationType(value: GqlOperationType): Self = this.set("operationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: GqlRequest[Variables]): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestStatus(value: RequestStatus): Self = this.set("requestStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionId(value: String): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionId: Self = this.set("subscriptionId", js.undefined)
  }
  
}

