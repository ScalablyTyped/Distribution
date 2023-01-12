package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointPolicyStatusForObjectLambdaResult extends StObject {
  
  var PolicyStatus: js.UndefOr[typings.awsSdk.clientsS3controlMod.PolicyStatus] = js.undefined
}
object GetAccessPointPolicyStatusForObjectLambdaResult {
  
  inline def apply(): GetAccessPointPolicyStatusForObjectLambdaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointPolicyStatusForObjectLambdaResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAccessPointPolicyStatusForObjectLambdaResult] (val x: Self) extends AnyVal {
    
    inline def setPolicyStatus(value: PolicyStatus): Self = StObject.set(x, "PolicyStatus", value.asInstanceOf[js.Any])
    
    inline def setPolicyStatusUndefined: Self = StObject.set(x, "PolicyStatus", js.undefined)
  }
}
