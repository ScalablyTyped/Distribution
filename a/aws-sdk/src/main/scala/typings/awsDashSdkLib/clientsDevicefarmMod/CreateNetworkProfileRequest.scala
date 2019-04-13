package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNetworkProfileRequest extends js.Object {
  /**
    * The description of the network profile.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * The data throughput rate in bits per second, as an integer from 0 to 104857600.
    */
  var downlinkBandwidthBits: js.UndefOr[Long] = js.undefined
  /**
    * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
    */
  var downlinkDelayMs: js.UndefOr[Long] = js.undefined
  /**
    * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
    */
  var downlinkJitterMs: js.UndefOr[Long] = js.undefined
  /**
    * Proportion of received packets that fail to arrive from 0 to 100 percent.
    */
  var downlinkLossPercent: js.UndefOr[PercentInteger] = js.undefined
  /**
    * The name you wish to specify for the new network profile.
    */
  var name: Name
  /**
    * The Amazon Resource Name (ARN) of the project for which you want to create a network profile.
    */
  var projectArn: AmazonResourceName
  /**
    * The type of network profile you wish to create. Valid values are listed below.
    */
  var `type`: js.UndefOr[NetworkProfileType] = js.undefined
  /**
    * The data throughput rate in bits per second, as an integer from 0 to 104857600.
    */
  var uplinkBandwidthBits: js.UndefOr[Long] = js.undefined
  /**
    * Delay time for all packets to destination in milliseconds as an integer from 0 to 2000.
    */
  var uplinkDelayMs: js.UndefOr[Long] = js.undefined
  /**
    * Time variation in the delay of received packets in milliseconds as an integer from 0 to 2000.
    */
  var uplinkJitterMs: js.UndefOr[Long] = js.undefined
  /**
    * Proportion of transmitted packets that fail to arrive from 0 to 100 percent.
    */
  var uplinkLossPercent: js.UndefOr[PercentInteger] = js.undefined
}

object CreateNetworkProfileRequest {
  @scala.inline
  def apply(
    name: Name,
    projectArn: AmazonResourceName,
    description: Message = null,
    downlinkBandwidthBits: js.UndefOr[Long] = js.undefined,
    downlinkDelayMs: js.UndefOr[Long] = js.undefined,
    downlinkJitterMs: js.UndefOr[Long] = js.undefined,
    downlinkLossPercent: js.UndefOr[PercentInteger] = js.undefined,
    `type`: NetworkProfileType = null,
    uplinkBandwidthBits: js.UndefOr[Long] = js.undefined,
    uplinkDelayMs: js.UndefOr[Long] = js.undefined,
    uplinkJitterMs: js.UndefOr[Long] = js.undefined,
    uplinkLossPercent: js.UndefOr[PercentInteger] = js.undefined
  ): CreateNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(name = name, projectArn = projectArn)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(downlinkBandwidthBits)) __obj.updateDynamic("downlinkBandwidthBits")(downlinkBandwidthBits)
    if (!js.isUndefined(downlinkDelayMs)) __obj.updateDynamic("downlinkDelayMs")(downlinkDelayMs)
    if (!js.isUndefined(downlinkJitterMs)) __obj.updateDynamic("downlinkJitterMs")(downlinkJitterMs)
    if (!js.isUndefined(downlinkLossPercent)) __obj.updateDynamic("downlinkLossPercent")(downlinkLossPercent)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uplinkBandwidthBits)) __obj.updateDynamic("uplinkBandwidthBits")(uplinkBandwidthBits)
    if (!js.isUndefined(uplinkDelayMs)) __obj.updateDynamic("uplinkDelayMs")(uplinkDelayMs)
    if (!js.isUndefined(uplinkJitterMs)) __obj.updateDynamic("uplinkJitterMs")(uplinkJitterMs)
    if (!js.isUndefined(uplinkLossPercent)) __obj.updateDynamic("uplinkLossPercent")(uplinkLossPercent)
    __obj.asInstanceOf[CreateNetworkProfileRequest]
  }
}

