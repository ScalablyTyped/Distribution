package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamUserPolicy extends StObject {
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsIamUserPolicy {
  
  inline def apply(): AwsIamUserPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamUserPolicy]
  }
  
  extension [Self <: AwsIamUserPolicy](x: Self) {
    
    inline def setPolicyName(value: NonEmptyString): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
