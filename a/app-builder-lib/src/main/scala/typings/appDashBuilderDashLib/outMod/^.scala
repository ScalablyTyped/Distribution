package typings.appDashBuilderDashLib.outMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.default
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.dir
import typings.appDashBuilderDashLib.outForgeDashMakerMod.ForgeOptions
import typings.appDashBuilderDashLib.outPackagerApiMod.PackagerOptions
import typings.electronDashPublish.electronDashPublishMod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_TARGET: default = js.native
  val DIR_TARGET: dir = js.native
  def archFromString(name: String): typings.builderDashUtil.outArchMod.Arch = js.native
  def build(options: PackagerOptions with PublishOptions): js.Promise[js.Array[String]] = js.native
  def build(
    options: PackagerOptions with PublishOptions,
    packager: typings.appDashBuilderDashLib.outPackagerMod.Packager
  ): js.Promise[js.Array[String]] = js.native
  def buildForge(forgeOptions: ForgeOptions, options: PackagerOptions): js.Promise[js.Array[String]] = js.native
  def checkBuildRequestOptions(options: PackagerOptions with PublishOptions): Unit = js.native
  def getArchSuffix(arch: typings.builderDashUtil.outArchMod.Arch): String = js.native
}

