package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAttachedLinksInput extends StObject {
  
  /**
    * Limits the number of returned links to the specified number.
    */
  var MaxResults: js.UndefOr[ListAttachedLinksMaxResults] = js.undefined
  
  /**
    * The token for the next set of items to return. You received this token from a previous call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOamMod.NextToken] = js.undefined
  
  /**
    * The ARN of the sink that you want to retrieve links for.
    */
  var SinkIdentifier: ResourceIdentifier
}
object ListAttachedLinksInput {
  
  inline def apply(SinkIdentifier: ResourceIdentifier): ListAttachedLinksInput = {
    val __obj = js.Dynamic.literal(SinkIdentifier = SinkIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttachedLinksInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAttachedLinksInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListAttachedLinksMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSinkIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "SinkIdentifier", value.asInstanceOf[js.Any])
  }
}
