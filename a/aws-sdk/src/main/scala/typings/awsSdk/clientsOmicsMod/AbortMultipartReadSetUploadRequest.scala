package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortMultipartReadSetUploadRequest extends StObject {
  
  /**
    *  The sequence store ID for the store involved in the multipart upload. 
    */
  var sequenceStoreId: SequenceStoreId
  
  /**
    *  The ID for the multipart upload. 
    */
  var uploadId: UploadId
}
object AbortMultipartReadSetUploadRequest {
  
  inline def apply(sequenceStoreId: SequenceStoreId, uploadId: UploadId): AbortMultipartReadSetUploadRequest = {
    val __obj = js.Dynamic.literal(sequenceStoreId = sequenceStoreId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortMultipartReadSetUploadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbortMultipartReadSetUploadRequest] (val x: Self) extends AnyVal {
    
    inline def setSequenceStoreId(value: SequenceStoreId): Self = StObject.set(x, "sequenceStoreId", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: UploadId): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
