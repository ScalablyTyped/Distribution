package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.auth0.mod.ImportUsersJob
  - typings.auth0.mod.ExportUsersJob
  - typings.auth0.mod.VerificationEmailJob
*/
trait Job extends StObject
object Job {
  
  inline def ExportUsersJob(id: String, status: JobStatus): typings.auth0.mod.ExportUsersJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("users_export")
    __obj.asInstanceOf[typings.auth0.mod.ExportUsersJob]
  }
  
  inline def ImportUsersJob(id: String, status: JobStatus): typings.auth0.mod.ImportUsersJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("users_import")
    __obj.asInstanceOf[typings.auth0.mod.ImportUsersJob]
  }
  
  inline def VerificationEmailJob(id: String, status: JobStatus): typings.auth0.mod.VerificationEmailJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("verification_email")
    __obj.asInstanceOf[typings.auth0.mod.VerificationEmailJob]
  }
}
