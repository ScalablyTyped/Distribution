package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkProfile extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the network profile.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
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
    * The name of the network profile.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The type of network profile. Valid values are listed below.
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

object NetworkProfile {
  @scala.inline
  def apply(
    arn: AmazonResourceName = null,
    description: Message = null,
    downlinkBandwidthBits: js.UndefOr[Long] = js.undefined,
    downlinkDelayMs: js.UndefOr[Long] = js.undefined,
    downlinkJitterMs: js.UndefOr[Long] = js.undefined,
    downlinkLossPercent: js.UndefOr[PercentInteger] = js.undefined,
    name: Name = null,
    `type`: NetworkProfileType = null,
    uplinkBandwidthBits: js.UndefOr[Long] = js.undefined,
    uplinkDelayMs: js.UndefOr[Long] = js.undefined,
    uplinkJitterMs: js.UndefOr[Long] = js.undefined,
    uplinkLossPercent: js.UndefOr[PercentInteger] = js.undefined
  ): NetworkProfile = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(downlinkBandwidthBits)) __obj.updateDynamic("downlinkBandwidthBits")(downlinkBandwidthBits)
    if (!js.isUndefined(downlinkDelayMs)) __obj.updateDynamic("downlinkDelayMs")(downlinkDelayMs)
    if (!js.isUndefined(downlinkJitterMs)) __obj.updateDynamic("downlinkJitterMs")(downlinkJitterMs)
    if (!js.isUndefined(downlinkLossPercent)) __obj.updateDynamic("downlinkLossPercent")(downlinkLossPercent)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uplinkBandwidthBits)) __obj.updateDynamic("uplinkBandwidthBits")(uplinkBandwidthBits)
    if (!js.isUndefined(uplinkDelayMs)) __obj.updateDynamic("uplinkDelayMs")(uplinkDelayMs)
    if (!js.isUndefined(uplinkJitterMs)) __obj.updateDynamic("uplinkJitterMs")(uplinkJitterMs)
    if (!js.isUndefined(uplinkLossPercent)) __obj.updateDynamic("uplinkLossPercent")(uplinkLossPercent)
    __obj.asInstanceOf[NetworkProfile]
  }
}

