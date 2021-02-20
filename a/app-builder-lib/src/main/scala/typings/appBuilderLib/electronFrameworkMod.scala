package typings.appBuilderLib

import typings.appBuilderLib.configurationMod.Configuration
import typings.appBuilderLib.frameworkMod.Framework
import typings.appBuilderLib.mod.Packager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object electronFrameworkMod {
  
  @JSImport("app-builder-lib/out/electron/ElectronFramework", "createElectronFrameworkSupport")
  @js.native
  def createElectronFrameworkSupport(configuration: Configuration, packager: Packager): js.Promise[Framework] = js.native
  
  @js.native
  trait ElectronDownloadOptions extends StObject {
    
    var arch: js.UndefOr[String] = js.native
    
    /**
      * The [cache location](https://github.com/electron-userland/electron-download#cache-location).
      */
    var cache: js.UndefOr[String | Null] = js.native
    
    /** @private */
    var customDir: js.UndefOr[String | Null] = js.native
    
    /** @private */
    var customFilename: js.UndefOr[String | Null] = js.native
    
    var isVerifyChecksum: js.UndefOr[Boolean] = js.native
    
    /**
      * The mirror.
      */
    var mirror: js.UndefOr[String | Null] = js.native
    
    var platform: js.UndefOr[ElectronPlatformName] = js.native
    
    var strictSSL: js.UndefOr[Boolean] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object ElectronDownloadOptions {
    
    @scala.inline
    def apply(): ElectronDownloadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElectronDownloadOptions]
    }
    
    @scala.inline
    implicit class ElectronDownloadOptionsMutableBuilder[Self <: ElectronDownloadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      @scala.inline
      def setCache(value: String): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheNull: Self = StObject.set(x, "cache", null)
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCustomDir(value: String): Self = StObject.set(x, "customDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDirNull: Self = StObject.set(x, "customDir", null)
      
      @scala.inline
      def setCustomDirUndefined: Self = StObject.set(x, "customDir", js.undefined)
      
      @scala.inline
      def setCustomFilename(value: String): Self = StObject.set(x, "customFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFilenameNull: Self = StObject.set(x, "customFilename", null)
      
      @scala.inline
      def setCustomFilenameUndefined: Self = StObject.set(x, "customFilename", js.undefined)
      
      @scala.inline
      def setIsVerifyChecksum(value: Boolean): Self = StObject.set(x, "isVerifyChecksum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVerifyChecksumUndefined: Self = StObject.set(x, "isVerifyChecksum", js.undefined)
      
      @scala.inline
      def setMirror(value: String): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrorNull: Self = StObject.set(x, "mirror", null)
      
      @scala.inline
      def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
      
      @scala.inline
      def setPlatform(value: ElectronPlatformName): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.appBuilderLib.appBuilderLibStrings.darwin
    - typings.appBuilderLib.appBuilderLibStrings.linux
    - typings.appBuilderLib.appBuilderLibStrings.win32
    - typings.appBuilderLib.appBuilderLibStrings.mas
  */
  trait ElectronPlatformName extends StObject
  object ElectronPlatformName {
    
    @scala.inline
    def darwin: typings.appBuilderLib.appBuilderLibStrings.darwin = "darwin".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.darwin]
    
    @scala.inline
    def linux: typings.appBuilderLib.appBuilderLibStrings.linux = "linux".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.linux]
    
    @scala.inline
    def mas: typings.appBuilderLib.appBuilderLibStrings.mas = "mas".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.mas]
    
    @scala.inline
    def win32: typings.appBuilderLib.appBuilderLibStrings.win32 = "win32".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.win32]
  }
}
