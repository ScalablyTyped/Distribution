package typings.appBuilderLib.packagerApiMod

import typings.builderUtil.archMod.Arch
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
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], targetPresentableName = targetPresentableName.asInstanceOf[js.Any])
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactBuildStarted]
  }
}

