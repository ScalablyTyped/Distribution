package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSpacesRequest extends StObject {
  
  /**
    * A token returned from a call to this API to indicate the next batch of results to return, if any.
    */
  var nextToken: js.UndefOr[ListSpacesRequestNextTokenString] = js.undefined
}
object ListSpacesRequest {
  
  inline def apply(): ListSpacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSpacesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSpacesRequest] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: ListSpacesRequestNextTokenString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
