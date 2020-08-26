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
  def ImportUsersJob(id: String, status: JobStatus, `type`: users_import): Job = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  def ExportUsersJob(id: String, status: JobStatus, `type`: users_export): Job = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  def VerificationEmailJob(id: String, status: JobStatus, `type`: verification_email): Job = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}

