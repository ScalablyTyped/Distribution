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
    
    @scala.inline
    def apply(file: String, lang: String, langName: js.Any, langWithRegion: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], langName = langName.asInstanceOf[js.Any], langWithRegion = langWithRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangName(value: js.Any): Self = StObject.set(x, "langName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangWithRegion(value: String): Self = StObject.set(x, "langWithRegion", value.asInstanceOf[js.Any])
    }
  }
  
  trait Packages extends StObject {
    
    var packages: StringDictionary[PackageFileInfo]
  }
  object Packages {
    
    @scala.inline
    def apply(packages: StringDictionary[PackageFileInfo]): Packages = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packages]
    }
    
    @scala.inline
    implicit class PackagesMutableBuilder[Self <: Packages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPackages(value: StringDictionary[PackageFileInfo]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(provider: PublishProvider, updaterCacheDirName: String): Provider = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], updaterCacheDirName = updaterCacheDirName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvider(value: PublishProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishAutoUpdate(value: Boolean): Self = StObject.set(x, "publishAutoUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishAutoUpdateUndefined: Self = StObject.set(x, "publishAutoUpdate", js.undefined)
      
      @scala.inline
      def setPublisherName(value: js.Array[String]): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublisherNameNull: Self = StObject.set(x, "publisherName", null)
      
      @scala.inline
      def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
      
      @scala.inline
      def setPublisherNameVarargs(value: String*): Self = StObject.set(x, "publisherName", js.Array(value :_*))
      
      @scala.inline
      def setRequestHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      @scala.inline
      def setUpdaterCacheDirName(value: String): Self = StObject.set(x, "updaterCacheDirName", value.asInstanceOf[js.Any])
    }
  }
}
