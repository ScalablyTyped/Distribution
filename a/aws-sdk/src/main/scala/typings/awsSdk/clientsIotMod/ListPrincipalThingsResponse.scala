package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPrincipalThingsResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The things.
    */
  var things: js.UndefOr[ThingNameList] = js.undefined
}
object ListPrincipalThingsResponse {
  
  inline def apply(): ListPrincipalThingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPrincipalThingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPrincipalThingsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setThings(value: ThingNameList): Self = StObject.set(x, "things", value.asInstanceOf[js.Any])
    
    inline def setThingsUndefined: Self = StObject.set(x, "things", js.undefined)
    
    inline def setThingsVarargs(value: ThingName*): Self = StObject.set(x, "things", js.Array(value*))
  }
}
