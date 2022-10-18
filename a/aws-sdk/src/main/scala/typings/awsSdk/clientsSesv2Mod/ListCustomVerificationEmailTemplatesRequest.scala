package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomVerificationEmailTemplatesRequest extends StObject {
  
  /**
    * A token returned from a previous call to ListCustomVerificationEmailTemplates to indicate the position in the list of custom verification email templates.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSesv2Mod.NextToken] = js.undefined
  
  /**
    * The number of results to show in a single call to ListCustomVerificationEmailTemplates. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results. The value you specify has to be at least 1, and can be no more than 50.
    */
  var PageSize: js.UndefOr[MaxItems] = js.undefined
}
object ListCustomVerificationEmailTemplatesRequest {
  
  inline def apply(): ListCustomVerificationEmailTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomVerificationEmailTemplatesRequest]
  }
  
  extension [Self <: ListCustomVerificationEmailTemplatesRequest](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageSize(value: MaxItems): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
