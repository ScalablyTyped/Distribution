package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelFlowRequest extends StObject {
  
  /**
    * The ARN of the channel flow.
    */
  var ChannelFlowArn: ChimeArn
  
  /**
    * The name of the channel flow.
    */
  var Name: NonEmptyResourceName
  
  /**
    * Information about the processor Lambda functions 
    */
  var Processors: ProcessorList
}
object UpdateChannelFlowRequest {
  
  inline def apply(ChannelFlowArn: ChimeArn, Name: NonEmptyResourceName, Processors: ProcessorList): UpdateChannelFlowRequest = {
    val __obj = js.Dynamic.literal(ChannelFlowArn = ChannelFlowArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Processors = Processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelFlowRequest]
  }
  
  extension [Self <: UpdateChannelFlowRequest](x: Self) {
    
    inline def setChannelFlowArn(value: ChimeArn): Self = StObject.set(x, "ChannelFlowArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProcessors(value: ProcessorList): Self = StObject.set(x, "Processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsVarargs(value: Processor*): Self = StObject.set(x, "Processors", js.Array(value*))
  }
}
