package typings.appBuilderLib

import typings.appBuilderLib.vmMod.VmManager
import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
import typings.appBuilderLib.winPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowsCodeSignMod {
  
  @JSImport("app-builder-lib/out/codeSign/windowsCodeSign", "doSign")
  @js.native
  def doSign(configuration: CustomWindowsSignTaskConfiguration, packager: WinPackager): js.Promise[Unit] = js.native
  
  @JSImport("app-builder-lib/out/codeSign/windowsCodeSign", "getCertInfo")
  @js.native
  def getCertInfo(file: String, password: String): js.Promise[CertificateInfo] = js.native
  
  @JSImport("app-builder-lib/out/codeSign/windowsCodeSign", "getCertificateFromStoreInfo")
  @js.native
  def getCertificateFromStoreInfo(options: WindowsConfiguration, vm: VmManager): js.Promise[CertificateFromStoreInfo] = js.native
  
  @JSImport("app-builder-lib/out/codeSign/windowsCodeSign", "getSignVendorPath")
  @js.native
  def getSignVendorPath(): js.Promise[String] = js.native
  
  @JSImport("app-builder-lib/out/codeSign/windowsCodeSign", "sign")
  @js.native
  def sign(options: WindowsSignOptions, packager: WinPackager): js.Promise[Unit] = js.native
  
  @js.native
  trait CertificateFromStoreInfo extends StObject {
    
    var isLocalMachineStore: Boolean = js.native
    
    var store: String = js.native
    
    var subject: String = js.native
    
    var thumbprint: String = js.native
  }
  object CertificateFromStoreInfo {
    
    @scala.inline
    def apply(isLocalMachineStore: Boolean, store: String, subject: String, thumbprint: String): CertificateFromStoreInfo = {
      val __obj = js.Dynamic.literal(isLocalMachineStore = isLocalMachineStore.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], thumbprint = thumbprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateFromStoreInfo]
    }
    
    @scala.inline
    implicit class CertificateFromStoreInfoMutableBuilder[Self <: CertificateFromStoreInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsLocalMachineStore(value: Boolean): Self = StObject.set(x, "isLocalMachineStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStore(value: String): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CertificateInfo extends StObject {
    
    val bloodyMicrosoftSubjectDn: String = js.native
    
    val commonName: String = js.native
  }
  object CertificateInfo {
    
    @scala.inline
    def apply(bloodyMicrosoftSubjectDn: String, commonName: String): CertificateInfo = {
      val __obj = js.Dynamic.literal(bloodyMicrosoftSubjectDn = bloodyMicrosoftSubjectDn.asInstanceOf[js.Any], commonName = commonName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateInfo]
    }
    
    @scala.inline
    implicit class CertificateInfoMutableBuilder[Self <: CertificateInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBloodyMicrosoftSubjectDn(value: String): Self = StObject.set(x, "bloodyMicrosoftSubjectDn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomWindowsSign = js.Function2[
    /* configuration */ CustomWindowsSignTaskConfiguration, 
    /* packager */ js.UndefOr[WinPackager], 
    js.Promise[js.Any]
  ]
  
  @js.native
  trait CustomWindowsSignTaskConfiguration extends WindowsSignTaskConfiguration {
    
    def computeSignToolArgs(isWin: Boolean): js.Array[String] = js.native
  }
  object CustomWindowsSignTaskConfiguration {
    
    @scala.inline
    def apply(
      computeSignToolArgs: Boolean => js.Array[String],
      hash: String,
      isNest: Boolean,
      options: WindowsConfiguration,
      path: String
    ): CustomWindowsSignTaskConfiguration = {
      val __obj = js.Dynamic.literal(computeSignToolArgs = js.Any.fromFunction1(computeSignToolArgs), hash = hash.asInstanceOf[js.Any], isNest = isNest.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomWindowsSignTaskConfiguration]
    }
    
    @scala.inline
    implicit class CustomWindowsSignTaskConfigurationMutableBuilder[Self <: CustomWindowsSignTaskConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputeSignToolArgs(value: Boolean => js.Array[String]): Self = StObject.set(x, "computeSignToolArgs", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FileCodeSigningInfo extends StObject {
    
    val file: String = js.native
    
    val password: String | Null = js.native
  }
  object FileCodeSigningInfo {
    
    @scala.inline
    def apply(file: String): FileCodeSigningInfo = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileCodeSigningInfo]
    }
    
    @scala.inline
    implicit class FileCodeSigningInfoMutableBuilder[Self <: FileCodeSigningInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordNull: Self = StObject.set(x, "password", null)
    }
  }
  
  @js.native
  trait WindowsSignOptions extends StObject {
    
    val cscInfo: js.UndefOr[FileCodeSigningInfo | CertificateFromStoreInfo | Null] = js.native
    
    val name: js.UndefOr[String | Null] = js.native
    
    val options: WindowsConfiguration = js.native
    
    val path: String = js.native
    
    val site: js.UndefOr[String | Null] = js.native
  }
  object WindowsSignOptions {
    
    @scala.inline
    def apply(options: WindowsConfiguration, path: String): WindowsSignOptions = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowsSignOptions]
    }
    
    @scala.inline
    implicit class WindowsSignOptionsMutableBuilder[Self <: WindowsSignOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCscInfo(value: FileCodeSigningInfo | CertificateFromStoreInfo): Self = StObject.set(x, "cscInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCscInfoNull: Self = StObject.set(x, "cscInfo", null)
      
      @scala.inline
      def setCscInfoUndefined: Self = StObject.set(x, "cscInfo", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptions(value: WindowsConfiguration): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSite(value: String): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteNull: Self = StObject.set(x, "site", null)
      
      @scala.inline
      def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    }
  }
  
  @js.native
  trait WindowsSignTaskConfiguration extends WindowsSignOptions {
    
    var hash: String = js.native
    
    var isNest: Boolean = js.native
    
    var resultOutputPath: js.UndefOr[String] = js.native
  }
  object WindowsSignTaskConfiguration {
    
    @scala.inline
    def apply(hash: String, isNest: Boolean, options: WindowsConfiguration, path: String): WindowsSignTaskConfiguration = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], isNest = isNest.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[WindowsSignTaskConfiguration]
    }
    
    @scala.inline
    implicit class WindowsSignTaskConfigurationMutableBuilder[Self <: WindowsSignTaskConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNest(value: Boolean): Self = StObject.set(x, "isNest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultOutputPath(value: String): Self = StObject.set(x, "resultOutputPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultOutputPathUndefined: Self = StObject.set(x, "resultOutputPath", js.undefined)
    }
  }
}
