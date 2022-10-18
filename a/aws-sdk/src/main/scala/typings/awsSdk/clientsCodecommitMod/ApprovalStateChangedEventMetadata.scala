package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalStateChangedEventMetadata extends StObject {
  
  /**
    * The approval status for the pull request.
    */
  var approvalStatus: js.UndefOr[ApprovalState] = js.undefined
  
  /**
    * The revision ID of the pull request when the approval state changed.
    */
  var revisionId: js.UndefOr[RevisionId] = js.undefined
}
object ApprovalStateChangedEventMetadata {
  
  inline def apply(): ApprovalStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalStateChangedEventMetadata]
  }
  
  extension [Self <: ApprovalStateChangedEventMetadata](x: Self) {
    
    inline def setApprovalStatus(value: ApprovalState): Self = StObject.set(x, "approvalStatus", value.asInstanceOf[js.Any])
    
    inline def setApprovalStatusUndefined: Self = StObject.set(x, "approvalStatus", js.undefined)
    
    inline def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
