package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFindingsRequest extends StObject {
  
  /**
    * The ARN of the analyzer that generated the findings to update.
    */
  var analyzerArn: AnalyzerArn
  
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the findings to update.
    */
  var ids: js.UndefOr[FindingIdList] = js.undefined
  
  /**
    * The ARN of the resource identified in the finding.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The state represents the action to take to update the finding Status. Use ARCHIVE to change an Active finding to an Archived finding. Use ACTIVE to change an Archived finding to an Active finding.
    */
  var status: FindingStatusUpdate
}
object UpdateFindingsRequest {
  
  @scala.inline
  def apply(analyzerArn: AnalyzerArn, status: FindingStatusUpdate): UpdateFindingsRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsRequest]
  }
  
  @scala.inline
  implicit class UpdateFindingsRequestMutableBuilder[Self <: UpdateFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setIds(value: FindingIdList): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: FindingId*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    @scala.inline
    def setStatus(value: FindingStatusUpdate): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
