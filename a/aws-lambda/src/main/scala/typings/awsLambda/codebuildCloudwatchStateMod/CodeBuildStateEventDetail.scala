package typings.awsLambda.codebuildCloudwatchStateMod

import typings.awsLambda.anon.Artifact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeBuildStateEventDetail extends js.Object {
  var `additional-information`: Artifact
  var `build-id`: String
  var `build-status`: CodeBuildStateType
  var `current-phase`: CodeBuildPhaseType
  var `current-phase-context`: String
  var `project-name`: String
  var version: String
}

object CodeBuildStateEventDetail {
  @scala.inline
  def apply(
    `additional-information`: Artifact,
    `build-id`: String,
    `build-status`: CodeBuildStateType,
    `current-phase`: CodeBuildPhaseType,
    `current-phase-context`: String,
    `project-name`: String,
    version: String
  ): CodeBuildStateEventDetail = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("additional-information")(`additional-information`.asInstanceOf[js.Any])
    __obj.updateDynamic("build-id")(`build-id`.asInstanceOf[js.Any])
    __obj.updateDynamic("build-status")(`build-status`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-phase")(`current-phase`.asInstanceOf[js.Any])
    __obj.updateDynamic("current-phase-context")(`current-phase-context`.asInstanceOf[js.Any])
    __obj.updateDynamic("project-name")(`project-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeBuildStateEventDetail]
  }
}

