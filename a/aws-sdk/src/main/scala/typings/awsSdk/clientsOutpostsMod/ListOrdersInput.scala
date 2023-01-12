package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrdersInput extends StObject {
  
  var MaxResults: js.UndefOr[MaxResults1000] = js.undefined
  
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the Outpost. 
    */
  var OutpostIdentifierFilter: js.UndefOr[OutpostIdentifier] = js.undefined
}
object ListOrdersInput {
  
  inline def apply(): ListOrdersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrdersInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOrdersInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOutpostIdentifierFilter(value: OutpostIdentifier): Self = StObject.set(x, "OutpostIdentifierFilter", value.asInstanceOf[js.Any])
    
    inline def setOutpostIdentifierFilterUndefined: Self = StObject.set(x, "OutpostIdentifierFilter", js.undefined)
  }
}
