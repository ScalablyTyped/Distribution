package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamRolePolicy extends StObject {
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsIamRolePolicy {
  
  inline def apply(): AwsIamRolePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamRolePolicy]
  }
  
  extension [Self <: AwsIamRolePolicy](x: Self) {
    
    inline def setPolicyName(value: NonEmptyString): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
