package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkSiteResponse extends StObject {
  
  /**
    * Information about the network site.
    */
  var networkSite: js.UndefOr[NetworkSite] = js.undefined
  
  /**
    *  The network site tags. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object GetNetworkSiteResponse {
  
  inline def apply(): GetNetworkSiteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkSiteResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNetworkSiteResponse] (val x: Self) extends AnyVal {
    
    inline def setNetworkSite(value: NetworkSite): Self = StObject.set(x, "networkSite", value.asInstanceOf[js.Any])
    
    inline def setNetworkSiteUndefined: Self = StObject.set(x, "networkSite", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
