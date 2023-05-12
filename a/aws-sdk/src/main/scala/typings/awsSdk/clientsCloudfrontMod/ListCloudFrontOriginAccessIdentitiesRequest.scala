package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCloudFrontOriginAccessIdentitiesRequest extends StObject {
  
  /**
    * Use this when paginating results to indicate where to begin in your list of origin access identities. The results include identities in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last identity on that page).
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of origin access identities you want in the response body.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
}
object ListCloudFrontOriginAccessIdentitiesRequest {
  
  inline def apply(): ListCloudFrontOriginAccessIdentitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCloudFrontOriginAccessIdentitiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCloudFrontOriginAccessIdentitiesRequest] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
