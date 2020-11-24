package typings.appBuilderLib.winOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.sha1
import typings.appBuilderLib.appBuilderLibStrings.sha256
import typings.appBuilderLib.coreMod.TargetConfigType
import typings.appBuilderLib.coreMod.TargetConfiguration
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appBuilderLib.winPackagerMod.WinPackager
import typings.appBuilderLib.windowsCodeSignMod.CustomWindowsSign
import typings.appBuilderLib.windowsCodeSignMod.CustomWindowsSignTaskConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsConfiguration extends PlatformSpecificBuildOptions {
  
  /**
    * The path to an additional certificate file you want to add to the signature block.
    */
  val additionalCertificateFile: js.UndefOr[String | Null] = js.native
  
  /**
    * The path to the *.pfx certificate you want to sign with. Please use it only if you cannot use env variable `CSC_LINK` (`WIN_CSC_LINK`) for some reason.
    * Please see [Code Signing](/code-signing).
    */
  val certificateFile: js.UndefOr[String | Null] = js.native
  
  /**
    * The password to the certificate provided in `certificateFile`. Please use it only if you cannot use env variable `CSC_KEY_PASSWORD` (`WIN_CSC_KEY_PASSWORD`) for some reason.
    * Please see [Code Signing](/code-signing).
    */
  val certificatePassword: js.UndefOr[String | Null] = js.native
  
  /**
    * The SHA1 hash of the signing certificate. The SHA1 hash is commonly specified when multiple certificates satisfy the criteria specified by the remaining switches. Works only on Windows (or on macOS if [Parallels Desktop](https://www.parallels.com/products/desktop/) Windows 10 virtual machines exits).
    */
  val certificateSha1: js.UndefOr[String | Null] = js.native
  
  /**
    * The name of the subject of the signing certificate. Required only for EV Code Signing and works only on Windows (or on macOS if [Parallels Desktop](https://www.parallels.com/products/desktop/) Windows 10 virtual machines exits).
    */
  val certificateSubjectName: js.UndefOr[String | Null] = js.native
  
  /**
    * The trademarks and registered trademarks.
    */
  val legalTrademarks: js.UndefOr[String | Null] = js.native
  
  /**
    * [The publisher name](https://github.com/electron-userland/electron-builder/issues/1187#issuecomment-278972073), exactly as in your code signed certificate. Several names can be provided.
    * Defaults to common name from your code signing certificate.
    */
  val publisherName: js.UndefOr[String | js.Array[String] | Null] = js.native
  
  /**
    * The [security level](https://msdn.microsoft.com/en-us/library/6ad1fshk.aspx#Anchor_9) at which the application requests to be executed.
    * Cannot be specified per target, allowed only in the `win`.
    * @default asInvoker
    */
  val requestedExecutionLevel: js.UndefOr[RequestedExecutionLevel | Null] = js.native
  
  /**
    * The URL of the RFC 3161 time stamp server.
    * @default http://timestamp.digicert.com
    */
  val rfc3161TimeStampServer: js.UndefOr[String | Null] = js.native
  
  /**
    * The custom function (or path to file or module id) to sign Windows executable.
    */
  val sign: js.UndefOr[CustomWindowsSign | String | Null] = js.native
  
  /**
    * Whether to sign and add metadata to executable. Advanced option.
    * @default true
    */
  val signAndEditExecutable: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to sign DLL files. Advanced option.
    * @see https://github.com/electron-userland/electron-builder/issues/3101#issuecomment-404212384
    * @default false
    */
  val signDlls: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of signing algorithms used. For AppX `sha256` is always used.
    * @default ['sha1', 'sha256']
    */
  val signingHashAlgorithms: js.UndefOr[(js.Array[sha1 | sha256]) | Null] = js.native
  
  /**
    * The target package type: list of `nsis`, `nsis-web` (Web installer), `portable` ([portable](/configuration/nsis#portable) app without installation), `appx`, `msi`, `squirrel`, `7z`, `zip`, `tar.xz`, `tar.lz`, `tar.gz`, `tar.bz2`, `dir`.
    * AppX package can be built only on Windows 10.
    *
    * To use Squirrel.Windows please install `electron-builder-squirrel-windows` dependency.
    *
    * @default nsis
    */
  @JSName("target")
  val target_WindowsConfiguration: js.UndefOr[TargetConfigType] = js.native
  
  /**
    * The URL of the time stamp server.
    * @default http://timestamp.digicert.com
    */
  val timeStampServer: js.UndefOr[String | Null] = js.native
  
  /**
    * Whether to verify the signature of an available update before installation.
    * The [publisher name](#publisherName) will be used for the signature verification.
    *
    * @default true
    */
  val verifyUpdateCodeSignature: js.UndefOr[Boolean] = js.native
}
object WindowsConfiguration {
  
  @scala.inline
  def apply(): WindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsConfiguration]
  }
  
  @scala.inline
  implicit class WindowsConfigurationOps[Self <: WindowsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAdditionalCertificateFile(value: String): Self = this.set("additionalCertificateFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalCertificateFile: Self = this.set("additionalCertificateFile", js.undefined)
    
    @scala.inline
    def setAdditionalCertificateFileNull: Self = this.set("additionalCertificateFile", null)
    
    @scala.inline
    def setCertificateFile(value: String): Self = this.set("certificateFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateFile: Self = this.set("certificateFile", js.undefined)
    
    @scala.inline
    def setCertificateFileNull: Self = this.set("certificateFile", null)
    
    @scala.inline
    def setCertificatePassword(value: String): Self = this.set("certificatePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificatePassword: Self = this.set("certificatePassword", js.undefined)
    
    @scala.inline
    def setCertificatePasswordNull: Self = this.set("certificatePassword", null)
    
    @scala.inline
    def setCertificateSha1(value: String): Self = this.set("certificateSha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateSha1: Self = this.set("certificateSha1", js.undefined)
    
    @scala.inline
    def setCertificateSha1Null: Self = this.set("certificateSha1", null)
    
    @scala.inline
    def setCertificateSubjectName(value: String): Self = this.set("certificateSubjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateSubjectName: Self = this.set("certificateSubjectName", js.undefined)
    
    @scala.inline
    def setCertificateSubjectNameNull: Self = this.set("certificateSubjectName", null)
    
    @scala.inline
    def setLegalTrademarks(value: String): Self = this.set("legalTrademarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegalTrademarks: Self = this.set("legalTrademarks", js.undefined)
    
    @scala.inline
    def setLegalTrademarksNull: Self = this.set("legalTrademarks", null)
    
    @scala.inline
    def setPublisherNameVarargs(value: String*): Self = this.set("publisherName", js.Array(value :_*))
    
    @scala.inline
    def setPublisherName(value: String | js.Array[String]): Self = this.set("publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherName: Self = this.set("publisherName", js.undefined)
    
    @scala.inline
    def setPublisherNameNull: Self = this.set("publisherName", null)
    
    @scala.inline
    def setRequestedExecutionLevel(value: RequestedExecutionLevel): Self = this.set("requestedExecutionLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedExecutionLevel: Self = this.set("requestedExecutionLevel", js.undefined)
    
    @scala.inline
    def setRequestedExecutionLevelNull: Self = this.set("requestedExecutionLevel", null)
    
    @scala.inline
    def setRfc3161TimeStampServer(value: String): Self = this.set("rfc3161TimeStampServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRfc3161TimeStampServer: Self = this.set("rfc3161TimeStampServer", js.undefined)
    
    @scala.inline
    def setRfc3161TimeStampServerNull: Self = this.set("rfc3161TimeStampServer", null)
    
    @scala.inline
    def setSignFunction2(
      value: (/* configuration */ CustomWindowsSignTaskConfiguration, /* packager */ js.UndefOr[WinPackager]) => js.Promise[js.Any]
    ): Self = this.set("sign", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSign(value: CustomWindowsSign | String): Self = this.set("sign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSign: Self = this.set("sign", js.undefined)
    
    @scala.inline
    def setSignNull: Self = this.set("sign", null)
    
    @scala.inline
    def setSignAndEditExecutable(value: Boolean): Self = this.set("signAndEditExecutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignAndEditExecutable: Self = this.set("signAndEditExecutable", js.undefined)
    
    @scala.inline
    def setSignDlls(value: Boolean): Self = this.set("signDlls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignDlls: Self = this.set("signDlls", js.undefined)
    
    @scala.inline
    def setSigningHashAlgorithmsVarargs(value: (sha1 | sha256)*): Self = this.set("signingHashAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setSigningHashAlgorithms(value: js.Array[sha1 | sha256]): Self = this.set("signingHashAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningHashAlgorithms: Self = this.set("signingHashAlgorithms", js.undefined)
    
    @scala.inline
    def setSigningHashAlgorithmsNull: Self = this.set("signingHashAlgorithms", null)
    
    @scala.inline
    def setTargetVarargs(value: (String | TargetConfiguration)*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: TargetConfigType): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setTimeStampServer(value: String): Self = this.set("timeStampServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeStampServer: Self = this.set("timeStampServer", js.undefined)
    
    @scala.inline
    def setTimeStampServerNull: Self = this.set("timeStampServer", null)
    
    @scala.inline
    def setVerifyUpdateCodeSignature(value: Boolean): Self = this.set("verifyUpdateCodeSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyUpdateCodeSignature: Self = this.set("verifyUpdateCodeSignature", js.undefined)
  }
}
