package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourcesResponse extends js.Object {
  /**
    * A continuation token, if this is not the first call to retrieve these resources.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * A summary of the data lake resources.
    */
  var ResourceInfoList: js.UndefOr[typings.awsDashSdk.clientsLakeformationMod.ResourceInfoList] = js.undefined
}

object ListResourcesResponse {
  @scala.inline
  def apply(NextToken: Token = null, ResourceInfoList: ResourceInfoList = null): ListResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ResourceInfoList != null) __obj.updateDynamic("ResourceInfoList")(ResourceInfoList)
    __obj.asInstanceOf[ListResourcesResponse]
  }
}

