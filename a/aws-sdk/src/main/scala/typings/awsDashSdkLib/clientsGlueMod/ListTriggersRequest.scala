package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTriggersRequest extends js.Object {
  /**
    *  The name of the job for which to retrieve triggers. The trigger that can start this job is returned. If there is no such trigger, all triggers are returned.
    */
  var DependentJobName: js.UndefOr[NameString] = js.undefined
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
    * Specifies to return only these tagged resources.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}

object ListTriggersRequest {
  @scala.inline
  def apply(
    DependentJobName: NameString = null,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: GenericString = null,
    Tags: TagsMap = null
  ): ListTriggersRequest = {
    val __obj = js.Dynamic.literal()
    if (DependentJobName != null) __obj.updateDynamic("DependentJobName")(DependentJobName)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTriggersRequest]
  }
}

