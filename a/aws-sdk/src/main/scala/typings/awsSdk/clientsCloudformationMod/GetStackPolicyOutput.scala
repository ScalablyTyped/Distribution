package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStackPolicyOutput extends StObject {
  
  /**
    * Structure containing the stack policy body. (For more information, go to  Prevent Updates to Stack Resources in the CloudFormation User Guide.)
    */
  var StackPolicyBody: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackPolicyBody] = js.undefined
}
object GetStackPolicyOutput {
  
  inline def apply(): GetStackPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStackPolicyOutput]
  }
  
  extension [Self <: GetStackPolicyOutput](x: Self) {
    
    inline def setStackPolicyBody(value: StackPolicyBody): Self = StObject.set(x, "StackPolicyBody", value.asInstanceOf[js.Any])
    
    inline def setStackPolicyBodyUndefined: Self = StObject.set(x, "StackPolicyBody", js.undefined)
  }
}
