package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCodeBuildProjectLogsConfigDetails extends StObject {
  
  /**
    * Information about CloudWatch Logs for the build project.
    */
  var CloudWatchLogs: js.UndefOr[AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails] = js.undefined
  
  /**
    * Information about logs built to an S3 bucket for a build project.
    */
  var S3Logs: js.UndefOr[AwsCodeBuildProjectLogsConfigS3LogsDetails] = js.undefined
}
object AwsCodeBuildProjectLogsConfigDetails {
  
  inline def apply(): AwsCodeBuildProjectLogsConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectLogsConfigDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCodeBuildProjectLogsConfigDetails] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogs(value: AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails): Self = StObject.set(x, "CloudWatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsUndefined: Self = StObject.set(x, "CloudWatchLogs", js.undefined)
    
    inline def setS3Logs(value: AwsCodeBuildProjectLogsConfigS3LogsDetails): Self = StObject.set(x, "S3Logs", value.asInstanceOf[js.Any])
    
    inline def setS3LogsUndefined: Self = StObject.set(x, "S3Logs", js.undefined)
  }
}
