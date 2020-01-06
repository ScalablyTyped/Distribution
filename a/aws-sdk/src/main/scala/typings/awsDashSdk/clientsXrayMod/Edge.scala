package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge extends js.Object {
  /**
    * Aliases for the edge.
    */
  var Aliases: js.UndefOr[AliasList] = js.native
  /**
    * The end time of the last segment on the edge.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * Identifier of the edge. Unique within a service map.
    */
  var ReferenceId: js.UndefOr[NullableInteger] = js.native
  /**
    * A histogram that maps the spread of client response times on an edge.
    */
  var ResponseTimeHistogram: js.UndefOr[Histogram] = js.native
  /**
    * The start time of the first segment on the edge.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  /**
    * Response statistics for segments on the edge.
    */
  var SummaryStatistics: js.UndefOr[EdgeStatistics] = js.native
}

object Edge {
  @scala.inline
  def apply(
    Aliases: AliasList = null,
    EndTime: Timestamp = null,
    ReferenceId: Int | scala.Double = null,
    ResponseTimeHistogram: Histogram = null,
    StartTime: Timestamp = null,
    SummaryStatistics: EdgeStatistics = null
  ): Edge = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (ReferenceId != null) __obj.updateDynamic("ReferenceId")(ReferenceId.asInstanceOf[js.Any])
    if (ResponseTimeHistogram != null) __obj.updateDynamic("ResponseTimeHistogram")(ResponseTimeHistogram.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (SummaryStatistics != null) __obj.updateDynamic("SummaryStatistics")(SummaryStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

