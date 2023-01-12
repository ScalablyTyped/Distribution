package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchLogOptionsSpecification extends StObject {
  
  /**
    * Enable or disable VPN tunnel logging feature. Default value is False. Valid values: True | False 
    */
  var LogEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch log group to send logs to.
    */
  var LogGroupArn: js.UndefOr[CloudWatchLogGroupArn] = js.undefined
  
  /**
    * Set log format. Default format is json. Valid values: json | text 
    */
  var LogOutputFormat: js.UndefOr[String] = js.undefined
}
object CloudWatchLogOptionsSpecification {
  
  inline def apply(): CloudWatchLogOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchLogOptionsSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchLogOptionsSpecification] (val x: Self) extends AnyVal {
    
    inline def setLogEnabled(value: Boolean): Self = StObject.set(x, "LogEnabled", value.asInstanceOf[js.Any])
    
    inline def setLogEnabledUndefined: Self = StObject.set(x, "LogEnabled", js.undefined)
    
    inline def setLogGroupArn(value: CloudWatchLogGroupArn): Self = StObject.set(x, "LogGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLogGroupArnUndefined: Self = StObject.set(x, "LogGroupArn", js.undefined)
    
    inline def setLogOutputFormat(value: String): Self = StObject.set(x, "LogOutputFormat", value.asInstanceOf[js.Any])
    
    inline def setLogOutputFormatUndefined: Self = StObject.set(x, "LogOutputFormat", js.undefined)
  }
}
