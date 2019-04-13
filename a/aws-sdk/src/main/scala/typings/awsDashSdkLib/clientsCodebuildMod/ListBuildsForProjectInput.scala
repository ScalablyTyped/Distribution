package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBuildsForProjectInput extends js.Object {
  /**
    * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the AWS CodeBuild project.
    */
  var projectName: NonEmptyString
  /**
    * The order to list build IDs. Valid values include:    ASCENDING: List the build IDs in ascending order by build ID.    DESCENDING: List the build IDs in descending order by build ID.  
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.undefined
}

object ListBuildsForProjectInput {
  @scala.inline
  def apply(projectName: NonEmptyString, nextToken: String = null, sortOrder: SortOrderType = null): ListBuildsForProjectInput = {
    val __obj = js.Dynamic.literal(projectName = projectName)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBuildsForProjectInput]
  }
}

