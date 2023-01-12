package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPausedDetails extends StObject {
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the job or job run will expire and be cancelled if you don't resume it first.
    */
  var jobExpiresAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Health event that Amazon Macie sent to notify you of the job or job run's pending expiration and cancellation. This value is null if a job has been paused for less than 23 days.
    */
  var jobImminentExpirationHealthEventArn: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when you paused the job.
    */
  var jobPausedAt: js.UndefOr[js.Date] = js.undefined
}
object UserPausedDetails {
  
  inline def apply(): UserPausedDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPausedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserPausedDetails] (val x: Self) extends AnyVal {
    
    inline def setJobExpiresAt(value: js.Date): Self = StObject.set(x, "jobExpiresAt", value.asInstanceOf[js.Any])
    
    inline def setJobExpiresAtUndefined: Self = StObject.set(x, "jobExpiresAt", js.undefined)
    
    inline def setJobImminentExpirationHealthEventArn(value: string): Self = StObject.set(x, "jobImminentExpirationHealthEventArn", value.asInstanceOf[js.Any])
    
    inline def setJobImminentExpirationHealthEventArnUndefined: Self = StObject.set(x, "jobImminentExpirationHealthEventArn", js.undefined)
    
    inline def setJobPausedAt(value: js.Date): Self = StObject.set(x, "jobPausedAt", value.asInstanceOf[js.Any])
    
    inline def setJobPausedAtUndefined: Self = StObject.set(x, "jobPausedAt", js.undefined)
  }
}
