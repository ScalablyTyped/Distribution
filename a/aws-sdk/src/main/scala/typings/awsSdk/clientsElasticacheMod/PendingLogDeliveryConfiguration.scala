package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingLogDeliveryConfiguration extends StObject {
  
  /**
    * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose destination.
    */
  var DestinationDetails: js.UndefOr[typings.awsSdk.clientsElasticacheMod.DestinationDetails] = js.undefined
  
  /**
    * Returns the destination type, either CloudWatch Logs or Kinesis Data Firehose.
    */
  var DestinationType: js.UndefOr[typings.awsSdk.clientsElasticacheMod.DestinationType] = js.undefined
  
  /**
    * Returns the log format, either JSON or TEXT
    */
  var LogFormat: js.UndefOr[typings.awsSdk.clientsElasticacheMod.LogFormat] = js.undefined
  
  /**
    * Refers to slow-log or engine-log..
    */
  var LogType: js.UndefOr[typings.awsSdk.clientsElasticacheMod.LogType] = js.undefined
}
object PendingLogDeliveryConfiguration {
  
  inline def apply(): PendingLogDeliveryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingLogDeliveryConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PendingLogDeliveryConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDestinationDetails(value: DestinationDetails): Self = StObject.set(x, "DestinationDetails", value.asInstanceOf[js.Any])
    
    inline def setDestinationDetailsUndefined: Self = StObject.set(x, "DestinationDetails", js.undefined)
    
    inline def setDestinationType(value: DestinationType): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeUndefined: Self = StObject.set(x, "DestinationType", js.undefined)
    
    inline def setLogFormat(value: LogFormat): Self = StObject.set(x, "LogFormat", value.asInstanceOf[js.Any])
    
    inline def setLogFormatUndefined: Self = StObject.set(x, "LogFormat", js.undefined)
    
    inline def setLogType(value: LogType): Self = StObject.set(x, "LogType", value.asInstanceOf[js.Any])
    
    inline def setLogTypeUndefined: Self = StObject.set(x, "LogType", js.undefined)
  }
}
