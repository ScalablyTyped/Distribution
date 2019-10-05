package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appDashBuilderDashLib.outPackagerMod.Packager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/appInfo", JSImport.Namespace)
@js.native
object outAppInfoMod extends js.Object {
  @js.native
  class AppInfo protected () extends js.Object {
    def this(info: Packager) = this()
    def this(info: Packager, buildVersion: String) = this()
    def this(
      info: Packager,
      buildVersion: js.UndefOr[scala.Nothing],
      platformSpecificOptions: PlatformSpecificBuildOptions
    ) = this()
    def this(info: Packager, buildVersion: String, platformSpecificOptions: PlatformSpecificBuildOptions) = this()
    def this(info: Packager, buildVersion: Null, platformSpecificOptions: PlatformSpecificBuildOptions) = this()
    val buildNumber: js.UndefOr[String] = js.native
    val buildVersion: String = js.native
    val channel: String | Null = js.native
    val companyName: String | Null = js.native
    val copyright: String = js.native
    val description: String = js.native
    val id: String = js.native
    val info: js.Any = js.native
    val linuxPackageName: String = js.native
    val macBundleIdentifier: String = js.native
    val name: String = js.native
    val notNullDevMetadata: js.Any = js.native
    val platformSpecificOptions: js.Any = js.native
    val productFilename: String = js.native
    val productName: String = js.native
    val sanitizedName: String = js.native
    val updaterCacheDirName: String = js.native
    val version: String = js.native
    def computePackageUrl(): js.Promise[String | Null] = js.native
    def getVersionInWeirdWindowsForm(): String = js.native
    def getVersionInWeirdWindowsForm(isSetBuildNumber: Boolean): String = js.native
  }
  
  def smarten(s: String): String = js.native
}

