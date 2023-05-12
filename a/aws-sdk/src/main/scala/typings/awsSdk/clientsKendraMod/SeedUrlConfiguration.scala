package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeedUrlConfiguration extends StObject {
  
  /**
    * The list of seed or starting point URLs of the websites you want to crawl. The list can include a maximum of 100 seed URLs.
    */
  var SeedUrls: SeedUrlList
  
  /**
    * You can choose one of the following modes:    HOST_ONLY – crawl only the website host names. For example, if the seed URL is "abc.example.com", then only URLs with host name "abc.example.com" are crawled.    SUBDOMAINS – crawl the website host names with subdomains. For example, if the seed URL is "abc.example.com", then "a.abc.example.com" and "b.abc.example.com" are also crawled.    EVERYTHING – crawl the website host names with subdomains and other domains that the web pages link to.   The default mode is set to HOST_ONLY.
    */
  var WebCrawlerMode: js.UndefOr[typings.awsSdk.clientsKendraMod.WebCrawlerMode] = js.undefined
}
object SeedUrlConfiguration {
  
  inline def apply(SeedUrls: SeedUrlList): SeedUrlConfiguration = {
    val __obj = js.Dynamic.literal(SeedUrls = SeedUrls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeedUrlConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeedUrlConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSeedUrls(value: SeedUrlList): Self = StObject.set(x, "SeedUrls", value.asInstanceOf[js.Any])
    
    inline def setSeedUrlsVarargs(value: SeedUrl*): Self = StObject.set(x, "SeedUrls", js.Array(value*))
    
    inline def setWebCrawlerMode(value: WebCrawlerMode): Self = StObject.set(x, "WebCrawlerMode", value.asInstanceOf[js.Any])
    
    inline def setWebCrawlerModeUndefined: Self = StObject.set(x, "WebCrawlerMode", js.undefined)
  }
}
