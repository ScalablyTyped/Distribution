package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReadSetUploadPartsRequest extends StObject {
  
  /**
    *  Attributes used to filter for a specific subset of read set part uploads. 
    */
  var filter: js.UndefOr[ReadSetUploadPartListFilter] = js.undefined
  
  /**
    *  The maximum number of read set upload parts returned in a page. 
    */
  var maxResults: js.UndefOr[ListReadSetUploadPartsRequestMaxResultsInteger] = js.undefined
  
  /**
    *  Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  The source file for the upload part. 
    */
  var partSource: ReadSetPartSource
  
  /**
    *  The Sequence Store ID used for the multipart uploads. 
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    *  The ID for the initiated multipart upload. 
    */
  var uploadId: UploadId
}
object ListReadSetUploadPartsRequest {
  
  inline def apply(partSource: ReadSetPartSource, sequenceStoreId: SequenceStoreId, uploadId: UploadId): ListReadSetUploadPartsRequest = {
    val __obj = js.Dynamic.literal(partSource = partSource.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReadSetUploadPartsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReadSetUploadPartsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: ReadSetUploadPartListFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: ListReadSetUploadPartsRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPartSource(value: ReadSetPartSource): Self = StObject.set(x, "partSource", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
