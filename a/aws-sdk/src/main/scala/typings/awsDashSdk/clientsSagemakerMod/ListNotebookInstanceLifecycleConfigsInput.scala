package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNotebookInstanceLifecycleConfigsInput extends js.Object {
  /**
    * A filter that returns only lifecycle configurations that were created after the specified time (timestamp).
    */
  var CreationTimeAfter: js.UndefOr[CreationTime] = js.undefined
  /**
    * A filter that returns only lifecycle configurations that were created before the specified time (timestamp).
    */
  var CreationTimeBefore: js.UndefOr[CreationTime] = js.undefined
  /**
    * A filter that returns only lifecycle configurations that were modified after the specified time (timestamp).
    */
  var LastModifiedTimeAfter: js.UndefOr[LastModifiedTime] = js.undefined
  /**
    * A filter that returns only lifecycle configurations that were modified before the specified time (timestamp).
    */
  var LastModifiedTimeBefore: js.UndefOr[LastModifiedTime] = js.undefined
  /**
    * The maximum number of lifecycle configurations to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxResults] = js.undefined
  /**
    * A string in the lifecycle configuration name. This filter returns only lifecycle configurations whose name contains the specified string.
    */
  var NameContains: js.UndefOr[NotebookInstanceLifecycleConfigNameContains] = js.undefined
  /**
    * If the result of a ListNotebookInstanceLifecycleConfigs request was truncated, the response includes a NextToken. To get the next set of lifecycle configurations, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.undefined
  /**
    * Sorts the list of results. The default is CreationTime.
    */
  var SortBy: js.UndefOr[NotebookInstanceLifecycleConfigSortKey] = js.undefined
  /**
    * The sort order for results.
    */
  var SortOrder: js.UndefOr[NotebookInstanceLifecycleConfigSortOrder] = js.undefined
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
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter)
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore)
    if (LastModifiedTimeAfter != null) __obj.updateDynamic("LastModifiedTimeAfter")(LastModifiedTimeAfter)
    if (LastModifiedTimeBefore != null) __obj.updateDynamic("LastModifiedTimeBefore")(LastModifiedTimeBefore)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NameContains != null) __obj.updateDynamic("NameContains")(NameContains)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNotebookInstanceLifecycleConfigsInput]
  }
}

