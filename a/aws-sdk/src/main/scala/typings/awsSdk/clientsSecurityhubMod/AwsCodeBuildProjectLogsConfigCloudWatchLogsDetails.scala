package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails extends StObject {
  
  /**
    * The group name of the logs in CloudWatch Logs.
    */
  var GroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current status of the logs in CloudWatch Logs for a build project.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The prefix of the stream name of the CloudWatch Logs.
    */
  var StreamName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails {
  
  inline def apply(): AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCodeBuildProjectLogsConfigCloudWatchLogsDetails] (val x: Self) extends AnyVal {
    
    inline def setGroupName(value: NonEmptyString): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStreamName(value: NonEmptyString): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
