package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAnalyzedResourceRequest extends js.Object {
  /**
    * The ARN of the analyzer to retrieve information from.
    */
  var analyzerArn: AnalyzerArn = js.native
  /**
    * The ARN of the resource to retrieve information about.
    */
  var resourceArn: ResourceArn = js.native
}

object GetAnalyzedResourceRequest {
  @scala.inline
  def apply(analyzerArn: AnalyzerArn, resourceArn: ResourceArn): GetAnalyzedResourceRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnalyzedResourceRequest]
  }
}

