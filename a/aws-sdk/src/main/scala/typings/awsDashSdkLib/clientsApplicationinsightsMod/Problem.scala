package typings
package awsDashSdkLib.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Problem extends js.Object {
  /**
    * The resource affected by the problem.
    */
  var AffectedResource: js.UndefOr[AffectedResource] = js.undefined
  /**
    * The time when the problem ended, in epoch seconds.
    */
  var EndTime: js.UndefOr[EndTime] = js.undefined
  /**
    * Feedback provided by the user about the problem.
    */
  var Feedback: js.UndefOr[Feedback] = js.undefined
  /**
    * The ID of the problem.
    */
  var Id: js.UndefOr[ProblemId] = js.undefined
  /**
    * A detailed analysis of the problem using machine learning.
    */
  var Insights: js.UndefOr[Insights] = js.undefined
  /**
    * The name of the resource group affected by the problem.
    */
  var ResourceGroupName: js.UndefOr[ResourceGroupName] = js.undefined
  /**
    * A measure of the level of impact of the problem.
    */
  var SeverityLevel: js.UndefOr[SeverityLevel] = js.undefined
  /**
    * The time when the problem started, in epoch seconds.
    */
  var StartTime: js.UndefOr[StartTime] = js.undefined
  /**
    * The status of the problem.
    */
  var Status: js.UndefOr[Status] = js.undefined
  /**
    * The name of the problem.
    */
  var Title: js.UndefOr[Title] = js.undefined
}

object Problem {
  @scala.inline
  def apply(
    AffectedResource: AffectedResource = null,
    EndTime: EndTime = null,
    Feedback: Feedback = null,
    Id: ProblemId = null,
    Insights: Insights = null,
    ResourceGroupName: ResourceGroupName = null,
    SeverityLevel: SeverityLevel = null,
    StartTime: StartTime = null,
    Status: Status = null,
    Title: Title = null
  ): Problem = {
    val __obj = js.Dynamic.literal()
    if (AffectedResource != null) __obj.updateDynamic("AffectedResource")(AffectedResource)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (Feedback != null) __obj.updateDynamic("Feedback")(Feedback)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Insights != null) __obj.updateDynamic("Insights")(Insights)
    if (ResourceGroupName != null) __obj.updateDynamic("ResourceGroupName")(ResourceGroupName)
    if (SeverityLevel != null) __obj.updateDynamic("SeverityLevel")(SeverityLevel.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[Problem]
  }
}

