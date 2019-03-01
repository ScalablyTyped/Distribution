package typings
package appDashBuilderDashLibLib.outPackagerApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactBuildStarted extends js.Object {
  val arch: builderDashUtilLib.outArchMod.Arch | scala.Null
  val file: java.lang.String
  val targetPresentableName: java.lang.String
}

object ArtifactBuildStarted {
  @scala.inline
  def apply(
    file: java.lang.String,
    targetPresentableName: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch = null
  ): ArtifactBuildStarted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("targetPresentableName")(targetPresentableName)
    if (arch != null) __obj.updateDynamic("arch")(arch)
    __obj.asInstanceOf[ArtifactBuildStarted]
  }
}

