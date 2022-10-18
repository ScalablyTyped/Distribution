package typings.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagQueueRequest extends StObject {
  
  /**
    * The URL of the queue.
    */
  var QueueUrl: String
  
  /**
    * The list of tags to be removed from the specified queue.
    */
  var TagKeys: TagKeyList
}
object UntagQueueRequest {
  
  inline def apply(QueueUrl: String, TagKeys: TagKeyList): UntagQueueRequest = {
    val __obj = js.Dynamic.literal(QueueUrl = QueueUrl.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagQueueRequest]
  }
  
  extension [Self <: UntagQueueRequest](x: Self) {
    
    inline def setQueueUrl(value: String): Self = StObject.set(x, "QueueUrl", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
