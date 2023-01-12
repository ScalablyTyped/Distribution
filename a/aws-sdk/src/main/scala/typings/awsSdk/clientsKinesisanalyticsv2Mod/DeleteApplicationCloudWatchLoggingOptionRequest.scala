package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationCloudWatchLoggingOptionRequest extends StObject {
  
  /**
    * The application name.
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * The CloudWatchLoggingOptionId of the Amazon CloudWatch logging option to delete. You can get the CloudWatchLoggingOptionId by using the DescribeApplication operation. 
    */
  var CloudWatchLoggingOptionId: Id
  
  /**
    * A value you use to implement strong concurrency for application updates. You must provide the CurrentApplicationVersionId or the ConditionalToken. You get the application's current ConditionalToken using DescribeApplication. For better concurrency support, use the ConditionalToken parameter instead of CurrentApplicationVersionId.
    */
  var ConditionalToken: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ConditionalToken] = js.undefined
  
  /**
    * The version ID of the application. You must provide the CurrentApplicationVersionId or the ConditionalToken. You can retrieve the application version ID using DescribeApplication. For better concurrency support, use the ConditionalToken parameter instead of CurrentApplicationVersionId.
    */
  var CurrentApplicationVersionId: js.UndefOr[ApplicationVersionId] = js.undefined
}
object DeleteApplicationCloudWatchLoggingOptionRequest {
  
  inline def apply(ApplicationName: ApplicationName, CloudWatchLoggingOptionId: Id): DeleteApplicationCloudWatchLoggingOptionRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CloudWatchLoggingOptionId = CloudWatchLoggingOptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationCloudWatchLoggingOptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteApplicationCloudWatchLoggingOptionRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionId(value: Id): Self = StObject.set(x, "CloudWatchLoggingOptionId", value.asInstanceOf[js.Any])
    
    inline def setConditionalToken(value: ConditionalToken): Self = StObject.set(x, "ConditionalToken", value.asInstanceOf[js.Any])
    
    inline def setConditionalTokenUndefined: Self = StObject.set(x, "ConditionalToken", js.undefined)
    
    inline def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    inline def setCurrentApplicationVersionIdUndefined: Self = StObject.set(x, "CurrentApplicationVersionId", js.undefined)
  }
}
