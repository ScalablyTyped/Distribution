package typings.auth0.mod

import typings.auth0.auth0Strings.verification_email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationEmailJob
  extends StObject
     with Job {
  
  var created_at: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var status: JobStatus
  
  var `type`: verification_email
}
object VerificationEmailJob {
  
  @scala.inline
  def apply(id: String, status: JobStatus): VerificationEmailJob = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("verification_email")
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
