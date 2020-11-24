package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageReportSubscription extends js.Object {
  
  /**
    * The time when the last usage report was generated.
    */
  var LastGeneratedReportDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon S3 bucket where generated reports are stored. If you enabled on-instance session scripts and Amazon S3 logging for your session script configuration, AppStream 2.0 created an S3 bucket to store the script output. The bucket is unique to your account and Region. When you enable usage reporting in this case, AppStream 2.0 uses the same bucket to store your usage reports. If you haven't already enabled on-instance session scripts, when you enable usage reports, AppStream 2.0 creates a new S3 bucket.
    */
  var S3BucketName: js.UndefOr[String] = js.native
  
  /**
    * The schedule for generating usage reports.
    */
  var Schedule: js.UndefOr[UsageReportSchedule] = js.native
  
  /**
    * The errors that were returned if usage reports couldn't be generated.
    */
  var SubscriptionErrors: js.UndefOr[LastReportGenerationExecutionErrors] = js.native
}
object UsageReportSubscription {
  
  @scala.inline
  def apply(): UsageReportSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageReportSubscription]
  }
  
  @scala.inline
  implicit class UsageReportSubscriptionOps[Self <: UsageReportSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLastGeneratedReportDate(value: Timestamp): Self = this.set("LastGeneratedReportDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastGeneratedReportDate: Self = this.set("LastGeneratedReportDate", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: String): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketName: Self = this.set("S3BucketName", js.undefined)
    
    @scala.inline
    def setSchedule(value: UsageReportSchedule): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    
    @scala.inline
    def setSubscriptionErrorsVarargs(value: LastReportGenerationExecutionError*): Self = this.set("SubscriptionErrors", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptionErrors(value: LastReportGenerationExecutionErrors): Self = this.set("SubscriptionErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionErrors: Self = this.set("SubscriptionErrors", js.undefined)
  }
}
