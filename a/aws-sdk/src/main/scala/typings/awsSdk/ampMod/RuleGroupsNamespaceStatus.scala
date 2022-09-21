package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupsNamespaceStatus extends StObject {
  
  /**
    * Status code of this namespace.
    */
  var statusCode: RuleGroupsNamespaceStatusCode
  
  /**
    * The reason for failure if any.
    */
  var statusReason: js.UndefOr[String] = js.undefined
}
object RuleGroupsNamespaceStatus {
  
  inline def apply(statusCode: RuleGroupsNamespaceStatusCode): RuleGroupsNamespaceStatus = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupsNamespaceStatus]
  }
  
  extension [Self <: RuleGroupsNamespaceStatus](x: Self) {
    
    inline def setStatusCode(value: RuleGroupsNamespaceStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
  }
}
