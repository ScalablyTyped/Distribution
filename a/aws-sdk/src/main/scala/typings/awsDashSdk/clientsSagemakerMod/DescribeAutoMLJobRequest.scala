package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAutoMLJobRequest extends js.Object {
  /**
    * Request information about a job using that job's unique name.
    */
  var AutoMLJobName: typings.awsDashSdk.clientsSagemakerMod.AutoMLJobName = js.native
}

object DescribeAutoMLJobRequest {
  @scala.inline
  def apply(AutoMLJobName: AutoMLJobName): DescribeAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAutoMLJobRequest]
  }
}

