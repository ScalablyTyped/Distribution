package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelCommandRequest extends StObject {
  
  /**
    * The ID of the command you want to cancel.
    */
  var CommandId: typings.awsSdk.clientsSsmMod.CommandId
  
  /**
    * (Optional) A list of managed node IDs on which you want to cancel the command. If not provided, the command is canceled on every node on which it was requested.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
}
object CancelCommandRequest {
  
  inline def apply(CommandId: CommandId): CancelCommandRequest = {
    val __obj = js.Dynamic.literal(CommandId = CommandId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelCommandRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelCommandRequest] (val x: Self) extends AnyVal {
    
    inline def setCommandId(value: CommandId): Self = StObject.set(x, "CommandId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIds(value: InstanceIdList): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    inline def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value*))
  }
}
