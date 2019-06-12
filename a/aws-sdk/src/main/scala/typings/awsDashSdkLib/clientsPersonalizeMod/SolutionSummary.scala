package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SolutionSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the solution was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The date and time (in Unix time) that the solution was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the solution.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.undefined
  /**
    * The status of the solution. A solution can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}

object SolutionSummary {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    solutionArn: Arn = null,
    status: Status = null
  ): SolutionSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (solutionArn != null) __obj.updateDynamic("solutionArn")(solutionArn)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[SolutionSummary]
  }
}

