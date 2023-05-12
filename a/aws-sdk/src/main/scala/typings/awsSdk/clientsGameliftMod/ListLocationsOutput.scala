package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLocationsOutput extends StObject {
  
  /**
    * A collection of locations.
    */
  var Locations: js.UndefOr[LocationModelList] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object ListLocationsOutput {
  
  inline def apply(): ListLocationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLocationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLocationsOutput] (val x: Self) extends AnyVal {
    
    inline def setLocations(value: LocationModelList): Self = StObject.set(x, "Locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "Locations", js.undefined)
    
    inline def setLocationsVarargs(value: LocationModel*): Self = StObject.set(x, "Locations", js.Array(value*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
