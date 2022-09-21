package typings.appBuilderLib

import typings.appBuilderLib.anon.File
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object licenseMod {
  
  @JSImport("app-builder-lib/out/util/license", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLicenseAssets(fileNames: js.Array[String], packager: PlatformPackager[Any]): js.Array[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLicenseAssets")(fileNames.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[js.Array[File]]
  
  inline def getLicenseFiles(packager: PlatformPackager[Any]): js.Promise[js.Array[LicenseFile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLicenseFiles")(packager.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[LicenseFile]]]
  
  inline def getNotLocalizedLicenseFile(custom: String, packager: PlatformPackager[Any]): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNotLocalizedLicenseFile")(custom.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  inline def getNotLocalizedLicenseFile(custom: String, packager: PlatformPackager[Any], supportedExtension: js.Array[String]): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNotLocalizedLicenseFile")(custom.asInstanceOf[js.Any], packager.asInstanceOf[js.Any], supportedExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  inline def getNotLocalizedLicenseFile(custom: Null, packager: PlatformPackager[Any]): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNotLocalizedLicenseFile")(custom.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  inline def getNotLocalizedLicenseFile(custom: Null, packager: PlatformPackager[Any], supportedExtension: js.Array[String]): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNotLocalizedLicenseFile")(custom.asInstanceOf[js.Any], packager.asInstanceOf[js.Any], supportedExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  inline def getNotLocalizedLicenseFile(custom: Unit, packager: PlatformPackager[Any]): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNotLocalizedLicenseFile")(custom.asInstanceOf[js.Any], packager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  inline def getNotLocalizedLicenseFile(custom: Unit, packager: PlatformPackager[Any], supportedExtension: js.Array[String]): js.Promise[String | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNotLocalizedLicenseFile")(custom.asInstanceOf[js.Any], packager.asInstanceOf[js.Any], supportedExtension.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Null]]
  
  trait LicenseFile extends StObject {
    
    var file: String
    
    var lang: String
    
    var langName: String
    
    var langWithRegion: String
  }
  object LicenseFile {
    
    inline def apply(file: String, lang: String, langName: String, langWithRegion: String): LicenseFile = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], langName = langName.asInstanceOf[js.Any], langWithRegion = langWithRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[LicenseFile]
    }
    
    extension [Self <: LicenseFile](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangName(value: String): Self = StObject.set(x, "langName", value.asInstanceOf[js.Any])
      
      inline def setLangWithRegion(value: String): Self = StObject.set(x, "langWithRegion", value.asInstanceOf[js.Any])
    }
  }
}
