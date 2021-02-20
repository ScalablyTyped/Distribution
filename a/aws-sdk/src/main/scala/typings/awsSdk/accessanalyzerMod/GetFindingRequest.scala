package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingRequest extends StObject {
  
  /**
    * The ARN of the analyzer that generated the finding.
    */
  var analyzerArn: AnalyzerArn = js.native
  
  /**
    * The ID of the finding to retrieve.
    */
  var id: FindingId = js.native
}
object GetFindingRequest {
  
  @scala.inline
  def apply(analyzerArn: AnalyzerArn, id: FindingId): GetFindingRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingRequest]
  }
  
  @scala.inline
  implicit class GetFindingRequestMutableBuilder[Self <: GetFindingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: FindingId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
