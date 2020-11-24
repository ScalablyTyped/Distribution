package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListObjectResult extends js.Object {
  
  var isTruncated: Boolean = js.native
  
  var nextMarker: String = js.native
  
  var objects: js.Array[ObjectMeta] = js.native
  
  var prefixes: js.Array[String] = js.native
  
  var res: NormalSuccessResponse = js.native
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
  implicit class ListObjectResultOps[Self <: ListObjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsTruncated(value: Boolean): Self = this.set("isTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarker(value: String): Self = this.set("nextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsVarargs(value: ObjectMeta*): Self = this.set("objects", js.Array(value :_*))
    
    @scala.inline
    def setObjects(value: js.Array[ObjectMeta]): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixesVarargs(value: String*): Self = this.set("prefixes", js.Array(value :_*))
    
    @scala.inline
    def setPrefixes(value: js.Array[String]): Self = this.set("prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
  }
}
