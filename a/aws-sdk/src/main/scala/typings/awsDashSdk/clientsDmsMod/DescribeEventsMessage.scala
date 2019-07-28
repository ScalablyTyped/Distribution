package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventsMessage extends js.Object {
  /**
    * The duration of the events to be listed.
    */
  var Duration: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The end time for the events to be listed.
    */
  var EndTime: js.UndefOr[TStamp] = js.undefined
  /**
    * A list of event categories for the source type that you've chosen.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  /**
    * Filters applied to the action.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    *  The identifier of an event source.
    */
  var SourceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The type of AWS DMS resource that generates events. Valid values: replication-instance | replication-task
    */
  var SourceType: js.UndefOr[typings.awsDashSdk.clientsDmsMod.SourceType] = js.undefined
  /**
    * The start time for the events to be listed.
    */
  var StartTime: js.UndefOr[TStamp] = js.undefined
}

object DescribeEventsMessage {
  @scala.inline
  def apply(
    Duration: js.UndefOr[IntegerOptional] = js.undefined,
    EndTime: TStamp = null,
    EventCategories: EventCategoriesList = null,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    SourceIdentifier: String = null,
    SourceType: SourceType = null,
    StartTime: TStamp = null
  ): DescribeEventsMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (SourceIdentifier != null) __obj.updateDynamic("SourceIdentifier")(SourceIdentifier)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[DescribeEventsMessage]
  }
}

