package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfileObjectTypeTemplatesRequest extends StObject {
  
  /**
    * The maximum number of objects returned per page.
    */
  var MaxResults: js.UndefOr[maxSize100] = js.undefined
  
  /**
    * The pagination token from the previous ListObjectTypeTemplates API call.
    */
  var NextToken: js.UndefOr[token] = js.undefined
}
object ListProfileObjectTypeTemplatesRequest {
  
  inline def apply(): ListProfileObjectTypeTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProfileObjectTypeTemplatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProfileObjectTypeTemplatesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: maxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
