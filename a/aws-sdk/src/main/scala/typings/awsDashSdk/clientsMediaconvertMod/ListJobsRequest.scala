package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsRequest extends js.Object {
  /**
    * Optional. Number of jobs, up to twenty, that will be returned at one time.
    */
  var MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined
  /**
    * Use this string, provided with the response to a previous request, to request the next batch of jobs.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * When you request lists of resources, you can optionally specify whether they are sorted in ASCENDING or DESCENDING order. Default varies by resource.
    */
  var Order: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.Order] = js.undefined
  /**
    * Provide a queue name to get back only jobs from that queue.
    */
  var Queue: js.UndefOr[__string] = js.undefined
  /**
    * A job's status can be SUBMITTED, PROGRESSING, COMPLETE, CANCELED, or ERROR.
    */
  var Status: js.UndefOr[JobStatus] = js.undefined
}

object ListJobsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined,
    NextToken: __string = null,
    Order: Order = null,
    Queue: __string = null,
    Status: JobStatus = null
  ): ListJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Order != null) __obj.updateDynamic("Order")(Order.asInstanceOf[js.Any])
    if (Queue != null) __obj.updateDynamic("Queue")(Queue)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobsRequest]
  }
}

