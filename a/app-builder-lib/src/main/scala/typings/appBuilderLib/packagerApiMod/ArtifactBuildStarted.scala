package typings.appBuilderLib.packagerApiMod

import typings.builderUtil.archMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactBuildStarted extends js.Object {
  val arch: Arch | Null = js.native
  val file: String = js.native
  val targetPresentableName: String = js.native
}

object ArtifactBuildStarted {
  @scala.inline
  def apply(file: String, targetPresentableName: String): ArtifactBuildStarted = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], targetPresentableName = targetPresentableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactBuildStarted]
  }
  @scala.inline
  implicit class ArtifactBuildStartedOps[Self <: ArtifactBuildStarted] (val x: Self) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetPresentableName(value: String): Self = this.set("targetPresentableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setArch(value: Arch): Self = this.set("arch", value.asInstanceOf[js.Any])
    @scala.inline
    def setArchNull: Self = this.set("arch", null)
  }
  
}

