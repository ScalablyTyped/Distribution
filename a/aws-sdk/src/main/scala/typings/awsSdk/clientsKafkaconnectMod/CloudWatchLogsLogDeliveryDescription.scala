package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogsLogDeliveryDescription extends StObject {
  
  /**
    * Whether log delivery to Amazon CloudWatch Logs is enabled.
    */
  var enabled: js.UndefOr[boolean] = js.undefined
  
  /**
    * The name of the CloudWatch log group that is the destination for log delivery.
    */
  var logGroup: js.UndefOr[string] = js.undefined
}
object CloudWatchLogsLogDeliveryDescription {
  
  inline def apply(): CloudWatchLogsLogDeliveryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogsLogDeliveryDescription]
  }
  
  extension [Self <: CloudWatchLogsLogDeliveryDescription](x: Self) {
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLogGroup(value: string): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "logGroup", js.undefined)
  }
}
