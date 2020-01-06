package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConformancePackResponse extends js.Object {
  /**
    * ARN of the conformance pack.
    */
  var ConformancePackArn: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConformancePackArn] = js.native
}

object PutConformancePackResponse {
  @scala.inline
  def apply(ConformancePackArn: ConformancePackArn = null): PutConformancePackResponse = {
    val __obj = js.Dynamic.literal()
    if (ConformancePackArn != null) __obj.updateDynamic("ConformancePackArn")(ConformancePackArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConformancePackResponse]
  }
}

