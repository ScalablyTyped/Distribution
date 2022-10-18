package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamGroupPolicy extends StObject {
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsIamGroupPolicy {
  
  inline def apply(): AwsIamGroupPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamGroupPolicy]
  }
  
  extension [Self <: AwsIamGroupPolicy](x: Self) {
    
    inline def setPolicyName(value: NonEmptyString): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
