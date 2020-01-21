package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayPropertiesDetail extends js.Object {
  /**
    * The job index within the array that is associated with this job. This parameter is returned for array job children.
    */
  var index: js.UndefOr[Integer] = js.native
  /**
    * The size of the array job. This parameter is returned for parent array jobs.
    */
  var size: js.UndefOr[Integer] = js.native
  /**
    * A summary of the number of array job children in each available job status. This parameter is returned for parent array jobs.
    */
  var statusSummary: js.UndefOr[ArrayJobStatusSummary] = js.native
}

object ArrayPropertiesDetail {
  @scala.inline
  def apply(index: Int | Double = null, size: Int | Double = null, statusSummary: ArrayJobStatusSummary = null): ArrayPropertiesDetail = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (statusSummary != null) __obj.updateDynamic("statusSummary")(statusSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayPropertiesDetail]
  }
}

