package typings.appBuilderLib.macOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.development
import typings.appBuilderLib.appBuilderLibStrings.distribution
import typings.appBuilderLib.coreMod.CompressionLevel
import typings.appBuilderLib.coreMod.Publish
import typings.appBuilderLib.coreMod.TargetConfiguration
import typings.appBuilderLib.fileAssociationMod.FileAssociation
import typings.appBuilderLib.platformSpecificBuildOptionsMod.AsarOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.FileSet
import typings.appBuilderLib.platformSpecificBuildOptionsMod.Protocol
import typings.appBuilderLib.platformSpecificBuildOptionsMod.ReleaseInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasConfiguration extends MacConfiguration

object MasConfiguration {
  @scala.inline
  def apply(
    appId: js.UndefOr[Null | String] = js.undefined,
    artifactName: js.UndefOr[Null | String] = js.undefined,
    asar: js.UndefOr[Null | AsarOptions | Boolean] = js.undefined,
    asarUnpack: js.UndefOr[Null | js.Array[String] | String] = js.undefined,
    binaries: js.UndefOr[Null | js.Array[String]] = js.undefined,
    bundleShortVersion: js.UndefOr[Null | String] = js.undefined,
    bundleVersion: js.UndefOr[Null | String] = js.undefined,
    category: js.UndefOr[Null | String] = js.undefined,
    compression: js.UndefOr[Null | CompressionLevel] = js.undefined,
    cscInstallerKeyPassword: js.UndefOr[Null | String] = js.undefined,
    cscInstallerLink: js.UndefOr[Null | String] = js.undefined,
    cscKeyPassword: js.UndefOr[Null | String] = js.undefined,
    cscLink: js.UndefOr[Null | String] = js.undefined,
    darkModeSupport: js.UndefOr[Boolean] = js.undefined,
    detectUpdateChannel: js.UndefOr[Boolean] = js.undefined,
    electronLanguages: js.Array[String] | String = null,
    electronUpdaterCompatibility: js.UndefOr[Null | String] = js.undefined,
    entitlements: js.UndefOr[Null | String] = js.undefined,
    entitlementsInherit: js.UndefOr[Null | String] = js.undefined,
    extendInfo: js.Any = null,
    extraDistFiles: js.UndefOr[Null | js.Array[String] | String] = js.undefined,
    extraFiles: js.UndefOr[Null | (js.Array[FileSet | String]) | FileSet | String] = js.undefined,
    extraResources: js.UndefOr[Null | (js.Array[FileSet | String]) | FileSet | String] = js.undefined,
    fileAssociations: js.Array[FileAssociation] | FileAssociation = null,
    files: js.UndefOr[Null | (js.Array[FileSet | String]) | FileSet | String] = js.undefined,
    forceCodeSigning: js.UndefOr[Boolean] = js.undefined,
    gatekeeperAssess: js.UndefOr[Boolean] = js.undefined,
    generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.undefined,
    hardenedRuntime: js.UndefOr[Boolean] = js.undefined,
    helperBundleId: js.UndefOr[Null | String] = js.undefined,
    helperEHBundleId: js.UndefOr[Null | String] = js.undefined,
    helperGPUBundleId: js.UndefOr[Null | String] = js.undefined,
    helperNPBundleId: js.UndefOr[Null | String] = js.undefined,
    helperPluginBundleId: js.UndefOr[Null | String] = js.undefined,
    helperRendererBundleId: js.UndefOr[Null | String] = js.undefined,
    icon: js.UndefOr[Null | String] = js.undefined,
    identity: js.UndefOr[Null | String] = js.undefined,
    minimumSystemVersion: js.UndefOr[Null | String] = js.undefined,
    protocols: js.Array[Protocol] | Protocol = null,
    provisioningProfile: js.UndefOr[Null | String] = js.undefined,
    publish: js.UndefOr[Null | Publish] = js.undefined,
    releaseInfo: ReleaseInfo = null,
    requirements: js.UndefOr[Null | String] = js.undefined,
    target: js.UndefOr[
      Null | (js.Array[MacOsTargetName | TargetConfiguration]) | MacOsTargetName | TargetConfiguration
    ] = js.undefined,
    `type`: js.UndefOr[Null | distribution | development] = js.undefined
  ): MasConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appId)) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (!js.isUndefined(artifactName)) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (!js.isUndefined(asar)) __obj.updateDynamic("asar")(asar.asInstanceOf[js.Any])
    if (!js.isUndefined(asarUnpack)) __obj.updateDynamic("asarUnpack")(asarUnpack.asInstanceOf[js.Any])
    if (!js.isUndefined(binaries)) __obj.updateDynamic("binaries")(binaries.asInstanceOf[js.Any])
    if (!js.isUndefined(bundleShortVersion)) __obj.updateDynamic("bundleShortVersion")(bundleShortVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(bundleVersion)) __obj.updateDynamic("bundleVersion")(bundleVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(cscInstallerKeyPassword)) __obj.updateDynamic("cscInstallerKeyPassword")(cscInstallerKeyPassword.asInstanceOf[js.Any])
    if (!js.isUndefined(cscInstallerLink)) __obj.updateDynamic("cscInstallerLink")(cscInstallerLink.asInstanceOf[js.Any])
    if (!js.isUndefined(cscKeyPassword)) __obj.updateDynamic("cscKeyPassword")(cscKeyPassword.asInstanceOf[js.Any])
    if (!js.isUndefined(cscLink)) __obj.updateDynamic("cscLink")(cscLink.asInstanceOf[js.Any])
    if (!js.isUndefined(darkModeSupport)) __obj.updateDynamic("darkModeSupport")(darkModeSupport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(detectUpdateChannel)) __obj.updateDynamic("detectUpdateChannel")(detectUpdateChannel.get.asInstanceOf[js.Any])
    if (electronLanguages != null) __obj.updateDynamic("electronLanguages")(electronLanguages.asInstanceOf[js.Any])
    if (!js.isUndefined(electronUpdaterCompatibility)) __obj.updateDynamic("electronUpdaterCompatibility")(electronUpdaterCompatibility.asInstanceOf[js.Any])
    if (!js.isUndefined(entitlements)) __obj.updateDynamic("entitlements")(entitlements.asInstanceOf[js.Any])
    if (!js.isUndefined(entitlementsInherit)) __obj.updateDynamic("entitlementsInherit")(entitlementsInherit.asInstanceOf[js.Any])
    if (extendInfo != null) __obj.updateDynamic("extendInfo")(extendInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(extraDistFiles)) __obj.updateDynamic("extraDistFiles")(extraDistFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(extraFiles)) __obj.updateDynamic("extraFiles")(extraFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(extraResources)) __obj.updateDynamic("extraResources")(extraResources.asInstanceOf[js.Any])
    if (fileAssociations != null) __obj.updateDynamic("fileAssociations")(fileAssociations.asInstanceOf[js.Any])
    if (!js.isUndefined(files)) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCodeSigning)) __obj.updateDynamic("forceCodeSigning")(forceCodeSigning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gatekeeperAssess)) __obj.updateDynamic("gatekeeperAssess")(gatekeeperAssess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateUpdatesFilesForAllChannels)) __obj.updateDynamic("generateUpdatesFilesForAllChannels")(generateUpdatesFilesForAllChannels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hardenedRuntime)) __obj.updateDynamic("hardenedRuntime")(hardenedRuntime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(helperBundleId)) __obj.updateDynamic("helperBundleId")(helperBundleId.asInstanceOf[js.Any])
    if (!js.isUndefined(helperEHBundleId)) __obj.updateDynamic("helperEHBundleId")(helperEHBundleId.asInstanceOf[js.Any])
    if (!js.isUndefined(helperGPUBundleId)) __obj.updateDynamic("helperGPUBundleId")(helperGPUBundleId.asInstanceOf[js.Any])
    if (!js.isUndefined(helperNPBundleId)) __obj.updateDynamic("helperNPBundleId")(helperNPBundleId.asInstanceOf[js.Any])
    if (!js.isUndefined(helperPluginBundleId)) __obj.updateDynamic("helperPluginBundleId")(helperPluginBundleId.asInstanceOf[js.Any])
    if (!js.isUndefined(helperRendererBundleId)) __obj.updateDynamic("helperRendererBundleId")(helperRendererBundleId.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(identity)) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumSystemVersion)) __obj.updateDynamic("minimumSystemVersion")(minimumSystemVersion.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(provisioningProfile)) __obj.updateDynamic("provisioningProfile")(provisioningProfile.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (releaseInfo != null) __obj.updateDynamic("releaseInfo")(releaseInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(requirements)) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasConfiguration]
  }
}

