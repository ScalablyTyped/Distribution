package typings.appBuilderLib.linuxOptionsMod

import typings.appBuilderLib.coreMod.TargetConfigType
import typings.appBuilderLib.coreMod.TargetConfiguration
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinuxConfiguration
  extends PlatformSpecificBuildOptions
     with CommonLinuxOptions {
  
  /**
    * The executable name. Defaults to `productName`.
    * Cannot be specified per target, allowed only in the `linux`.
    */
  val executableName: js.UndefOr[String | Null] = js.native
  
  /**
    * The path to icon set directory or one png file, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory. The icon filename must contain the size (e.g. 32x32.png) of the icon.
    * By default will be generated automatically based on the macOS icns file.
    */
  @JSName("icon")
  val icon_LinuxConfiguration: js.UndefOr[String] = js.native
  
  /**
    * The maintainer. Defaults to [author](/configuration/configuration#Metadata-author).
    */
  val maintainer: js.UndefOr[String | Null] = js.native
  
  /**
    * backward compatibility + to allow specify fpm-only category for all possible fpm targets in one place
    * @private
    */
  val packageCategory: js.UndefOr[String | Null] = js.native
  
  /**
    * Target package type: list of `AppImage`, `snap`, `deb`, `rpm`, `freebsd`, `pacman`, `p5p`, `apk`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`.
    *
    * electron-builder [docker image](/multi-platform-build#docker) can be used to build Linux targets on any platform.
    *
    * Please [do not put an AppImage into another archive](https://github.com/probonopd/AppImageKit/wiki/Creating-AppImages#common-mistake) like a .zip or .tar.gz.
    * @default AppImage
    */
  @JSName("target")
  val target_LinuxConfiguration: js.UndefOr[TargetConfigType] = js.native
  
  /**
    * The vendor. Defaults to [author](/configuration/configuration#Metadata-author).
    */
  val vendor: js.UndefOr[String | Null] = js.native
}
object LinuxConfiguration {
  
  @scala.inline
  def apply(): LinuxConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxConfiguration]
  }
  
  @scala.inline
  implicit class LinuxConfigurationOps[Self <: LinuxConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExecutableName(value: String): Self = this.set("executableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutableName: Self = this.set("executableName", js.undefined)
    
    @scala.inline
    def setExecutableNameNull: Self = this.set("executableName", null)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setMaintainer(value: String): Self = this.set("maintainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintainer: Self = this.set("maintainer", js.undefined)
    
    @scala.inline
    def setMaintainerNull: Self = this.set("maintainer", null)
    
    @scala.inline
    def setPackageCategory(value: String): Self = this.set("packageCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageCategory: Self = this.set("packageCategory", js.undefined)
    
    @scala.inline
    def setPackageCategoryNull: Self = this.set("packageCategory", null)
    
    @scala.inline
    def setTargetVarargs(value: (String | TargetConfiguration)*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: TargetConfigType): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
    
    @scala.inline
    def setVendorNull: Self = this.set("vendor", null)
  }
}
