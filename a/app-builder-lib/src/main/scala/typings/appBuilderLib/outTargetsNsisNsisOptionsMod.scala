package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.admin
import typings.appBuilderLib.appBuilderLibStrings.highest
import typings.appBuilderLib.appBuilderLibStrings.user
import typings.appBuilderLib.outCoreMod.TargetSpecificOptions
import typings.appBuilderLib.outOptionsCommonWindowsInstallerConfigurationMod.CommonWindowsInstallerConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsNsisNsisOptionsMod {
  
  trait CommonNsisOptions extends StObject {
    
    /**
      * Allows you to provide your own `makensis`, such as one with support for debug logging via LogSet and LogText. (Logging also requires option `debugLogging = true`)
      */
    val customNsisBinary: js.UndefOr[CustomNsisBinary | Null] = js.undefined
    
    /**
      * See [GUID vs Application Name](../configuration/nsis#guid-vs-application-name).
      */
    val guid: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether to create [Unicode installer](http://nsis.sourceforge.net/Docs/Chapter1.html#intro-unicode).
      * @default true
      */
    val unicode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @private
      * @default false
      */
    val useZip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `warningsAsErrors` is `true` (default): NSIS will treat warnings as errors. If `warningsAsErrors` is `false`: NSIS will allow warnings.
      * @default true
      */
    val warningsAsErrors: js.UndefOr[Boolean] = js.undefined
  }
  object CommonNsisOptions {
    
    inline def apply(): CommonNsisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonNsisOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommonNsisOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomNsisBinary(value: CustomNsisBinary): Self = StObject.set(x, "customNsisBinary", value.asInstanceOf[js.Any])
      
      inline def setCustomNsisBinaryNull: Self = StObject.set(x, "customNsisBinary", null)
      
      inline def setCustomNsisBinaryUndefined: Self = StObject.set(x, "customNsisBinary", js.undefined)
      
      inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      inline def setGuidNull: Self = StObject.set(x, "guid", null)
      
      inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
      
      inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
      
      inline def setUseZip(value: Boolean): Self = StObject.set(x, "useZip", value.asInstanceOf[js.Any])
      
      inline def setUseZipUndefined: Self = StObject.set(x, "useZip", js.undefined)
      
      inline def setWarningsAsErrors(value: Boolean): Self = StObject.set(x, "warningsAsErrors", value.asInstanceOf[js.Any])
      
      inline def setWarningsAsErrorsUndefined: Self = StObject.set(x, "warningsAsErrors", js.undefined)
    }
  }
  
  trait CustomNsisBinary extends StObject {
    
    /**
      * @default VKMiizYdmNdJOWpRGz4trl4lD++BvYP2irAXpMilheUP0pc93iKlWAoP843Vlraj8YG19CVn0j+dCo/hURz9+Q==
      */
    val checksum: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether or not to enable NSIS logging for debugging.
      * Note: Requires a debug-enabled NSIS build.
      * electron-builder's included `makensis` does not natively support debug-enabled NSIS installers currently, you must supply your own via `customNsisBinary?: CustomNsisBinary`
      * In your custom nsis scripts, you can leverage this functionality via `LogSet` and `LogText`
      */
    val debugLogging: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * @default https://github.com/electron-userland/electron-builder-binaries/releases/download
      */
    val url: String | Null
    
    /**
      * @default 3.0.4.1
      */
    val version: js.UndefOr[String | Null] = js.undefined
  }
  object CustomNsisBinary {
    
    inline def apply(): CustomNsisBinary = {
      val __obj = js.Dynamic.literal(url = null)
      __obj.asInstanceOf[CustomNsisBinary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomNsisBinary] (val x: Self) extends AnyVal {
      
      inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setChecksumNull: Self = StObject.set(x, "checksum", null)
      
      inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
      
      inline def setDebugLogging(value: Boolean): Self = StObject.set(x, "debugLogging", value.asInstanceOf[js.Any])
      
      inline def setDebugLoggingNull: Self = StObject.set(x, "debugLogging", null)
      
      inline def setDebugLoggingUndefined: Self = StObject.set(x, "debugLogging", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionNull: Self = StObject.set(x, "version", null)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait NsisOptions
    extends StObject
       with CommonNsisOptions
       with CommonWindowsInstallerConfiguration
       with TargetSpecificOptions {
    
    /**
      * *assisted installer only.* Allow requesting for elevation. If false, user will have to restart installer with elevated permissions.
      * @default true
      */
    val allowElevation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * *assisted installer only.* Whether to allow user to change installation directory.
      * @default false
      */
    val allowToChangeInstallationDirectory: js.UndefOr[Boolean] = js.undefined
    
    /**
      * *one-click installer only.* Whether to delete app data on uninstall.
      * @default false
      */
    val deleteAppDataOnUninstall: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @private
      */
    var differentialPackage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to display a language selection dialog. Not recommended (by default will be detected using OS language).
      * @default false
      */
    val displayLanguageSelector: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The path to NSIS include script to customize installer. Defaults to `build/installer.nsh`. See [Custom NSIS script](#custom-nsis-script).
      */
    val include: js.UndefOr[String | Null] = js.undefined
    
    /**
      * *assisted installer only.* `MUI_HEADERIMAGE`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
      * @default build/installerHeader.bmp
      */
    val installerHeader: js.UndefOr[String | Null] = js.undefined
    
    /**
      * *one-click installer only.* The path to header icon (above the progress bar), relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
      * Defaults to `build/installerHeaderIcon.ico` or application icon.
      */
    val installerHeaderIcon: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The path to installer icon, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
      * Defaults to `build/installerIcon.ico` or application icon.
      */
    val installerIcon: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The installer languages (e.g. `en_US`, `de_DE`). Change only if you understand what do you do and for what.
      */
    val installerLanguages: js.UndefOr[js.Array[String] | String | Null] = js.undefined
    
    /**
      * *assisted installer only.* `MUI_WELCOMEFINISHPAGE_BITMAP`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
      * Defaults to `build/installerSidebar.bmp` or `${NSISDIR}\\Contrib\\Graphics\\Wizard\\nsis3-metro.bmp`. Image size 164 × 314 pixels.
      */
    val installerSidebar: js.UndefOr[String | Null] = js.undefined
    
    /**
      * [LCID Dec](https://msdn.microsoft.com/en-au/goglobal/bb964664.aspx), defaults to `1033`(`English - United States`).
      */
    val language: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). In addition to `txt`, `rtf` and `html` supported (don't forget to use `target="_blank"` for links).
      *
      * Multiple license files in different languages are supported — use lang postfix (e.g. `_de`, `_ru`). For example, create files `license_de.txt` and `license_en.txt` in the build resources.
      * If OS language is german, `license_de.txt` will be displayed. See map of [language code to name](https://github.com/meikidd/iso-639-1/blob/master/src/data.js).
      *
      * Appropriate license file will be selected by user OS language.
      */
    val license: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Whether to create multi-language installer. Defaults to `unicode` option value.
      */
    val multiLanguageInstaller: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to pack the elevate executable (required for electron-updater if per-machine installer used or can be used in the future). Ignored if `perMachine` is set to `true`.
      * @default true
      */
    val packElevateHelper: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The file extension of files that will be not compressed. Applicable only for `extraResources` and `extraFiles` files.
      * @default [".avi", ".mov", ".m4v", ".mp4", ".m4p", ".qt", ".mkv", ".webm", ".vmdk"]
      */
    val preCompressedFileExtensions: js.UndefOr[js.Array[String] | String | Null] = js.undefined
    
    /**
      * *assisted installer only.* remove the default uninstall welcome page.
      * @default false
      */
    val removeDefaultUninstallWelcomePage: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The path to NSIS script to customize installer. Defaults to `build/installer.nsi`. See [Custom NSIS script](#custom-nsis-script).
      */
    val script: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The uninstaller display name in the control panel.
      * @default ${productName} ${version}
      */
    val uninstallDisplayName: js.UndefOr[String] = js.undefined
    
    /**
      * The path to uninstaller icon, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
      * Defaults to `build/uninstallerIcon.ico` or application icon.
      */
    val uninstallerIcon: js.UndefOr[String | Null] = js.undefined
    
    /**
      * *assisted installer only.* `MUI_UNWELCOMEFINISHPAGE_BITMAP`, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
      * Defaults to `installerSidebar` option or `build/uninstallerSidebar.bmp` or `build/installerSidebar.bmp` or `${NSISDIR}\\Contrib\\Graphics\\Wizard\\nsis3-metro.bmp`
      */
    val uninstallerSidebar: js.UndefOr[String | Null] = js.undefined
  }
  object NsisOptions {
    
    inline def apply(): NsisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NsisOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NsisOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowElevation(value: Boolean): Self = StObject.set(x, "allowElevation", value.asInstanceOf[js.Any])
      
      inline def setAllowElevationUndefined: Self = StObject.set(x, "allowElevation", js.undefined)
      
      inline def setAllowToChangeInstallationDirectory(value: Boolean): Self = StObject.set(x, "allowToChangeInstallationDirectory", value.asInstanceOf[js.Any])
      
      inline def setAllowToChangeInstallationDirectoryUndefined: Self = StObject.set(x, "allowToChangeInstallationDirectory", js.undefined)
      
      inline def setDeleteAppDataOnUninstall(value: Boolean): Self = StObject.set(x, "deleteAppDataOnUninstall", value.asInstanceOf[js.Any])
      
      inline def setDeleteAppDataOnUninstallUndefined: Self = StObject.set(x, "deleteAppDataOnUninstall", js.undefined)
      
      inline def setDifferentialPackage(value: Boolean): Self = StObject.set(x, "differentialPackage", value.asInstanceOf[js.Any])
      
      inline def setDifferentialPackageUndefined: Self = StObject.set(x, "differentialPackage", js.undefined)
      
      inline def setDisplayLanguageSelector(value: Boolean): Self = StObject.set(x, "displayLanguageSelector", value.asInstanceOf[js.Any])
      
      inline def setDisplayLanguageSelectorUndefined: Self = StObject.set(x, "displayLanguageSelector", js.undefined)
      
      inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeNull: Self = StObject.set(x, "include", null)
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setInstallerHeader(value: String): Self = StObject.set(x, "installerHeader", value.asInstanceOf[js.Any])
      
      inline def setInstallerHeaderIcon(value: String): Self = StObject.set(x, "installerHeaderIcon", value.asInstanceOf[js.Any])
      
      inline def setInstallerHeaderIconNull: Self = StObject.set(x, "installerHeaderIcon", null)
      
      inline def setInstallerHeaderIconUndefined: Self = StObject.set(x, "installerHeaderIcon", js.undefined)
      
      inline def setInstallerHeaderNull: Self = StObject.set(x, "installerHeader", null)
      
      inline def setInstallerHeaderUndefined: Self = StObject.set(x, "installerHeader", js.undefined)
      
      inline def setInstallerIcon(value: String): Self = StObject.set(x, "installerIcon", value.asInstanceOf[js.Any])
      
      inline def setInstallerIconNull: Self = StObject.set(x, "installerIcon", null)
      
      inline def setInstallerIconUndefined: Self = StObject.set(x, "installerIcon", js.undefined)
      
      inline def setInstallerLanguages(value: js.Array[String] | String): Self = StObject.set(x, "installerLanguages", value.asInstanceOf[js.Any])
      
      inline def setInstallerLanguagesNull: Self = StObject.set(x, "installerLanguages", null)
      
      inline def setInstallerLanguagesUndefined: Self = StObject.set(x, "installerLanguages", js.undefined)
      
      inline def setInstallerLanguagesVarargs(value: String*): Self = StObject.set(x, "installerLanguages", js.Array(value*))
      
      inline def setInstallerSidebar(value: String): Self = StObject.set(x, "installerSidebar", value.asInstanceOf[js.Any])
      
      inline def setInstallerSidebarNull: Self = StObject.set(x, "installerSidebar", null)
      
      inline def setInstallerSidebarUndefined: Self = StObject.set(x, "installerSidebar", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageNull: Self = StObject.set(x, "language", null)
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseNull: Self = StObject.set(x, "license", null)
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setMultiLanguageInstaller(value: Boolean): Self = StObject.set(x, "multiLanguageInstaller", value.asInstanceOf[js.Any])
      
      inline def setMultiLanguageInstallerUndefined: Self = StObject.set(x, "multiLanguageInstaller", js.undefined)
      
      inline def setPackElevateHelper(value: Boolean): Self = StObject.set(x, "packElevateHelper", value.asInstanceOf[js.Any])
      
      inline def setPackElevateHelperUndefined: Self = StObject.set(x, "packElevateHelper", js.undefined)
      
      inline def setPreCompressedFileExtensions(value: js.Array[String] | String): Self = StObject.set(x, "preCompressedFileExtensions", value.asInstanceOf[js.Any])
      
      inline def setPreCompressedFileExtensionsNull: Self = StObject.set(x, "preCompressedFileExtensions", null)
      
      inline def setPreCompressedFileExtensionsUndefined: Self = StObject.set(x, "preCompressedFileExtensions", js.undefined)
      
      inline def setPreCompressedFileExtensionsVarargs(value: String*): Self = StObject.set(x, "preCompressedFileExtensions", js.Array(value*))
      
      inline def setRemoveDefaultUninstallWelcomePage(value: Boolean): Self = StObject.set(x, "removeDefaultUninstallWelcomePage", value.asInstanceOf[js.Any])
      
      inline def setRemoveDefaultUninstallWelcomePageUndefined: Self = StObject.set(x, "removeDefaultUninstallWelcomePage", js.undefined)
      
      inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      inline def setScriptNull: Self = StObject.set(x, "script", null)
      
      inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      inline def setUninstallDisplayName(value: String): Self = StObject.set(x, "uninstallDisplayName", value.asInstanceOf[js.Any])
      
      inline def setUninstallDisplayNameUndefined: Self = StObject.set(x, "uninstallDisplayName", js.undefined)
      
      inline def setUninstallerIcon(value: String): Self = StObject.set(x, "uninstallerIcon", value.asInstanceOf[js.Any])
      
      inline def setUninstallerIconNull: Self = StObject.set(x, "uninstallerIcon", null)
      
      inline def setUninstallerIconUndefined: Self = StObject.set(x, "uninstallerIcon", js.undefined)
      
      inline def setUninstallerSidebar(value: String): Self = StObject.set(x, "uninstallerSidebar", value.asInstanceOf[js.Any])
      
      inline def setUninstallerSidebarNull: Self = StObject.set(x, "uninstallerSidebar", null)
      
      inline def setUninstallerSidebarUndefined: Self = StObject.set(x, "uninstallerSidebar", js.undefined)
    }
  }
  
  trait NsisWebOptions
    extends StObject
       with NsisOptions {
    
    /**
      * The application package download URL. Optional — by default computed using publish configuration.
      *
      * URL like `https://example.com/download/latest` allows web installer to be version independent (installer will download latest application package).
      * Please note — it is [full URL](https://github.com/electron-userland/electron-builder/issues/1810#issuecomment-317650878).
      *
      * Custom `X-Arch` http header is set to `32` or `64`.
      */
    val appPackageUrl: js.UndefOr[String | Null] = js.undefined
  }
  object NsisWebOptions {
    
    inline def apply(): NsisWebOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NsisWebOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NsisWebOptions] (val x: Self) extends AnyVal {
      
      inline def setAppPackageUrl(value: String): Self = StObject.set(x, "appPackageUrl", value.asInstanceOf[js.Any])
      
      inline def setAppPackageUrlNull: Self = StObject.set(x, "appPackageUrl", null)
      
      inline def setAppPackageUrlUndefined: Self = StObject.set(x, "appPackageUrl", js.undefined)
    }
  }
  
  trait PortableOptions
    extends StObject
       with TargetSpecificOptions
       with CommonNsisOptions {
    
    /**
      * The [requested execution level](http://nsis.sourceforge.net/Reference/RequestExecutionLevel) for Windows.
      * @default user
      */
    val requestExecutionLevel: js.UndefOr[user | highest | admin] = js.undefined
    
    /**
      * The image to show while the portable executable is extracting. This image must be a bitmap (`.bmp`) image.
      */
    val splashImage: js.UndefOr[String | Null] = js.undefined
    
    /**
      * The unpack directory for the portable app resources.
      *
      * If set to a string, it will be the name in [TEMP](https://www.askvg.com/where-does-windows-store-temporary-files-and-how-to-change-temp-folder-location/) directory
      * If set explicitly to `false`, it will use the Windows temp directory ($PLUGINSDIR) that is unique to each launch of the portable application.
      *
      * Defaults to [uuid](https://github.com/segmentio/ksuid) of build (changed on each build of portable executable).
      */
    val unpackDirName: js.UndefOr[String | Boolean] = js.undefined
  }
  object PortableOptions {
    
    inline def apply(): PortableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortableOptions] (val x: Self) extends AnyVal {
      
      inline def setRequestExecutionLevel(value: user | highest | admin): Self = StObject.set(x, "requestExecutionLevel", value.asInstanceOf[js.Any])
      
      inline def setRequestExecutionLevelUndefined: Self = StObject.set(x, "requestExecutionLevel", js.undefined)
      
      inline def setSplashImage(value: String): Self = StObject.set(x, "splashImage", value.asInstanceOf[js.Any])
      
      inline def setSplashImageNull: Self = StObject.set(x, "splashImage", null)
      
      inline def setSplashImageUndefined: Self = StObject.set(x, "splashImage", js.undefined)
      
      inline def setUnpackDirName(value: String | Boolean): Self = StObject.set(x, "unpackDirName", value.asInstanceOf[js.Any])
      
      inline def setUnpackDirNameUndefined: Self = StObject.set(x, "unpackDirName", js.undefined)
    }
  }
}
