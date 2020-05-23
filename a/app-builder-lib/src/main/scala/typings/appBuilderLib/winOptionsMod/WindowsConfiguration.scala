package typings.appBuilderLib.winOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.sha1
import typings.appBuilderLib.appBuilderLibStrings.sha256
import typings.appBuilderLib.coreMod.CompressionLevel
import typings.appBuilderLib.coreMod.Publish
import typings.appBuilderLib.coreMod.TargetConfigType
import typings.appBuilderLib.fileAssociationMod.FileAssociation
import typings.appBuilderLib.platformSpecificBuildOptionsMod.AsarOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.FileSet
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.Protocol
import typings.appBuilderLib.platformSpecificBuildOptionsMod.ReleaseInfo
import typings.appBuilderLib.windowsCodeSignMod.CustomWindowsSign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsConfiguration extends PlatformSpecificBuildOptions {
  /**
    * The path to an additional certificate file you want to add to the signature block.
    */
  val additionalCertificateFile: js.UndefOr[String | Null] = js.undefined
  /**
    * The path to the *.pfx certificate you want to sign with. Please use it only if you cannot use env variable `CSC_LINK` (`WIN_CSC_LINK`) for some reason.
    * Please see [Code Signing](/code-signing).
    */
  val certificateFile: js.UndefOr[String | Null] = js.undefined
  /**
    * The password to the certificate provided in `certificateFile`. Please use it only if you cannot use env variable `CSC_KEY_PASSWORD` (`WIN_CSC_KEY_PASSWORD`) for some reason.
    * Please see [Code Signing](/code-signing).
    */
  val certificatePassword: js.UndefOr[String | Null] = js.undefined
  /**
    * The SHA1 hash of the signing certificate. The SHA1 hash is commonly specified when multiple certificates satisfy the criteria specified by the remaining switches. Works only on Windows (or on macOS if [Parallels Desktop](https://www.parallels.com/products/desktop/) Windows 10 virtual machines exits).
    */
  val certificateSha1: js.UndefOr[String | Null] = js.undefined
  /**
    * The name of the subject of the signing certificate. Required only for EV Code Signing and works only on Windows (or on macOS if [Parallels Desktop](https://www.parallels.com/products/desktop/) Windows 10 virtual machines exits).
    */
  val certificateSubjectName: js.UndefOr[String | Null] = js.undefined
  /**
    * The trademarks and registered trademarks.
    */
  val legalTrademarks: js.UndefOr[String | Null] = js.undefined
  /**
    * [The publisher name](https://github.com/electron-userland/electron-builder/issues/1187#issuecomment-278972073), exactly as in your code signed certificate. Several names can be provided.
    * Defaults to common name from your code signing certificate.
    */
  val publisherName: js.UndefOr[String | js.Array[String] | Null] = js.undefined
  /**
    * The [security level](https://msdn.microsoft.com/en-us/library/6ad1fshk.aspx#Anchor_9) at which the application requests to be executed.
    * Cannot be specified per target, allowed only in the `win`.
    * @default asInvoker
    */
  val requestedExecutionLevel: js.UndefOr[RequestedExecutionLevel | Null] = js.undefined
  /**
    * The URL of the RFC 3161 time stamp server.
    * @default http://timestamp.comodoca.com/rfc3161
    */
  val rfc3161TimeStampServer: js.UndefOr[String | Null] = js.undefined
  /**
    * The custom function (or path to file or module id) to sign Windows executable.
    */
  val sign: js.UndefOr[CustomWindowsSign | String | Null] = js.undefined
  /**
    * Whether to sign and add metadata to executable. Advanced option.
    * @default true
    */
  val signAndEditExecutable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to sign DLL files. Advanced option.
    * @see https://github.com/electron-userland/electron-builder/issues/3101#issuecomment-404212384
    * @default false
    */
  val signDlls: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of signing algorithms used. For AppX `sha256` is always used.
    * @default ['sha1', 'sha256']
    */
  val signingHashAlgorithms: js.UndefOr[(js.Array[sha1 | sha256]) | Null] = js.undefined
  /**
    * The target package type: list of `nsis`, `nsis-web` (Web installer), `portable` ([portable](/configuration/nsis#portable) app without installation), `appx`, `msi`, `squirrel`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`.
    * AppX package can be built only on Windows 10.
    *
    * To use Squirrel.Windows please install `electron-builder-squirrel-windows` dependency.
    *
    * @default nsis
    */
  @JSName("target")
  val target_WindowsConfiguration: js.UndefOr[TargetConfigType] = js.undefined
  /**
    * The URL of the time stamp server.
    * @default http://timestamp.digicert.com
    */
  val timeStampServer: js.UndefOr[String | Null] = js.undefined
  /**
    * Whether to verify the signature of an available update before installation.
    * The [publisher name](#publisherName) will be used for the signature verification.
    *
    * @default true
    */
  val verifyUpdateCodeSignature: js.UndefOr[Boolean] = js.undefined
}

object WindowsConfiguration {
  @scala.inline
  def apply(
    additionalCertificateFile: js.UndefOr[Null | String] = js.undefined,
    appId: js.UndefOr[Null | String] = js.undefined,
    artifactName: js.UndefOr[Null | String] = js.undefined,
    asar: js.UndefOr[Null | AsarOptions | Boolean] = js.undefined,
    asarUnpack: js.UndefOr[Null | js.Array[String] | String] = js.undefined,
    certificateFile: js.UndefOr[Null | String] = js.undefined,
    certificatePassword: js.UndefOr[Null | String] = js.undefined,
    certificateSha1: js.UndefOr[Null | String] = js.undefined,
    certificateSubjectName: js.UndefOr[Null | String] = js.undefined,
    compression: js.UndefOr[Null | CompressionLevel] = js.undefined,
    cscKeyPassword: js.UndefOr[Null | String] = js.undefined,
    cscLink: js.UndefOr[Null | String] = js.undefined,
    detectUpdateChannel: js.UndefOr[Boolean] = js.undefined,
    electronUpdaterCompatibility: js.UndefOr[Null | String] = js.undefined,
    extraFiles: js.UndefOr[Null | (js.Array[FileSet | String]) | FileSet | String] = js.undefined,
    extraResources: js.UndefOr[Null | (js.Array[FileSet | String]) | FileSet | String] = js.undefined,
    fileAssociations: js.Array[FileAssociation] | FileAssociation = null,
    files: js.UndefOr[Null | (js.Array[FileSet | String]) | FileSet | String] = js.undefined,
    forceCodeSigning: js.UndefOr[Boolean] = js.undefined,
    generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[Null | String] = js.undefined,
    legalTrademarks: js.UndefOr[Null | String] = js.undefined,
    protocols: js.Array[Protocol] | Protocol = null,
    publish: js.UndefOr[Null | Publish] = js.undefined,
    publisherName: js.UndefOr[Null | String | js.Array[String]] = js.undefined,
    releaseInfo: ReleaseInfo = null,
    requestedExecutionLevel: js.UndefOr[Null | RequestedExecutionLevel] = js.undefined,
    rfc3161TimeStampServer: js.UndefOr[Null | String] = js.undefined,
    sign: js.UndefOr[Null | CustomWindowsSign | String] = js.undefined,
    signAndEditExecutable: js.UndefOr[Boolean] = js.undefined,
    signDlls: js.UndefOr[Boolean] = js.undefined,
    signingHashAlgorithms: js.UndefOr[Null | (js.Array[sha1 | sha256])] = js.undefined,
    target: js.UndefOr[Null | TargetConfigType] = js.undefined,
    timeStampServer: js.UndefOr[Null | String] = js.undefined,
    verifyUpdateCodeSignature: js.UndefOr[Boolean] = js.undefined
  ): WindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(additionalCertificateFile)) __obj.updateDynamic("additionalCertificateFile")(additionalCertificateFile.asInstanceOf[js.Any])
    if (!js.isUndefined(appId)) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (!js.isUndefined(artifactName)) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (!js.isUndefined(asar)) __obj.updateDynamic("asar")(asar.asInstanceOf[js.Any])
    if (!js.isUndefined(asarUnpack)) __obj.updateDynamic("asarUnpack")(asarUnpack.asInstanceOf[js.Any])
    if (!js.isUndefined(certificateFile)) __obj.updateDynamic("certificateFile")(certificateFile.asInstanceOf[js.Any])
    if (!js.isUndefined(certificatePassword)) __obj.updateDynamic("certificatePassword")(certificatePassword.asInstanceOf[js.Any])
    if (!js.isUndefined(certificateSha1)) __obj.updateDynamic("certificateSha1")(certificateSha1.asInstanceOf[js.Any])
    if (!js.isUndefined(certificateSubjectName)) __obj.updateDynamic("certificateSubjectName")(certificateSubjectName.asInstanceOf[js.Any])
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(cscKeyPassword)) __obj.updateDynamic("cscKeyPassword")(cscKeyPassword.asInstanceOf[js.Any])
    if (!js.isUndefined(cscLink)) __obj.updateDynamic("cscLink")(cscLink.asInstanceOf[js.Any])
    if (!js.isUndefined(detectUpdateChannel)) __obj.updateDynamic("detectUpdateChannel")(detectUpdateChannel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(electronUpdaterCompatibility)) __obj.updateDynamic("electronUpdaterCompatibility")(electronUpdaterCompatibility.asInstanceOf[js.Any])
    if (!js.isUndefined(extraFiles)) __obj.updateDynamic("extraFiles")(extraFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(extraResources)) __obj.updateDynamic("extraResources")(extraResources.asInstanceOf[js.Any])
    if (fileAssociations != null) __obj.updateDynamic("fileAssociations")(fileAssociations.asInstanceOf[js.Any])
    if (!js.isUndefined(files)) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCodeSigning)) __obj.updateDynamic("forceCodeSigning")(forceCodeSigning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateUpdatesFilesForAllChannels)) __obj.updateDynamic("generateUpdatesFilesForAllChannels")(generateUpdatesFilesForAllChannels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(legalTrademarks)) __obj.updateDynamic("legalTrademarks")(legalTrademarks.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherName)) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (releaseInfo != null) __obj.updateDynamic("releaseInfo")(releaseInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(requestedExecutionLevel)) __obj.updateDynamic("requestedExecutionLevel")(requestedExecutionLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(rfc3161TimeStampServer)) __obj.updateDynamic("rfc3161TimeStampServer")(rfc3161TimeStampServer.asInstanceOf[js.Any])
    if (!js.isUndefined(sign)) __obj.updateDynamic("sign")(sign.asInstanceOf[js.Any])
    if (!js.isUndefined(signAndEditExecutable)) __obj.updateDynamic("signAndEditExecutable")(signAndEditExecutable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(signDlls)) __obj.updateDynamic("signDlls")(signDlls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(signingHashAlgorithms)) __obj.updateDynamic("signingHashAlgorithms")(signingHashAlgorithms.asInstanceOf[js.Any])
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(timeStampServer)) __obj.updateDynamic("timeStampServer")(timeStampServer.asInstanceOf[js.Any])
    if (!js.isUndefined(verifyUpdateCodeSignature)) __obj.updateDynamic("verifyUpdateCodeSignature")(verifyUpdateCodeSignature.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsConfiguration]
  }
}

