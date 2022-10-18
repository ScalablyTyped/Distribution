package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFieldOptionsResponse extends StObject {
  
  /**
    * The token for the next set of results. This is null if there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of FieldOption objects.
    */
  var options: FieldOptionsList
}
object ListFieldOptionsResponse {
  
  inline def apply(options: FieldOptionsList): ListFieldOptionsResponse = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFieldOptionsResponse]
  }
  
  extension [Self <: ListFieldOptionsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOptions(value: FieldOptionsList): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: FieldOption*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
