package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.UDBZ
import typings.appBuilderLib.appBuilderLibStrings.UDCO
import typings.appBuilderLib.appBuilderLibStrings.UDRO
import typings.appBuilderLib.appBuilderLibStrings.UDRW
import typings.appBuilderLib.appBuilderLibStrings.UDZO
import typings.appBuilderLib.appBuilderLibStrings.ULFO
import typings.appBuilderLib.appBuilderLibStrings.default_
import typings.appBuilderLib.appBuilderLibStrings.development
import typings.appBuilderLib.appBuilderLibStrings.dir
import typings.appBuilderLib.appBuilderLibStrings.distribution
import typings.appBuilderLib.appBuilderLibStrings.file
import typings.appBuilderLib.appBuilderLibStrings.link
import typings.appBuilderLib.coreMod.TargetConfiguration
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macOptionsMod {
  
  @js.native
  trait DmgContent extends StObject {
    
    /**
      * The name of the file within the DMG. Defaults to basename of `path`.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The path of the file within the DMG.
      */
    var path: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[link | file | dir] = js.native
    
    /**
      * The device-independent pixel offset from the left of the window to the **center** of the icon.
      */
    var x: Double = js.native
    
    /**
      * The device-independent pixel offset from the top of the window to the **center** of the icon.
      */
    var y: Double = js.native
  }
  object DmgContent {
    
    @scala.inline
    def apply(x: Double, y: Double): DmgContent = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DmgContent]
    }
    
    @scala.inline
    implicit class DmgContentMutableBuilder[Self <: DmgContent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setType(value: link | file | dir): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DmgOptions extends TargetSpecificOptions {
    
    /**
      * The path to background image (default: `build/background.tiff` or `build/background.png` if exists). The resolution of this file determines the resolution of the installer window.
      * If background is not specified, use `window.size`. Default locations expected background size to be 540x380.
      * @see [DMG with Retina background support](http://stackoverflow.com/a/11204769/1910191).
      */
    var background: js.UndefOr[String | Null] = js.native
    
    /**
      * The background color (accepts css colors). Defaults to `#ffffff` (white) if no background image.
      */
    var backgroundColor: js.UndefOr[String | Null] = js.native
    
    /**
      * The content — to customize icon locations. The x and y coordinates refer to the position of the **center** of the icon (at 1x scale), and do not take the label into account.
      */
    var contents: js.UndefOr[js.Array[DmgContent]] = js.native
    
    /**
      * The disk image format. `ULFO` (lzfse-compressed image (OS X 10.11+ only)).
      * @default UDZO
      */
    var format: js.UndefOr[UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO] = js.native
    
    /**
      * The path to DMG icon (volume icon), which will be shown when mounted, relative to the [build resources](/configuration/configuration#MetadataDirectories-buildResources) or to the project directory.
      * Defaults to the application icon (`build/icon.icns`).
      */
    var icon: js.UndefOr[String | Null] = js.native
    
    /**
      * The size of all the icons inside the DMG.
      * @default 80
      */
    val iconSize: js.UndefOr[Double | Null] = js.native
    
    /**
      * The size of all the icon texts inside the DMG.
      * @default 12
      */
    val iconTextSize: js.UndefOr[Double | Null] = js.native
    
    /**
      * Whether to create internet-enabled disk image (when it is downloaded using a browser it will automatically decompress the image, put the application on the desktop, unmount and remove the disk image file).
      * @default false
      */
    val internetEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to sign the DMG or not. Signing is not required and will lead to unwanted errors in combination with notarization requirements.
      * @default false
      */
    val sign: js.UndefOr[Boolean] = js.native
    
    /**
      * The title of the produced DMG, which will be shown when mounted (volume name).
      *
      * Macro `${productName}`, `${version}` and `${name}` are supported.
      * @default ${productName} ${version}
      */
    val title: js.UndefOr[String | Null] = js.native
    
    /**
      * The DMG window position and size. With y co-ordinates running from bottom to top.
      *
      * The Finder makes sure that the window will be on the user’s display, so if you want your window at the top left of the display you could use `"x": 0, "y": 100000` as the x, y co-ordinates.
      * It is not to be possible to position the window relative to the [top left](https://github.com/electron-userland/electron-builder/issues/3990#issuecomment-512960957) or relative to the center of the user’s screen.
      */
    var window: js.UndefOr[DmgWindow] = js.native
    
    /**
      * @private
      * @default true
      */
    var writeUpdateInfo: js.UndefOr[Boolean] = js.native
  }
  object DmgOptions {
    
    @scala.inline
    def apply(): DmgOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DmgOptions]
    }
    
    @scala.inline
    implicit class DmgOptionsMutableBuilder[Self <: DmgOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundNull: Self = StObject.set(x, "background", null)
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setContents(value: js.Array[DmgContent]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      @scala.inline
      def setContentsVarargs(value: DmgContent*): Self = StObject.set(x, "contents", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSizeNull: Self = StObject.set(x, "iconSize", null)
      
      @scala.inline
      def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      @scala.inline
      def setIconTextSize(value: Double): Self = StObject.set(x, "iconTextSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconTextSizeNull: Self = StObject.set(x, "iconTextSize", null)
      
      @scala.inline
      def setIconTextSizeUndefined: Self = StObject.set(x, "iconTextSize", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInternetEnabled(value: Boolean): Self = StObject.set(x, "internetEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternetEnabledUndefined: Self = StObject.set(x, "internetEnabled", js.undefined)
      
      @scala.inline
      def setSign(value: Boolean): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignUndefined: Self = StObject.set(x, "sign", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWindow(value: DmgWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
      
      @scala.inline
      def setWriteUpdateInfo(value: Boolean): Self = StObject.set(x, "writeUpdateInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteUpdateInfoUndefined: Self = StObject.set(x, "writeUpdateInfo", js.undefined)
    }
  }
  
  @js.native
  trait DmgWindow extends StObject {
    
    /**
      * The height. Defaults to background image height or 380.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * The width. Defaults to background image width or 540.
      */
    var width: js.UndefOr[Double] = js.native
    
    /**
      * The X position relative to left of the screen.
      * @default 400
      */
    var x: js.UndefOr[Double] = js.native
    
    /**
      * The Y position relative to bottom of the screen.
      * @default 100
      */
    var y: js.UndefOr[Double] = js.native
  }
  object DmgWindow {
    
    @scala.inline
    def apply(): DmgWindow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DmgWindow]
    }
    
    @scala.inline
    implicit class DmgWindowMutableBuilder[Self <: DmgWindow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait MacConfiguration extends PlatformSpecificBuildOptions {
    
    /**
      * Paths of any extra binaries that need to be signed.
      */
    val binaries: js.UndefOr[js.Array[String] | Null] = js.native
    
    /**
      * The `CFBundleShortVersionString`. Do not use it unless you need to.
      */
    val bundleShortVersion: js.UndefOr[String | Null] = js.native
    
    /**
      * The `CFBundleVersion`. Do not use it unless [you need to](https://github.com/electron-userland/electron-builder/issues/565#issuecomment-230678643).
      */
    val bundleVersion: js.UndefOr[String | Null] = js.native
    
    /**
      * The application category type, as shown in the Finder via *View -> Arrange by Application Category* when viewing the Applications directory.
      *
      * For example, `"category": "public.app-category.developer-tools"` will set the application category to *Developer Tools*.
      *
      * Valid values are listed in [Apple's documentation](https://developer.apple.com/library/ios/documentation/General/Reference/InfoPlistKeyReference/Articles/LaunchServicesKeys.html#//apple_ref/doc/uid/TP40009250-SW8).
      */
    val category: js.UndefOr[String | Null] = js.native
    
    /** @private */
    val cscInstallerKeyPassword: js.UndefOr[String | Null] = js.native
    
    /** @private */
    val cscInstallerLink: js.UndefOr[String | Null] = js.native
    
    /**
      * Whether a dark mode is supported. If your app does have a dark mode, you can make your app follow the system-wide dark mode setting.
      * @default false
      */
    val darkModeSupport: js.UndefOr[Boolean] = js.native
    
    /**
      * The electron locales. By default Electron locales used as is.
      */
    val electronLanguages: js.UndefOr[js.Array[String] | String] = js.native
    
    /**
      * The path to entitlements file for signing the app. `build/entitlements.mac.plist` will be used if exists (it is a recommended way to set).
      * MAS entitlements is specified in the [mas](/configuration/mas).
      */
    val entitlements: js.UndefOr[String | Null] = js.native
    
    /**
      * The path to child entitlements which inherit the security settings for signing frameworks and bundles of a distribution. `build/entitlements.mac.inherit.plist` will be used if exists (it is a recommended way to set).
      * Otherwise [default](https://github.com/electron-userland/electron-osx-sign/blob/master/default.entitlements.darwin.inherit.plist).
      *
      * This option only applies when signing with `entitlements` provided.
      */
    val entitlementsInherit: js.UndefOr[String | Null] = js.native
    
    /**
      * Path to login helper entitlement file.
      * When using App Sandbox, the the `com.apple.security.inherit` key that is normally in the inherited entitlements cannot be inherited since the login helper is a standalone executable.
      * Defaults to the value provided for `entitlements`. This option only applies when signing with `entitlements` provided.
      */
    val entitlementsLoginHelper: js.UndefOr[String | Null] = js.native
    
    /**
      * The extra entries for `Info.plist`.
      */
    val extendInfo: js.UndefOr[js.Any] = js.native
    
    /**
      * Extra files to put in archive. Not applicable for `tar.*`.
      */
    val extraDistFiles: js.UndefOr[js.Array[String] | String | Null] = js.native
    
    /**
      * Whether to let electron-osx-sign validate the signing or not.
      * @default false
      */
    val gatekeeperAssess: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether your app has to be signed with hardened runtime.
      * @default true
      */
    val hardenedRuntime: js.UndefOr[Boolean] = js.native
    
    /**
      * The bundle identifier to use in the application helper's plist.
      * @default ${appBundleIdentifier}.helper
      */
    val helperBundleId: js.UndefOr[String | Null] = js.native
    
    /**
      * The bundle identifier to use in the EH helper's plist.
      * @default ${appBundleIdentifier}.helper.EH
      */
    val helperEHBundleId: js.UndefOr[String | Null] = js.native
    
    /**
      * The bundle identifier to use in the GPU helper's plist.
      * @default ${appBundleIdentifier}.helper.GPU
      */
    val helperGPUBundleId: js.UndefOr[String | Null] = js.native
    
    /**
      * The bundle identifier to use in the NP helper's plist.
      * @default ${appBundleIdentifier}.helper.NP
      */
    val helperNPBundleId: js.UndefOr[String | Null] = js.native
    
    /**
      * The bundle identifier to use in the Plugin helper's plist.
      * @default ${appBundleIdentifier}.helper.Plugin
      */
    val helperPluginBundleId: js.UndefOr[String | Null] = js.native
    
    /**
      * The bundle identifier to use in the Renderer helper's plist.
      * @default ${appBundleIdentifier}.helper.Renderer
      */
    val helperRendererBundleId: js.UndefOr[String | Null] = js.native
    
    /**
      * The name of certificate to use when signing. Consider using environment variables [CSC_LINK or CSC_NAME](/code-signing) instead of specifying this option.
      * MAS installer identity is specified in the [mas](/configuration/mas).
      */
    val identity: js.UndefOr[String | Null] = js.native
    
    /**
      * The minimum version of macOS required for the app to run. Corresponds to `LSMinimumSystemVersion`.
      */
    val minimumSystemVersion: js.UndefOr[String | Null] = js.native
    
    /**
      * The path to the provisioning profile to use when signing, absolute or relative to the app root.
      */
    val provisioningProfile: js.UndefOr[String | Null] = js.native
    
    /**
      * Path of [requirements file](https://developer.apple.com/library/mac/documentation/Security/Conceptual/CodeSigningGuide/RequirementLang/RequirementLang.html) used in signing. Not applicable for MAS.
      */
    val requirements: js.UndefOr[String | Null] = js.native
    
    /**
      * Regex or an array of regex's that signal skipping signing a file.
      */
    val signIgnore: js.UndefOr[js.Array[String] | String | Null] = js.native
    
    /**
      * Whether to let electron-osx-sign verify the contents or not.
      * @default true
      */
    val strictVerify: js.UndefOr[js.Array[String] | String | Boolean] = js.native
    
    /**
      * The target package type: list of `default`, `dmg`, `mas`, `mas-dev`, `pkg`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`. Defaults to `default` (dmg and zip for Squirrel.Mac).
      */
    @JSName("target")
    val target_MacConfiguration: js.UndefOr[
        (js.Array[MacOsTargetName | TargetConfiguration]) | MacOsTargetName | TargetConfiguration | Null
      ] = js.native
    
    /**
      * Whether to sign app for development or for distribution.
      * @default distribution
      */
    val `type`: js.UndefOr[distribution | development | Null] = js.native
  }
  object MacConfiguration {
    
    @scala.inline
    def apply(): MacConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MacConfiguration]
    }
    
    @scala.inline
    implicit class MacConfigurationMutableBuilder[Self <: MacConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinaries(value: js.Array[String]): Self = StObject.set(x, "binaries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinariesNull: Self = StObject.set(x, "binaries", null)
      
      @scala.inline
      def setBinariesUndefined: Self = StObject.set(x, "binaries", js.undefined)
      
      @scala.inline
      def setBinariesVarargs(value: String*): Self = StObject.set(x, "binaries", js.Array(value :_*))
      
      @scala.inline
      def setBundleShortVersion(value: String): Self = StObject.set(x, "bundleShortVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleShortVersionNull: Self = StObject.set(x, "bundleShortVersion", null)
      
      @scala.inline
      def setBundleShortVersionUndefined: Self = StObject.set(x, "bundleShortVersion", js.undefined)
      
      @scala.inline
      def setBundleVersion(value: String): Self = StObject.set(x, "bundleVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleVersionNull: Self = StObject.set(x, "bundleVersion", null)
      
      @scala.inline
      def setBundleVersionUndefined: Self = StObject.set(x, "bundleVersion", js.undefined)
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryNull: Self = StObject.set(x, "category", null)
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setCscInstallerKeyPassword(value: String): Self = StObject.set(x, "cscInstallerKeyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCscInstallerKeyPasswordNull: Self = StObject.set(x, "cscInstallerKeyPassword", null)
      
      @scala.inline
      def setCscInstallerKeyPasswordUndefined: Self = StObject.set(x, "cscInstallerKeyPassword", js.undefined)
      
      @scala.inline
      def setCscInstallerLink(value: String): Self = StObject.set(x, "cscInstallerLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCscInstallerLinkNull: Self = StObject.set(x, "cscInstallerLink", null)
      
      @scala.inline
      def setCscInstallerLinkUndefined: Self = StObject.set(x, "cscInstallerLink", js.undefined)
      
      @scala.inline
      def setDarkModeSupport(value: Boolean): Self = StObject.set(x, "darkModeSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkModeSupportUndefined: Self = StObject.set(x, "darkModeSupport", js.undefined)
      
      @scala.inline
      def setElectronLanguages(value: js.Array[String] | String): Self = StObject.set(x, "electronLanguages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElectronLanguagesUndefined: Self = StObject.set(x, "electronLanguages", js.undefined)
      
      @scala.inline
      def setElectronLanguagesVarargs(value: String*): Self = StObject.set(x, "electronLanguages", js.Array(value :_*))
      
      @scala.inline
      def setEntitlements(value: String): Self = StObject.set(x, "entitlements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntitlementsInherit(value: String): Self = StObject.set(x, "entitlementsInherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntitlementsInheritNull: Self = StObject.set(x, "entitlementsInherit", null)
      
      @scala.inline
      def setEntitlementsInheritUndefined: Self = StObject.set(x, "entitlementsInherit", js.undefined)
      
      @scala.inline
      def setEntitlementsLoginHelper(value: String): Self = StObject.set(x, "entitlementsLoginHelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntitlementsLoginHelperNull: Self = StObject.set(x, "entitlementsLoginHelper", null)
      
      @scala.inline
      def setEntitlementsLoginHelperUndefined: Self = StObject.set(x, "entitlementsLoginHelper", js.undefined)
      
      @scala.inline
      def setEntitlementsNull: Self = StObject.set(x, "entitlements", null)
      
      @scala.inline
      def setEntitlementsUndefined: Self = StObject.set(x, "entitlements", js.undefined)
      
      @scala.inline
      def setExtendInfo(value: js.Any): Self = StObject.set(x, "extendInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendInfoUndefined: Self = StObject.set(x, "extendInfo", js.undefined)
      
      @scala.inline
      def setExtraDistFiles(value: js.Array[String] | String): Self = StObject.set(x, "extraDistFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraDistFilesNull: Self = StObject.set(x, "extraDistFiles", null)
      
      @scala.inline
      def setExtraDistFilesUndefined: Self = StObject.set(x, "extraDistFiles", js.undefined)
      
      @scala.inline
      def setExtraDistFilesVarargs(value: String*): Self = StObject.set(x, "extraDistFiles", js.Array(value :_*))
      
      @scala.inline
      def setGatekeeperAssess(value: Boolean): Self = StObject.set(x, "gatekeeperAssess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatekeeperAssessUndefined: Self = StObject.set(x, "gatekeeperAssess", js.undefined)
      
      @scala.inline
      def setHardenedRuntime(value: Boolean): Self = StObject.set(x, "hardenedRuntime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardenedRuntimeUndefined: Self = StObject.set(x, "hardenedRuntime", js.undefined)
      
      @scala.inline
      def setHelperBundleId(value: String): Self = StObject.set(x, "helperBundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperBundleIdNull: Self = StObject.set(x, "helperBundleId", null)
      
      @scala.inline
      def setHelperBundleIdUndefined: Self = StObject.set(x, "helperBundleId", js.undefined)
      
      @scala.inline
      def setHelperEHBundleId(value: String): Self = StObject.set(x, "helperEHBundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperEHBundleIdNull: Self = StObject.set(x, "helperEHBundleId", null)
      
      @scala.inline
      def setHelperEHBundleIdUndefined: Self = StObject.set(x, "helperEHBundleId", js.undefined)
      
      @scala.inline
      def setHelperGPUBundleId(value: String): Self = StObject.set(x, "helperGPUBundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperGPUBundleIdNull: Self = StObject.set(x, "helperGPUBundleId", null)
      
      @scala.inline
      def setHelperGPUBundleIdUndefined: Self = StObject.set(x, "helperGPUBundleId", js.undefined)
      
      @scala.inline
      def setHelperNPBundleId(value: String): Self = StObject.set(x, "helperNPBundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperNPBundleIdNull: Self = StObject.set(x, "helperNPBundleId", null)
      
      @scala.inline
      def setHelperNPBundleIdUndefined: Self = StObject.set(x, "helperNPBundleId", js.undefined)
      
      @scala.inline
      def setHelperPluginBundleId(value: String): Self = StObject.set(x, "helperPluginBundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperPluginBundleIdNull: Self = StObject.set(x, "helperPluginBundleId", null)
      
      @scala.inline
      def setHelperPluginBundleIdUndefined: Self = StObject.set(x, "helperPluginBundleId", js.undefined)
      
      @scala.inline
      def setHelperRendererBundleId(value: String): Self = StObject.set(x, "helperRendererBundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperRendererBundleIdNull: Self = StObject.set(x, "helperRendererBundleId", null)
      
      @scala.inline
      def setHelperRendererBundleIdUndefined: Self = StObject.set(x, "helperRendererBundleId", js.undefined)
      
      @scala.inline
      def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentityNull: Self = StObject.set(x, "identity", null)
      
      @scala.inline
      def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      @scala.inline
      def setMinimumSystemVersion(value: String): Self = StObject.set(x, "minimumSystemVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumSystemVersionNull: Self = StObject.set(x, "minimumSystemVersion", null)
      
      @scala.inline
      def setMinimumSystemVersionUndefined: Self = StObject.set(x, "minimumSystemVersion", js.undefined)
      
      @scala.inline
      def setProvisioningProfile(value: String): Self = StObject.set(x, "provisioningProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisioningProfileNull: Self = StObject.set(x, "provisioningProfile", null)
      
      @scala.inline
      def setProvisioningProfileUndefined: Self = StObject.set(x, "provisioningProfile", js.undefined)
      
      @scala.inline
      def setRequirements(value: String): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequirementsNull: Self = StObject.set(x, "requirements", null)
      
      @scala.inline
      def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
      
      @scala.inline
      def setSignIgnore(value: js.Array[String] | String): Self = StObject.set(x, "signIgnore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignIgnoreNull: Self = StObject.set(x, "signIgnore", null)
      
      @scala.inline
      def setSignIgnoreUndefined: Self = StObject.set(x, "signIgnore", js.undefined)
      
      @scala.inline
      def setSignIgnoreVarargs(value: String*): Self = StObject.set(x, "signIgnore", js.Array(value :_*))
      
      @scala.inline
      def setStrictVerify(value: js.Array[String] | String | Boolean): Self = StObject.set(x, "strictVerify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictVerifyUndefined: Self = StObject.set(x, "strictVerify", js.undefined)
      
      @scala.inline
      def setStrictVerifyVarargs(value: String*): Self = StObject.set(x, "strictVerify", js.Array(value :_*))
      
      @scala.inline
      def setTarget(value: (js.Array[MacOsTargetName | TargetConfiguration]) | MacOsTargetName | TargetConfiguration): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTargetVarargs(value: (MacOsTargetName | TargetConfiguration)*): Self = StObject.set(x, "target", js.Array(value :_*))
      
      @scala.inline
      def setType(value: distribution | development): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.appBuilderLib.appBuilderLibStrings.default_
    - typings.appBuilderLib.appBuilderLibStrings.dmg
    - typings.appBuilderLib.appBuilderLibStrings.mas
    - typings.appBuilderLib.appBuilderLibStrings.`mas-dev`
    - typings.appBuilderLib.appBuilderLibStrings.pkg
    - typings.appBuilderLib.appBuilderLibStrings.`7z`
    - typings.appBuilderLib.appBuilderLibStrings.zip
    - typings.appBuilderLib.appBuilderLibStrings.tarDotxz
    - typings.appBuilderLib.appBuilderLibStrings.tarDotlz
    - typings.appBuilderLib.appBuilderLibStrings.tarDotgz
    - typings.appBuilderLib.appBuilderLibStrings.tarDotbz2
    - typings.appBuilderLib.appBuilderLibStrings.dir
  */
  trait MacOsTargetName extends StObject
  object MacOsTargetName {
    
    @scala.inline
    def default: default_ = "default".asInstanceOf[default_]
    
    @scala.inline
    def `7z`: typings.appBuilderLib.appBuilderLibStrings.`7z` = "7z".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`7z`]
    
    @scala.inline
    def dir: typings.appBuilderLib.appBuilderLibStrings.dir = "dir".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.dir]
    
    @scala.inline
    def dmg: typings.appBuilderLib.appBuilderLibStrings.dmg = "dmg".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.dmg]
    
    @scala.inline
    def mas: typings.appBuilderLib.appBuilderLibStrings.mas = "mas".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.mas]
    
    @scala.inline
    def `mas-dev`: typings.appBuilderLib.appBuilderLibStrings.`mas-dev` = "mas-dev".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`mas-dev`]
    
    @scala.inline
    def pkg: typings.appBuilderLib.appBuilderLibStrings.pkg = "pkg".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.pkg]
    
    @scala.inline
    def tarDotbz2: typings.appBuilderLib.appBuilderLibStrings.tarDotbz2 = "tar.bz2".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.tarDotbz2]
    
    @scala.inline
    def tarDotgz: typings.appBuilderLib.appBuilderLibStrings.tarDotgz = "tar.gz".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.tarDotgz]
    
    @scala.inline
    def tarDotlz: typings.appBuilderLib.appBuilderLibStrings.tarDotlz = "tar.lz".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.tarDotlz]
    
    @scala.inline
    def tarDotxz: typings.appBuilderLib.appBuilderLibStrings.tarDotxz = "tar.xz".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.tarDotxz]
    
    @scala.inline
    def zip: typings.appBuilderLib.appBuilderLibStrings.zip = "zip".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.zip]
  }
  
  @js.native
  trait MasConfiguration extends MacConfiguration
  object MasConfiguration {
    
    @scala.inline
    def apply(): MasConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MasConfiguration]
    }
  }
}
