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
  def apply(): FindingSourceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingSourceDetail]
  }
  @scala.inline
  implicit class FindingSourceDetailOps[Self <: FindingSourceDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessPointArn(value: String): Self = this.set("accessPointArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessPointArn: Self = this.set("accessPointArn", js.undefined)
  }
  
}

