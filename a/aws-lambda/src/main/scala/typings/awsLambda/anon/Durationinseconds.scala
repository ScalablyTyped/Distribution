package typings.awsLambda.anon

import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildPhaseStatusType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildPhaseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Durationinseconds extends js.Object {
   // Not available for COMPLETED phase-type
  var `duration-in-seconds`: js.UndefOr[Double] = js.undefined
  var `end-time`: js.UndefOr[String] = js.undefined
  var `phase-context`: js.UndefOr[js.Array[String]] = js.undefined
  var `phase-status`: js.UndefOr[CodeBuildPhaseStatusType] = js.undefined
   // Not available for COMPLETED phase-type
  var `phase-type`: CodeBuildPhaseType
   // Not available for COMPLETED phase-type
  var `start-time`: String
}

object Durationinseconds {
  @scala.inline
  def apply(
    `phase-type`: CodeBuildPhaseType,
    `start-time`: String,
    `duration-in-seconds`: js.UndefOr[Double] = js.undefined,
    `end-time`: String = null,
    `phase-context`: js.Array[String] = null,
    `phase-status`: CodeBuildPhaseStatusType = null
  ): Durationinseconds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("phase-type")(`phase-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("start-time")(`start-time`.asInstanceOf[js.Any])
    if (!js.isUndefined(`duration-in-seconds`)) __obj.updateDynamic("duration-in-seconds")(`duration-in-seconds`.get.asInstanceOf[js.Any])
    if (`end-time` != null) __obj.updateDynamic("end-time")(`end-time`.asInstanceOf[js.Any])
    if (`phase-context` != null) __obj.updateDynamic("phase-context")(`phase-context`.asInstanceOf[js.Any])
    if (`phase-status` != null) __obj.updateDynamic("phase-status")(`phase-status`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Durationinseconds]
  }
}

