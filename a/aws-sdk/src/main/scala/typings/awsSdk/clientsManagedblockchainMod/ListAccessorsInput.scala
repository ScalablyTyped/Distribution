package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessorsInput extends StObject {
  
  /**
    *  The maximum number of accessors to list.
    */
  var MaxResults: js.UndefOr[AccessorListMaxResults] = js.undefined
  
  /**
    *  The pagination token that indicates the next set of results to retrieve. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAccessorsInput {
  
  inline def apply(): ListAccessorsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessorsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccessorsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: AccessorListMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
