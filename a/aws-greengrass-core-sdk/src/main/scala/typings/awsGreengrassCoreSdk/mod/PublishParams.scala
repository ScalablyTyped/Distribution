package typings.awsGreengrassCoreSdk.mod

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.AllOrError
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.BestEffort
import typings.node.bufferMod.global.Buffer
import typings.std.ArrayLike
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishParams extends StObject {
  
  var payload: Buffer | Blob | String | ArrayLike[Any]
  
  var queueFullPolicy: js.UndefOr[AllOrError | BestEffort] = js.undefined
  
  var topic: String
}
object PublishParams {
  
  inline def apply(payload: Buffer | Blob | String | ArrayLike[Any], topic: String): PublishParams = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishParams] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Buffer | Blob | String | ArrayLike[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setQueueFullPolicy(value: AllOrError | BestEffort): Self = StObject.set(x, "queueFullPolicy", value.asInstanceOf[js.Any])
    
    inline def setQueueFullPolicyUndefined: Self = StObject.set(x, "queueFullPolicy", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
