package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamProcessorsResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of stream processors. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * List of stream processors that you have created.
    */
  var StreamProcessors: js.UndefOr[StreamProcessorList] = js.undefined
}
object ListStreamProcessorsResponse {
  
  inline def apply(): ListStreamProcessorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamProcessorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStreamProcessorsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStreamProcessors(value: StreamProcessorList): Self = StObject.set(x, "StreamProcessors", value.asInstanceOf[js.Any])
    
    inline def setStreamProcessorsUndefined: Self = StObject.set(x, "StreamProcessors", js.undefined)
    
    inline def setStreamProcessorsVarargs(value: StreamProcessor*): Self = StObject.set(x, "StreamProcessors", js.Array(value*))
  }
}
