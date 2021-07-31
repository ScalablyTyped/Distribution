package typings.appBuilderLib

import typings.appBuilderLib.vmMod.VmManager
import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
import typings.appBuilderLib.winPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowsCodeSignMod {
  
  @JSImport("app-builder-lib/out/codeSign/windowsCodeSign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def doSign(configuration: CustomWindowsSignTaskConfiguration, packager: WinPackager): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("doSign")(configuration.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def getCertInfo(file: String, password: String): js.Promise[CertificateInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCertInfo")(file.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CertificateInfo]]
  
  @scala.inline
  def getCertificateFromStoreInfo(options: WindowsConfiguration, vm: VmManager): js.Promise[CertificateFromStoreInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCertificateFromStoreInfo")(options.asInstanceOf[js.Any], vm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CertificateFromStoreInfo]]
  
  @scala.inline
  def getSignVendorPath(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSignVendorPath")().asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def sign(options: WindowsSignOptions, packager: WinPackager): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(options.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait CertificateFromStoreInfo extends StObject {
    
    var isLocalMachineStore: Boolean
    
    var store: String
    
    var subject: String
    
    var thumbprint: String
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
  
  trait CertificateInfo extends StObject {
    
    val bloodyMicrosoftSubjectDn: String
    
    val commonName: String
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
  
  trait CustomWindowsSignTaskConfiguration
    extends StObject
       with WindowsSignTaskConfiguration {
    
    def computeSignToolArgs(isWin: Boolean): js.Array[String]
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
  
  trait FileCodeSigningInfo extends StObject {
    
    val file: String
    
    val password: String | Null
  }
  object FileCodeSigningInfo {
    
    @scala.inline
    def apply(file: String): FileCodeSigningInfo = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], password = null)
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
  
  trait WindowsSignOptions extends StObject {
    
    val cscInfo: js.UndefOr[FileCodeSigningInfo | CertificateFromStoreInfo | Null] = js.undefined
    
    val name: js.UndefOr[String | Null] = js.undefined
    
    val options: WindowsConfiguration
    
    val path: String
    
    val site: js.UndefOr[String | Null] = js.undefined
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
  
  trait WindowsSignTaskConfiguration
    extends StObject
       with WindowsSignOptions {
    
    var hash: String
    
    var isNest: Boolean
    
    var resultOutputPath: js.UndefOr[String] = js.undefined
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
