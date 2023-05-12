package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogDestination extends StObject {
  
  /**
    * The name of the CloudWatch Logs group to send pipeline logs to. You can specify an existing log group or create a new one. For example, /aws/OpenSearchService/IngestionService/my-pipeline.
    */
  var LogGroup: typings.awsSdk.clientsOsisMod.LogGroup
}
object CloudWatchLogDestination {
  
  inline def apply(LogGroup: LogGroup): CloudWatchLogDestination = {
    val __obj = js.Dynamic.literal(LogGroup = LogGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchLogDestination] (val x: Self) extends AnyVal {
    
    inline def setLogGroup(value: LogGroup): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
  }
}
