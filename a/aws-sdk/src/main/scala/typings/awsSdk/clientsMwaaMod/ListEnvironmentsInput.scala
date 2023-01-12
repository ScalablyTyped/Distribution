package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnvironmentsInput extends StObject {
  
  /**
    * The maximum number of results to retrieve per page. For example, 5 environments per page.
    */
  var MaxResults: js.UndefOr[ListEnvironmentsInputMaxResultsInteger] = js.undefined
  
  /**
    * Retrieves the next page of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsMwaaMod.NextToken] = js.undefined
}
object ListEnvironmentsInput {
  
  inline def apply(): ListEnvironmentsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEnvironmentsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListEnvironmentsInputMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
