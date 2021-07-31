package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.admin
import typings.appBuilderLib.appBuilderLibStrings.highest
import typings.appBuilderLib.appBuilderLibStrings.user
import typings.appBuilderLib.commonWindowsInstallerConfigurationMod.CommonWindowsInstallerConfiguration
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nsisOptionsMod {
  
  trait CommonNsisOptions extends StObject {
    
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
    
    @scala.inline
    def apply(): CommonNsisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonNsisOptions]
    }
    
    @scala.inline
    implicit class CommonNsisOptionsMutableBuilder[Self <: CommonNsisOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuidNull: Self = StObject.set(x, "guid", null)
      
      @scala.inline
      def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
      
      @scala.inline
      def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
      
      @scala.inline
      def setUseZip(value: Boolean): Self = StObject.set(x, "useZip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseZipUndefined: Self = StObject.set(x, "useZip", js.undefined)
      
      @scala.inline
      def setWarningsAsErrors(value: Boolean): Self = StObject.set(x, "warningsAsErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsAsErrorsUndefined: Self = StObject.set(x, "warningsAsErrors", js.undefined)
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
      * The path to EULA license file. Defaults to `license.txt` or `eula.txt` (or uppercase variants). In addition to `txt, `rtf` and `html` supported (don't forget to use `target="_blank"` for links).
      *
      * Multiple license files in different languages are supported — use lang postfix (e.g. `_de`, `_ru`)). For example, create files `license_de.txt` and `license_en.txt` in the build resources.
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
    
    @scala.inline
    def apply(): NsisOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NsisOptions]
    }
    
    @scala.inline
    implicit class NsisOptionsMutableBuilder[Self <: NsisOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowElevation(value: Boolean): Self = StObject.set(x, "allowElevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowElevationUndefined: Self = StObject.set(x, "allowElevation", js.undefined)
      
      @scala.inline
      def setAllowToChangeInstallationDirectory(value: Boolean): Self = StObject.set(x, "allowToChangeInstallationDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowToChangeInstallationDirectoryUndefined: Self = StObject.set(x, "allowToChangeInstallationDirectory", js.undefined)
      
      @scala.inline
      def setDeleteAppDataOnUninstall(value: Boolean): Self = StObject.set(x, "deleteAppDataOnUninstall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteAppDataOnUninstallUndefined: Self = StObject.set(x, "deleteAppDataOnUninstall", js.undefined)
      
      @scala.inline
      def setDifferentialPackage(value: Boolean): Self = StObject.set(x, "differentialPackage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDifferentialPackageUndefined: Self = StObject.set(x, "differentialPackage", js.undefined)
      
      @scala.inline
      def setDisplayLanguageSelector(value: Boolean): Self = StObject.set(x, "displayLanguageSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayLanguageSelectorUndefined: Self = StObject.set(x, "displayLanguageSelector", js.undefined)
      
      @scala.inline
      def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeNull: Self = StObject.set(x, "include", null)
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setInstallerHeader(value: String): Self = StObject.set(x, "installerHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallerHeaderIcon(value: String): Self = StObject.set(x, "installerHeaderIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallerHeaderIconNull: Self = StObject.set(x, "installerHeaderIcon", null)
      
      @scala.inline
      def setInstallerHeaderIconUndefined: Self = StObject.set(x, "installerHeaderIcon", js.undefined)
      
      @scala.inline
      def setInstallerHeaderNull: Self = StObject.set(x, "installerHeader", null)
      
      @scala.inline
      def setInstallerHeaderUndefined: Self = StObject.set(x, "installerHeader", js.undefined)
      
      @scala.inline
      def setInstallerIcon(value: String): Self = StObject.set(x, "installerIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallerIconNull: Self = StObject.set(x, "installerIcon", null)
      
      @scala.inline
      def setInstallerIconUndefined: Self = StObject.set(x, "installerIcon", js.undefined)
      
      @scala.inline
      def setInstallerLanguages(value: js.Array[String] | String): Self = StObject.set(x, "installerLanguages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallerLanguagesNull: Self = StObject.set(x, "installerLanguages", null)
      
      @scala.inline
      def setInstallerLanguagesUndefined: Self = StObject.set(x, "installerLanguages", js.undefined)
      
      @scala.inline
      def setInstallerLanguagesVarargs(value: String*): Self = StObject.set(x, "installerLanguages", js.Array(value :_*))
      
      @scala.inline
      def setInstallerSidebar(value: String): Self = StObject.set(x, "installerSidebar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstallerSidebarNull: Self = StObject.set(x, "installerSidebar", null)
      
      @scala.inline
      def setInstallerSidebarUndefined: Self = StObject.set(x, "installerSidebar", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageNull: Self = StObject.set(x, "language", null)
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseNull: Self = StObject.set(x, "license", null)
      
      @scala.inline
      def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      @scala.inline
      def setMultiLanguageInstaller(value: Boolean): Self = StObject.set(x, "multiLanguageInstaller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiLanguageInstallerUndefined: Self = StObject.set(x, "multiLanguageInstaller", js.undefined)
      
      @scala.inline
      def setPackElevateHelper(value: Boolean): Self = StObject.set(x, "packElevateHelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackElevateHelperUndefined: Self = StObject.set(x, "packElevateHelper", js.undefined)
      
      @scala.inline
      def setPreCompressedFileExtensions(value: js.Array[String] | String): Self = StObject.set(x, "preCompressedFileExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreCompressedFileExtensionsNull: Self = StObject.set(x, "preCompressedFileExtensions", null)
      
      @scala.inline
      def setPreCompressedFileExtensionsUndefined: Self = StObject.set(x, "preCompressedFileExtensions", js.undefined)
      
      @scala.inline
      def setPreCompressedFileExtensionsVarargs(value: String*): Self = StObject.set(x, "preCompressedFileExtensions", js.Array(value :_*))
      
      @scala.inline
      def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptNull: Self = StObject.set(x, "script", null)
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
      
      @scala.inline
      def setUninstallDisplayName(value: String): Self = StObject.set(x, "uninstallDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUninstallDisplayNameUndefined: Self = StObject.set(x, "uninstallDisplayName", js.undefined)
      
      @scala.inline
      def setUninstallerIcon(value: String): Self = StObject.set(x, "uninstallerIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUninstallerIconNull: Self = StObject.set(x, "uninstallerIcon", null)
      
      @scala.inline
      def setUninstallerIconUndefined: Self = StObject.set(x, "uninstallerIcon", js.undefined)
      
      @scala.inline
      def setUninstallerSidebar(value: String): Self = StObject.set(x, "uninstallerSidebar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUninstallerSidebarNull: Self = StObject.set(x, "uninstallerSidebar", null)
      
      @scala.inline
      def setUninstallerSidebarUndefined: Self = StObject.set(x, "uninstallerSidebar", js.undefined)
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
    
    @scala.inline
    def apply(): NsisWebOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NsisWebOptions]
    }
    
    @scala.inline
    implicit class NsisWebOptionsMutableBuilder[Self <: NsisWebOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppPackageUrl(value: String): Self = StObject.set(x, "appPackageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppPackageUrlNull: Self = StObject.set(x, "appPackageUrl", null)
      
      @scala.inline
      def setAppPackageUrlUndefined: Self = StObject.set(x, "appPackageUrl", js.undefined)
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
      * The unpack directory name in [TEMP](https://www.askvg.com/where-does-windows-store-temporary-files-and-how-to-change-temp-folder-location/) directory.
      *
      * Defaults to [uuid](https://github.com/segmentio/ksuid) of build (changed on each build of portable executable).
      */
    val unpackDirName: js.UndefOr[String] = js.undefined
  }
  object PortableOptions {
    
    @scala.inline
    def apply(): PortableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortableOptions]
    }
    
    @scala.inline
    implicit class PortableOptionsMutableBuilder[Self <: PortableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestExecutionLevel(value: user | highest | admin): Self = StObject.set(x, "requestExecutionLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestExecutionLevelUndefined: Self = StObject.set(x, "requestExecutionLevel", js.undefined)
      
      @scala.inline
      def setSplashImage(value: String): Self = StObject.set(x, "splashImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplashImageNull: Self = StObject.set(x, "splashImage", null)
      
      @scala.inline
      def setSplashImageUndefined: Self = StObject.set(x, "splashImage", js.undefined)
      
      @scala.inline
      def setUnpackDirName(value: String): Self = StObject.set(x, "unpackDirName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnpackDirNameUndefined: Self = StObject.set(x, "unpackDirName", js.undefined)
    }
  }
}
