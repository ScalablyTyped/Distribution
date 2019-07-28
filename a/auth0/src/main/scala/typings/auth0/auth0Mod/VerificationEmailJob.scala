package typings.auth0.auth0Mod

import typings.auth0.auth0Strings.verification_email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationEmailJob extends Job {
  var created_at: js.UndefOr[String] = js.undefined
  var id: String
  var status: JobStatus
  var `type`: verification_email
}

object VerificationEmailJob {
  @scala.inline
  def apply(id: String, status: JobStatus, `type`: verification_email, created_at: String = null): VerificationEmailJob = {
    val __obj = js.Dynamic.literal(id = id, status = status)
    __obj.updateDynamic("type")(`type`)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    __obj.asInstanceOf[VerificationEmailJob]
  }
}

