package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceResponse extends StObject {
  
  /**
    * The tag keys that have been removed from the cluster.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object UntagResourceResponse {
  
  inline def apply(): UntagResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
