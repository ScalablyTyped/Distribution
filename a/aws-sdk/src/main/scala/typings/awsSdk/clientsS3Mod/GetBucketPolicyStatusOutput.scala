package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketPolicyStatusOutput extends StObject {
  
  /**
    * The policy status for the specified bucket.
    */
  var PolicyStatus: js.UndefOr[typings.awsSdk.clientsS3Mod.PolicyStatus] = js.undefined
}
object GetBucketPolicyStatusOutput {
  
  inline def apply(): GetBucketPolicyStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketPolicyStatusOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketPolicyStatusOutput] (val x: Self) extends AnyVal {
    
    inline def setPolicyStatus(value: PolicyStatus): Self = StObject.set(x, "PolicyStatus", value.asInstanceOf[js.Any])
    
    inline def setPolicyStatusUndefined: Self = StObject.set(x, "PolicyStatus", js.undefined)
  }
}
