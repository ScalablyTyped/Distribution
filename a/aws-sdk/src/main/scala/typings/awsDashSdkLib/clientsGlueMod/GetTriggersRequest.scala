package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTriggersRequest extends js.Object {
  /**
    * The name of the job for which to retrieve triggers. The trigger that can start this job will be returned, and if there is no such trigger, all triggers will be returned.
    */
  var DependentJobName: js.UndefOr[NameString] = js.undefined
  /**
    * The maximum size of the response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}

object GetTriggersRequest {
  @scala.inline
  def apply(
    DependentJobName: NameString = null,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: GenericString = null
  ): GetTriggersRequest = {
    val __obj = js.Dynamic.literal()
    if (DependentJobName != null) __obj.updateDynamic("DependentJobName")(DependentJobName)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetTriggersRequest]
  }
}

