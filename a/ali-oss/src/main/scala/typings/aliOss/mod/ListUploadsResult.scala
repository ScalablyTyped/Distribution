package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUploadsResult extends StObject {
  
  var bucket: String
  
  var isTruncated: Boolean
  
  var nextKeyMarker: Any
  
  var nextUploadIdMarker: Any
  
  var res: NormalSuccessResponse
  
  var uploads: js.Array[Upload]
}
object ListUploadsResult {
  
  inline def apply(
    bucket: String,
    isTruncated: Boolean,
    nextKeyMarker: Any,
    nextUploadIdMarker: Any,
    res: NormalSuccessResponse,
    uploads: js.Array[Upload]
  ): ListUploadsResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], isTruncated = isTruncated.asInstanceOf[js.Any], nextKeyMarker = nextKeyMarker.asInstanceOf[js.Any], nextUploadIdMarker = nextUploadIdMarker.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], uploads = uploads.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUploadsResult]
  }
  
  extension [Self <: ListUploadsResult](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "isTruncated", value.asInstanceOf[js.Any])
    
    inline def setNextKeyMarker(value: Any): Self = StObject.set(x, "nextKeyMarker", value.asInstanceOf[js.Any])
    
    inline def setNextUploadIdMarker(value: Any): Self = StObject.set(x, "nextUploadIdMarker", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setUploads(value: js.Array[Upload]): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
    
    inline def setUploadsVarargs(value: Upload*): Self = StObject.set(x, "uploads", js.Array(value*))
  }
}
