package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUsageReportSubscriptionResult extends StObject {
  
  /**
    * The Amazon S3 bucket where generated reports are stored. If you enabled on-instance session scripts and Amazon S3 logging for your session script configuration, AppStream 2.0 created an S3 bucket to store the script output. The bucket is unique to your account and Region. When you enable usage reporting in this case, AppStream 2.0 uses the same bucket to store your usage reports. If you haven't already enabled on-instance session scripts, when you enable usage reports, AppStream 2.0 creates a new S3 bucket.
    */
  var S3BucketName: js.UndefOr[String] = js.native
  
  /**
    * The schedule for generating usage reports.
    */
  var Schedule: js.UndefOr[UsageReportSchedule] = js.native
}
object CreateUsageReportSubscriptionResult {
  
  @scala.inline
  def apply(): CreateUsageReportSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUsageReportSubscriptionResult]
  }
  
  @scala.inline
  implicit class CreateUsageReportSubscriptionResultMutableBuilder[Self <: CreateUsageReportSubscriptionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    @scala.inline
    def setSchedule(value: UsageReportSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
  }
}
