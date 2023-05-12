package typings.awsSdk.clientsIvschatMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsDestinationConfiguration extends StObject {
  
  /**
    * Name of the Amazon Cloudwatch Logs destination where chat activity will be logged.
    */
  var logGroupName: LogGroupName
}
object CloudWatchLogsDestinationConfiguration {
  
  inline def apply(logGroupName: LogGroupName): CloudWatchLogsDestinationConfiguration = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsDestinationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchLogsDestinationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
  }
}
