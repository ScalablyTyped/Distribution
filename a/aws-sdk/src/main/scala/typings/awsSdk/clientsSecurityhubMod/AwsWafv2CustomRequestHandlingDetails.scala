package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2CustomRequestHandlingDetails extends StObject {
  
  /**
    *  The HTTP headers to insert into the request. 
    */
  var InsertHeaders: js.UndefOr[AwsWafv2InsertHeadersList] = js.undefined
}
object AwsWafv2CustomRequestHandlingDetails {
  
  inline def apply(): AwsWafv2CustomRequestHandlingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2CustomRequestHandlingDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2CustomRequestHandlingDetails] (val x: Self) extends AnyVal {
    
    inline def setInsertHeaders(value: AwsWafv2InsertHeadersList): Self = StObject.set(x, "InsertHeaders", value.asInstanceOf[js.Any])
    
    inline def setInsertHeadersUndefined: Self = StObject.set(x, "InsertHeaders", js.undefined)
    
    inline def setInsertHeadersVarargs(value: AwsWafv2CustomHttpHeader*): Self = StObject.set(x, "InsertHeaders", js.Array(value*))
  }
}
