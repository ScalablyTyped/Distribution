package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartResourceScanRequest extends js.Object {
  /**
    * The ARN of the analyzer to use to scan the policies applied to the specified resource.
    */
  var analyzerArn: AnalyzerArn = js.native
  /**
    * The ARN of the resource to scan.
    */
  var resourceArn: ResourceArn = js.native
}

object StartResourceScanRequest {
  @scala.inline
  def apply(analyzerArn: AnalyzerArn, resourceArn: ResourceArn): StartResourceScanRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartResourceScanRequest]
  }
}

