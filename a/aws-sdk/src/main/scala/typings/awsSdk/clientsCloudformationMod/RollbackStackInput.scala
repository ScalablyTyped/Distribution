package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackStackInput extends StObject {
  
  /**
    * A unique identifier for this RollbackStack request.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ClientRequestToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Identity and Access Management role that CloudFormation assumes to rollback the stack.
    */
  var RoleARN: js.UndefOr[RoleARN_] = js.undefined
  
  /**
    * The name that's associated with the stack.
    */
  var StackName: StackNameOrId
}
object RollbackStackInput {
  
  inline def apply(StackName: StackNameOrId): RollbackStackInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackStackInput]
  }
  
  extension [Self <: RollbackStackInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setRoleARN(value: RoleARN_): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
