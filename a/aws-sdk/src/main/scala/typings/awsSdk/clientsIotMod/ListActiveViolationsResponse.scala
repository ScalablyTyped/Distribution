package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListActiveViolationsResponse extends StObject {
  
  /**
    * The list of active violations.
    */
  var activeViolations: js.UndefOr[ActiveViolations] = js.undefined
  
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListActiveViolationsResponse {
  
  inline def apply(): ListActiveViolationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActiveViolationsResponse]
  }
  
  extension [Self <: ListActiveViolationsResponse](x: Self) {
    
    inline def setActiveViolations(value: ActiveViolations): Self = StObject.set(x, "activeViolations", value.asInstanceOf[js.Any])
    
    inline def setActiveViolationsUndefined: Self = StObject.set(x, "activeViolations", js.undefined)
    
    inline def setActiveViolationsVarargs(value: ActiveViolation*): Self = StObject.set(x, "activeViolations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
