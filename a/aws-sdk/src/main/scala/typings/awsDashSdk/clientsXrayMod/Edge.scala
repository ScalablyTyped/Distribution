package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  /**
    * Aliases for the edge.
    */
  var Aliases: js.UndefOr[AliasList] = js.undefined
  /**
    * The end time of the last segment on the edge.
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Identifier of the edge. Unique within a service map.
    */
  var ReferenceId: js.UndefOr[NullableInteger] = js.undefined
  /**
    * A histogram that maps the spread of client response times on an edge.
    */
  var ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined
  /**
    * The start time of the first segment on the edge.
    */
  var StartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Response statistics for segments on the edge.
    */
  var SummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined
}

object Edge {
  @scala.inline
  def apply(
    Aliases: AliasList = null,
    EndTime: Timestamp = null,
    ReferenceId: js.UndefOr[NullableInteger] = js.undefined,
    ResponseTimeHistogram: Histogram = null,
    StartTime: Timestamp = null,
    SummaryStatistics: EdgeStatistics = null
  ): Edge = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (!js.isUndefined(ReferenceId)) __obj.updateDynamic("ReferenceId")(ReferenceId)
    if (ResponseTimeHistogram != null) __obj.updateDynamic("ResponseTimeHistogram")(ResponseTimeHistogram)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (SummaryStatistics != null) __obj.updateDynamic("SummaryStatistics")(SummaryStatistics)
    __obj.asInstanceOf[Edge]
  }
}

