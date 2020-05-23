package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingSourceDetail extends js.Object {
  /**
    * The ARN of the access point that generated the finding.
    */
  var accessPointArn: js.UndefOr[String] = js.native
}

object FindingSourceDetail {
  @scala.inline
  def apply(accessPointArn: String = null): FindingSourceDetail = {
    val __obj = js.Dynamic.literal()
    if (accessPointArn != null) __obj.updateDynamic("accessPointArn")(accessPointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingSourceDetail]
  }
}

