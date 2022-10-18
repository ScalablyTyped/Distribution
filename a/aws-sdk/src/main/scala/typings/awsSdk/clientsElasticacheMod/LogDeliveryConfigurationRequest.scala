package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogDeliveryConfigurationRequest extends StObject {
  
  /**
    * Configuration details of either a CloudWatch Logs destination or Kinesis Data Firehose destination.
    */
  var DestinationDetails: js.UndefOr[typings.awsSdk.clientsElasticacheMod.DestinationDetails] = js.undefined
  
  /**
    * Specify either cloudwatch-logs or kinesis-firehose as the destination type.
    */
  var DestinationType: js.UndefOr[typings.awsSdk.clientsElasticacheMod.DestinationType] = js.undefined
  
  /**
    * Specify if log delivery is enabled. Default true.
    */
  var Enabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Specifies either JSON or TEXT
    */
  var LogFormat: js.UndefOr[typings.awsSdk.clientsElasticacheMod.LogFormat] = js.undefined
  
  /**
    * Refers to slow-log or engine-log..
    */
  var LogType: js.UndefOr[typings.awsSdk.clientsElasticacheMod.LogType] = js.undefined
}
object LogDeliveryConfigurationRequest {
  
  inline def apply(): LogDeliveryConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogDeliveryConfigurationRequest]
  }
  
  extension [Self <: LogDeliveryConfigurationRequest](x: Self) {
    
    inline def setDestinationDetails(value: DestinationDetails): Self = StObject.set(x, "DestinationDetails", value.asInstanceOf[js.Any])
    
    inline def setDestinationDetailsUndefined: Self = StObject.set(x, "DestinationDetails", js.undefined)
    
    inline def setDestinationType(value: DestinationType): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeUndefined: Self = StObject.set(x, "DestinationType", js.undefined)
    
    inline def setEnabled(value: BooleanOptional): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setLogFormat(value: LogFormat): Self = StObject.set(x, "LogFormat", value.asInstanceOf[js.Any])
    
    inline def setLogFormatUndefined: Self = StObject.set(x, "LogFormat", js.undefined)
    
    inline def setLogType(value: LogType): Self = StObject.set(x, "LogType", value.asInstanceOf[js.Any])
    
    inline def setLogTypeUndefined: Self = StObject.set(x, "LogType", js.undefined)
  }
}
