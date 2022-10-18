package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamModeDetails extends StObject {
  
  /**
    *  Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams, you can choose between an on-demand capacity mode and a provisioned capacity mode for your data streams. 
    */
  var StreamMode: typings.awsSdk.clientsKinesisMod.StreamMode
}
object StreamModeDetails {
  
  inline def apply(StreamMode: StreamMode): StreamModeDetails = {
    val __obj = js.Dynamic.literal(StreamMode = StreamMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamModeDetails]
  }
  
  extension [Self <: StreamModeDetails](x: Self) {
    
    inline def setStreamMode(value: StreamMode): Self = StObject.set(x, "StreamMode", value.asInstanceOf[js.Any])
  }
}
