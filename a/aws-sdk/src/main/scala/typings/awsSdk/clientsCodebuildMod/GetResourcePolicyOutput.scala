package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePolicyOutput extends StObject {
  
  /**
    *  The resource policy for the resource identified by the input ARN parameter. 
    */
  var policy: js.UndefOr[NonEmptyString] = js.undefined
}
object GetResourcePolicyOutput {
  
  inline def apply(): GetResourcePolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyOutput]
  }
  
  extension [Self <: GetResourcePolicyOutput](x: Self) {
    
    inline def setPolicy(value: NonEmptyString): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
