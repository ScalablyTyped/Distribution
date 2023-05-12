package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2CustomResponseDetails extends StObject {
  
  /**
    *  References the response body that you want WAF to return to the web request client. You can define a custom response for a rule action or a default web ACL action that is set to block. 
    */
  var CustomResponseBodyKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The HTTP status code to return to the client. For a list of status codes that you can use in your custom responses, see Supported status codes for custom response in the WAF Developer Guide. 
    */
  var ResponseCode: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The HTTP headers to use in the response. 
    */
  var ResponseHeaders: js.UndefOr[AwsWafv2InsertHeadersList] = js.undefined
}
object AwsWafv2CustomResponseDetails {
  
  inline def apply(): AwsWafv2CustomResponseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2CustomResponseDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2CustomResponseDetails] (val x: Self) extends AnyVal {
    
    inline def setCustomResponseBodyKey(value: NonEmptyString): Self = StObject.set(x, "CustomResponseBodyKey", value.asInstanceOf[js.Any])
    
    inline def setCustomResponseBodyKeyUndefined: Self = StObject.set(x, "CustomResponseBodyKey", js.undefined)
    
    inline def setResponseCode(value: Integer): Self = StObject.set(x, "ResponseCode", value.asInstanceOf[js.Any])
    
    inline def setResponseCodeUndefined: Self = StObject.set(x, "ResponseCode", js.undefined)
    
    inline def setResponseHeaders(value: AwsWafv2InsertHeadersList): Self = StObject.set(x, "ResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersUndefined: Self = StObject.set(x, "ResponseHeaders", js.undefined)
    
    inline def setResponseHeadersVarargs(value: AwsWafv2CustomHttpHeader*): Self = StObject.set(x, "ResponseHeaders", js.Array(value*))
  }
}
