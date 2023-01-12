package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.bzip2
import typings.appBuilderLib.appBuilderLibStrings.gz
import typings.appBuilderLib.appBuilderLibStrings.lzo
import typings.appBuilderLib.appBuilderLibStrings.xz
import typings.appBuilderLib.outCoreMod.TargetConfigType
import typings.appBuilderLib.outCoreMod.TargetConfiguration
import typings.appBuilderLib.outCoreMod.TargetSpecificOptions
import typings.appBuilderLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outOptionsLinuxOptionsMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppImageOptions] (val x: Self) extends AnyVal {
      
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
      * The [Desktop file](https://developer.gnome.org/documentation/guidelines/maintainer/integrating.html#desktop-files) entries (name to value).
      */
    val desktop: js.UndefOr[Any | Null] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonLinuxOptions] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryNull: Self = StObject.set(x, "category", null)
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDesktop(value: Any): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopNull: Self = StObject.set(x, "desktop", null)
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setExecutableArgs(value: js.Array[String]): Self = StObject.set(x, "executableArgs", value.asInstanceOf[js.Any])
      
      inline def setExecutableArgsNull: Self = StObject.set(x, "executableArgs", null)
      
      inline def setExecutableArgsUndefined: Self = StObject.set(x, "executableArgs", js.undefined)
      
      inline def setExecutableArgsVarargs(value: String*): Self = StObject.set(x, "executableArgs", js.Array(value*))
      
      inline def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      inline def setMimeTypesNull: Self = StObject.set(x, "mimeTypes", null)
      
      inline def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      inline def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value*))
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DebOptions] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityNull: Self = StObject.set(x, "priority", null)
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  trait FlatpakOptions
    extends StObject
       with CommonLinuxOptions
       with TargetSpecificOptions {
    
    /**
      * Start with the files from the specified application. This can be used to create applications that extend another application.
      * Defaults to [org.electronjs.Electron2.BaseApp](https://github.com/flathub/org.electronjs.Electron2.BaseApp).
      *
      * See [flatpak manifest documentation](https://docs.flatpak.org/en/latest/flatpak-builder-command-reference.html#flatpak-manifest).
      */
    val base: js.UndefOr[String] = js.undefined
    
    /**
      * Use this specific version of the application specified in base. Defaults to `20.08`.
      *
      * See [flatpak manifest documentation](https://docs.flatpak.org/en/latest/flatpak-builder-command-reference.html#flatpak-manifest).
      */
    val baseVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The branch to use when exporting the application. Defaults to `master`.
      *
      * See [flatpak manifest documentation](https://docs.flatpak.org/en/latest/flatpak-builder-command-reference.html#flatpak-manifest).
      */
    val branch: js.UndefOr[String] = js.undefined
    
    /**
      * Files to copy directly into the app. Should be a list of [source, dest] tuples. Source should be a relative/absolute path to a file/directory to copy into the flatpak, and dest should be the path inside the app install prefix (e.g. /share/applications/).
      *
      * See [@malept/flatpak-bundler documentation](https://github.com/malept/flatpak-bundler#build-options).
      */
    val files: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.undefined
    
    /**
      * An array of arguments passed to the flatpak build-finish command. Defaults to:
      * ```json
      * [
      *   // Wayland/X11 Rendering
      *   "--socket=wayland",
      *   "--socket=x11",
      *   "--share=ipc",
      *   // Open GL
      *   "--device=dri",
      *   // Audio output
      *   "--socket=pulseaudio",
      *   // Read/write home directory access
      *   "--filesystem=home",
      *   // Allow communication with network
      *   "--share=network",
      *   // System notifications with libnotify
      *   "--talk-name=org.freedesktop.Notifications",
      * ]
      * ```
      *
      * See [flatpak manifest documentation](https://docs.flatpak.org/en/latest/flatpak-builder-command-reference.html#flatpak-manifest).
      */
    val finishArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). Only plain text is supported.
      */
    val license: js.UndefOr[String | Null] = js.undefined
    
    /**
      * An array of objects specifying the modules to be built in order.
      *
      * See [flatpak manifest documentation](https://docs.flatpak.org/en/latest/flatpak-builder-command-reference.html#flatpak-manifest).
      */
    val modules: js.UndefOr[js.Array[String | Any]] = js.undefined
    
    /**
      * The name of the runtime that the application uses. Defaults to `org.freedesktop.Platform`.
      *
      * See [flatpak manifest documentation](https://docs.flatpak.org/en/latest/flatpak-builder-command-reference.html#flatpak-manifest).
      */
    val runtime: js.UndefOr[String] = js.undefined
    
    /**
      * The version of the runtime that the application uses. Defaults to `20.08`.
      *
      * See [flatpak manifest documentation](https://docs.flatpak.org/en/latest/flatpak-builder-command-reference.html#flatpak-manifest).
      */
    val runtimeVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the development runtime that the application builds with. Defaults to `org.freedesktop.Sdk`.
      *
      * See [flatpak manifest documentation](https://docs.flatpak.org/en/latest/flatpak-builder-command-reference.html#flatpak-manifest).
      */
    val sdk: js.UndefOr[String] = js.undefined
    
    /**
      * Symlinks to create in the app files. Should be a list of [target, location] symlink tuples. Target can be either a relative or absolute path inside the app install prefix, and location should be a absolute path inside the prefix to create the symlink at.
      *
      * See [@malept/flatpak-bundler documentation](https://github.com/malept/flatpak-bundler#build-options).
      */
    val symlinks: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.undefined
    
    /**
      * Whether to enable the Wayland specific flags (`--enable-features=UseOzonePlatform --ozone-platform=wayland`) in the wrapper script. These flags are only available starting with Electron version 12. Defaults to `false`.
      */
    val useWaylandFlags: js.UndefOr[Boolean] = js.undefined
  }
  object FlatpakOptions {
    
    inline def apply(): FlatpakOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlatpakOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlatpakOptions] (val x: Self) extends AnyVal {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBaseVersion(value: String): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
      
      inline def setBaseVersionUndefined: Self = StObject.set(x, "baseVersion", js.undefined)
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setFiles(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFinishArgs(value: js.Array[String]): Self = StObject.set(x, "finishArgs", value.asInstanceOf[js.Any])
      
      inline def setFinishArgsUndefined: Self = StObject.set(x, "finishArgs", js.undefined)
      
      inline def setFinishArgsVarargs(value: String*): Self = StObject.set(x, "finishArgs", js.Array(value*))
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseNull: Self = StObject.set(x, "license", null)
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setModules(value: js.Array[String | Any]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setModulesVarargs(value: (String | Any)*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
      
      inline def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
      
      inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
      
      inline def setSdk(value: String): Self = StObject.set(x, "sdk", value.asInstanceOf[js.Any])
      
      inline def setSdkUndefined: Self = StObject.set(x, "sdk", js.undefined)
      
      inline def setSymlinks(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
      
      inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
      
      inline def setSymlinksVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "symlinks", js.Array(value*))
      
      inline def setUseWaylandFlags(value: Boolean): Self = StObject.set(x, "useWaylandFlags", value.asInstanceOf[js.Any])
      
      inline def setUseWaylandFlagsUndefined: Self = StObject.set(x, "useWaylandFlags", js.undefined)
    }
  }
  
  trait LinuxConfiguration
    extends StObject
       with CommonLinuxOptions
       with PlatformSpecificBuildOptions {
    
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
      * Target package type: list of `AppImage`, `flatpak`, `snap`, `deb`, `rpm`, `freebsd`, `pacman`, `p5p`, `apk`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`.
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinuxConfiguration] (val x: Self) extends AnyVal {
      
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
      
      inline def setTargetVarargs(value: (String | TargetConfiguration)*): Self = StObject.set(x, "target", js.Array(value*))
      
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
    val compression: js.UndefOr[gz | bzip2 | xz | lzo | Null] = js.undefined
    
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
    
    /**
      * The name of the package.
      */
    val packageName: js.UndefOr[String | Null] = js.undefined
    
    val vendor: js.UndefOr[String | Null] = js.undefined
  }
  object LinuxTargetSpecificOptions {
    
    inline def apply(): LinuxTargetSpecificOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinuxTargetSpecificOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinuxTargetSpecificOptions] (val x: Self) extends AnyVal {
      
      inline def setAfterInstall(value: String): Self = StObject.set(x, "afterInstall", value.asInstanceOf[js.Any])
      
      inline def setAfterInstallNull: Self = StObject.set(x, "afterInstall", null)
      
      inline def setAfterInstallUndefined: Self = StObject.set(x, "afterInstall", js.undefined)
      
      inline def setAfterRemove(value: String): Self = StObject.set(x, "afterRemove", value.asInstanceOf[js.Any])
      
      inline def setAfterRemoveNull: Self = StObject.set(x, "afterRemove", null)
      
      inline def setAfterRemoveUndefined: Self = StObject.set(x, "afterRemove", js.undefined)
      
      inline def setCompression(value: gz | bzip2 | xz | lzo): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionNull: Self = StObject.set(x, "compression", null)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setDepends(value: js.Array[String]): Self = StObject.set(x, "depends", value.asInstanceOf[js.Any])
      
      inline def setDependsNull: Self = StObject.set(x, "depends", null)
      
      inline def setDependsUndefined: Self = StObject.set(x, "depends", js.undefined)
      
      inline def setDependsVarargs(value: String*): Self = StObject.set(x, "depends", js.Array(value*))
      
      inline def setFpm(value: js.Array[String]): Self = StObject.set(x, "fpm", value.asInstanceOf[js.Any])
      
      inline def setFpmNull: Self = StObject.set(x, "fpm", null)
      
      inline def setFpmUndefined: Self = StObject.set(x, "fpm", js.undefined)
      
      inline def setFpmVarargs(value: String*): Self = StObject.set(x, "fpm", js.Array(value*))
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMaintainer(value: String): Self = StObject.set(x, "maintainer", value.asInstanceOf[js.Any])
      
      inline def setMaintainerNull: Self = StObject.set(x, "maintainer", null)
      
      inline def setMaintainerUndefined: Self = StObject.set(x, "maintainer", js.undefined)
      
      inline def setPackageCategory(value: String): Self = StObject.set(x, "packageCategory", value.asInstanceOf[js.Any])
      
      inline def setPackageCategoryNull: Self = StObject.set(x, "packageCategory", null)
      
      inline def setPackageCategoryUndefined: Self = StObject.set(x, "packageCategory", js.undefined)
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
      
      inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVendorNull: Self = StObject.set(x, "vendor", null)
      
      inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    }
  }
}
