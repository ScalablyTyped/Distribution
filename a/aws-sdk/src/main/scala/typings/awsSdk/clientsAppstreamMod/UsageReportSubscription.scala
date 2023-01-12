package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageReportSubscription extends StObject {
  
  /**
    * The time when the last usage report was generated.
    */
  var LastGeneratedReportDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon S3 bucket where generated reports are stored. If you enabled on-instance session scripts and Amazon S3 logging for your session script configuration, AppStream 2.0 created an S3 bucket to store the script output. The bucket is unique to your account and Region. When you enable usage reporting in this case, AppStream 2.0 uses the same bucket to store your usage reports. If you haven't already enabled on-instance session scripts, when you enable usage reports, AppStream 2.0 creates a new S3 bucket.
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The schedule for generating usage reports.
    */
  var Schedule: js.UndefOr[UsageReportSchedule] = js.undefined
  
  /**
    * The errors that were returned if usage reports couldn't be generated.
    */
  var SubscriptionErrors: js.UndefOr[LastReportGenerationExecutionErrors] = js.undefined
}
object UsageReportSubscription {
  
  inline def apply(): UsageReportSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageReportSubscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsageReportSubscription] (val x: Self) extends AnyVal {
    
    inline def setLastGeneratedReportDate(value: js.Date): Self = StObject.set(x, "LastGeneratedReportDate", value.asInstanceOf[js.Any])
    
    inline def setLastGeneratedReportDateUndefined: Self = StObject.set(x, "LastGeneratedReportDate", js.undefined)
    
    inline def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setSchedule(value: UsageReportSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setSubscriptionErrors(value: LastReportGenerationExecutionErrors): Self = StObject.set(x, "SubscriptionErrors", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionErrorsUndefined: Self = StObject.set(x, "SubscriptionErrors", js.undefined)
    
    inline def setSubscriptionErrorsVarargs(value: LastReportGenerationExecutionError*): Self = StObject.set(x, "SubscriptionErrors", js.Array(value*))
  }
}
