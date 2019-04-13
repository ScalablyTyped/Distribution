package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSentimentDetectionJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a sentiment detection job.
    */
  var SentimentDetectionJobProperties: js.UndefOr[SentimentDetectionJobProperties] = js.undefined
}

object DescribeSentimentDetectionJobResponse {
  @scala.inline
  def apply(SentimentDetectionJobProperties: SentimentDetectionJobProperties = null): DescribeSentimentDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (SentimentDetectionJobProperties != null) __obj.updateDynamic("SentimentDetectionJobProperties")(SentimentDetectionJobProperties)
    __obj.asInstanceOf[DescribeSentimentDetectionJobResponse]
  }
}

