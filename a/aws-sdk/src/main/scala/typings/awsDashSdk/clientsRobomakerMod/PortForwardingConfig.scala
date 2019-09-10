package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortForwardingConfig extends js.Object {
  /**
    * The port mappings for the configuration.
    */
  var portMappings: js.UndefOr[PortMappingList] = js.undefined
}

object PortForwardingConfig {
  @scala.inline
  def apply(portMappings: PortMappingList = null): PortForwardingConfig = {
    val __obj = js.Dynamic.literal()
    if (portMappings != null) __obj.updateDynamic("portMappings")(portMappings)
    __obj.asInstanceOf[PortForwardingConfig]
  }
}

