package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalRuleOverriddenEventMetadata extends StObject {
  
  /**
    * The status of the override event.
    */
  var overrideStatus: js.UndefOr[OverrideStatus] = js.undefined
  
  /**
    * The revision ID of the pull request when the override event occurred.
    */
  var revisionId: js.UndefOr[RevisionId] = js.undefined
}
object ApprovalRuleOverriddenEventMetadata {
  
  inline def apply(): ApprovalRuleOverriddenEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRuleOverriddenEventMetadata]
  }
  
  extension [Self <: ApprovalRuleOverriddenEventMetadata](x: Self) {
    
    inline def setOverrideStatus(value: OverrideStatus): Self = StObject.set(x, "overrideStatus", value.asInstanceOf[js.Any])
    
    inline def setOverrideStatusUndefined: Self = StObject.set(x, "overrideStatus", js.undefined)
    
    inline def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
