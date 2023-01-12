package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReplicationSetInput extends StObject {
  
  /**
    * An action to add or delete a Region.
    */
  var actions: UpdateReplicationSetInputActionsList
  
  /**
    * The Amazon Resource Name (ARN) of the replication set you're updating.
    */
  var arn: Arn
  
  /**
    * A token that ensures that the operation is called only once with the specified details.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
}
object UpdateReplicationSetInput {
  
  inline def apply(actions: UpdateReplicationSetInputActionsList, arn: Arn): UpdateReplicationSetInput = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReplicationSetInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateReplicationSetInput] (val x: Self) extends AnyVal {
    
    inline def setActions(value: UpdateReplicationSetInputActionsList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: UpdateReplicationSetAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
