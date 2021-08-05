package typings.appBuilderLib

import org.scalablytyped.runtime.StringDictionary
import typings.builderUtilRuntime.publishOptionsMod.PublishProvider
import typings.builderUtilRuntime.updateInfoMod.PackageFileInfo
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait File extends StObject {
    
    var file: String
    
    var lang: String
    
    var langName: js.Any
    
    var langWithRegion: String
  }
  object File {
    
    inline def apply(file: String, lang: String, langName: js.Any, langWithRegion: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], langName = langName.asInstanceOf[js.Any], langWithRegion = langWithRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangName(value: js.Any): Self = StObject.set(x, "langName", value.asInstanceOf[js.Any])
      
      inline def setLangWithRegion(value: String): Self = StObject.set(x, "langWithRegion", value.asInstanceOf[js.Any])
    }
  }
  
  trait Packages extends StObject {
    
    var packages: StringDictionary[PackageFileInfo]
  }
  object Packages {
    
    inline def apply(packages: StringDictionary[PackageFileInfo]): Packages = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packages]
    }
    
    extension [Self <: Packages](x: Self) {
      
      inline def setPackages(value: StringDictionary[PackageFileInfo]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    }
  }
  
  trait Provider extends StObject {
    
    var provider: PublishProvider
    
    var publishAutoUpdate: js.UndefOr[Boolean] = js.undefined
    
    var publisherName: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    var requestHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    
    var updaterCacheDirName: String
  }
  object Provider {
    
    inline def apply(provider: PublishProvider, updaterCacheDirName: String): Provider = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], updaterCacheDirName = updaterCacheDirName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    extension [Self <: Provider](x: Self) {
      
      inline def setProvider(value: PublishProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setPublishAutoUpdate(value: Boolean): Self = StObject.set(x, "publishAutoUpdate", value.asInstanceOf[js.Any])
      
      inline def setPublishAutoUpdateUndefined: Self = StObject.set(x, "publishAutoUpdate", js.undefined)
      
      inline def setPublisherName(value: js.Array[String]): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
      
      inline def setPublisherNameNull: Self = StObject.set(x, "publisherName", null)
      
      inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
      
      inline def setPublisherNameVarargs(value: String*): Self = StObject.set(x, "publisherName", js.Array(value :_*))
      
      inline def setRequestHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      inline def setUpdaterCacheDirName(value: String): Self = StObject.set(x, "updaterCacheDirName", value.asInstanceOf[js.Any])
    }
  }
}
