package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelFlowSummary extends StObject {
  
  /**
    * The ARN of the channel flow.
    */
  var ChannelFlowArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The name of the channel flow.
    */
  var Name: js.UndefOr[NonEmptyResourceName] = js.undefined
  
  /**
    * Information about the processor Lambda functions.
    */
  var Processors: js.UndefOr[ProcessorList] = js.undefined
}
object ChannelFlowSummary {
  
  inline def apply(): ChannelFlowSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelFlowSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelFlowSummary] (val x: Self) extends AnyVal {
    
    inline def setChannelFlowArn(value: ChimeArn): Self = StObject.set(x, "ChannelFlowArn", value.asInstanceOf[js.Any])
    
    inline def setChannelFlowArnUndefined: Self = StObject.set(x, "ChannelFlowArn", js.undefined)
    
    inline def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProcessors(value: ProcessorList): Self = StObject.set(x, "Processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsUndefined: Self = StObject.set(x, "Processors", js.undefined)
    
    inline def setProcessorsVarargs(value: Processor*): Self = StObject.set(x, "Processors", js.Array(value*))
  }
}
