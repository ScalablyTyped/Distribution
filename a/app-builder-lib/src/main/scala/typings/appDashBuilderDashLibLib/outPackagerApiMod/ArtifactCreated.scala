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

