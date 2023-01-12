package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelFlow extends StObject {
  
  /**
    * The ARN of the channel flow.
    */
  var ChannelFlowArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The time at which the channel flow was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which a channel flow was updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the channel flow.
    */
  var Name: js.UndefOr[NonEmptyResourceName] = js.undefined
  
  /**
    * Information about the processor Lambda functions.
    */
  var Processors: js.UndefOr[ProcessorList] = js.undefined
}
object ChannelFlow {
  
  inline def apply(): ChannelFlow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelFlow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelFlow] (val x: Self) extends AnyVal {
    
    inline def setChannelFlowArn(value: ChimeArn): Self = StObject.set(x, "ChannelFlowArn", value.asInstanceOf[js.Any])
    
    inline def setChannelFlowArnUndefined: Self = StObject.set(x, "ChannelFlowArn", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProcessors(value: ProcessorList): Self = StObject.set(x, "Processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsUndefined: Self = StObject.set(x, "Processors", js.undefined)
    
    inline def setProcessorsVarargs(value: Processor*): Self = StObject.set(x, "Processors", js.Array(value*))
  }
}
