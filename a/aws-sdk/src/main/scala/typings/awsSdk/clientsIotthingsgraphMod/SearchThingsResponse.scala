package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchThingsResponse extends StObject {
  
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of things in the result set.
    */
  var things: js.UndefOr[Things] = js.undefined
}
object SearchThingsResponse {
  
  inline def apply(): SearchThingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchThingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchThingsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setThings(value: Things): Self = StObject.set(x, "things", value.asInstanceOf[js.Any])
    
    inline def setThingsUndefined: Self = StObject.set(x, "things", js.undefined)
    
    inline def setThingsVarargs(value: Thing*): Self = StObject.set(x, "things", js.Array(value*))
  }
}
