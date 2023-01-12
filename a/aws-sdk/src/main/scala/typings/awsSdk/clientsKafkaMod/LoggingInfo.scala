package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingInfo extends StObject {
  
  var BrokerLogs: typings.awsSdk.clientsKafkaMod.BrokerLogs
}
object LoggingInfo {
  
  inline def apply(BrokerLogs: BrokerLogs): LoggingInfo = {
    val __obj = js.Dynamic.literal(BrokerLogs = BrokerLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggingInfo] (val x: Self) extends AnyVal {
    
    inline def setBrokerLogs(value: BrokerLogs): Self = StObject.set(x, "BrokerLogs", value.asInstanceOf[js.Any])
  }
}
