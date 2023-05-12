package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataProtectionPolicyRequest extends StObject {
  
  /**
    * The name or ARN of the log group that you want to delete the data protection policy for.
    */
  var logGroupIdentifier: LogGroupIdentifier
}
object DeleteDataProtectionPolicyRequest {
  
  inline def apply(logGroupIdentifier: LogGroupIdentifier): DeleteDataProtectionPolicyRequest = {
    val __obj = js.Dynamic.literal(logGroupIdentifier = logGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataProtectionPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDataProtectionPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setLogGroupIdentifier(value: LogGroupIdentifier): Self = StObject.set(x, "logGroupIdentifier", value.asInstanceOf[js.Any])
  }
}
