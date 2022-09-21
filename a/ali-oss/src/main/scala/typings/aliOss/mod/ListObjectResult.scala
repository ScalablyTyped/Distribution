package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectResult extends StObject {
  
  var isTruncated: Boolean
  
  var nextMarker: String
  
  var objects: js.Array[ObjectMeta]
  
  var prefixes: js.Array[String]
  
  var res: NormalSuccessResponse
}
object ListObjectResult {
  
  inline def apply(
    isTruncated: Boolean,
    nextMarker: String,
    objects: js.Array[ObjectMeta],
    prefixes: js.Array[String],
    res: NormalSuccessResponse
  ): ListObjectResult = {
    val __obj = js.Dynamic.literal(isTruncated = isTruncated.asInstanceOf[js.Any], nextMarker = nextMarker.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectResult]
  }
  
  extension [Self <: ListObjectResult](x: Self) {
    
    inline def setIsTruncated(value: Boolean): Self = StObject.set(x, "isTruncated", value.asInstanceOf[js.Any])
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    inline def setObjects(value: js.Array[ObjectMeta]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: ObjectMeta*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def setPrefixes(value: js.Array[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setPrefixesVarargs(value: String*): Self = StObject.set(x, "prefixes", js.Array(value*))
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
