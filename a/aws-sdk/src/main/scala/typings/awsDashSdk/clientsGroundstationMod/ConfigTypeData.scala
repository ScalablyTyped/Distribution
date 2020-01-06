package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigTypeData extends js.Object {
  /**
    * Information about how AWS Ground Station should configure an antenna for downlink during a contact.
    */
  var antennaDownlinkConfig: js.UndefOr[AntennaDownlinkConfig] = js.native
  /**
    * Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
    */
  var antennaDownlinkDemodDecodeConfig: js.UndefOr[AntennaDownlinkDemodDecodeConfig] = js.native
  /**
    * Information about how AWS Ground Station should conﬁgure an antenna for uplink during a contact.
    */
  var antennaUplinkConfig: js.UndefOr[AntennaUplinkConfig] = js.native
  /**
    * Information about the dataflow endpoint Config.
    */
  var dataflowEndpointConfig: js.UndefOr[DataflowEndpointConfig] = js.native
  /**
    * Object that determines whether tracking should be used during a contact executed with this Config in the mission profile. 
    */
  var trackingConfig: js.UndefOr[TrackingConfig] = js.native
  /**
    * Information about an uplink echo Config.
    Parameters from the AntennaUplinkConfig, corresponding to the specified AntennaUplinkConfigArn, are used when this UplinkEchoConfig is used in a contact.
    */
  var uplinkEchoConfig: js.UndefOr[UplinkEchoConfig] = js.native
}

object ConfigTypeData {
  @scala.inline
  def apply(
    antennaDownlinkConfig: AntennaDownlinkConfig = null,
    antennaDownlinkDemodDecodeConfig: AntennaDownlinkDemodDecodeConfig = null,
    antennaUplinkConfig: AntennaUplinkConfig = null,
    dataflowEndpointConfig: DataflowEndpointConfig = null,
    trackingConfig: TrackingConfig = null,
    uplinkEchoConfig: UplinkEchoConfig = null
  ): ConfigTypeData = {
    val __obj = js.Dynamic.literal()
    if (antennaDownlinkConfig != null) __obj.updateDynamic("antennaDownlinkConfig")(antennaDownlinkConfig.asInstanceOf[js.Any])
    if (antennaDownlinkDemodDecodeConfig != null) __obj.updateDynamic("antennaDownlinkDemodDecodeConfig")(antennaDownlinkDemodDecodeConfig.asInstanceOf[js.Any])
    if (antennaUplinkConfig != null) __obj.updateDynamic("antennaUplinkConfig")(antennaUplinkConfig.asInstanceOf[js.Any])
    if (dataflowEndpointConfig != null) __obj.updateDynamic("dataflowEndpointConfig")(dataflowEndpointConfig.asInstanceOf[js.Any])
    if (trackingConfig != null) __obj.updateDynamic("trackingConfig")(trackingConfig.asInstanceOf[js.Any])
    if (uplinkEchoConfig != null) __obj.updateDynamic("uplinkEchoConfig")(uplinkEchoConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigTypeData]
  }
}

