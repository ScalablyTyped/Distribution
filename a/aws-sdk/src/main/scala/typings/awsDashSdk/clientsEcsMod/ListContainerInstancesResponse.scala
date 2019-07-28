package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContainerInstancesResponse extends js.Object {
  /**
    * The list of container instances with full ARN entries for each container instance associated with the specified cluster.
    */
  var containerInstanceArns: js.UndefOr[StringList] = js.undefined
  /**
    * The nextToken value to include in a future ListContainerInstances request. When the results of a ListContainerInstances request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListContainerInstancesResponse {
  @scala.inline
  def apply(containerInstanceArns: StringList = null, nextToken: String = null): ListContainerInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (containerInstanceArns != null) __obj.updateDynamic("containerInstanceArns")(containerInstanceArns)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListContainerInstancesResponse]
  }
}

