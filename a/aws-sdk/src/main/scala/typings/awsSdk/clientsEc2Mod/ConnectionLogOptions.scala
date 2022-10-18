package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionLogOptions extends StObject {
  
  /**
    * The name of the CloudWatch Logs log group. Required if connection logging is enabled.
    */
  var CloudwatchLogGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the CloudWatch Logs log stream to which the connection data is published.
    */
  var CloudwatchLogStream: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether connection logging is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object ConnectionLogOptions {
  
  inline def apply(): ConnectionLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionLogOptions]
  }
  
  extension [Self <: ConnectionLogOptions](x: Self) {
    
    inline def setCloudwatchLogGroup(value: String): Self = StObject.set(x, "CloudwatchLogGroup", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLogGroupUndefined: Self = StObject.set(x, "CloudwatchLogGroup", js.undefined)
    
    inline def setCloudwatchLogStream(value: String): Self = StObject.set(x, "CloudwatchLogStream", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLogStreamUndefined: Self = StObject.set(x, "CloudwatchLogStream", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
