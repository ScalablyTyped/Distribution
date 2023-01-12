package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteChangeSetInput extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of the change set that you want use to update the specified stack.
    */
  var ChangeSetName: ChangeSetNameOrId
  
  /**
    * A unique identifier for this ExecuteChangeSet request. Specify this token if you plan to retry requests so that CloudFormation knows that you're not attempting to execute a change set to update a stack with the same name. You might retry ExecuteChangeSet requests to ensure that CloudFormation successfully received them.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ClientRequestToken] = js.undefined
  
  /**
    * Preserves the state of previously provisioned resources when an operation fails. Default: True 
    */
  var DisableRollback: js.UndefOr[typings.awsSdk.clientsCloudformationMod.DisableRollback] = js.undefined
  
  /**
    * If you specified the name of a change set, specify the stack name or Amazon Resource Name (ARN) that's associated with the change set you want to execute.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.undefined
}
object ExecuteChangeSetInput {
  
  inline def apply(ChangeSetName: ChangeSetNameOrId): ExecuteChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteChangeSetInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecuteChangeSetInput] (val x: Self) extends AnyVal {
    
    inline def setChangeSetName(value: ChangeSetNameOrId): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDisableRollback(value: DisableRollback): Self = StObject.set(x, "DisableRollback", value.asInstanceOf[js.Any])
    
    inline def setDisableRollbackUndefined: Self = StObject.set(x, "DisableRollback", js.undefined)
    
    inline def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
  }
}
