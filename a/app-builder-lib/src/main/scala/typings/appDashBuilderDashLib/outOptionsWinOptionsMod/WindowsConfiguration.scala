package typings.appDashBuilderDashLib.outOptionsWinOptionsMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.sha1
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.sha256
import typings.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod.CustomWindowsSign
import typings.appDashBuilderDashLib.outCoreMod.CompressionLevel
import typings.appDashBuilderDashLib.outCoreMod.Publish
import typings.appDashBuilderDashLib.outCoreMod.TargetConfigType
import typings.appDashBuilderDashLib.outOptionsFileAssociationMod.FileAssociation
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.AsarOptions
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.FileSet
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.Protocol
import typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod.ReleaseInfo
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
    additionalCertificateFile: String = null,
    appId: String = null,
    artifactName: String = null,
    asar: AsarOptions | Boolean = null,
    asarUnpack: js.Array[String] | String = null,
    certificateFile: String = null,
    certificatePassword: String = null,
    certificateSha1: String = null,
    certificateSubjectName: String = null,
    compression: CompressionLevel = null,
    cscKeyPassword: String = null,
    cscLink: String = null,
    detectUpdateChannel: js.UndefOr[Boolean] = js.undefined,
    electronUpdaterCompatibility: String = null,
    extraFiles: (js.Array[FileSet | String]) | FileSet | String = null,
    extraResources: (js.Array[FileSet | String]) | FileSet | String = null,
    fileAssociations: js.Array[FileAssociation] | FileAssociation = null,
    files: (js.Array[FileSet | String]) | FileSet | String = null,
    forceCodeSigning: js.UndefOr[Boolean] = js.undefined,
    generateUpdatesFilesForAllChannels: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    legalTrademarks: String = null,
    protocols: js.Array[Protocol] | Protocol = null,
    publish: Publish = null,
    publisherName: String | js.Array[String] = null,
    releaseInfo: ReleaseInfo = null,
    requestedExecutionLevel: RequestedExecutionLevel = null,
    rfc3161TimeStampServer: String = null,
    sign: CustomWindowsSign | String = null,
    signAndEditExecutable: js.UndefOr[Boolean] = js.undefined,
    signDlls: js.UndefOr[Boolean] = js.undefined,
    signingHashAlgorithms: js.Array[sha1 | sha256] = null,
    target: TargetConfigType = null,
    timeStampServer: String = null,
    verifyUpdateCodeSignature: js.UndefOr[Boolean] = js.undefined
  ): WindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (additionalCertificateFile != null) __obj.updateDynamic("additionalCertificateFile")(additionalCertificateFile)
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (artifactName != null) __obj.updateDynamic("artifactName")(artifactName)
    if (asar != null) __obj.updateDynamic("asar")(asar.asInstanceOf[js.Any])
    if (asarUnpack != null) __obj.updateDynamic("asarUnpack")(asarUnpack.asInstanceOf[js.Any])
    if (certificateFile != null) __obj.updateDynamic("certificateFile")(certificateFile)
    if (certificatePassword != null) __obj.updateDynamic("certificatePassword")(certificatePassword)
    if (certificateSha1 != null) __obj.updateDynamic("certificateSha1")(certificateSha1)
    if (certificateSubjectName != null) __obj.updateDynamic("certificateSubjectName")(certificateSubjectName)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (cscKeyPassword != null) __obj.updateDynamic("cscKeyPassword")(cscKeyPassword)
    if (cscLink != null) __obj.updateDynamic("cscLink")(cscLink)
    if (!js.isUndefined(detectUpdateChannel)) __obj.updateDynamic("detectUpdateChannel")(detectUpdateChannel)
    if (electronUpdaterCompatibility != null) __obj.updateDynamic("electronUpdaterCompatibility")(electronUpdaterCompatibility)
    if (extraFiles != null) __obj.updateDynamic("extraFiles")(extraFiles.asInstanceOf[js.Any])
    if (extraResources != null) __obj.updateDynamic("extraResources")(extraResources.asInstanceOf[js.Any])
    if (fileAssociations != null) __obj.updateDynamic("fileAssociations")(fileAssociations.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (!js.isUndefined(forceCodeSigning)) __obj.updateDynamic("forceCodeSigning")(forceCodeSigning)
    if (!js.isUndefined(generateUpdatesFilesForAllChannels)) __obj.updateDynamic("generateUpdatesFilesForAllChannels")(generateUpdatesFilesForAllChannels)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (legalTrademarks != null) __obj.updateDynamic("legalTrademarks")(legalTrademarks)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (publish != null) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (releaseInfo != null) __obj.updateDynamic("releaseInfo")(releaseInfo)
    if (requestedExecutionLevel != null) __obj.updateDynamic("requestedExecutionLevel")(requestedExecutionLevel)
    if (rfc3161TimeStampServer != null) __obj.updateDynamic("rfc3161TimeStampServer")(rfc3161TimeStampServer)
    if (sign != null) __obj.updateDynamic("sign")(sign.asInstanceOf[js.Any])
    if (!js.isUndefined(signAndEditExecutable)) __obj.updateDynamic("signAndEditExecutable")(signAndEditExecutable)
    if (!js.isUndefined(signDlls)) __obj.updateDynamic("signDlls")(signDlls)
    if (signingHashAlgorithms != null) __obj.updateDynamic("signingHashAlgorithms")(signingHashAlgorithms)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeStampServer != null) __obj.updateDynamic("timeStampServer")(timeStampServer)
    if (!js.isUndefined(verifyUpdateCodeSignature)) __obj.updateDynamic("verifyUpdateCodeSignature")(verifyUpdateCodeSignature)
    __obj.asInstanceOf[WindowsConfiguration]
  }
}

