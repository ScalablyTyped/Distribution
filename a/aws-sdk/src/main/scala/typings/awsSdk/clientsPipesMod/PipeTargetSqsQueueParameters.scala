package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeTargetSqsQueueParameters extends StObject {
  
  /**
    * This parameter applies only to FIFO (first-in-first-out) queues. The token used for deduplication of sent messages.
    */
  var MessageDeduplicationId: js.UndefOr[typings.awsSdk.clientsPipesMod.MessageDeduplicationId] = js.undefined
  
  /**
    * The FIFO message group ID to use as the target.
    */
  var MessageGroupId: js.UndefOr[typings.awsSdk.clientsPipesMod.MessageGroupId] = js.undefined
}
object PipeTargetSqsQueueParameters {
  
  inline def apply(): PipeTargetSqsQueueParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeTargetSqsQueueParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeTargetSqsQueueParameters] (val x: Self) extends AnyVal {
    
    inline def setMessageDeduplicationId(value: MessageDeduplicationId): Self = StObject.set(x, "MessageDeduplicationId", value.asInstanceOf[js.Any])
    
    inline def setMessageDeduplicationIdUndefined: Self = StObject.set(x, "MessageDeduplicationId", js.undefined)
    
    inline def setMessageGroupId(value: MessageGroupId): Self = StObject.set(x, "MessageGroupId", value.asInstanceOf[js.Any])
    
    inline def setMessageGroupIdUndefined: Self = StObject.set(x, "MessageGroupId", js.undefined)
  }
}
