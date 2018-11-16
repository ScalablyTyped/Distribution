package typings
package appDashBuilderDashLibLib.outMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out", JSImport.Namespace)
@js.native
object outModMembers extends js.Object {
  val DEFAULT_TARGET: /* default */ java.lang.String = js.native
  val DIR_TARGET: /* dir */ java.lang.String = js.native
  def archFromString(name: java.lang.String): builderDashUtilLib.outArchMod.Arch = js.native
  def build(
    options: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions with electronDashPublishLib.electronDashPublishMod.PublishOptions
  ): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def build(
    options: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions with electronDashPublishLib.electronDashPublishMod.PublishOptions,
    packager: appDashBuilderDashLibLib.outPackagerMod.Packager
  ): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def buildForge(
    forgeOptions: appDashBuilderDashLibLib.outForgeDashMakerMod.ForgeOptions,
    options: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions
  ): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def checkBuildRequestOptions(
    options: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions with electronDashPublishLib.electronDashPublishMod.PublishOptions
  ): scala.Unit = js.native
  def getArchSuffix(arch: builderDashUtilLib.outArchMod.Arch): java.lang.String = js.native
}

