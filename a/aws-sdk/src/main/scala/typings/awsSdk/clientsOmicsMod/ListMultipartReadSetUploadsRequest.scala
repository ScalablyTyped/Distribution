package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMultipartReadSetUploadsRequest extends StObject {
  
  /**
    *  The maximum number of multipart uploads returned in a page. 
    */
  var maxResults: js.UndefOr[ListMultipartReadSetUploadsRequestMaxResultsInteger] = js.undefined
  
  /**
    *  Next token returned in the response of a previous ListMultipartReadSetUploads call. Used to get the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  The Sequence Store ID used for the multipart uploads. 
    */
  var sequenceStoreId: SequenceStoreId
}
object ListMultipartReadSetUploadsRequest {
  
  inline def apply(sequenceStoreId: SequenceStoreId): ListMultipartReadSetUploadsRequest = {
    val __obj = js.Dynamic.literal(sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultipartReadSetUploadsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListMultipartReadSetUploadsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListMultipartReadSetUploadsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
  }
}
