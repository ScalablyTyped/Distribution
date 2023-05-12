package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSpacesResponse extends StObject {
  
  /**
    * If the previous response was truncated, you will receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * The list of spaces.
    */
  var Spaces: js.UndefOr[SpaceList] = js.undefined
}
object ListSpacesResponse {
  
  inline def apply(): ListSpacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSpacesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSpacesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSpaces(value: SpaceList): Self = StObject.set(x, "Spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesUndefined: Self = StObject.set(x, "Spaces", js.undefined)
    
    inline def setSpacesVarargs(value: SpaceDetails*): Self = StObject.set(x, "Spaces", js.Array(value*))
  }
}
