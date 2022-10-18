package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackageImportJobResponse extends StObject {
  
  /**
    * The job's client token.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsPanoramaMod.ClientToken] = js.undefined
  
  /**
    * When the job was created.
    */
  var CreatedTime: js.Date
  
  /**
    * The job's input config.
    */
  var InputConfig: PackageImportJobInputConfig
  
  /**
    * The job's ID.
    */
  var JobId: typings.awsSdk.clientsPanoramaMod.JobId
  
  /**
    * The job's tags.
    */
  var JobTags: js.UndefOr[JobTagsList] = js.undefined
  
  /**
    * The job's type.
    */
  var JobType: PackageImportJobType
  
  /**
    * When the job was updated.
    */
  var LastUpdatedTime: js.Date
  
  /**
    * The job's output.
    */
  var Output: PackageImportJobOutput
  
  /**
    * The job's output config.
    */
  var OutputConfig: PackageImportJobOutputConfig
  
  /**
    * The job's status.
    */
  var Status: PackageImportJobStatus
  
  /**
    * The job's status message.
    */
  var StatusMessage: PackageImportJobStatusMessage
}
object DescribePackageImportJobResponse {
  
  inline def apply(
    CreatedTime: js.Date,
    InputConfig: PackageImportJobInputConfig,
    JobId: JobId,
    JobType: PackageImportJobType,
    LastUpdatedTime: js.Date,
    Output: PackageImportJobOutput,
    OutputConfig: PackageImportJobOutputConfig,
    Status: PackageImportJobStatus,
    StatusMessage: PackageImportJobStatusMessage
  ): DescribePackageImportJobResponse = {
    val __obj = js.Dynamic.literal(CreatedTime = CreatedTime.asInstanceOf[js.Any], InputConfig = InputConfig.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any], LastUpdatedTime = LastUpdatedTime.asInstanceOf[js.Any], Output = Output.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StatusMessage = StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackageImportJobResponse]
  }
  
  extension [Self <: DescribePackageImportJobResponse](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setInputConfig(value: PackageImportJobInputConfig): Self = StObject.set(x, "InputConfig", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobTags(value: JobTagsList): Self = StObject.set(x, "JobTags", value.asInstanceOf[js.Any])
    
    inline def setJobTagsUndefined: Self = StObject.set(x, "JobTags", js.undefined)
    
    inline def setJobTagsVarargs(value: JobResourceTags*): Self = StObject.set(x, "JobTags", js.Array(value*))
    
    inline def setJobType(value: PackageImportJobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: PackageImportJobOutput): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: PackageImportJobOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PackageImportJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: PackageImportJobStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
  }
}
