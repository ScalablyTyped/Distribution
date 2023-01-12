package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkSiteResponse extends StObject {
  
  /**
    * Information about the network site.
    */
  var networkSite: js.UndefOr[NetworkSite] = js.undefined
  
  /**
    *  The network site tags. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateNetworkSiteResponse {
  
  inline def apply(): CreateNetworkSiteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkSiteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNetworkSiteResponse] (val x: Self) extends AnyVal {
    
    inline def setNetworkSite(value: NetworkSite): Self = StObject.set(x, "networkSite", value.asInstanceOf[js.Any])
    
    inline def setNetworkSiteUndefined: Self = StObject.set(x, "networkSite", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
