package typings.auth0.mod

import typings.auth0.auth0Strings.verification_email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class VerificationEmailJobMutableBuilder[Self <: VerificationEmailJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: verification_email): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
