package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTerminationProtectionInput extends StObject {
  
  /**
    * Whether to enable termination protection on the specified stack.
    */
  var EnableTerminationProtection: typings.awsSdk.clientsCloudformationMod.EnableTerminationProtection
  
  /**
    * The name or unique ID of the stack for which you want to set termination protection.
    */
  var StackName: StackNameOrId
}
object UpdateTerminationProtectionInput {
  
  inline def apply(EnableTerminationProtection: EnableTerminationProtection, StackName: StackNameOrId): UpdateTerminationProtectionInput = {
    val __obj = js.Dynamic.literal(EnableTerminationProtection = EnableTerminationProtection.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTerminationProtectionInput]
  }
  
  extension [Self <: UpdateTerminationProtectionInput](x: Self) {
    
    inline def setEnableTerminationProtection(value: EnableTerminationProtection): Self = StObject.set(x, "EnableTerminationProtection", value.asInstanceOf[js.Any])
    
    inline def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
  }
}
