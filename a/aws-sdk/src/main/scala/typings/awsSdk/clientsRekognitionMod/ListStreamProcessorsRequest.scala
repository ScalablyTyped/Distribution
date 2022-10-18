package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamProcessorsRequest extends StObject {
  
  /**
    * Maximum number of stream processors you want Amazon Rekognition Video to return in the response. The default is 1000. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsRekognitionMod.MaxResults] = js.undefined
  
  /**
    * If the previous response was incomplete (because there are more stream processors to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of stream processors. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListStreamProcessorsRequest {
  
  inline def apply(): ListStreamProcessorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamProcessorsRequest]
  }
  
  extension [Self <: ListStreamProcessorsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
