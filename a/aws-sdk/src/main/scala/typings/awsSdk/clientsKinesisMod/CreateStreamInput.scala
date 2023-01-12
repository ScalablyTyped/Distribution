package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamInput extends StObject {
  
  /**
    * The number of shards that the stream will use. The throughput of the stream is a function of the number of shards; more shards are required for greater provisioned throughput.
    */
  var ShardCount: js.UndefOr[PositiveIntegerObject] = js.undefined
  
  /**
    *  Indicates the capacity mode of the data stream. Currently, in Kinesis Data Streams, you can choose between an on-demand capacity mode and a provisioned capacity mode for your data streams.
    */
  var StreamModeDetails: js.UndefOr[typings.awsSdk.clientsKinesisMod.StreamModeDetails] = js.undefined
  
  /**
    * A name to identify the stream. The stream name is scoped to the Amazon Web Services account used by the application that creates the stream. It is also scoped by Amazon Web Services Region. That is, two streams in two different Amazon Web Services accounts can have the same name. Two streams in the same Amazon Web Services account but in two different Regions can also have the same name.
    */
  var StreamName: typings.awsSdk.clientsKinesisMod.StreamName
}
object CreateStreamInput {
  
  inline def apply(StreamName: StreamName): CreateStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateStreamInput] (val x: Self) extends AnyVal {
    
    inline def setShardCount(value: PositiveIntegerObject): Self = StObject.set(x, "ShardCount", value.asInstanceOf[js.Any])
    
    inline def setShardCountUndefined: Self = StObject.set(x, "ShardCount", js.undefined)
    
    inline def setStreamModeDetails(value: StreamModeDetails): Self = StObject.set(x, "StreamModeDetails", value.asInstanceOf[js.Any])
    
    inline def setStreamModeDetailsUndefined: Self = StObject.set(x, "StreamModeDetails", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
  }
}
