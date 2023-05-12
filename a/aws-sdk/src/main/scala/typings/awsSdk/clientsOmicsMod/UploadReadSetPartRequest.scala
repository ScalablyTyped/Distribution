package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadReadSetPartRequest extends StObject {
  
  /**
    *  The number of the part being uploaded. 
    */
  var partNumber: UploadReadSetPartRequestPartNumberInteger
  
  /**
    *  The source file for an upload part. 
    */
  var partSource: ReadSetPartSource
  
  /**
    *  The read set data to upload for a part. 
    */
  var payload: ReadSetPartStreamingBlob
  
  /**
    *  The Sequence Store ID used for the multipart upload. 
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    *  The ID for the initiated multipart upload. 
    */
  var uploadId: UploadId
}
object UploadReadSetPartRequest {
  
  inline def apply(
    partNumber: UploadReadSetPartRequestPartNumberInteger,
    partSource: ReadSetPartSource,
    payload: ReadSetPartStreamingBlob,
    sequenceStoreId: SequenceStoreId,
    uploadId: UploadId
  ): UploadReadSetPartRequest = {
    val __obj = js.Dynamic.literal(partNumber = partNumber.asInstanceOf[js.Any], partSource = partSource.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadReadSetPartRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadReadSetPartRequest] (val x: Self) extends AnyVal {
    
    inline def setPartNumber(value: UploadReadSetPartRequestPartNumberInteger): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    inline def setPartSource(value: ReadSetPartSource): Self = StObject.set(x, "partSource", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: ReadSetPartStreamingBlob): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
