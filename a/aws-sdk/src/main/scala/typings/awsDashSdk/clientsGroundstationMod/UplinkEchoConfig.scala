package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UplinkEchoConfig extends js.Object {
  /**
    * ARN of an uplink Config.
    */
  var antennaUplinkConfigArn: ConfigArn = js.native
  /**
    * Whether or not an uplink Config is enabled.
    */
  var enabled: Boolean = js.native
}

object UplinkEchoConfig {
  @scala.inline
  def apply(antennaUplinkConfigArn: ConfigArn, enabled: Boolean): UplinkEchoConfig = {
    val __obj = js.Dynamic.literal(antennaUplinkConfigArn = antennaUplinkConfigArn.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UplinkEchoConfig]
  }
}

