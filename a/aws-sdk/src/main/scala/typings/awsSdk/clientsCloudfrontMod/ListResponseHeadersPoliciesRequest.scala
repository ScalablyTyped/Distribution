package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResponseHeadersPoliciesRequest extends StObject {
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of response headers policies. The response includes response headers policies in the list that occur after the marker. To get the next page of the list, set this field's value to the value of NextMarker from the current page's response.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of response headers policies that you want to get in the response.
    */
  var MaxItems: js.UndefOr[String] = js.undefined
  
  /**
    * A filter to get only the specified kind of response headers policies. Valid values are:    managed – Gets only the managed policies created by Amazon Web Services.    custom – Gets only the custom policies created in your Amazon Web Services account.  
    */
  var Type: js.UndefOr[ResponseHeadersPolicyType] = js.undefined
}
object ListResponseHeadersPoliciesRequest {
  
  inline def apply(): ListResponseHeadersPoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResponseHeadersPoliciesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResponseHeadersPoliciesRequest] (val x: Self) extends AnyVal {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setType(value: ResponseHeadersPolicyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
