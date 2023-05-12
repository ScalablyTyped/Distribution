package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReadSetUploadPartsResponse extends StObject {
  
  /**
    *  Next token returned in the response of a previous ListReadSetUploadParts call. Used to get the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  An array of upload parts. 
    */
  var parts: js.UndefOr[ReadSetUploadPartList] = js.undefined
}
object ListReadSetUploadPartsResponse {
  
  inline def apply(): ListReadSetUploadPartsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReadSetUploadPartsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReadSetUploadPartsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setParts(value: ReadSetUploadPartList): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setPartsVarargs(value: ReadSetUploadPartListItem*): Self = StObject.set(x, "parts", js.Array(value*))
  }
}
