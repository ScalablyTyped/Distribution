package typings.appDashBuilderDashLib.outPackagerApiMod

import typings.builderDashUtil.outArchMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactBuildStarted extends js.Object {
  val arch: Arch | Null
  val file: String
  val targetPresentableName: String
}

object ArtifactBuildStarted {
  @scala.inline
  def apply(file: String, targetPresentableName: String, arch: Arch = null): ArtifactBuildStarted = {
    val __obj = js.Dynamic.literal(file = file, targetPresentableName = targetPresentableName)
    if (arch != null) __obj.updateDynamic("arch")(arch)
    __obj.asInstanceOf[ArtifactBuildStarted]
  }
}

