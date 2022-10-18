package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectStackSetDriftInput extends StObject {
  
  /**
    * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. By default, SELF is specified. Use SELF for stack sets with self-managed permissions.   If you are signed in to the management account, specify SELF.   If you are signed in to a delegated administrator account, specify DELEGATED_ADMIN. Your Amazon Web Services account must be registered as a delegated administrator in the management account. For more information, see Register a delegated administrator in the CloudFormation User Guide.  
    */
  var CallAs: js.UndefOr[typings.awsSdk.clientsCloudformationMod.CallAs] = js.undefined
  
  /**
    *  The ID of the stack set operation. 
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
  
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
  
  /**
    * The name of the stack set on which to perform the drift detection operation.
    */
  var StackSetName: StackSetNameOrId
}
object DetectStackSetDriftInput {
  
  inline def apply(StackSetName: StackSetNameOrId): DetectStackSetDriftInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackSetDriftInput]
  }
  
  extension [Self <: DetectStackSetDriftInput](x: Self) {
    
    inline def setCallAs(value: CallAs): Self = StObject.set(x, "CallAs", value.asInstanceOf[js.Any])
    
    inline def setCallAsUndefined: Self = StObject.set(x, "CallAs", js.undefined)
    
    inline def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
    
    inline def setOperationPreferences(value: StackSetOperationPreferences): Self = StObject.set(x, "OperationPreferences", value.asInstanceOf[js.Any])
    
    inline def setOperationPreferencesUndefined: Self = StObject.set(x, "OperationPreferences", js.undefined)
    
    inline def setStackSetName(value: StackSetNameOrId): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
