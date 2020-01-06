package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyWorkersResponse extends js.Object {
  /**
    *  When MTurk sends notifications to the list of Workers, it returns back any failures it encounters in this list of NotifyWorkersFailureStatus objects. 
    */
  var NotifyWorkersFailureStatuses: js.UndefOr[NotifyWorkersFailureStatusList] = js.native
}

object NotifyWorkersResponse {
  @scala.inline
  def apply(NotifyWorkersFailureStatuses: NotifyWorkersFailureStatusList = null): NotifyWorkersResponse = {
    val __obj = js.Dynamic.literal()
    if (NotifyWorkersFailureStatuses != null) __obj.updateDynamic("NotifyWorkersFailureStatuses")(NotifyWorkersFailureStatuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyWorkersResponse]
  }
}

