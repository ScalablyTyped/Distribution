package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataProtectionPolicyRequest extends StObject {
  
  /**
    * The name or ARN of the log group that contains the data protection policy that you want to see.
    */
  var logGroupIdentifier: LogGroupIdentifier
}
object GetDataProtectionPolicyRequest {
  
  inline def apply(logGroupIdentifier: LogGroupIdentifier): GetDataProtectionPolicyRequest = {
    val __obj = js.Dynamic.literal(logGroupIdentifier = logGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataProtectionPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataProtectionPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setLogGroupIdentifier(value: LogGroupIdentifier): Self = StObject.set(x, "logGroupIdentifier", value.asInstanceOf[js.Any])
  }
}
