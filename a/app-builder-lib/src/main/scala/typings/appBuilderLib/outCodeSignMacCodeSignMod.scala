package typings.appBuilderLib

import typings.builderUtil.mod.TmpDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outCodeSignMacCodeSignMod {
  
  @JSImport("app-builder-lib/out/codeSign/macCodeSign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/codeSign/macCodeSign", "Identity")
  @js.native
  open class Identity protected () extends StObject {
    def this(name: String, hash: String) = this()
    
    val hash: String = js.native
    
    val name: String = js.native
  }
  
  @JSImport("app-builder-lib/out/codeSign/macCodeSign", "appleCertificatePrefixes")
  @js.native
  val appleCertificatePrefixes: js.Array[String] = js.native
  
  inline def createKeychain(param0: CreateKeychainOptions): js.Promise[CodeSigningInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeychain")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CodeSigningInfo]]
  
  inline def findIdentity(certType: CertType): js.Promise[Identity | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIdentity")(certType.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Identity | Null]]
  inline def findIdentity(certType: CertType, qualifier: String): js.Promise[Identity | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIdentity")(certType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Identity | Null]]
  inline def findIdentity(certType: CertType, qualifier: String, keychain: String): js.Promise[Identity | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIdentity")(certType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Identity | Null]]
  inline def findIdentity(certType: CertType, qualifier: Null, keychain: String): js.Promise[Identity | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIdentity")(certType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Identity | Null]]
  inline def findIdentity(certType: CertType, qualifier: Unit, keychain: String): js.Promise[Identity | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIdentity")(certType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Identity | Null]]
  
  @JSImport("app-builder-lib/out/codeSign/macCodeSign", "findIdentityRawResult")
  @js.native
  def findIdentityRawResult: js.Promise[js.Array[String]] | Null = js.native
  inline def findIdentityRawResult_=(x: js.Promise[js.Array[String]] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findIdentityRawResult")(x.asInstanceOf[js.Any])
  
  inline def isSignAllowed(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignAllowed")().asInstanceOf[Boolean]
  inline def isSignAllowed(isPrintWarn: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignAllowed")(isPrintWarn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeKeychain(keychainFile: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeKeychain")(keychainFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def removeKeychain(keychainFile: String, printWarn: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeKeychain")(keychainFile.asInstanceOf[js.Any], printWarn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def reportError(
    isMas: Boolean,
    certificateTypes: js.Array[CertType],
    qualifier: String,
    keychainFile: String,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateTypes.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reportError(
    isMas: Boolean,
    certificateTypes: js.Array[CertType],
    qualifier: String,
    keychainFile: Null,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateTypes.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reportError(
    isMas: Boolean,
    certificateTypes: js.Array[CertType],
    qualifier: String,
    keychainFile: Unit,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateTypes.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reportError(
    isMas: Boolean,
    certificateTypes: js.Array[CertType],
    qualifier: Null,
    keychainFile: String,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateTypes.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reportError(
    isMas: Boolean,
    certificateTypes: js.Array[CertType],
    qualifier: Null,
    keychainFile: Null,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateTypes.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reportError(
    isMas: Boolean,
    certificateTypes: js.Array[CertType],
    qualifier: Null,
    keychainFile: Unit,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateTypes.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reportError(
    isMas: Boolean,
    certificateTypes: js.Array[CertType],
    qualifier: Unit,
    keychainFile: String,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateTypes.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reportError(
    isMas: Boolean,
    certificateTypes: js.Array[CertType],
    qualifier: Unit,
    keychainFile: Null,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateTypes.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def reportError(
    isMas: Boolean,
    certificateTypes: js.Array[CertType],
    qualifier: Unit,
    keychainFile: Unit,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateTypes.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def sign(path: String, name: String, keychain: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(path.asInstanceOf[js.Any], name.asInstanceOf[js.Any], keychain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.appBuilderLib.appBuilderLibStrings.`Developer ID Application`
    - typings.appBuilderLib.appBuilderLibStrings.`Developer ID Installer`
    - typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Application`
    - typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Installer`
    - typings.appBuilderLib.appBuilderLibStrings.`Mac Developer`
    - typings.appBuilderLib.appBuilderLibStrings.`Apple Development`
    - typings.appBuilderLib.appBuilderLibStrings.`Apple Distribution`
  */
  trait CertType extends StObject
  object CertType {
    
    inline def `3rd Party Mac Developer Application`: typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Application` = ("3rd Party Mac Developer Application").asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Application`]
    
    inline def `3rd Party Mac Developer Installer`: typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Installer` = ("3rd Party Mac Developer Installer").asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Installer`]
    
    inline def `Apple Development`: typings.appBuilderLib.appBuilderLibStrings.`Apple Development` = ("Apple Development").asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`Apple Development`]
    
    inline def `Apple Distribution`: typings.appBuilderLib.appBuilderLibStrings.`Apple Distribution` = ("Apple Distribution").asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`Apple Distribution`]
    
    inline def `Developer ID Application`: typings.appBuilderLib.appBuilderLibStrings.`Developer ID Application` = ("Developer ID Application").asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`Developer ID Application`]
    
    inline def `Developer ID Installer`: typings.appBuilderLib.appBuilderLibStrings.`Developer ID Installer` = ("Developer ID Installer").asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`Developer ID Installer`]
    
    inline def `Mac Developer`: typings.appBuilderLib.appBuilderLibStrings.`Mac Developer` = ("Mac Developer").asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`Mac Developer`]
  }
  
  trait CodeSigningInfo extends StObject {
    
    var keychainFile: js.UndefOr[String | Null] = js.undefined
  }
  object CodeSigningInfo {
    
    inline def apply(): CodeSigningInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeSigningInfo]
    }
    
    extension [Self <: CodeSigningInfo](x: Self) {
      
      inline def setKeychainFile(value: String): Self = StObject.set(x, "keychainFile", value.asInstanceOf[js.Any])
      
      inline def setKeychainFileNull: Self = StObject.set(x, "keychainFile", null)
      
      inline def setKeychainFileUndefined: Self = StObject.set(x, "keychainFile", js.undefined)
    }
  }
  
  trait CreateKeychainOptions extends StObject {
    
    var cscIKeyPassword: js.UndefOr[String | Null] = js.undefined
    
    var cscILink: js.UndefOr[String | Null] = js.undefined
    
    var cscKeyPassword: String
    
    var cscLink: String
    
    var currentDir: String
    
    var tmpDir: TmpDir
  }
  object CreateKeychainOptions {
    
    inline def apply(cscKeyPassword: String, cscLink: String, currentDir: String, tmpDir: TmpDir): CreateKeychainOptions = {
      val __obj = js.Dynamic.literal(cscKeyPassword = cscKeyPassword.asInstanceOf[js.Any], cscLink = cscLink.asInstanceOf[js.Any], currentDir = currentDir.asInstanceOf[js.Any], tmpDir = tmpDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateKeychainOptions]
    }
    
    extension [Self <: CreateKeychainOptions](x: Self) {
      
      inline def setCscIKeyPassword(value: String): Self = StObject.set(x, "cscIKeyPassword", value.asInstanceOf[js.Any])
      
      inline def setCscIKeyPasswordNull: Self = StObject.set(x, "cscIKeyPassword", null)
      
      inline def setCscIKeyPasswordUndefined: Self = StObject.set(x, "cscIKeyPassword", js.undefined)
      
      inline def setCscILink(value: String): Self = StObject.set(x, "cscILink", value.asInstanceOf[js.Any])
      
      inline def setCscILinkNull: Self = StObject.set(x, "cscILink", null)
      
      inline def setCscILinkUndefined: Self = StObject.set(x, "cscILink", js.undefined)
      
      inline def setCscKeyPassword(value: String): Self = StObject.set(x, "cscKeyPassword", value.asInstanceOf[js.Any])
      
      inline def setCscLink(value: String): Self = StObject.set(x, "cscLink", value.asInstanceOf[js.Any])
      
      inline def setCurrentDir(value: String): Self = StObject.set(x, "currentDir", value.asInstanceOf[js.Any])
      
      inline def setTmpDir(value: TmpDir): Self = StObject.set(x, "tmpDir", value.asInstanceOf[js.Any])
    }
  }
}
