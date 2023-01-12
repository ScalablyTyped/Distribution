package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Processor extends StObject {
  
  /**
    * The information about the type of processor and its identifier.
    */
  var Configuration: ProcessorConfiguration
  
  /**
    * The sequence in which processors run. If you have multiple processors in a channel flow, message processing goes through each processor in the sequence. The value determines the sequence. At this point, we support only 1 processor within a flow.
    */
  var ExecutionOrder: ChannelFlowExecutionOrder
  
  /**
    * Determines whether to continue with message processing or stop it in cases where communication with a processor fails. If a processor has a fallback action of ABORT and communication with it fails, the processor sets the message status to FAILED and does not send the message to any recipients. Note that if the last processor in the channel flow sequence has a fallback action of CONTINUE and communication with the processor fails, then the message is considered processed and sent to recipients of the channel.
    */
  var FallbackAction: typings.awsSdk.clientsChimesdkmessagingMod.FallbackAction
  
  /**
    * The name of the channel flow.
    */
  var Name: NonEmptyResourceName
}
object Processor {
  
  inline def apply(
    Configuration: ProcessorConfiguration,
    ExecutionOrder: ChannelFlowExecutionOrder,
    FallbackAction: FallbackAction,
    Name: NonEmptyResourceName
  ): Processor = {
    val __obj = js.Dynamic.literal(Configuration = Configuration.asInstanceOf[js.Any], ExecutionOrder = ExecutionOrder.asInstanceOf[js.Any], FallbackAction = FallbackAction.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Processor] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: ProcessorConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setExecutionOrder(value: ChannelFlowExecutionOrder): Self = StObject.set(x, "ExecutionOrder", value.asInstanceOf[js.Any])
    
    inline def setFallbackAction(value: FallbackAction): Self = StObject.set(x, "FallbackAction", value.asInstanceOf[js.Any])
    
    inline def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
