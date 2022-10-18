package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedPolicyResult extends StObject {
  
  /**
    * The text to use as the content for the new policy. The policy is created using the CreatePolicy action.
    */
  var generatedPolicies: js.UndefOr[GeneratedPolicyList] = js.undefined
  
  /**
    * A GeneratedPolicyProperties object that contains properties of the generated policy.
    */
  var properties: GeneratedPolicyProperties
}
object GeneratedPolicyResult {
  
  inline def apply(properties: GeneratedPolicyProperties): GeneratedPolicyResult = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneratedPolicyResult]
  }
  
  extension [Self <: GeneratedPolicyResult](x: Self) {
    
    inline def setGeneratedPolicies(value: GeneratedPolicyList): Self = StObject.set(x, "generatedPolicies", value.asInstanceOf[js.Any])
    
    inline def setGeneratedPoliciesUndefined: Self = StObject.set(x, "generatedPolicies", js.undefined)
    
    inline def setGeneratedPoliciesVarargs(value: GeneratedPolicy*): Self = StObject.set(x, "generatedPolicies", js.Array(value*))
    
    inline def setProperties(value: GeneratedPolicyProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
