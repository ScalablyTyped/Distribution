package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessLogCloudWatchLogsDestinationOptions extends StObject {
  
  /**
    * Indicates whether logging is enabled.
    */
  var Enabled: Boolean
  
  /**
    * The ID of the CloudWatch Logs log group.
    */
  var LogGroup: js.UndefOr[String] = js.undefined
}
object VerifiedAccessLogCloudWatchLogsDestinationOptions {
  
  inline def apply(Enabled: Boolean): VerifiedAccessLogCloudWatchLogsDestinationOptions = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifiedAccessLogCloudWatchLogsDestinationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessLogCloudWatchLogsDestinationOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setLogGroup(value: String): Self = StObject.set(x, "LogGroup", value.asInstanceOf[js.Any])
    
    inline def setLogGroupUndefined: Self = StObject.set(x, "LogGroup", js.undefined)
  }
}
