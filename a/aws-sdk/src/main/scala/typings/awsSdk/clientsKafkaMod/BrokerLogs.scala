package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerLogs extends StObject {
  
  var CloudWatchLogs: js.UndefOr[typings.awsSdk.clientsKafkaMod.CloudWatchLogs] = js.undefined
  
  var Firehose: js.UndefOr[typings.awsSdk.clientsKafkaMod.Firehose] = js.undefined
  
  var S3: js.UndefOr[typings.awsSdk.clientsKafkaMod.S3] = js.undefined
}
object BrokerLogs {
  
  inline def apply(): BrokerLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerLogs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrokerLogs] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogs(value: CloudWatchLogs): Self = StObject.set(x, "CloudWatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsUndefined: Self = StObject.set(x, "CloudWatchLogs", js.undefined)
    
    inline def setFirehose(value: Firehose): Self = StObject.set(x, "Firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "Firehose", js.undefined)
    
    inline def setS3(value: S3): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
  }
}
