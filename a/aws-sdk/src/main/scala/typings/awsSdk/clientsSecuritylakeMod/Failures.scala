package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Failures extends StObject {
  
  /**
    * List of all exception messages.
    */
  var exceptionMessage: SafeString
  
  /**
    * List of all remediation steps for failures.
    */
  var remediation: SafeString
  
  /**
    * This error can occur if you configure the wrong timestamp format, or if the subset of entries used for validation had errors or missing values.
    */
  var timestamp: js.Date
}
object Failures {
  
  inline def apply(exceptionMessage: SafeString, remediation: SafeString, timestamp: js.Date): Failures = {
    val __obj = js.Dynamic.literal(exceptionMessage = exceptionMessage.asInstanceOf[js.Any], remediation = remediation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Failures] (val x: Self) extends AnyVal {
    
    inline def setExceptionMessage(value: SafeString): Self = StObject.set(x, "exceptionMessage", value.asInstanceOf[js.Any])
    
    inline def setRemediation(value: SafeString): Self = StObject.set(x, "remediation", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
