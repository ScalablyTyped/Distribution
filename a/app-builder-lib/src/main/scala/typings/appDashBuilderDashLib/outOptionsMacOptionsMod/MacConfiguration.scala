package typings.appDashBuilderDashLib.outOptionsMacOptionsMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.development
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.distribution
import typings.appDashBuilderDashLib.outCoreMod.CompressionLevel
import typings.appDashBuilderDashLib.outCoreMod.Publish
import typings.appDashBuilderDashLib.outCoreMod.TargetConfiguration
import typings.appDashBuilderDashLib.outOptionsFileAssociationMod.FileAssociation
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.AsarOptions
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.Protocol
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.ReleaseInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MacConfiguration extends PlatformSpecificBuildOptions {
  /**
    * Paths of any extra binaries that need to be signed.
    */
  val binaries: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * The `CFBundleShortVersionString`. Do not use it unless you need to.
    */
  val bundleShortVersion: js.UndefOr[String | Null] = js.undefined
  /**
    * The `CFBundleVersion`. Do not use it unless [you need to](https://github.com/electron-userland/electron-builder/issues/565#issuecomment-230678643).
    */
  val bundleVersion: js.UndefOr[String | Null] = js.undefined
  /**
    * The application category type, as shown in the Finder via *View -> Arrange by Application Category* when viewing the Applications directory.
    *
    * For example, `"category": "public.app-category.developer-tools"` will set the application category to *Developer Tools*.
    *
    * Valid values are listed in [Apple's documentation](https://developer.apple.com/library/ios/documentation/General/Reference/InfoPlistKeyReference/Articles/LaunchServicesKeys.html#//apple_ref/doc/uid/TP40009250-SW8).
    */
  val category: js.UndefOr[String | Null] = js.undefined
  /** @private */
  val cscInstallerKeyPassword: js.UndefOr[String | Null] = js.undefined
  /** @private */
  val cscInstallerLink: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether a dark mode is supported. If your app does have a dark mode, you can make your app follow the system-wide dark mode setting.
    * @default false
    */
  val darkModeSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * The electron locales. By default Electron locales used as is.
    */
  val electronLanguages: js.UndefOr[js.Array[String] | String] = js.undefined
  /**
    * The path to entitlements file for signing the app. `build/entitlements.mac.plist` will be used if exists (it is a recommended way to set).
    * MAS entitlements is specified in the [mas](/configuration/mas).
    */
  val entitlements: js.UndefOr[String | Null] = js.undefined
  /**
    * The path to child entitlements which inherit the security settings for signing frameworks and bundles of a distribution. `build/entitlements.mac.inherit.plist` will be used if exists (it is a recommended way to set).
    * Otherwise [default](https://github.com/electron-userland/electron-osx-sign/blob/master/default.entitlements.darwin.inherit.plist).
    *
    * This option only applies when signing with `entitlements` provided.
    */
  val entitlementsInherit: js.UndefOr[String | Null] = js.undefined
  /**
    * The extra entries for `Info.plist`.
    */
  val extendInfo: js.UndefOr[js.Any] = js.undefined
  /**
    * Extra files to put in archive. Not applicable for `tar.*`.
    */
  val extraDistFiles: js.UndefOr[js.Array[String] | String | Null] = js.undefined
  /**
    * Whether to let electron-osx-sign validate the signing or not.
    * @default false
    */
  val gatekeeperAssess: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether your app has to be signed with hardened runtime.
    * @default true
    */
  val hardenedRuntime: js.UndefOr[Boolean] = js.undefined
  /**
    * The bundle identifier to use in the application helper's plist.
    * @default ${appBundleIdentifier}.helper
    */
  val helperBundleId: js.UndefOr[String | Null] = js.undefined
  /**
    * The name of certificate to use when signing. Consider using environment variables [CSC_LINK or CSC_NAME](/code-signing) instead of specifying this option.
    * MAS installer identity is specified in the [mas](/configuration/mas).
    */
  val identity: js.UndefOr[String | Null] = js.undefined
  /**
    * The minimum version of macOS required for the app to run. Corresponds to `LSMinimumSystemVersion`.
    */
  val minimumSystemVersion: js.UndefOr[String | Null] = js.undefined
  /**
    * The path to the provisioning profile to use when signing, absolute or relative to the app root.
    */
  val provisioningProfile: js.UndefOr[String | Null] = js.undefined
  /**
    * Path of [requirements file](https://developer.apple.com/library/mac/documentation/Security/Conceptual/CodeSigningGuide/RequirementLang/RequirementLang.html) used in signing. Not applicable for MAS.
    */
  val requirements: js.UndefOr[String | Null] = js.undefined
  /**
    * The target package type: list of `default`, `dmg`, `mas`, `mas-dev`, `pkg`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`. Defaults to `default` (dmg and zip for Squirrel.Mac).
    */
  @JSName("target")
  val target_MacConfiguration: js.UndefOr[
    (js.Array[MacOsTargetName | TargetConfiguration]) | MacOsTargetName | TargetConfiguration | Null
  ] = js.undefined
  /**
    * Whether to sign app for development or for distribution.
    * @default distribution
    */
  val `type`: js.UndefOr[distribution | development | Null] = js.undefined
}

object MacConfiguration {
  @scala.inline
  def apply(
    appId: String = null,
    artifactName: String = null,
    asar: AsarOptions | Boolean = null,
    asarUnpack: js.Array[String] | String = null,
    binaries: js.Array[String] = null,
    bundleShortVersion: String = null,
    bundleVersion: String = null,
    category: String = null,
    compression: CompressionLevel = null,
    cscInstallerKeyPassword: String = null,
    cscInstallerLink: String = null,
    cscKeyPassword: String = null,
    cscLink: String = null,
    darkModeSupport: js.UndefOr[Boolean] = js.undefined,
    detectUpdateChannel: js.UndefOr[Boolean] = js.undefined,
    electronLanguages: js.Array[String] | String = null,
    electronUpdaterCompatibility: String = null,
    entitlements: String = null,
    entitlementsInherit: String = null,
    extendInfo: js.Any = null,
    extraDistFiles: js.Array[String] | String = null,
    extraFiles: (js.Array[FileSet | String]) | FileSet | String = null,
    extraResources: (js.Array[FileSet | String]) | FileSet | String = null,
    fileAssociations: js.Array[FileAssociation] | FileAssociation = null,
    files: (js.Array[FileSet | String]) | FileSet | String = null,
    forceCodeSigning: js.UndefOr[Boolean] = js.undefined,
    gatekeeperAssess: js.UndefOr[Boolean] = js.undefined,
    generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.undefined,
    hardenedRuntime: js.UndefOr[Boolean] = js.undefined,
    helperBundleId: String = null,
    icon: String = null,
    identity: String = null,
    minimumSystemVersion: String = null,
    protocols: js.Array[Protocol] | Protocol = null,
    provisioningProfile: String = null,
    publish: Publish = null,
    releaseInfo: ReleaseInfo = null,
    requirements: String = null,
    target: (js.Array[MacOsTargetName | TargetConfiguration]) | MacOsTargetName | TargetConfiguration = null,
    `type`: distribution | development = null
  ): MacConfiguration = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (asar != null) __obj.updateDynamic("asar")(asar.asInstanceOf[js.Any])
    if (asarUnpack != null) __obj.updateDynamic("asarUnpack")(asarUnpack.asInstanceOf[js.Any])
    if (binaries != null) __obj.updateDynamic("binaries")(binaries)
    if (bundleShortVersion != null) __obj.updateDynamic("bundleShortVersion")(bundleShortVersion)
    if (bundleVersion != null) __obj.updateDynamic("bundleVersion")(bundleVersion)
    if (category != null) __obj.updateDynamic("category")(category)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (cscInstallerKeyPassword != null) __obj.updateDynamic("cscInstallerKeyPassword")(cscInstallerKeyPassword)
    if (cscInstallerLink != null) __obj.updateDynamic("cscInstallerLink")(cscInstallerLink)
    if (cscKeyPassword != null) __obj.updateDynamic("cscKeyPassword")(cscKeyPassword)
    if (cscLink != null) __obj.updateDynamic("cscLink")(cscLink)
    if (!js.isUndefined(darkModeSupport)) __obj.updateDynamic("darkModeSupport")(darkModeSupport)
    if (!js.isUndefined(detectUpdateChannel)) __obj.updateDynamic("detectUpdateChannel")(detectUpdateChannel)
    if (electronLanguages != null) __obj.updateDynamic("electronLanguages")(electronLanguages.asInstanceOf[js.Any])
    if (electronUpdaterCompatibility != null) __obj.updateDynamic("electronUpdaterCompatibility")(electronUpdaterCompatibility)
    if (entitlements != null) __obj.updateDynamic("entitlements")(entitlements)
    if (entitlementsInherit != null) __obj.updateDynamic("entitlementsInherit")(entitlementsInherit)
    if (extendInfo != null) __obj.updateDynamic("extendInfo")(extendInfo)
    if (extraDistFiles != null) __obj.updateDynamic("extraDistFiles")(extraDistFiles.asInstanceOf[js.Any])
    if (extraFiles != null) __obj.updateDynamic("extraFiles")(extraFiles.asInstanceOf[js.Any])
    if (extraResources != null) __obj.updateDynamic("extraResources")(extraResources.asInstanceOf[js.Any])
    if (fileAssociations != null) __obj.updateDynamic("fileAssociations")(fileAssociations.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCodeSigning)) __obj.updateDynamic("forceCodeSigning")(forceCodeSigning)
    if (!js.isUndefined(gatekeeperAssess)) __obj.updateDynamic("gatekeeperAssess")(gatekeeperAssess)
    if (!js.isUndefined(generateUpdatesFilesForAllChannels)) __obj.updateDynamic("generateUpdatesFilesForAllChannels")(generateUpdatesFilesForAllChannels)
    if (!js.isUndefined(hardenedRuntime)) __obj.updateDynamic("hardenedRuntime")(hardenedRuntime)
    if (helperBundleId != null) __obj.updateDynamic("helperBundleId")(helperBundleId)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (minimumSystemVersion != null) __obj.updateDynamic("minimumSystemVersion")(minimumSystemVersion)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (provisioningProfile != null) __obj.updateDynamic("provisioningProfile")(provisioningProfile)
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (releaseInfo != null) __obj.updateDynamic("releaseInfo")(releaseInfo)
    if (requirements != null) __obj.updateDynamic("requirements")(requirements)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacConfiguration]
  }
}

