package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobTemplatesRequest extends StObject {
  
  /**
    * The maximum number of results to return in the list.
    */
  var maxResults: js.UndefOr[LaserMaxResults] = js.undefined
  
  /**
    * The token to use to return the next set of results in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListJobTemplatesRequest {
  
  inline def apply(): ListJobTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobTemplatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListJobTemplatesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: LaserMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
