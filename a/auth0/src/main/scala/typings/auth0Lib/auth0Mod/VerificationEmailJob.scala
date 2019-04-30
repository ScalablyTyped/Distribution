package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerificationEmailJob extends Job {
  var created_at: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var status: JobStatus
  var `type`: auth0Lib.auth0LibStrings.verification_email
}

object VerificationEmailJob {
  @scala.inline
  def apply(
    id: java.lang.String,
    status: JobStatus,
    `type`: auth0Lib.auth0LibStrings.verification_email,
    created_at: java.lang.String = null
  ): VerificationEmailJob = {
    val __obj = js.Dynamic.literal(id = id, status = status)
    __obj.updateDynamic("type")(`type`)
    if (created_at != null) __obj.updateDynamic("created_at")(created_at)
    __obj.asInstanceOf[VerificationEmailJob]
  }
}

