package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFindingsStatisticsResponse extends js.Object {
  /**
    * Finding statistics object.
    */
  var FindingStatistics: js.UndefOr[FindingStatistics] = js.undefined
}

object GetFindingsStatisticsResponse {
  @scala.inline
  def apply(FindingStatistics: FindingStatistics = null): GetFindingsStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    if (FindingStatistics != null) __obj.updateDynamic("FindingStatistics")(FindingStatistics)
    __obj.asInstanceOf[GetFindingsStatisticsResponse]
  }
}

