package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartsResult extends StObject {
  
  var PartNumberMarker: Double
  
  var bucket: String
  
  var isTruncated: Boolean
  
  var maxParts: Double
  
  var name: String
  
  var nextPartNumberMarker: Double
  
  var parts: js.Array[ObjectPart]
  
  var res: NormalSuccessResponse
  
  var uploadId: String
}
object ListPartsResult {
  
  inline def apply(
    PartNumberMarker: Double,
    bucket: String,
    isTruncated: Boolean,
    maxParts: Double,
    name: String,
    nextPartNumberMarker: Double,
    parts: js.Array[ObjectPart],
    res: NormalSuccessResponse,
    uploadId: String
  ): ListPartsResult = {
    val __obj = js.Dynamic.literal(PartNumberMarker = PartNumberMarker.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], isTruncated = isTruncated.asInstanceOf[js.Any], maxParts = maxParts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextPartNumberMarker = nextPartNumberMarker.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsResult]
  }
  
  extension [Self <: ListPartsResult](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "isTruncated", value.asInstanceOf[js.Any])
    
    inline def setMaxParts(value: Double): Self = StObject.set(x, "maxParts", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNextPartNumberMarker(value: Double): Self = StObject.set(x, "nextPartNumberMarker", value.asInstanceOf[js.Any])
    
    inline def setPartNumberMarker(value: Double): Self = StObject.set(x, "PartNumberMarker", value.asInstanceOf[js.Any])
    
    inline def setParts(value: js.Array[ObjectPart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: ObjectPart*): Self = StObject.set(x, "parts", js.Array(value :_*))
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
