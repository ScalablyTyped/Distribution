package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventTopicsRequest extends js.Object {
  /**
    * The Directory ID for which to get the list of associated SNS topics. If this member is null, associations for all Directory IDs are returned.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.native
  /**
    * A list of SNS topic names for which to obtain the information. If this member is null, all associations for the specified Directory ID are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var TopicNames: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.TopicNames] = js.native
}

object DescribeEventTopicsRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId = null, TopicNames: TopicNames = null): DescribeEventTopicsRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (TopicNames != null) __obj.updateDynamic("TopicNames")(TopicNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventTopicsRequest]
  }
}

