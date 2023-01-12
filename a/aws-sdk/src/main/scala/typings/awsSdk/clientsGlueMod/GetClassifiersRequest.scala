package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClassifiersRequest extends StObject {
  
  /**
    * The size of the list to return (optional).
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * An optional continuation token.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object GetClassifiersRequest {
  
  inline def apply(): GetClassifiersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClassifiersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClassifiersRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
