package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceStatusSummary extends js.Object {
  /**
    * The system instance health or application instance health.
    */
  var Details: js.UndefOr[InstanceStatusDetailsList] = js.undefined
  /**
    * The status.
    */
  var Status: js.UndefOr[SummaryStatus] = js.undefined
}

object InstanceStatusSummary {
  @scala.inline
  def apply(Details: InstanceStatusDetailsList = null, Status: SummaryStatus = null): InstanceStatusSummary = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceStatusSummary]
  }
}

