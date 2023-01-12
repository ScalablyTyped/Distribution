package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshTrustedAdvisorCheckResponse extends StObject {
  
  /**
    * The current refresh status for a check, including the amount of time until the check is eligible for refresh.
    */
  var status: TrustedAdvisorCheckRefreshStatus
}
object RefreshTrustedAdvisorCheckResponse {
  
  inline def apply(status: TrustedAdvisorCheckRefreshStatus): RefreshTrustedAdvisorCheckResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshTrustedAdvisorCheckResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshTrustedAdvisorCheckResponse] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: TrustedAdvisorCheckRefreshStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
