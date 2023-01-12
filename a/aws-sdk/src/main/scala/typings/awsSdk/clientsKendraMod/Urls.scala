package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Urls extends StObject {
  
  /**
    * Configuration of the seed or starting point URLs of the websites you want to crawl. You can choose to crawl only the website host names, or the website host names with subdomains, or the website host names with subdomains and other domains that the webpages link to. You can list up to 100 seed URLs.
    */
  var SeedUrlConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.SeedUrlConfiguration] = js.undefined
  
  /**
    * Configuration of the sitemap URLs of the websites you want to crawl. Only URLs belonging to the same website host names are crawled. You can list up to three sitemap URLs.
    */
  var SiteMapsConfiguration: js.UndefOr[typings.awsSdk.clientsKendraMod.SiteMapsConfiguration] = js.undefined
}
object Urls {
  
  inline def apply(): Urls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Urls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Urls] (val x: Self) extends AnyVal {
    
    inline def setSeedUrlConfiguration(value: SeedUrlConfiguration): Self = StObject.set(x, "SeedUrlConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSeedUrlConfigurationUndefined: Self = StObject.set(x, "SeedUrlConfiguration", js.undefined)
    
    inline def setSiteMapsConfiguration(value: SiteMapsConfiguration): Self = StObject.set(x, "SiteMapsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSiteMapsConfigurationUndefined: Self = StObject.set(x, "SiteMapsConfiguration", js.undefined)
  }
}
