package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStackPolicyInput extends StObject {
  
  /**
    * The name or unique stack ID that you want to associate a policy with.
    */
  var StackName: typings.awsSdk.clientsCloudformationMod.StackName
  
  /**
    * Structure containing the stack policy body. For more information, go to  Prevent updates to stack resources in the CloudFormation User Guide. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
    */
  var StackPolicyBody: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackPolicyBody] = js.undefined
  
  /**
    * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in an Amazon S3 bucket in the same Amazon Web Services Region as the stack. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
    */
  var StackPolicyURL: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackPolicyURL] = js.undefined
}
object SetStackPolicyInput {
  
  inline def apply(StackName: StackName): SetStackPolicyInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStackPolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetStackPolicyInput] (val x: Self) extends AnyVal {
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackPolicyBody(value: StackPolicyBody): Self = StObject.set(x, "StackPolicyBody", value.asInstanceOf[js.Any])
    
    inline def setStackPolicyBodyUndefined: Self = StObject.set(x, "StackPolicyBody", js.undefined)
    
    inline def setStackPolicyURL(value: StackPolicyURL): Self = StObject.set(x, "StackPolicyURL", value.asInstanceOf[js.Any])
    
    inline def setStackPolicyURLUndefined: Self = StObject.set(x, "StackPolicyURL", js.undefined)
  }
}
