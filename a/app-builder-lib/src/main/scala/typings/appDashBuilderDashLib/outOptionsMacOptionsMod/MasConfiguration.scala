package typings.appDashBuilderDashLib.outOptionsMacOptionsMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.development
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.distribution
import typings.appDashBuilderDashLib.outCoreMod.CompressionLevel
import typings.appDashBuilderDashLib.outCoreMod.TargetConfiguration
import typings.appDashBuilderDashLib.outOptionsFileAssociationMod.FileAssociation
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.AsarOptions
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.Protocol
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.ReleaseInfo
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.Publish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasConfiguration extends MacConfiguration

object MasConfiguration {
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
  ): MasConfiguration = {
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
    __obj.asInstanceOf[MasConfiguration]
  }
}

