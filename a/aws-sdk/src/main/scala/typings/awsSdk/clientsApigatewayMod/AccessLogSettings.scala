package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessLogSettings extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch Logs log group or Kinesis Data Firehose delivery stream to receive access logs. If you specify a Kinesis Data Firehose delivery stream, the stream name must begin with amazon-apigateway-.
    */
  var destinationArn: js.UndefOr[String] = js.undefined
  
  /**
    * A single line format of the access logs of data, as specified by selected $context variables. The format must include at least $context.requestId.
    */
  var format: js.UndefOr[String] = js.undefined
}
object AccessLogSettings {
  
  inline def apply(): AccessLogSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessLogSettings]
  }
  
  extension [Self <: AccessLogSettings](x: Self) {
    
    inline def setDestinationArn(value: String): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "destinationArn", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
