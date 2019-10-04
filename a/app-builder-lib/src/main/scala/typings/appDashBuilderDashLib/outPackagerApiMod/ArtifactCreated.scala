package typings.appDashBuilderDashLib.outPackagerApiMod

import typings.appDashBuilderDashLib.outCoreMod.Target
import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typings.builderDashUtil.outArchMod.Arch
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.PublishConfiguration
import typings.electronDashPublish.electronDashPublishMod.UploadTask
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactCreated extends UploadTask {
  val isWriteUpdateInfo: js.UndefOr[Boolean] = js.undefined
  val packager: PlatformPackager[_]
  val publishConfig: js.UndefOr[PublishConfiguration | Null] = js.undefined
  val target: Target | Null
  var updateInfo: js.UndefOr[js.Any] = js.undefined
}

object ArtifactCreated {
  @scala.inline
  def apply(
    file: String,
    packager: PlatformPackager[_],
    arch: Arch = null,
    fileContent: Buffer = null,
    isWriteUpdateInfo: js.UndefOr[Boolean] = js.undefined,
    publishConfig: PublishConfiguration = null,
    safeArtifactName: String = null,
    target: Target = null,
    updateInfo: js.Any = null
  ): ArtifactCreated = {
    val __obj = js.Dynamic.literal(file = file, packager = packager)
    if (arch != null) __obj.updateDynamic("arch")(arch)
    if (fileContent != null) __obj.updateDynamic("fileContent")(fileContent)
    if (!js.isUndefined(isWriteUpdateInfo)) __obj.updateDynamic("isWriteUpdateInfo")(isWriteUpdateInfo)
    if (publishConfig != null) __obj.updateDynamic("publishConfig")(publishConfig)
    if (safeArtifactName != null) __obj.updateDynamic("safeArtifactName")(safeArtifactName)
    if (target != null) __obj.updateDynamic("target")(target)
    if (updateInfo != null) __obj.updateDynamic("updateInfo")(updateInfo)
    __obj.asInstanceOf[ArtifactCreated]
  }
}

