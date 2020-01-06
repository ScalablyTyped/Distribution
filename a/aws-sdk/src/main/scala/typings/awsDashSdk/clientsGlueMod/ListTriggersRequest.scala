package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTriggersRequest extends js.Object {
  /**
    *  The name of the job for which to retrieve triggers. The trigger that can start this job is returned. If there is no such trigger, all triggers are returned.
    */
  var DependentJobName: js.UndefOr[NameString] = js.native
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * Specifies to return only these tagged resources.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
}

object ListTriggersRequest {
  @scala.inline
  def apply(
    DependentJobName: NameString = null,
    MaxResults: Int | Double = null,
    NextToken: GenericString = null,
    Tags: TagsMap = null
  ): ListTriggersRequest = {
    val __obj = js.Dynamic.literal()
    if (DependentJobName != null) __obj.updateDynamic("DependentJobName")(DependentJobName.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTriggersRequest]
  }
}

