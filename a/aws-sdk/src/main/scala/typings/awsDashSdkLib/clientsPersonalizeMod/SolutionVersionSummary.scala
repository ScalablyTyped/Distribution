package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SolutionVersionSummary extends js.Object {
  /**
    * The date and time (in Unix time) that this version of a solution was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * If a solution version fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The date and time (in Unix time) that the solution version was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
  /**
    * The status of the solution version. A solution version can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.undefined
}

object SolutionVersionSummary {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    failureReason: FailureReason = null,
    lastUpdatedDateTime: _Date = null,
    solutionVersionArn: Arn = null,
    status: Status = null
  ): SolutionVersionSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[SolutionVersionSummary]
  }
}

