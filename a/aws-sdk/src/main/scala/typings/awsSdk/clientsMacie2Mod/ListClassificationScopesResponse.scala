package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClassificationScopesResponse extends StObject {
  
  /**
    * An array that specifies the unique identifier and name of the classification scope for the account.
    */
  var classificationScopes: js.UndefOr[listOfClassificationScopeSummary] = js.undefined
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListClassificationScopesResponse {
  
  inline def apply(): ListClassificationScopesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClassificationScopesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListClassificationScopesResponse] (val x: Self) extends AnyVal {
    
    inline def setClassificationScopes(value: listOfClassificationScopeSummary): Self = StObject.set(x, "classificationScopes", value.asInstanceOf[js.Any])
    
    inline def setClassificationScopesUndefined: Self = StObject.set(x, "classificationScopes", js.undefined)
    
    inline def setClassificationScopesVarargs(value: ClassificationScopeSummary*): Self = StObject.set(x, "classificationScopes", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
