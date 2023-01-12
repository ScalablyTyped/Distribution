package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThingsResponse extends StObject {
  
  /**
    * The token to use to get the next set of results. Will not be returned if operation has returned all results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The things.
    */
  var things: js.UndefOr[ThingAttributeList] = js.undefined
}
object ListThingsResponse {
  
  inline def apply(): ListThingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListThingsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setThings(value: ThingAttributeList): Self = StObject.set(x, "things", value.asInstanceOf[js.Any])
    
    inline def setThingsUndefined: Self = StObject.set(x, "things", js.undefined)
    
    inline def setThingsVarargs(value: ThingAttribute*): Self = StObject.set(x, "things", js.Array(value*))
  }
}
