package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverallVolume extends js.Object {
  /**
    * An object that contains inbox and junk mail placement metrics for individual email providers.
    */
  var DomainIspPlacements: js.UndefOr[DomainIspPlacements] = js.undefined
  /**
    * The percentage of emails that were sent from the domain that were read by their recipients.
    */
  var ReadRatePercent: js.UndefOr[Percentage] = js.undefined
  /**
    * An object that contains information about the numbers of messages that arrived in recipients' inboxes and junk mail folders.
    */
  var VolumeStatistics: js.UndefOr[VolumeStatistics] = js.undefined
}

object OverallVolume {
  @scala.inline
  def apply(
    DomainIspPlacements: DomainIspPlacements = null,
    ReadRatePercent: js.UndefOr[Percentage] = js.undefined,
    VolumeStatistics: VolumeStatistics = null
  ): OverallVolume = {
    val __obj = js.Dynamic.literal()
    if (DomainIspPlacements != null) __obj.updateDynamic("DomainIspPlacements")(DomainIspPlacements)
    if (!js.isUndefined(ReadRatePercent)) __obj.updateDynamic("ReadRatePercent")(ReadRatePercent)
    if (VolumeStatistics != null) __obj.updateDynamic("VolumeStatistics")(VolumeStatistics)
    __obj.asInstanceOf[OverallVolume]
  }
}

