package typings.auth0.mod

import typings.auth0.auth0Strings.verification_email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerificationEmailJob extends Job {
  var created_at: js.UndefOr[String] = js.native
  var id: String = js.native
  var status: JobStatus = js.native
  var `type`: verification_email = js.native
}

object VerificationEmailJob {
  @scala.inline
  def apply(id: String, status: JobStatus, `type`: verification_email): VerificationEmailJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationEmailJob]
  }
  @scala.inline
  implicit class VerificationEmailJobOps[Self <: VerificationEmailJob] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: verification_email): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: String): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
  }
  
}

