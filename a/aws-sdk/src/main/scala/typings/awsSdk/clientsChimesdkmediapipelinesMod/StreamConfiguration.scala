package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamConfiguration extends StObject {
  
  /**
    * The unique identifier of the fragment to begin processing.
    */
  var FragmentNumber: js.UndefOr[FragmentNumberString] = js.undefined
  
  /**
    * The ARN of the stream.
    */
  var StreamArn: KinesisVideoStreamArn
  
  /**
    * The streaming channel definition in the stream configuration.
    */
  var StreamChannelDefinition: typings.awsSdk.clientsChimesdkmediapipelinesMod.StreamChannelDefinition
}
object StreamConfiguration {
  
  inline def apply(StreamArn: KinesisVideoStreamArn, StreamChannelDefinition: StreamChannelDefinition): StreamConfiguration = {
    val __obj = js.Dynamic.literal(StreamArn = StreamArn.asInstanceOf[js.Any], StreamChannelDefinition = StreamChannelDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFragmentNumber(value: FragmentNumberString): Self = StObject.set(x, "FragmentNumber", value.asInstanceOf[js.Any])
    
    inline def setFragmentNumberUndefined: Self = StObject.set(x, "FragmentNumber", js.undefined)
    
    inline def setStreamArn(value: KinesisVideoStreamArn): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    inline def setStreamChannelDefinition(value: StreamChannelDefinition): Self = StObject.set(x, "StreamChannelDefinition", value.asInstanceOf[js.Any])
  }
}
