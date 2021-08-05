package typings.appBuilderLib

import typings.appBuilderLib.packagerMod.Packager
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appInfoMod {
  
  @JSImport("app-builder-lib/out/appInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/appInfo", "AppInfo")
  @js.native
  class AppInfo protected () extends StObject {
    def this(info: Packager) = this()
    def this(info: Packager, buildVersion: String) = this()
    def this(info: Packager, buildVersion: String, platformSpecificOptions: PlatformSpecificBuildOptions) = this()
    def this(info: Packager, buildVersion: Null, platformSpecificOptions: PlatformSpecificBuildOptions) = this()
    def this(info: Packager, buildVersion: Unit, platformSpecificOptions: PlatformSpecificBuildOptions) = this()
    
    val buildNumber: js.UndefOr[String] = js.native
    
    val buildVersion: String = js.native
    
    def channel: String | Null = js.native
    
    def companyName: String | Null = js.native
    
    def computePackageUrl(): js.Promise[String | Null] = js.native
    
    def copyright: String = js.native
    
    val description: String = js.native
    
    def getVersionInWeirdWindowsForm(): String = js.native
    def getVersionInWeirdWindowsForm(isSetBuildNumber: Boolean): String = js.native
    
    def id: String = js.native
    
    /* private */ val info: js.Any = js.native
    
    def linuxPackageName: String = js.native
    
    def macBundleIdentifier: String = js.native
    
    def name: String = js.native
    
    /* private */ def notNullDevMetadata: js.Any = js.native
    
    /* private */ val platformSpecificOptions: js.Any = js.native
    
    val productFilename: String = js.native
    
    val productName: String = js.native
    
    def sanitizedName: String = js.native
    
    val shortVersion: js.UndefOr[String] = js.native
    
    val shortVersionWindows: js.UndefOr[String] = js.native
    
    def updaterCacheDirName: String = js.native
    
    val version: String = js.native
  }
  
  inline def smarten(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("smarten")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
