package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamAttachedManagedPolicy extends StObject {
  
  /**
    * The ARN of the policy.
    */
  var PolicyArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsIamAttachedManagedPolicy {
  
  inline def apply(): AwsIamAttachedManagedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamAttachedManagedPolicy]
  }
  
  extension [Self <: AwsIamAttachedManagedPolicy](x: Self) {
    
    inline def setPolicyArn(value: NonEmptyString): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
    
    inline def setPolicyName(value: NonEmptyString): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
