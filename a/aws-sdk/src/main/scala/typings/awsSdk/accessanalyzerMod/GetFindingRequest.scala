package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingRequest extends js.Object {
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
}

