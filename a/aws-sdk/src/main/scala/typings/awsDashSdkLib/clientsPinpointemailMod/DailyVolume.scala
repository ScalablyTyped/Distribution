package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DailyVolume extends js.Object {
  /**
    * An object that contains inbox placement metrics for a specifid day in the analysis period, broken out by the recipient's email provider.
    */
  var DomainIspPlacements: js.UndefOr[DomainIspPlacements] = js.undefined
  /**
    * The date that the DailyVolume metrics apply to, in Unix time.
    */
  var StartDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * An object that contains inbox placement metrics for a specific day in the analysis period.
    */
  var VolumeStatistics: js.UndefOr[VolumeStatistics] = js.undefined
}

object DailyVolume {
  @scala.inline
  def apply(
    DomainIspPlacements: DomainIspPlacements = null,
    StartDate: Timestamp = null,
    VolumeStatistics: VolumeStatistics = null
  ): DailyVolume = {
    val __obj = js.Dynamic.literal()
    if (DomainIspPlacements != null) __obj.updateDynamic("DomainIspPlacements")(DomainIspPlacements)
    if (StartDate != null) __obj.updateDynamic("StartDate")(StartDate)
    if (VolumeStatistics != null) __obj.updateDynamic("VolumeStatistics")(VolumeStatistics)
    __obj.asInstanceOf[DailyVolume]
  }
}

