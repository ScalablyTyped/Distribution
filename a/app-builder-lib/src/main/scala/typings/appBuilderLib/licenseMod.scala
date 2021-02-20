package typings.appBuilderLib

import typings.appBuilderLib.anon.File
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object licenseMod {
  
  @JSImport("app-builder-lib/out/util/license", "getLicenseAssets")
  @js.native
  def getLicenseAssets(fileNames: js.Array[String], packager: PlatformPackager[_]): js.Array[File] = js.native
  
  @JSImport("app-builder-lib/out/util/license", "getLicenseFiles")
  @js.native
  def getLicenseFiles(packager: PlatformPackager[_]): js.Promise[js.Array[LicenseFile]] = js.native
  
  @JSImport("app-builder-lib/out/util/license", "getNotLocalizedLicenseFile")
  @js.native
  def getNotLocalizedLicenseFile(custom: js.UndefOr[scala.Nothing], packager: PlatformPackager[_]): js.Promise[String | Null] = js.native
  @JSImport("app-builder-lib/out/util/license", "getNotLocalizedLicenseFile")
  @js.native
  def getNotLocalizedLicenseFile(
    custom: js.UndefOr[scala.Nothing],
    packager: PlatformPackager[_],
    supportedExtension: js.Array[String]
  ): js.Promise[String | Null] = js.native
  @JSImport("app-builder-lib/out/util/license", "getNotLocalizedLicenseFile")
  @js.native
  def getNotLocalizedLicenseFile(custom: String, packager: PlatformPackager[_]): js.Promise[String | Null] = js.native
  @JSImport("app-builder-lib/out/util/license", "getNotLocalizedLicenseFile")
  @js.native
  def getNotLocalizedLicenseFile(custom: String, packager: PlatformPackager[_], supportedExtension: js.Array[String]): js.Promise[String | Null] = js.native
  @JSImport("app-builder-lib/out/util/license", "getNotLocalizedLicenseFile")
  @js.native
  def getNotLocalizedLicenseFile(custom: Null, packager: PlatformPackager[_]): js.Promise[String | Null] = js.native
  @JSImport("app-builder-lib/out/util/license", "getNotLocalizedLicenseFile")
  @js.native
  def getNotLocalizedLicenseFile(custom: Null, packager: PlatformPackager[_], supportedExtension: js.Array[String]): js.Promise[String | Null] = js.native
  
  @js.native
  trait LicenseFile extends StObject {
    
    var file: String = js.native
    
    var lang: String = js.native
    
    var langName: String = js.native
    
    var langWithRegion: String = js.native
  }
  object LicenseFile {
    
    @scala.inline
    def apply(file: String, lang: String, langName: String, langWithRegion: String): LicenseFile = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], langName = langName.asInstanceOf[js.Any], langWithRegion = langWithRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseFile]
    }
    
    @scala.inline
    implicit class LicenseFileMutableBuilder[Self <: LicenseFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangName(value: String): Self = StObject.set(x, "langName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangWithRegion(value: String): Self = StObject.set(x, "langWithRegion", value.asInstanceOf[js.Any])
    }
  }
}
