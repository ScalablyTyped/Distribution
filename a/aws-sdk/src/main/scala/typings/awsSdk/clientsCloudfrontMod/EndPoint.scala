package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndPoint extends StObject {
  
  /**
    * Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
    */
  var KinesisStreamConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.KinesisStreamConfig] = js.undefined
  
  /**
    * The type of data stream where you are sending real-time log data. The only valid value is Kinesis.
    */
  var StreamType: String
}
object EndPoint {
  
  inline def apply(StreamType: String): EndPoint = {
    val __obj = js.Dynamic.literal(StreamType = StreamType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPoint]
  }
  
  extension [Self <: EndPoint](x: Self) {
    
    inline def setKinesisStreamConfig(value: KinesisStreamConfig): Self = StObject.set(x, "KinesisStreamConfig", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamConfigUndefined: Self = StObject.set(x, "KinesisStreamConfig", js.undefined)
    
    inline def setStreamType(value: String): Self = StObject.set(x, "StreamType", value.asInstanceOf[js.Any])
  }
}
