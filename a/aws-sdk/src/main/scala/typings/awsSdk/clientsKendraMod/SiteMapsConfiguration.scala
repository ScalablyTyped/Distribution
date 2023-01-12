package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SiteMapsConfiguration extends StObject {
  
  /**
    * The list of sitemap URLs of the websites you want to crawl. The list can include a maximum of three sitemap URLs.
    */
  var SiteMaps: SiteMapsList
}
object SiteMapsConfiguration {
  
  inline def apply(SiteMaps: SiteMapsList): SiteMapsConfiguration = {
    val __obj = js.Dynamic.literal(SiteMaps = SiteMaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteMapsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SiteMapsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSiteMaps(value: SiteMapsList): Self = StObject.set(x, "SiteMaps", value.asInstanceOf[js.Any])
    
    inline def setSiteMapsVarargs(value: SiteMap*): Self = StObject.set(x, "SiteMaps", js.Array(value*))
  }
}
