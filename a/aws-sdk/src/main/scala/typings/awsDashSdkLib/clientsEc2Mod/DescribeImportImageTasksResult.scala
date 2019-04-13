package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImportImageTasksResult extends js.Object {
  /**
    * A list of zero or more import image tasks that are currently active or were completed or canceled in the previous 7 days.
    */
  var ImportImageTasks: js.UndefOr[ImportImageTaskList] = js.undefined
  /**
    * The token to use to get the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeImportImageTasksResult {
  @scala.inline
  def apply(ImportImageTasks: ImportImageTaskList = null, NextToken: String = null): DescribeImportImageTasksResult = {
    val __obj = js.Dynamic.literal()
    if (ImportImageTasks != null) __obj.updateDynamic("ImportImageTasks")(ImportImageTasks)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeImportImageTasksResult]
  }
}

