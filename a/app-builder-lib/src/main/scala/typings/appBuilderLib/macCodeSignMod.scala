package typings.appBuilderLib

import typings.builderUtil.mod.TmpDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macCodeSignMod {
  
  @JSImport("app-builder-lib/out/codeSign/macCodeSign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/codeSign/macCodeSign", "Identity")
  @js.native
  class Identity protected () extends StObject {
    def this(name: String, hash: String) = this()
    
    val hash: String = js.native
    
    val name: String = js.native
  }
  
  @JSImport("app-builder-lib/out/codeSign/macCodeSign", "appleCertificatePrefixes")
  @js.native
  val appleCertificatePrefixes: js.Array[String] = js.native
  
  @scala.inline
  def createKeychain(hasTmpDirCscLinkCscKeyPasswordCscILinkCscIKeyPasswordCurrentDir: CreateKeychainOptions): js.Promise[CodeSigningInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("createKeychain")(hasTmpDirCscLinkCscKeyPasswordCscILinkCscIKeyPasswordCurrentDir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CodeSigningInfo]]
  
  @scala.inline
  def findIdentity(certType: CertType): js.Promise[Identity | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIdentity")(certType.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Identity | Null]]
  @scala.inline
  def findIdentity(certType: CertType, qualifier: String): js.Promise[Identity | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIdentity")(certType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Identity | Null]]
  @scala.inline
  def findIdentity(certType: CertType, qualifier: String, keychain: String): js.Promise[Identity | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIdentity")(certType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Identity | Null]]
  @scala.inline
  def findIdentity(certType: CertType, qualifier: Null, keychain: String): js.Promise[Identity | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIdentity")(certType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Identity | Null]]
  @scala.inline
  def findIdentity(certType: CertType, qualifier: Unit, keychain: String): js.Promise[Identity | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIdentity")(certType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Identity | Null]]
  
  @JSImport("app-builder-lib/out/codeSign/macCodeSign", "findIdentityRawResult")
  @js.native
  def findIdentityRawResult: js.Promise[js.Array[String]] | Null = js.native
  @scala.inline
  def findIdentityRawResult_=(x: js.Promise[js.Array[String]] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findIdentityRawResult")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def isSignAllowed(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignAllowed")().asInstanceOf[Boolean]
  @scala.inline
  def isSignAllowed(isPrintWarn: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignAllowed")(isPrintWarn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def removeKeychain(keychainFile: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeKeychain")(keychainFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def removeKeychain(keychainFile: String, printWarn: Boolean): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeKeychain")(keychainFile.asInstanceOf[js.Any], printWarn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def reportError(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: String,
    keychainFile: String,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def reportError(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: String,
    keychainFile: Null,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def reportError(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: String,
    keychainFile: Unit,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def reportError(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: Null,
    keychainFile: String,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def reportError(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: Null,
    keychainFile: Null,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def reportError(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: Null,
    keychainFile: Unit,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def reportError(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: Unit,
    keychainFile: String,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def reportError(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: Unit,
    keychainFile: Null,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def reportError(
    isMas: Boolean,
    certificateType: CertType,
    qualifier: Unit,
    keychainFile: Unit,
    isForceCodeSigning: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reportError")(isMas.asInstanceOf[js.Any], certificateType.asInstanceOf[js.Any], qualifier.asInstanceOf[js.Any], keychainFile.asInstanceOf[js.Any], isForceCodeSigning.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def sign(path: String, name: String, keychain: String): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(path.asInstanceOf[js.Any], name.asInstanceOf[js.Any], keychain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.appBuilderLib.appBuilderLibStrings.`Developer ID Application`
    - typings.appBuilderLib.appBuilderLibStrings.`Developer ID Installer`
    - typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Application`
    - typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Installer`
    - typings.appBuilderLib.appBuilderLibStrings.`Mac Developer`
  */
  trait CertType extends StObject
  object CertType {
    
    @scala.inline
    def `3rd Party Mac Developer Application`: typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Application` = ("3rd Party Mac Developer Application").asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Application`]
    
    @scala.inline
    def `3rd Party Mac Developer Installer`: typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Installer` = ("3rd Party Mac Developer Installer").asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`3rd Party Mac Developer Installer`]
    
    @scala.inline
    def `Developer ID Application`: typings.appBuilderLib.appBuilderLibStrings.`Developer ID Application` = ("Developer ID Application").asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`Developer ID Application`]
    
    @scala.inline
    def `Developer ID Installer`: typings.appBuilderLib.appBuilderLibStrings.`Developer ID Installer` = ("Developer ID Installer").asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`Developer ID Installer`]
    
    @scala.inline
    def `Mac Developer`: typings.appBuilderLib.appBuilderLibStrings.`Mac Developer` = ("Mac Developer").asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.`Mac Developer`]
  }
  
  trait CodeSigningInfo extends StObject {
    
    var keychainFile: js.UndefOr[String | Null] = js.undefined
  }
  object CodeSigningInfo {
    
    @scala.inline
    def apply(): CodeSigningInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeSigningInfo]
    }
    
    @scala.inline
    implicit class CodeSigningInfoMutableBuilder[Self <: CodeSigningInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeychainFile(value: String): Self = StObject.set(x, "keychainFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeychainFileNull: Self = StObject.set(x, "keychainFile", null)
      
      @scala.inline
      def setKeychainFileUndefined: Self = StObject.set(x, "keychainFile", js.undefined)
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
    
    @scala.inline
    def apply(cscKeyPassword: String, cscLink: String, currentDir: String, tmpDir: TmpDir): CreateKeychainOptions = {
      val __obj = js.Dynamic.literal(cscKeyPassword = cscKeyPassword.asInstanceOf[js.Any], cscLink = cscLink.asInstanceOf[js.Any], currentDir = currentDir.asInstanceOf[js.Any], tmpDir = tmpDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateKeychainOptions]
    }
    
    @scala.inline
    implicit class CreateKeychainOptionsMutableBuilder[Self <: CreateKeychainOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCscIKeyPassword(value: String): Self = StObject.set(x, "cscIKeyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCscIKeyPasswordNull: Self = StObject.set(x, "cscIKeyPassword", null)
      
      @scala.inline
      def setCscIKeyPasswordUndefined: Self = StObject.set(x, "cscIKeyPassword", js.undefined)
      
      @scala.inline
      def setCscILink(value: String): Self = StObject.set(x, "cscILink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCscILinkNull: Self = StObject.set(x, "cscILink", null)
      
      @scala.inline
      def setCscILinkUndefined: Self = StObject.set(x, "cscILink", js.undefined)
      
      @scala.inline
      def setCscKeyPassword(value: String): Self = StObject.set(x, "cscKeyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCscLink(value: String): Self = StObject.set(x, "cscLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentDir(value: String): Self = StObject.set(x, "currentDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmpDir(value: TmpDir): Self = StObject.set(x, "tmpDir", value.asInstanceOf[js.Any])
    }
  }
}
