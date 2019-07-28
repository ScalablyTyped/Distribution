package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigTypeData extends js.Object {
  /**
    * Information about how AWS Ground Station should configure an antenna for downlink during a contact.
    */
  var antennaDownlinkConfig: js.UndefOr[AntennaDownlinkConfig] = js.undefined
  /**
    * Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
    */
  var antennaDownlinkDemodDecodeConfig: js.UndefOr[AntennaDownlinkDemodDecodeConfig] = js.undefined
  /**
    * Information about how AWS Ground Station should conﬁgure an antenna for uplink during a contact.
    */
  var antennaUplinkConfig: js.UndefOr[AntennaUplinkConfig] = js.undefined
  /**
    * Information about the dataflow endpoint Config.
    */
  var dataflowEndpointConfig: js.UndefOr[DataflowEndpointConfig] = js.undefined
  /**
    * Object that determines whether tracking should be used during a contact executed with this Config in the mission profile. 
    */
  var trackingConfig: js.UndefOr[TrackingConfig] = js.undefined
  /**
    * Information about an uplink echo Config.
    Parameters from the AntennaUplinkConfig, corresponding to the specified AntennaUplinkConfigArn, are used when this UplinkEchoConfig is used in a contact.
    */
  var uplinkEchoConfig: js.UndefOr[UplinkEchoConfig] = js.undefined
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
    if (antennaDownlinkConfig != null) __obj.updateDynamic("antennaDownlinkConfig")(antennaDownlinkConfig)
    if (antennaDownlinkDemodDecodeConfig != null) __obj.updateDynamic("antennaDownlinkDemodDecodeConfig")(antennaDownlinkDemodDecodeConfig)
    if (antennaUplinkConfig != null) __obj.updateDynamic("antennaUplinkConfig")(antennaUplinkConfig)
    if (dataflowEndpointConfig != null) __obj.updateDynamic("dataflowEndpointConfig")(dataflowEndpointConfig)
    if (trackingConfig != null) __obj.updateDynamic("trackingConfig")(trackingConfig)
    if (uplinkEchoConfig != null) __obj.updateDynamic("uplinkEchoConfig")(uplinkEchoConfig)
    __obj.asInstanceOf[ConfigTypeData]
  }
}

