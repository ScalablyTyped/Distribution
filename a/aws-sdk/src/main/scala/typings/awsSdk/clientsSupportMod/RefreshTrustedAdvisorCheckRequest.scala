package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshTrustedAdvisorCheckRequest extends StObject {
  
  /**
    * The unique identifier for the Trusted Advisor check to refresh.  Specifying the check ID of a check that is automatically refreshed causes an InvalidParameterValue error. 
    */
  var checkId: String
}
object RefreshTrustedAdvisorCheckRequest {
  
  inline def apply(checkId: String): RefreshTrustedAdvisorCheckRequest = {
    val __obj = js.Dynamic.literal(checkId = checkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTrustedAdvisorCheckRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshTrustedAdvisorCheckRequest] (val x: Self) extends AnyVal {
    
    inline def setCheckId(value: String): Self = StObject.set(x, "checkId", value.asInstanceOf[js.Any])
  }
}
