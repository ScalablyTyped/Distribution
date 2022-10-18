package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessLogSettings extends StObject {
  
  /**
    * The ARN of the CloudWatch Logs log group to receive access logs.
    */
  var DestinationArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A single line format of the access logs of data, as specified by selected $context variables. The format must include at least $context.requestId.
    */
  var Format: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined
}
object AccessLogSettings {
  
  inline def apply(): AccessLogSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessLogSettings]
  }
  
  extension [Self <: AccessLogSettings](x: Self) {
    
    inline def setDestinationArn(value: Arn): Self = StObject.set(x, "DestinationArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationArnUndefined: Self = StObject.set(x, "DestinationArn", js.undefined)
    
    inline def setFormat(value: StringWithLengthBetween1And1024): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
  }
}
