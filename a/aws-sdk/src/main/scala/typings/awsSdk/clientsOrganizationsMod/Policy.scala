package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Policy extends StObject {
  
  /**
    * The text content of the policy.
    */
  var Content: js.UndefOr[PolicyContent] = js.undefined
  
  /**
    * A structure that contains additional details about the policy.
    */
  var PolicySummary: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.PolicySummary] = js.undefined
}
object Policy {
  
  inline def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  
  extension [Self <: Policy](x: Self) {
    
    inline def setContent(value: PolicyContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setPolicySummary(value: PolicySummary): Self = StObject.set(x, "PolicySummary", value.asInstanceOf[js.Any])
    
    inline def setPolicySummaryUndefined: Self = StObject.set(x, "PolicySummary", js.undefined)
  }
}
