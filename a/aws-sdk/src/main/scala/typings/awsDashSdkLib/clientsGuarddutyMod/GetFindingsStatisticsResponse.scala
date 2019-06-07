package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFindingsStatisticsResponse extends js.Object {
  /**
    * Finding statistics object.
    */
  var FindingStatistics: awsDashSdkLib.clientsGuarddutyMod.FindingStatistics
}

object GetFindingsStatisticsResponse {
  @scala.inline
  def apply(FindingStatistics: FindingStatistics): GetFindingsStatisticsResponse = {
    val __obj = js.Dynamic.literal(FindingStatistics = FindingStatistics)
  
    __obj.asInstanceOf[GetFindingsStatisticsResponse]
  }
}

