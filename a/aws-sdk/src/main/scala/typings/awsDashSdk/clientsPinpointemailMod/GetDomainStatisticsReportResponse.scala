package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainStatisticsReportResponse extends js.Object {
  /**
    * An object that contains deliverability metrics for the domain that you specified. This object contains data for each day, starting on the StartDate and ending on the EndDate.
    */
  var DailyVolumes: typings.awsDashSdk.clientsPinpointemailMod.DailyVolumes
  /**
    * An object that contains deliverability metrics for the domain that you specified. The data in this object is a summary of all of the data that was collected from the StartDate to the EndDate.
    */
  var OverallVolume: typings.awsDashSdk.clientsPinpointemailMod.OverallVolume
}

object GetDomainStatisticsReportResponse {
  @scala.inline
  def apply(DailyVolumes: DailyVolumes, OverallVolume: OverallVolume): GetDomainStatisticsReportResponse = {
    val __obj = js.Dynamic.literal(DailyVolumes = DailyVolumes, OverallVolume = OverallVolume)
  
    __obj.asInstanceOf[GetDomainStatisticsReportResponse]
  }
}

