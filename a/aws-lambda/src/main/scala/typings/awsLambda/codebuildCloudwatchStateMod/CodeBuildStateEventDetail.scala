package typings.awsLambda.codebuildCloudwatchStateMod

import typings.awsLambda.anon.Artifact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeBuildStateEventDetail extends js.Object {
  var `additional-information`: Artifact = js.native
  var `build-id`: String = js.native
  var `build-status`: CodeBuildStateType = js.native
  var `current-phase`: CodeBuildPhaseType = js.native
  var `current-phase-context`: String = js.native
  var `project-name`: String = js.native
  var version: String = js.native
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
  @scala.inline
  implicit class CodeBuildStateEventDetailOps[Self <: CodeBuildStateEventDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAdditional-information`(value: Artifact): Self = this.set("additional-information", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBuild-id`(value: String): Self = this.set("build-id", value.asInstanceOf[js.Any])
    @scala.inline
    def `setBuild-status`(value: CodeBuildStateType): Self = this.set("build-status", value.asInstanceOf[js.Any])
    @scala.inline
    def `setCurrent-phase`(value: CodeBuildPhaseType): Self = this.set("current-phase", value.asInstanceOf[js.Any])
    @scala.inline
    def `setCurrent-phase-context`(value: String): Self = this.set("current-phase-context", value.asInstanceOf[js.Any])
    @scala.inline
    def `setProject-name`(value: String): Self = this.set("project-name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

