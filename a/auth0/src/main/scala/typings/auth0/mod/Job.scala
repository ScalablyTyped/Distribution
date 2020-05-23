package typings.auth0.mod

import typings.auth0.auth0Strings.users_export
import typings.auth0.auth0Strings.users_import
import typings.auth0.auth0Strings.verification_email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.auth0.mod.ImportUsersJob
  - typings.auth0.mod.ExportUsersJob
  - typings.auth0.mod.VerificationEmailJob
*/
trait Job extends js.Object

object Job {
  @scala.inline
  def ImportUsersJob(
    id: String,
    status: JobStatus,
    `type`: users_import,
    connection_id: String = null,
    created_at: String = null,
    external_id: String = null,
    send_completion_email: js.UndefOr[Boolean] = js.undefined,
    upsert: js.UndefOr[Boolean] = js.undefined
  ): Job = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (external_id != null) __obj.updateDynamic("external_id")(external_id.asInstanceOf[js.Any])
    if (!js.isUndefined(send_completion_email)) __obj.updateDynamic("send_completion_email")(send_completion_email.get.asInstanceOf[js.Any])
    if (!js.isUndefined(upsert)) __obj.updateDynamic("upsert")(upsert.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  def ExportUsersJob(
    id: String,
    status: JobStatus,
    `type`: users_export,
    connection_id: String = null,
    created_at: String = null,
    fields: js.Array[ExportUserField] = null,
    format: JobFormat = null,
    location: String = null
  ): Job = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (connection_id != null) __obj.updateDynamic("connection_id")(connection_id.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  def VerificationEmailJob(id: String, status: JobStatus, `type`: verification_email, created_at: String = null): Job = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}

