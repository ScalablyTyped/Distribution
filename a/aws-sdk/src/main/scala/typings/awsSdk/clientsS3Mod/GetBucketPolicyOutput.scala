package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketPolicyOutput extends StObject {
  
  /**
    * The bucket policy as a JSON document.
    */
  var Policy: js.UndefOr[typings.awsSdk.clientsS3Mod.Policy] = js.undefined
}
object GetBucketPolicyOutput {
  
  inline def apply(): GetBucketPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketPolicyOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketPolicyOutput] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
