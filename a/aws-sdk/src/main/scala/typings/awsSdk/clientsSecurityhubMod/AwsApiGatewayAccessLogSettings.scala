package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsApiGatewayAccessLogSettings extends StObject {
  
  /**
    * The ARN of the CloudWatch Logs log group that receives the access logs.
    */
  var DestinationArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A single-line format of the access logs of data, as specified by selected $context variables. The format must include at least $context.requestId.
    */
  var Format: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsApiGatewayAccessLogSettings {
  
  inline def apply(): AwsApiGatewayAccessLogSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayAccessLogSettings]
  }
  
  extension [Self <: AwsApiGatewayAccessLogSettings](x: Self) {
    
    inline def setDestinationArn(value: NonEmptyString): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setFormat(value: NonEmptyString): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
  }
}
