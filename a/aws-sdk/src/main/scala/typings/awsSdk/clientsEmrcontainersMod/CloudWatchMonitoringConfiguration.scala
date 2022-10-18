package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchMonitoringConfiguration extends StObject {
  
  /**
    * The name of the log group for log publishing.
    */
  var logGroupName: LogGroupName
  
  /**
    * The specified name prefix for log streams.
    */
  var logStreamNamePrefix: js.UndefOr[String256] = js.undefined
}
object CloudWatchMonitoringConfiguration {
  
  inline def apply(logGroupName: LogGroupName): CloudWatchMonitoringConfiguration = {
    val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchMonitoringConfiguration]
  }
  
  extension [Self <: CloudWatchMonitoringConfiguration](x: Self) {
    
    inline def setLogGroupName(value: LogGroupName): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNamePrefix(value: String256): Self = StObject.set(x, "logStreamNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setLogStreamNamePrefixUndefined: Self = StObject.set(x, "logStreamNamePrefix", js.undefined)
  }
}
