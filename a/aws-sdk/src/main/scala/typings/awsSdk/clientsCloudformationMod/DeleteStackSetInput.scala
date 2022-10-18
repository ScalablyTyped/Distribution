package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStackSetInput extends StObject {
  
  /**
    * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. By default, SELF is specified. Use SELF for stack sets with self-managed permissions.   If you are signed in to the management account, specify SELF.   If you are signed in to a delegated administrator account, specify DELEGATED_ADMIN. Your Amazon Web Services account must be registered as a delegated administrator in the management account. For more information, see Register a delegated administrator in the CloudFormation User Guide.  
    */
  var CallAs: js.UndefOr[typings.awsSdk.clientsCloudformationMod.CallAs] = js.undefined
  
  /**
    * The name or unique ID of the stack set that you're deleting. You can obtain this value by running ListStackSets.
    */
  var StackSetName: typings.awsSdk.clientsCloudformationMod.StackSetName
}
object DeleteStackSetInput {
  
  inline def apply(StackSetName: StackSetName): DeleteStackSetInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStackSetInput]
  }
  
  extension [Self <: DeleteStackSetInput](x: Self) {
    
    inline def setCallAs(value: CallAs): Self = StObject.set(x, "CallAs", value.asInstanceOf[js.Any])
    
    inline def setCallAsUndefined: Self = StObject.set(x, "CallAs", js.undefined)
    
    inline def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
