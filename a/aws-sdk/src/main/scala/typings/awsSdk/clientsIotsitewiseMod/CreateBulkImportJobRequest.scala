package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBulkImportJobRequest extends StObject {
  
  /**
    * The Amazon S3 destination where errors associated with the job creation request are saved.
    */
  var errorReportLocation: ErrorReportLocation
  
  /**
    * The files in the specified Amazon S3 bucket that contain your data.
    */
  var files: Files
  
  /**
    * Contains the configuration information of a job, such as the file format used to save data in Amazon S3.
    */
  var jobConfiguration: JobConfiguration
  
  /**
    * The unique name that helps identify the job request.
    */
  var jobName: Name
  
  /**
    * The ARN of the IAM role that allows IoT SiteWise to read Amazon S3 data.
    */
  var jobRoleArn: ARN
}
object CreateBulkImportJobRequest {
  
  inline def apply(
    errorReportLocation: ErrorReportLocation,
    files: Files,
    jobConfiguration: JobConfiguration,
    jobName: Name,
    jobRoleArn: ARN
  ): CreateBulkImportJobRequest = {
    val __obj = js.Dynamic.literal(errorReportLocation = errorReportLocation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], jobConfiguration = jobConfiguration.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobRoleArn = jobRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBulkImportJobRequest]
  }
  
  extension [Self <: CreateBulkImportJobRequest](x: Self) {
    
    inline def setErrorReportLocation(value: ErrorReportLocation): Self = StObject.set(x, "errorReportLocation", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setJobConfiguration(value: JobConfiguration): Self = StObject.set(x, "jobConfiguration", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: Name): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobRoleArn(value: ARN): Self = StObject.set(x, "jobRoleArn", value.asInstanceOf[js.Any])
  }
}
