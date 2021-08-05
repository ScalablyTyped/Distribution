package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.bzip2
import typings.appBuilderLib.appBuilderLibStrings.gz
import typings.appBuilderLib.appBuilderLibStrings.xz
import typings.appBuilderLib.coreMod.TargetConfigType
import typings.appBuilderLib.coreMod.TargetConfiguration
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linuxOptionsMod {
  
  trait AppImageOptions
    extends StObject
       with CommonLinuxOptions
       with TargetSpecificOptions {
    
    /**
      * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). Only plain text is supported.
      */
    val license: js.UndefOr[String | Null] = js.undefined
  }
  object AppImageOptions {
    
    inline def apply(): AppImageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppImageOptions]
    }
    
    extension [Self <: AppImageOptions](x: Self) {
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseNull: Self = StObject.set(x, "license", null)
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    }
  }
  
  trait CommonLinuxOptions extends StObject {
    
    /**
      * The [application category](https://specifications.freedesktop.org/menu-spec/latest/apa.html#main-category-registry).
      */
    val category: js.UndefOr[String | Null] = js.undefined
    
    /**
      * As [description](/configuration/configuration#Metadata-description) from application package.json, but allows you to specify different for Linux.
      */
    val description: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The [Desktop file](https://developer.gnome.org/integration-guide/stable/desktop-files.html.en) entries (name to value).
      */
    val desktop: js.UndefOr[js.Any | Null] = js.undefined
    
    /**
      * The executable parameters. Pass to executableName
      */
    val executableArgs: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * The mime types in addition to specified in the file associations. Use it if you don't want to register a new mime type, but reuse existing.
      */
    val mimeTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * The [short description](https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-Description).
      */
    val synopsis: js.UndefOr[String | Null] = js.undefined
  }
  object CommonLinuxOptions {
    
    inline def apply(): CommonLinuxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonLinuxOptions]
    }
    
    extension [Self <: CommonLinuxOptions](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryNull: Self = StObject.set(x, "category", null)
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDesktop(value: js.Any): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopNull: Self = StObject.set(x, "desktop", null)
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setExecutableArgs(value: js.Array[String]): Self = StObject.set(x, "executableArgs", value.asInstanceOf[js.Any])
      
      inline def setExecutableArgsNull: Self = StObject.set(x, "executableArgs", null)
      
      inline def setExecutableArgsUndefined: Self = StObject.set(x, "executableArgs", js.undefined)
      
      inline def setExecutableArgsVarargs(value: String*): Self = StObject.set(x, "executableArgs", js.Array(value :_*))
      
      inline def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      inline def setMimeTypesNull: Self = StObject.set(x, "mimeTypes", null)
      
      inline def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      inline def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value :_*))
      
      inline def setSynopsis(value: String): Self = StObject.set(x, "synopsis", value.asInstanceOf[js.Any])
      
      inline def setSynopsisNull: Self = StObject.set(x, "synopsis", null)
      
      inline def setSynopsisUndefined: Self = StObject.set(x, "synopsis", js.undefined)
    }
  }
  
  trait DebOptions
    extends StObject
       with LinuxTargetSpecificOptions {
    
    /**
      * The [Priority](https://www.debian.org/doc/debian-policy/ch-controlfields.html#s-f-Priority) attribute.
      */
    val priority: js.UndefOr[String | Null] = js.undefined
  }
  object DebOptions {
    
    inline def apply(): DebOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebOptions]
    }
    
    extension [Self <: DebOptions](x: Self) {
      
      inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityNull: Self = StObject.set(x, "priority", null)
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  trait LinuxConfiguration
    extends StObject
       with CommonLinuxOptions
       with PlatformSpecificBuildOptions {
    
    /**
      * The executable name. Defaults to `productName`.
      * Cannot be specified per target, allowed only in the `linux`.
      */
    val executableName: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The path to icon set directory or one png file, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory. The icon filename must contain the size (e.g. 32x32.png) of the icon.
      * By default will be generated automatically based on the macOS icns file.
      */
    @JSName("icon")
    val icon_LinuxConfiguration: js.UndefOr[String] = js.undefined
    
    /**
      * The maintainer. Defaults to [author](/configuration/configuration#Metadata-author).
      */
    val maintainer: js.UndefOr[String | Null] = js.undefined
    
    /**
      * backward compatibility + to allow specify fpm-only category for all possible fpm targets in one place
      * @private
      */
    val packageCategory: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Target package type: list of `AppImage`, `snap`, `deb`, `rpm`, `freebsd`, `pacman`, `p5p`, `apk`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`.
      *
      * electron-builder [docker image](/multi-platform-build#docker) can be used to build Linux targets on any platform.
      *
      * Please [do not put an AppImage into another archive](https://github.com/probonopd/AppImageKit/wiki/Creating-AppImages#common-mistake) like a .zip or .tar.gz.
      * @default AppImage
      */
    @JSName("target")
    val target_LinuxConfiguration: js.UndefOr[TargetConfigType] = js.undefined
    
    /**
      * The vendor. Defaults to [author](/configuration/configuration#Metadata-author).
      */
    val vendor: js.UndefOr[String | Null] = js.undefined
  }
  object LinuxConfiguration {
    
    inline def apply(): LinuxConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinuxConfiguration]
    }
    
    extension [Self <: LinuxConfiguration](x: Self) {
      
      inline def setExecutableName(value: String): Self = StObject.set(x, "executableName", value.asInstanceOf[js.Any])
      
      inline def setExecutableNameNull: Self = StObject.set(x, "executableName", null)
      
      inline def setExecutableNameUndefined: Self = StObject.set(x, "executableName", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMaintainer(value: String): Self = StObject.set(x, "maintainer", value.asInstanceOf[js.Any])
      
      inline def setMaintainerNull: Self = StObject.set(x, "maintainer", null)
      
      inline def setMaintainerUndefined: Self = StObject.set(x, "maintainer", js.undefined)
      
      inline def setPackageCategory(value: String): Self = StObject.set(x, "packageCategory", value.asInstanceOf[js.Any])
      
      inline def setPackageCategoryNull: Self = StObject.set(x, "packageCategory", null)
      
      inline def setPackageCategoryUndefined: Self = StObject.set(x, "packageCategory", js.undefined)
      
      inline def setTarget(value: TargetConfigType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetVarargs(value: (String | TargetConfiguration)*): Self = StObject.set(x, "target", js.Array(value :_*))
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVendorNull: Self = StObject.set(x, "vendor", null)
      
      inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
  
  trait LinuxTargetSpecificOptions
    extends StObject
       with CommonLinuxOptions
       with TargetSpecificOptions {
    
    val afterInstall: js.UndefOr[String | Null] = js.undefined
    
    val afterRemove: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The compression type.
      * @default xz
      */
    val compression: js.UndefOr[gz | bzip2 | xz | Null] = js.undefined
    
    /**
      * Package dependencies.
      */
    val depends: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * *Advanced only* The [fpm](https://github.com/jordansissel/fpm/wiki#usage) options.
      *
      * Example: `["--before-install=build/deb-preinstall.sh", "--after-upgrade=build/deb-postinstall.sh"]`
      */
    val fpm: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    val icon: js.UndefOr[String] = js.undefined
    
    val maintainer: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The package category.
      */
    val packageCategory: js.UndefOr[String | Null] = js.undefined
    
    val vendor: js.UndefOr[String | Null] = js.undefined
  }
  object LinuxTargetSpecificOptions {
    
    inline def apply(): LinuxTargetSpecificOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinuxTargetSpecificOptions]
    }
    
    extension [Self <: LinuxTargetSpecificOptions](x: Self) {
      
      inline def setAfterInstall(value: String): Self = StObject.set(x, "afterInstall", value.asInstanceOf[js.Any])
      
      inline def setAfterInstallNull: Self = StObject.set(x, "afterInstall", null)
      
      inline def setAfterInstallUndefined: Self = StObject.set(x, "afterInstall", js.undefined)
      
      inline def setAfterRemove(value: String): Self = StObject.set(x, "afterRemove", value.asInstanceOf[js.Any])
      
      inline def setAfterRemoveNull: Self = StObject.set(x, "afterRemove", null)
      
      inline def setAfterRemoveUndefined: Self = StObject.set(x, "afterRemove", js.undefined)
      
      inline def setCompression(value: gz | bzip2 | xz): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionNull: Self = StObject.set(x, "compression", null)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setDepends(value: js.Array[String]): Self = StObject.set(x, "depends", value.asInstanceOf[js.Any])
      
      inline def setDependsNull: Self = StObject.set(x, "depends", null)
      
      inline def setDependsUndefined: Self = StObject.set(x, "depends", js.undefined)
      
      inline def setDependsVarargs(value: String*): Self = StObject.set(x, "depends", js.Array(value :_*))
      
      inline def setFpm(value: js.Array[String]): Self = StObject.set(x, "fpm", value.asInstanceOf[js.Any])
      
      inline def setFpmNull: Self = StObject.set(x, "fpm", null)
      
      inline def setFpmUndefined: Self = StObject.set(x, "fpm", js.undefined)
      
      inline def setFpmVarargs(value: String*): Self = StObject.set(x, "fpm", js.Array(value :_*))
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMaintainer(value: String): Self = StObject.set(x, "maintainer", value.asInstanceOf[js.Any])
      
      inline def setMaintainerNull: Self = StObject.set(x, "maintainer", null)
      
      inline def setMaintainerUndefined: Self = StObject.set(x, "maintainer", js.undefined)
      
      inline def setPackageCategory(value: String): Self = StObject.set(x, "packageCategory", value.asInstanceOf[js.Any])
      
      inline def setPackageCategoryNull: Self = StObject.set(x, "packageCategory", null)
      
      inline def setPackageCategoryUndefined: Self = StObject.set(x, "packageCategory", js.undefined)
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVendorNull: Self = StObject.set(x, "vendor", null)
      
      inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
}
