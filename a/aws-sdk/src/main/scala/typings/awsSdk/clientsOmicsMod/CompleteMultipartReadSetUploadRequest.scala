package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteMultipartReadSetUploadRequest extends StObject {
  
  /**
    *  The individual uploads or parts of a multipart upload. 
    */
  var parts: CompleteReadSetUploadPartList
  
  /**
    *  The sequence store ID for the store involved in the multipart upload. 
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    *  The ID for the multipart upload. 
    */
  var uploadId: UploadId
}
object CompleteMultipartReadSetUploadRequest {
  
  inline def apply(parts: CompleteReadSetUploadPartList, sequenceStoreId: SequenceStoreId, uploadId: UploadId): CompleteMultipartReadSetUploadRequest = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartReadSetUploadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompleteMultipartReadSetUploadRequest] (val x: Self) extends AnyVal {
    
    inline def setParts(value: CompleteReadSetUploadPartList): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: CompleteReadSetUploadPartListItem*): Self = StObject.set(x, "parts", js.Array(value*))
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
