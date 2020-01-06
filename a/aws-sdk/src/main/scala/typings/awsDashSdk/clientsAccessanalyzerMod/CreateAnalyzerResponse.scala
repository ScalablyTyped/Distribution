package typings.awsDashSdk.clientsAccessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAnalyzerResponse extends js.Object {
  /**
    * The ARN of the analyzer that was created by the request.
    */
  var arn: js.UndefOr[AnalyzerArn] = js.native
}

object CreateAnalyzerResponse {
  @scala.inline
  def apply(arn: AnalyzerArn = null): CreateAnalyzerResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnalyzerResponse]
  }
}

