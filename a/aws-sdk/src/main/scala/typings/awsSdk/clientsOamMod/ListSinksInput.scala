package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSinksInput extends StObject {
  
  /**
    * Limits the number of returned links to the specified number.
    */
  var MaxResults: js.UndefOr[ListSinksMaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. You received this token from a previous call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOamMod.NextToken] = js.undefined
}
object ListSinksInput {
  
  inline def apply(): ListSinksInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSinksInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSinksInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListSinksMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
