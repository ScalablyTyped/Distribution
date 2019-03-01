package typings
package appDashBuilderDashLibLib.outPackagerApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactCreated
  extends electronDashPublishLib.electronDashPublishMod.UploadTask {
  val isWriteUpdateInfo: js.UndefOr[scala.Boolean] = js.undefined
  val packager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_]
  val publishConfig: js.UndefOr[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration] = js.undefined
  val target: appDashBuilderDashLibLib.outCoreMod.Target | scala.Null
  var updateInfo: js.UndefOr[js.Any] = js.undefined
}

object ArtifactCreated {
  @scala.inline
  def apply(
    file: java.lang.String,
    packager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    arch: builderDashUtilLib.outArchMod.Arch = null,
    fileContent: nodeLib.Buffer = null,
    isWriteUpdateInfo: js.UndefOr[scala.Boolean] = js.undefined,
    publishConfig: builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration = null,
    safeArtifactName: java.lang.String = null,
    target: appDashBuilderDashLibLib.outCoreMod.Target = null,
    updateInfo: js.Any = null
  ): ArtifactCreated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("packager")(packager)
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

