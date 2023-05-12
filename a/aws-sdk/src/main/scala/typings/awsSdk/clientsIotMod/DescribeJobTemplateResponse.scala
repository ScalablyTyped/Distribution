package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobTemplateResponse extends StObject {
  
  var abortConfig: js.UndefOr[AbortConfig] = js.undefined
  
  /**
    * The time, in seconds since the epoch, when the job template was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the job template.
    */
  var description: js.UndefOr[JobDescription] = js.undefined
  
  /**
    * The job document.
    */
  var document: js.UndefOr[JobDocument] = js.undefined
  
  /**
    * An S3 link to the job document.
    */
  var documentSource: js.UndefOr[JobDocumentSource] = js.undefined
  
  /**
    * The configuration that determines how many retries are allowed for each failure type for a job.
    */
  var jobExecutionsRetryConfig: js.UndefOr[JobExecutionsRetryConfig] = js.undefined
  
  var jobExecutionsRolloutConfig: js.UndefOr[JobExecutionsRolloutConfig] = js.undefined
  
  /**
    * The ARN of the job template.
    */
  var jobTemplateArn: js.UndefOr[JobTemplateArn] = js.undefined
  
  /**
    * The unique identifier of the job template.
    */
  var jobTemplateId: js.UndefOr[JobTemplateId] = js.undefined
  
  /**
    * Allows you to configure an optional maintenance window for the rollout of a job document to all devices in the target group for a job.
    */
  var maintenanceWindows: js.UndefOr[MaintenanceWindows] = js.undefined
  
  var presignedUrlConfig: js.UndefOr[PresignedUrlConfig] = js.undefined
  
  var timeoutConfig: js.UndefOr[TimeoutConfig] = js.undefined
}
object DescribeJobTemplateResponse {
  
  inline def apply(): DescribeJobTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeJobTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setAbortConfig(value: AbortConfig): Self = StObject.set(x, "abortConfig", value.asInstanceOf[js.Any])
    
    inline def setAbortConfigUndefined: Self = StObject.set(x, "abortConfig", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDescription(value: JobDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDocument(value: JobDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentSource(value: JobDocumentSource): Self = StObject.set(x, "documentSource", value.asInstanceOf[js.Any])
    
    inline def setDocumentSourceUndefined: Self = StObject.set(x, "documentSource", js.undefined)
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setJobExecutionsRetryConfig(value: JobExecutionsRetryConfig): Self = StObject.set(x, "jobExecutionsRetryConfig", value.asInstanceOf[js.Any])
    
    inline def setJobExecutionsRetryConfigUndefined: Self = StObject.set(x, "jobExecutionsRetryConfig", js.undefined)
    
    inline def setJobExecutionsRolloutConfig(value: JobExecutionsRolloutConfig): Self = StObject.set(x, "jobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    
    inline def setJobExecutionsRolloutConfigUndefined: Self = StObject.set(x, "jobExecutionsRolloutConfig", js.undefined)
    
    inline def setJobTemplateArn(value: JobTemplateArn): Self = StObject.set(x, "jobTemplateArn", value.asInstanceOf[js.Any])
    
    inline def setJobTemplateArnUndefined: Self = StObject.set(x, "jobTemplateArn", js.undefined)
    
    inline def setJobTemplateId(value: JobTemplateId): Self = StObject.set(x, "jobTemplateId", value.asInstanceOf[js.Any])
    
    inline def setJobTemplateIdUndefined: Self = StObject.set(x, "jobTemplateId", js.undefined)
    
    inline def setMaintenanceWindows(value: MaintenanceWindows): Self = StObject.set(x, "maintenanceWindows", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceWindowsUndefined: Self = StObject.set(x, "maintenanceWindows", js.undefined)
    
    inline def setMaintenanceWindowsVarargs(value: MaintenanceWindow*): Self = StObject.set(x, "maintenanceWindows", js.Array(value*))
    
    inline def setPresignedUrlConfig(value: PresignedUrlConfig): Self = StObject.set(x, "presignedUrlConfig", value.asInstanceOf[js.Any])
    
    inline def setPresignedUrlConfigUndefined: Self = StObject.set(x, "presignedUrlConfig", js.undefined)
    
    inline def setTimeoutConfig(value: TimeoutConfig): Self = StObject.set(x, "timeoutConfig", value.asInstanceOf[js.Any])
    
    inline def setTimeoutConfigUndefined: Self = StObject.set(x, "timeoutConfig", js.undefined)
  }
}
