package typings.awsLambda.cloudfrontRequestMod

import typings.awsLambda.anon.Cf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontRequestEvent extends js.Object {
  var Records: js.Array[Cf] = js.native
}

object CloudFrontRequestEvent {
  @scala.inline
  def apply(Records: js.Array[Cf]): CloudFrontRequestEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontRequestEvent]
  }
  @scala.inline
  implicit class CloudFrontRequestEventOps[Self <: CloudFrontRequestEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRecordsVarargs(value: Cf*): Self = this.set("Records", js.Array(value :_*))
    @scala.inline
    def setRecords(value: js.Array[Cf]): Self = this.set("Records", value.asInstanceOf[js.Any])
  }
  
}

