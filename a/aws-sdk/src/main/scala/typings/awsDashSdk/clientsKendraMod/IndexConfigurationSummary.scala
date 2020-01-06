package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexConfigurationSummary extends js.Object {
  /**
    * The Unix timestamp when the index was created.
    */
  var CreatedAt: Timestamp = js.native
  /**
    * A unique identifier for the index. Use this to identify the index when you are using operations such as Query, DescribeIndex, UpdateIndex, and DeleteIndex.
    */
  var Id: js.UndefOr[IndexId] = js.native
  /**
    * The name of the index.
    */
  var Name: js.UndefOr[IndexName] = js.native
  /**
    * The current status of the index. When the status is ACTIVE, the index is ready to search.
    */
  var Status: IndexStatus = js.native
  /**
    * The Unix timestamp when the index was last updated by the UpdateIndex operation.
    */
  var UpdatedAt: Timestamp = js.native
}

object IndexConfigurationSummary {
  @scala.inline
  def apply(
    CreatedAt: Timestamp,
    Status: IndexStatus,
    UpdatedAt: Timestamp,
    Id: IndexId = null,
    Name: IndexName = null
  ): IndexConfigurationSummary = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexConfigurationSummary]
  }
}

