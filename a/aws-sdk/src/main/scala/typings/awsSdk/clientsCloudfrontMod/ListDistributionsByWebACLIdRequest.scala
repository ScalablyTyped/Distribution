package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByWebACLIdRequest extends StObject {
  
  /**
    * Use Marker and MaxItems to control pagination of results. If you have more than MaxItems distributions that satisfy the request, the response includes a NextMarker element. To get the next page of results, submit another request. For the value of Marker, specify the value of NextMarker from the last response. (For the first request, omit Marker.) 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of distributions that you want CloudFront to return in the response body. The maximum and default values are both 100.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the WAF web ACL that you want to list the associated distributions. If you specify "null" for the ID, the request returns a list of the distributions that aren't associated with a web ACL.
    */
  var WebACLId: String
}
object ListDistributionsByWebACLIdRequest {
  
  inline def apply(WebACLId: String): ListDistributionsByWebACLIdRequest = {
    val __obj = js.Dynamic.literal(WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionsByWebACLIdRequest]
  }
  
  extension [Self <: ListDistributionsByWebACLIdRequest](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setWebACLId(value: String): Self = StObject.set(x, "WebACLId", value.asInstanceOf[js.Any])
  }
}
