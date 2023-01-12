package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIntegrationsRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * Boolean to indicate if hidden integration should be returned. Defaults to False.
    */
  var IncludeHidden: js.UndefOr[optionalBoolean] = js.undefined
  
  /**
    * The maximum number of objects returned per page.
    */
  var MaxResults: js.UndefOr[maxSize100] = js.undefined
  
  /**
    * The pagination token from the previous ListIntegrations API call.
    */
  var NextToken: js.UndefOr[token] = js.undefined
}
object ListIntegrationsRequest {
  
  inline def apply(DomainName: name): ListIntegrationsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIntegrationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIntegrationsRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setIncludeHidden(value: optionalBoolean): Self = StObject.set(x, "IncludeHidden", value.asInstanceOf[js.Any])
    
    inline def setIncludeHiddenUndefined: Self = StObject.set(x, "IncludeHidden", js.undefined)
    
    inline def setMaxResults(value: maxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
