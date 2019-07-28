package typings.appDashBuilderDashLib.outMod

import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out", "AppInfo")
@js.native
class AppInfo protected ()
  extends typings.appDashBuilderDashLib.outAppInfoMod.AppInfo {
  def this(info: typings.appDashBuilderDashLib.outPackagerMod.Packager) = this()
  def this(info: typings.appDashBuilderDashLib.outPackagerMod.Packager, buildVersion: String) = this()
  def this(
    info: typings.appDashBuilderDashLib.outPackagerMod.Packager,
    buildVersion: js.UndefOr[scala.Nothing],
    platformSpecificOptions: PlatformSpecificBuildOptions
  ) = this()
  def this(
    info: typings.appDashBuilderDashLib.outPackagerMod.Packager,
    buildVersion: String,
    platformSpecificOptions: PlatformSpecificBuildOptions
  ) = this()
  def this(
    info: typings.appDashBuilderDashLib.outPackagerMod.Packager,
    buildVersion: Null,
    platformSpecificOptions: PlatformSpecificBuildOptions
  ) = this()
}

