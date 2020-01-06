package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventsMessage extends js.Object {
  /**
    * The number of minutes to retrieve events for. Default: 60
    */
  var Duration: js.UndefOr[IntegerOptional] = js.native
  /**
    *  The end of the time interval for which to retrieve events, specified in ISO 8601 format.  Example: 2009-07-08T18:00Z
    */
  var EndTime: js.UndefOr[TStamp] = js.native
  /**
    * A list of event categories that trigger notifications for an event notification subscription.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token (marker) is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The identifier of the event source for which events are returned. If not specified, then all sources are included in the response. Constraints:   If SourceIdentifier is provided, SourceType must also be provided.   If the source type is DBInstance, a DBInstanceIdentifier must be provided.   If the source type is DBSecurityGroup, a DBSecurityGroupName must be provided.   If the source type is DBParameterGroup, a DBParameterGroupName must be provided.   If the source type is DBSnapshot, a DBSnapshotIdentifier must be provided.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var SourceIdentifier: js.UndefOr[String] = js.native
  /**
    * The event source to retrieve events for. If no value is specified, all events are returned.
    */
  var SourceType: js.UndefOr[typings.awsDashSdk.clientsDocdbMod.SourceType] = js.native
  /**
    *  The beginning of the time interval to retrieve events for, specified in ISO 8601 format.  Example: 2009-07-08T18:00Z
    */
  var StartTime: js.UndefOr[TStamp] = js.native
}

object DescribeEventsMessage {
  @scala.inline
  def apply(
    Duration: Int | Double = null,
    EndTime: TStamp = null,
    EventCategories: EventCategoriesList = null,
    Filters: FilterList = null,
    Marker: String = null,
    MaxRecords: Int | Double = null,
    SourceIdentifier: String = null,
    SourceType: SourceType = null,
    StartTime: TStamp = null
  ): DescribeEventsMessage = {
    val __obj = js.Dynamic.literal()
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (SourceIdentifier != null) __obj.updateDynamic("SourceIdentifier")(SourceIdentifier.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventsMessage]
  }
}

