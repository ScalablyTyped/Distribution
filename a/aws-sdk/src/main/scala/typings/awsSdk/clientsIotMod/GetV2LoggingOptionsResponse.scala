package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetV2LoggingOptionsResponse extends StObject {
  
  /**
    * The default log level.
    */
  var defaultLogLevel: js.UndefOr[LogLevel] = js.undefined
  
  /**
    * Disables all logs.
    */
  var disableAllLogs: js.UndefOr[DisableAllLogs] = js.undefined
  
  /**
    * The IAM role ARN IoT uses to write to your CloudWatch logs.
    */
  var roleArn: js.UndefOr[AwsArn] = js.undefined
}
object GetV2LoggingOptionsResponse {
  
  inline def apply(): GetV2LoggingOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetV2LoggingOptionsResponse]
  }
  
  extension [Self <: GetV2LoggingOptionsResponse](x: Self) {
    
    inline def setDefaultLogLevel(value: LogLevel): Self = StObject.set(x, "defaultLogLevel", value.asInstanceOf[js.Any])
    
    inline def setDefaultLogLevelUndefined: Self = StObject.set(x, "defaultLogLevel", js.undefined)
    
    inline def setDisableAllLogs(value: DisableAllLogs): Self = StObject.set(x, "disableAllLogs", value.asInstanceOf[js.Any])
    
    inline def setDisableAllLogsUndefined: Self = StObject.set(x, "disableAllLogs", js.undefined)
    
    inline def setRoleArn(value: AwsArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
