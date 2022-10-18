package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThingsInBillingGroupResponse extends StObject {
  
  /**
    * The token to use to get the next set of results. Will not be returned if operation has returned all results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of things in the billing group.
    */
  var things: js.UndefOr[ThingNameList] = js.undefined
}
object ListThingsInBillingGroupResponse {
  
  inline def apply(): ListThingsInBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingsInBillingGroupResponse]
  }
  
  extension [Self <: ListThingsInBillingGroupResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setThings(value: ThingNameList): Self = StObject.set(x, "things", value.asInstanceOf[js.Any])
    
    inline def setThingsUndefined: Self = StObject.set(x, "things", js.undefined)
    
    inline def setThingsVarargs(value: ThingName*): Self = StObject.set(x, "things", js.Array(value*))
  }
}
