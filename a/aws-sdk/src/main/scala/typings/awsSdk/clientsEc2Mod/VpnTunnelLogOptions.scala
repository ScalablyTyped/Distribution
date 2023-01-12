package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnTunnelLogOptions extends StObject {
  
  /**
    * Options for sending VPN tunnel logs to CloudWatch.
    */
  var CloudWatchLogOptions: js.UndefOr[typings.awsSdk.clientsEc2Mod.CloudWatchLogOptions] = js.undefined
}
object VpnTunnelLogOptions {
  
  inline def apply(): VpnTunnelLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnTunnelLogOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpnTunnelLogOptions] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogOptions(value: CloudWatchLogOptions): Self = StObject.set(x, "CloudWatchLogOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogOptionsUndefined: Self = StObject.set(x, "CloudWatchLogOptions", js.undefined)
  }
}
