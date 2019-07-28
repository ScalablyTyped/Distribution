package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UplinkEchoConfig extends js.Object {
  /**
    * ARN of an uplink Config.
    */
  var antennaUplinkConfigArn: ConfigArn
  /**
    * Whether or not an uplink Config is enabled.
    */
  var enabled: Boolean
}

object UplinkEchoConfig {
  @scala.inline
  def apply(antennaUplinkConfigArn: ConfigArn, enabled: Boolean): UplinkEchoConfig = {
    val __obj = js.Dynamic.literal(antennaUplinkConfigArn = antennaUplinkConfigArn, enabled = enabled)
  
    __obj.asInstanceOf[UplinkEchoConfig]
  }
}

