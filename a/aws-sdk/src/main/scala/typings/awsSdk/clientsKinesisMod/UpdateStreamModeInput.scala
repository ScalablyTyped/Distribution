package typings.awsSdk.clientsKinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStreamModeInput extends StObject {
  
  /**
    *  Specifies the ARN of the data stream whose capacity mode you want to update. 
    */
  var StreamARN: typings.awsSdk.clientsKinesisMod.StreamARN
  
  /**
    *  Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams, you can choose between an on-demand capacity mode and a provisioned capacity mode for your data streams. 
    */
  var StreamModeDetails: typings.awsSdk.clientsKinesisMod.StreamModeDetails
}
object UpdateStreamModeInput {
  
  inline def apply(StreamARN: StreamARN, StreamModeDetails: StreamModeDetails): UpdateStreamModeInput = {
    val __obj = js.Dynamic.literal(StreamARN = StreamARN.asInstanceOf[js.Any], StreamModeDetails = StreamModeDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamModeInput]
  }
  
  extension [Self <: UpdateStreamModeInput](x: Self) {
    
    inline def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamModeDetails(value: StreamModeDetails): Self = StObject.set(x, "StreamModeDetails", value.asInstanceOf[js.Any])
  }
}
