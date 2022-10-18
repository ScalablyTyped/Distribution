package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsDestinationDetails extends StObject {
  
  /**
    * The name of the CloudWatch Logs log group.
    */
  var LogGroup: js.UndefOr[String] = js.undefined
}
object CloudWatchLogsDestinationDetails {
  
  inline def apply(): CloudWatchLogsDestinationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsDestinationDetails]
  }
  
  extension [Self <: CloudWatchLogsDestinationDetails](x: Self) {
    
    inline def setLogGroup(value: String): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "LogGroup", js.undefined)
  }
}
