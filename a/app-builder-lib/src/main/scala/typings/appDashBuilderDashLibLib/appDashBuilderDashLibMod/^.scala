package typings
package appDashBuilderDashLibLib.appDashBuilderDashLibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_TARGET: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.default = js.native
  val DIR_TARGET: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.dir = js.native
  def archFromString(name: java.lang.String): builderDashUtilLib.outArchMod.Arch = js.native
  def build(
    options: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions with electronDashPublishLib.electronDashPublishMod.PublishOptions
  ): js.Promise[js.Array[java.lang.String]] = js.native
  def build(
    options: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions with electronDashPublishLib.electronDashPublishMod.PublishOptions,
    packager: appDashBuilderDashLibLib.outPackagerMod.Packager
  ): js.Promise[js.Array[java.lang.String]] = js.native
  def buildForge(
    forgeOptions: appDashBuilderDashLibLib.outForgeDashMakerMod.ForgeOptions,
    options: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions
  ): js.Promise[js.Array[java.lang.String]] = js.native
  def checkBuildRequestOptions(
    options: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions with electronDashPublishLib.electronDashPublishMod.PublishOptions
  ): scala.Unit = js.native
  def getArchSuffix(arch: builderDashUtilLib.outArchMod.Arch): java.lang.String = js.native
}

