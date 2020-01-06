package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNotebookInstanceLifecycleConfigsInput extends js.Object {
  /**
    * A filter that returns only lifecycle configurations that were created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[CreationTime] = js.native
  /**
    * A filter that returns only lifecycle configurations that were created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[CreationTime] = js.native
  /**
    * A filter that returns only lifecycle configurations that were modified after the specified time (timestamp).
    */
  var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.native
  /**
    * A filter that returns only lifecycle configurations that were modified before the specified time (timestamp).
    */
  var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.native
  /**
    * The maximum number of lifecycle configurations to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxResults] = js.native
  /**
    * A string in the lifecycle configuration name. This filter returns only lifecycle configurations whose name contains the specified string.
    */
  var NameContains: js.UndefOr[NotebookInstanceLifecycleConfigNameContains] = js.native
  /**
    * If the result of a ListNotebookInstanceLifecycleConfigs request was truncated, the response includes a NextToken. To get the next set of lifecycle configurations, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.native
  /**
    * Sorts the list of results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[NotebookInstanceLifecycleConfigSortKey] = js.native
  /**
    * The sort order for results.
    */
  var SortOrder: js.UndefOr[NotebookInstanceLifecycleConfigSortOrder] = js.native
}

object ListNotebookInstanceLifecycleConfigsInput {
  @scala.inline
  def apply(
    CreationTimeAfter: CreationTime = null,
    CreationTimeBefore: CreationTime = null,
    LastModifiedTimeAfter: LastModifiedTime = null,
    LastModifiedTimeBefore: LastModifiedTime = null,
    MaxResults: Int | Double = null,
    NameContains: NotebookInstanceLifecycleConfigNameContains = null,
    NextToken: NextToken = null,
    SortBy: NotebookInstanceLifecycleConfigSortKey = null,
    SortOrder: NotebookInstanceLifecycleConfigSortOrder = null
  ): ListNotebookInstanceLifecycleConfigsInput = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter.asInstanceOf[js.Any])
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNotebookInstanceLifecycleConfigsInput]
  }
}

