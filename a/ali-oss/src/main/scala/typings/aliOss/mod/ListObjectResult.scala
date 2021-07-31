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
  
  @scala.inline
  def apply(
    isTruncated: Boolean,
    nextMarker: String,
    objects: js.Array[ObjectMeta],
    prefixes: js.Array[String],
    res: NormalSuccessResponse
  ): ListObjectResult = {
    val __obj = js.Dynamic.literal(isTruncated = isTruncated.asInstanceOf[js.Any], nextMarker = nextMarker.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectResult]
  }
  
  @scala.inline
  implicit class ListObjectResultMutableBuilder[Self <: ListObjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTruncated(value: Boolean): Self = StObject.set(x, "isTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjects(value: js.Array[ObjectMeta]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: ObjectMeta*): Self = StObject.set(x, "objects", js.Array(value :_*))
    
    @scala.inline
    def setPrefixes(value: js.Array[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixesVarargs(value: String*): Self = StObject.set(x, "prefixes", js.Array(value :_*))
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
