package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogOptions extends StObject {
  
  /**
    * Status of VPN tunnel logging feature. Default value is False. Valid values: True | False 
    */
  var LogEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
    */
  var LogGroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * Configured log format. Default format is json. Valid values: json | text 
    */
  var LogOutputFormat: js.UndefOr[String] = js.undefined
}
object CloudWatchLogOptions {
  
  inline def apply(): CloudWatchLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchLogOptions] (val x: Self) extends AnyVal {
    
    inline def setLogEnabled(value: Boolean): Self = StObject.set(x, "LogEnabled", value.asInstanceOf[js.Any])
    
    inline def setLogEnabledUndefined: Self = StObject.set(x, "LogEnabled", js.undefined)
    
    inline def setLogGroupArn(value: String): Self = StObject.set(x, "LogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLogGroupArnUndefined: Self = StObject.set(x, "LogGroupArn", js.undefined)
    
    inline def setLogOutputFormat(value: String): Self = StObject.set(x, "LogOutputFormat", value.asInstanceOf[js.Any])
    
    inline def setLogOutputFormatUndefined: Self = StObject.set(x, "LogOutputFormat", js.undefined)
  }
}
