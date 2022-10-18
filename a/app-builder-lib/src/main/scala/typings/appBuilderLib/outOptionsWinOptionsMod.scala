package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.sha1
import typings.appBuilderLib.appBuilderLibStrings.sha256_
import typings.appBuilderLib.outCodeSignWindowsCodeSignMod.CustomWindowsSign
import typings.appBuilderLib.outCodeSignWindowsCodeSignMod.CustomWindowsSignTaskConfiguration
import typings.appBuilderLib.outCoreMod.TargetConfigType
import typings.appBuilderLib.outCoreMod.TargetConfiguration
import typings.appBuilderLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.appBuilderLib.outWinPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outOptionsWinOptionsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.appBuilderLib.appBuilderLibStrings.asInvoker
    - typings.appBuilderLib.appBuilderLibStrings.highestAvailable
    - typings.appBuilderLib.appBuilderLibStrings.requireAdministrator
  */
  trait RequestedExecutionLevel extends StObject
  object RequestedExecutionLevel {
    
    inline def asInvoker: typings.appBuilderLib.appBuilderLibStrings.asInvoker = "asInvoker".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.asInvoker]
    
    inline def highestAvailable: typings.appBuilderLib.appBuilderLibStrings.highestAvailable = "highestAvailable".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.highestAvailable]
    
    inline def requireAdministrator: typings.appBuilderLib.appBuilderLibStrings.requireAdministrator = "requireAdministrator".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.requireAdministrator]
  }
  
  trait WindowsConfiguration
    extends StObject
       with PlatformSpecificBuildOptions {
    
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
      * The name of the subject of the signing certificate, which is often labeled with the field name `issued to`. Required only for EV Code Signing and works only on Windows (or on macOS if [Parallels Desktop](https://www.parallels.com/products/desktop/) Windows 10 virtual machines exits).
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
      * @default http://timestamp.digicert.com
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
    val signingHashAlgorithms: js.UndefOr[(js.Array[sha1 | sha256_]) | Null] = js.undefined
    
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
    
    inline def apply(): WindowsConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowsConfiguration]
    }
    
    extension [Self <: WindowsConfiguration](x: Self) {
      
      inline def setAdditionalCertificateFile(value: String): Self = StObject.set(x, "additionalCertificateFile", value.asInstanceOf[js.Any])
      
      inline def setAdditionalCertificateFileNull: Self = StObject.set(x, "additionalCertificateFile", null)
      
      inline def setAdditionalCertificateFileUndefined: Self = StObject.set(x, "additionalCertificateFile", js.undefined)
      
      inline def setCertificateFile(value: String): Self = StObject.set(x, "certificateFile", value.asInstanceOf[js.Any])
      
      inline def setCertificateFileNull: Self = StObject.set(x, "certificateFile", null)
      
      inline def setCertificateFileUndefined: Self = StObject.set(x, "certificateFile", js.undefined)
      
      inline def setCertificatePassword(value: String): Self = StObject.set(x, "certificatePassword", value.asInstanceOf[js.Any])
      
      inline def setCertificatePasswordNull: Self = StObject.set(x, "certificatePassword", null)
      
      inline def setCertificatePasswordUndefined: Self = StObject.set(x, "certificatePassword", js.undefined)
      
      inline def setCertificateSha1(value: String): Self = StObject.set(x, "certificateSha1", value.asInstanceOf[js.Any])
      
      inline def setCertificateSha1Null: Self = StObject.set(x, "certificateSha1", null)
      
      inline def setCertificateSha1Undefined: Self = StObject.set(x, "certificateSha1", js.undefined)
      
      inline def setCertificateSubjectName(value: String): Self = StObject.set(x, "certificateSubjectName", value.asInstanceOf[js.Any])
      
      inline def setCertificateSubjectNameNull: Self = StObject.set(x, "certificateSubjectName", null)
      
      inline def setCertificateSubjectNameUndefined: Self = StObject.set(x, "certificateSubjectName", js.undefined)
      
      inline def setLegalTrademarks(value: String): Self = StObject.set(x, "legalTrademarks", value.asInstanceOf[js.Any])
      
      inline def setLegalTrademarksNull: Self = StObject.set(x, "legalTrademarks", null)
      
      inline def setLegalTrademarksUndefined: Self = StObject.set(x, "legalTrademarks", js.undefined)
      
      inline def setPublisherName(value: String | js.Array[String]): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
      
      inline def setPublisherNameNull: Self = StObject.set(x, "publisherName", null)
      
      inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
      
      inline def setPublisherNameVarargs(value: String*): Self = StObject.set(x, "publisherName", js.Array(value*))
      
      inline def setRequestedExecutionLevel(value: RequestedExecutionLevel): Self = StObject.set(x, "requestedExecutionLevel", value.asInstanceOf[js.Any])
      
      inline def setRequestedExecutionLevelNull: Self = StObject.set(x, "requestedExecutionLevel", null)
      
      inline def setRequestedExecutionLevelUndefined: Self = StObject.set(x, "requestedExecutionLevel", js.undefined)
      
      inline def setRfc3161TimeStampServer(value: String): Self = StObject.set(x, "rfc3161TimeStampServer", value.asInstanceOf[js.Any])
      
      inline def setRfc3161TimeStampServerNull: Self = StObject.set(x, "rfc3161TimeStampServer", null)
      
      inline def setRfc3161TimeStampServerUndefined: Self = StObject.set(x, "rfc3161TimeStampServer", js.undefined)
      
      inline def setSign(value: CustomWindowsSign | String): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
      
      inline def setSignAndEditExecutable(value: Boolean): Self = StObject.set(x, "signAndEditExecutable", value.asInstanceOf[js.Any])
      
      inline def setSignAndEditExecutableUndefined: Self = StObject.set(x, "signAndEditExecutable", js.undefined)
      
      inline def setSignDlls(value: Boolean): Self = StObject.set(x, "signDlls", value.asInstanceOf[js.Any])
      
      inline def setSignDllsUndefined: Self = StObject.set(x, "signDlls", js.undefined)
      
      inline def setSignFunction2(
        value: (/* configuration */ CustomWindowsSignTaskConfiguration, /* packager */ js.UndefOr[WinPackager]) => js.Promise[Any]
      ): Self = StObject.set(x, "sign", js.Any.fromFunction2(value))
      
      inline def setSignNull: Self = StObject.set(x, "sign", null)
      
      inline def setSignUndefined: Self = StObject.set(x, "sign", js.undefined)
      
      inline def setSigningHashAlgorithms(value: js.Array[sha1 | sha256_]): Self = StObject.set(x, "signingHashAlgorithms", value.asInstanceOf[js.Any])
      
      inline def setSigningHashAlgorithmsNull: Self = StObject.set(x, "signingHashAlgorithms", null)
      
      inline def setSigningHashAlgorithmsUndefined: Self = StObject.set(x, "signingHashAlgorithms", js.undefined)
      
      inline def setSigningHashAlgorithmsVarargs(value: (sha1 | sha256_)*): Self = StObject.set(x, "signingHashAlgorithms", js.Array(value*))
      
      inline def setTarget(value: TargetConfigType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetVarargs(value: (String | TargetConfiguration)*): Self = StObject.set(x, "target", js.Array(value*))
      
      inline def setTimeStampServer(value: String): Self = StObject.set(x, "timeStampServer", value.asInstanceOf[js.Any])
      
      inline def setTimeStampServerNull: Self = StObject.set(x, "timeStampServer", null)
      
      inline def setTimeStampServerUndefined: Self = StObject.set(x, "timeStampServer", js.undefined)
      
      inline def setVerifyUpdateCodeSignature(value: Boolean): Self = StObject.set(x, "verifyUpdateCodeSignature", value.asInstanceOf[js.Any])
      
      inline def setVerifyUpdateCodeSignatureUndefined: Self = StObject.set(x, "verifyUpdateCodeSignature", js.undefined)
    }
  }
}
