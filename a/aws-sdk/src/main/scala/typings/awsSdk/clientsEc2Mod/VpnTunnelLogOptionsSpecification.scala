package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnTunnelLogOptionsSpecification extends StObject {
  
  /**
    * Options for sending VPN tunnel logs to CloudWatch.
    */
  var CloudWatchLogOptions: js.UndefOr[CloudWatchLogOptionsSpecification] = js.undefined
}
object VpnTunnelLogOptionsSpecification {
  
  inline def apply(): VpnTunnelLogOptionsSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnTunnelLogOptionsSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpnTunnelLogOptionsSpecification] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogOptions(value: CloudWatchLogOptionsSpecification): Self = StObject.set(x, "CloudWatchLogOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogOptionsUndefined: Self = StObject.set(x, "CloudWatchLogOptions", js.undefined)
  }
}
