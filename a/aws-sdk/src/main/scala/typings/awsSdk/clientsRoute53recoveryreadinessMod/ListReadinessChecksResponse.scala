package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReadinessChecksResponse extends StObject {
  
  /**
    * The token that identifies which batch of results you want to see.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A list of readiness checks associated with the account.
    */
  var ReadinessChecks: js.UndefOr[listOfReadinessCheckOutput] = js.undefined
}
object ListReadinessChecksResponse {
  
  inline def apply(): ListReadinessChecksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReadinessChecksResponse]
  }
  
  extension [Self <: ListReadinessChecksResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReadinessChecks(value: listOfReadinessCheckOutput): Self = StObject.set(x, "ReadinessChecks", value.asInstanceOf[js.Any])
    
    inline def setReadinessChecksUndefined: Self = StObject.set(x, "ReadinessChecks", js.undefined)
    
    inline def setReadinessChecksVarargs(value: ReadinessCheckOutput*): Self = StObject.set(x, "ReadinessChecks", js.Array(value*))
  }
}
