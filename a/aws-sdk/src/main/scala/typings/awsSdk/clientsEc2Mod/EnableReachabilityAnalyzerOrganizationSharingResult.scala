package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableReachabilityAnalyzerOrganizationSharingResult extends StObject {
  
  /**
    * Returns true if the request succeeds; otherwise, returns an error.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.undefined
}
object EnableReachabilityAnalyzerOrganizationSharingResult {
  
  inline def apply(): EnableReachabilityAnalyzerOrganizationSharingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableReachabilityAnalyzerOrganizationSharingResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableReachabilityAnalyzerOrganizationSharingResult] (val x: Self) extends AnyVal {
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "ReturnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "ReturnValue", js.undefined)
  }
}
