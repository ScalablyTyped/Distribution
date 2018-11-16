package typings
package appDashBuilderDashLibLib.outAppInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/appInfo", "AppInfo")
@js.native
class AppInfo protected () extends js.Object {
  def this(info: appDashBuilderDashLibLib.outPackagerMod.Packager) = this()
  def this(info: appDashBuilderDashLibLib.outPackagerMod.Packager, buildVersion: java.lang.String) = this()
  def this(info: appDashBuilderDashLibLib.outPackagerMod.Packager, buildVersion: java.lang.String, platformSpecificOptions: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions) = this()
  def this(info: appDashBuilderDashLibLib.outPackagerMod.Packager, buildVersion: js.UndefOr[scala.Nothing], platformSpecificOptions: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions) = this()
  def this(info: appDashBuilderDashLibLib.outPackagerMod.Packager, buildVersion: scala.Null, platformSpecificOptions: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions) = this()
  val buildNumber: js.UndefOr[java.lang.String] = js.native
  val buildVersion: java.lang.String = js.native
  val channel: java.lang.String | scala.Null = js.native
  val companyName: java.lang.String | scala.Null = js.native
  val copyright: java.lang.String = js.native
  val description: java.lang.String = js.native
  val id: java.lang.String = js.native
  val info: js.Any = js.native
  val linuxPackageName: java.lang.String = js.native
  val macBundleIdentifier: java.lang.String = js.native
  val name: java.lang.String = js.native
  val notNullDevMetadata: js.Any = js.native
  val platformSpecificOptions: js.Any = js.native
  val productFilename: java.lang.String = js.native
  val productName: java.lang.String = js.native
  val sanitizedName: java.lang.String = js.native
  val version: java.lang.String = js.native
  def computePackageUrl(): stdLib.Promise[java.lang.String | scala.Null] = js.native
  def getVersionInWeirdWindowsForm(): java.lang.String = js.native
  def getVersionInWeirdWindowsForm(isSetBuildNumber: scala.Boolean): java.lang.String = js.native
}

