package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatStreamingConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the standard Amazon SNS topic. The Amazon Resource Name (ARN) of the streaming endpoint that is used to publish real-time message streaming for chat conversations.
    */
  var StreamingEndpointArn: ChatStreamingEndpointARN
}
object ChatStreamingConfiguration {
  
  inline def apply(StreamingEndpointArn: ChatStreamingEndpointARN): ChatStreamingConfiguration = {
    val __obj = js.Dynamic.literal(StreamingEndpointArn = StreamingEndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatStreamingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatStreamingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setStreamingEndpointArn(value: ChatStreamingEndpointARN): Self = StObject.set(x, "StreamingEndpointArn", value.asInstanceOf[js.Any])
  }
}
