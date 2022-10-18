package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThingPrincipalsResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The principals associated with the thing.
    */
  var principals: js.UndefOr[Principals] = js.undefined
}
object ListThingPrincipalsResponse {
  
  inline def apply(): ListThingPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingPrincipalsResponse]
  }
  
  extension [Self <: ListThingPrincipalsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPrincipals(value: Principals): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsUndefined: Self = StObject.set(x, "principals", js.undefined)
    
    inline def setPrincipalsVarargs(value: PrincipalArn*): Self = StObject.set(x, "principals", js.Array(value*))
  }
}
