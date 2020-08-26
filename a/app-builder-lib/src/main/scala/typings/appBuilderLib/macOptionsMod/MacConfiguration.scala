package typings.appBuilderLib.macOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.development
import typings.appBuilderLib.appBuilderLibStrings.distribution
import typings.appBuilderLib.coreMod.TargetConfiguration
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class MacConfigurationOps[Self <: MacConfiguration] (val x: Self) extends AnyVal {
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
    def setBinariesVarargs(value: String*): Self = this.set("binaries", js.Array(value :_*))
    @scala.inline
    def setBinaries(value: js.Array[String]): Self = this.set("binaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaries: Self = this.set("binaries", js.undefined)
    @scala.inline
    def setBinariesNull: Self = this.set("binaries", null)
    @scala.inline
    def setBundleShortVersion(value: String): Self = this.set("bundleShortVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleShortVersion: Self = this.set("bundleShortVersion", js.undefined)
    @scala.inline
    def setBundleShortVersionNull: Self = this.set("bundleShortVersion", null)
    @scala.inline
    def setBundleVersion(value: String): Self = this.set("bundleVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleVersion: Self = this.set("bundleVersion", js.undefined)
    @scala.inline
    def setBundleVersionNull: Self = this.set("bundleVersion", null)
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setCategoryNull: Self = this.set("category", null)
    @scala.inline
    def setCscInstallerKeyPassword(value: String): Self = this.set("cscInstallerKeyPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCscInstallerKeyPassword: Self = this.set("cscInstallerKeyPassword", js.undefined)
    @scala.inline
    def setCscInstallerKeyPasswordNull: Self = this.set("cscInstallerKeyPassword", null)
    @scala.inline
    def setCscInstallerLink(value: String): Self = this.set("cscInstallerLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCscInstallerLink: Self = this.set("cscInstallerLink", js.undefined)
    @scala.inline
    def setCscInstallerLinkNull: Self = this.set("cscInstallerLink", null)
    @scala.inline
    def setDarkModeSupport(value: Boolean): Self = this.set("darkModeSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarkModeSupport: Self = this.set("darkModeSupport", js.undefined)
    @scala.inline
    def setElectronLanguagesVarargs(value: String*): Self = this.set("electronLanguages", js.Array(value :_*))
    @scala.inline
    def setElectronLanguages(value: js.Array[String] | String): Self = this.set("electronLanguages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElectronLanguages: Self = this.set("electronLanguages", js.undefined)
    @scala.inline
    def setEntitlements(value: String): Self = this.set("entitlements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlements: Self = this.set("entitlements", js.undefined)
    @scala.inline
    def setEntitlementsNull: Self = this.set("entitlements", null)
    @scala.inline
    def setEntitlementsInherit(value: String): Self = this.set("entitlementsInherit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlementsInherit: Self = this.set("entitlementsInherit", js.undefined)
    @scala.inline
    def setEntitlementsInheritNull: Self = this.set("entitlementsInherit", null)
    @scala.inline
    def setEntitlementsLoginHelper(value: String): Self = this.set("entitlementsLoginHelper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntitlementsLoginHelper: Self = this.set("entitlementsLoginHelper", js.undefined)
    @scala.inline
    def setEntitlementsLoginHelperNull: Self = this.set("entitlementsLoginHelper", null)
    @scala.inline
    def setExtendInfo(value: js.Any): Self = this.set("extendInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendInfo: Self = this.set("extendInfo", js.undefined)
    @scala.inline
    def setExtraDistFilesVarargs(value: String*): Self = this.set("extraDistFiles", js.Array(value :_*))
    @scala.inline
    def setExtraDistFiles(value: js.Array[String] | String): Self = this.set("extraDistFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraDistFiles: Self = this.set("extraDistFiles", js.undefined)
    @scala.inline
    def setExtraDistFilesNull: Self = this.set("extraDistFiles", null)
    @scala.inline
    def setGatekeeperAssess(value: Boolean): Self = this.set("gatekeeperAssess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatekeeperAssess: Self = this.set("gatekeeperAssess", js.undefined)
    @scala.inline
    def setHardenedRuntime(value: Boolean): Self = this.set("hardenedRuntime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardenedRuntime: Self = this.set("hardenedRuntime", js.undefined)
    @scala.inline
    def setHelperBundleId(value: String): Self = this.set("helperBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelperBundleId: Self = this.set("helperBundleId", js.undefined)
    @scala.inline
    def setHelperBundleIdNull: Self = this.set("helperBundleId", null)
    @scala.inline
    def setHelperEHBundleId(value: String): Self = this.set("helperEHBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelperEHBundleId: Self = this.set("helperEHBundleId", js.undefined)
    @scala.inline
    def setHelperEHBundleIdNull: Self = this.set("helperEHBundleId", null)
    @scala.inline
    def setHelperGPUBundleId(value: String): Self = this.set("helperGPUBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelperGPUBundleId: Self = this.set("helperGPUBundleId", js.undefined)
    @scala.inline
    def setHelperGPUBundleIdNull: Self = this.set("helperGPUBundleId", null)
    @scala.inline
    def setHelperNPBundleId(value: String): Self = this.set("helperNPBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelperNPBundleId: Self = this.set("helperNPBundleId", js.undefined)
    @scala.inline
    def setHelperNPBundleIdNull: Self = this.set("helperNPBundleId", null)
    @scala.inline
    def setHelperPluginBundleId(value: String): Self = this.set("helperPluginBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelperPluginBundleId: Self = this.set("helperPluginBundleId", js.undefined)
    @scala.inline
    def setHelperPluginBundleIdNull: Self = this.set("helperPluginBundleId", null)
    @scala.inline
    def setHelperRendererBundleId(value: String): Self = this.set("helperRendererBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelperRendererBundleId: Self = this.set("helperRendererBundleId", js.undefined)
    @scala.inline
    def setHelperRendererBundleIdNull: Self = this.set("helperRendererBundleId", null)
    @scala.inline
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    @scala.inline
    def setIdentityNull: Self = this.set("identity", null)
    @scala.inline
    def setMinimumSystemVersion(value: String): Self = this.set("minimumSystemVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumSystemVersion: Self = this.set("minimumSystemVersion", js.undefined)
    @scala.inline
    def setMinimumSystemVersionNull: Self = this.set("minimumSystemVersion", null)
    @scala.inline
    def setProvisioningProfile(value: String): Self = this.set("provisioningProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisioningProfile: Self = this.set("provisioningProfile", js.undefined)
    @scala.inline
    def setProvisioningProfileNull: Self = this.set("provisioningProfile", null)
    @scala.inline
    def setRequirements(value: String): Self = this.set("requirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequirements: Self = this.set("requirements", js.undefined)
    @scala.inline
    def setRequirementsNull: Self = this.set("requirements", null)
    @scala.inline
    def setTargetVarargs(value: (MacOsTargetName | TargetConfiguration)*): Self = this.set("target", js.Array(value :_*))
    @scala.inline
    def setTarget(value: (js.Array[MacOsTargetName | TargetConfiguration]) | MacOsTargetName | TargetConfiguration): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    @scala.inline
    def setType(value: distribution | development): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
  
}

