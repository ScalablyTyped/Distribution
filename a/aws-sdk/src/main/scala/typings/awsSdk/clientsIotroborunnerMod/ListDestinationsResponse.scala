package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDestinationsResponse extends StObject {
  
  var destinations: js.UndefOr[Destinations] = js.undefined
  
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDestinationsResponse {
  
  inline def apply(): ListDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDestinationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDestinationsResponse] (val x: Self) extends AnyVal {
    
    inline def setDestinations(value: Destinations): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: Destination*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
