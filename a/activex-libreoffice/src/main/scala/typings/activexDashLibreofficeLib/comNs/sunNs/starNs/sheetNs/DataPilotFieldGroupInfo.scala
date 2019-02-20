package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the grouping information of a {@link DataPilotField} . */
trait DataPilotFieldGroupInfo extends js.Object {
  /** specifies the end value for the grouping if {@link HasAutoEnd} is set to `FALSE` . */
  var End: scala.Double
  /**
    * specifies the grouping of the date values.
    * @see DataPilotFieldGroupBy
    */
  var GroupBy: scala.Double
  /**
    * specifies the named groups in this field if there are some.
    *
    * The returned object is an instance of {@link DataPilotFieldGroups} . The collection of groups can be modified by inserting, removing, replacing, or
    * renaming single groups or item names in the groups. When writing back this struct containing such a changed collection of groups to the {@link
    * DataPilotField.GroupInfo} property, the modified grouping settings are applied at the DataPilot field.
    * @see DataPilotField
    * @see DataPilotFieldGroups
    */
  var Groups: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * specifies whether the end value for the grouping is taken automatically from the maximum of the item values.
    *
    * If `FALSE` is set, the value from {@link End} will be used as end value for the grouping.If `TRUE` is set, the end value for the grouping will be
    * calculated automatically from the maximum of all member values of the DataPilot field.
    */
  var HasAutoEnd: scala.Boolean
  /**
    * specifies whether the start value for the grouping is taken automatically from the minimum of the item values.
    *
    * If `FALSE` is set, the value from {@link Start} will be used as start value for the grouping.If `TRUE` is set, the start value for the grouping will
    * be calculated automatically from the minimum of all member values of the DataPilot field.
    */
  var HasAutoStart: scala.Boolean
  /**
    * specifies whether date values are grouped by ranges of days.
    *
    * If `FALSE` is set, and {@link GroupBy} contains zero, grouping is performed inplace on the item values.If `FALSE` is set, and {@link GroupBy} contains
    * one or more flags from {@link DataPilotFieldGroupBy} , grouping is performed on date or time.If `TRUE` is set, {@link Step} contains a value greater
    * than or equal to 1, and {@link GroupBy} set to {@link DataPilotFieldGroupBy.DAYS} , grouping is performed on ranges of days (see descriptions for
    * {@link XDataPilotFieldGrouping.createDateGroup()} for more details about day grouping).
    */
  var HasDateValues: scala.Boolean
  /**
    * contains the source DataPilot field grouping is based on. Will be `NULL` if this field is not grouped or contains numeric grouping.
    * @see DataPilotField
    */
  var SourceField: XDataPilotField
  /** specifies the start value for the grouping if {@link HasAutoStart} is set to `FALSE` . */
  var Start: scala.Double
  /**
    * specifies the size of the ranges for numeric or day grouping.
    *
    * Example: With {@link HasAutoStart} set to `FALSE` , {@link Start} set to 2, and {@link Step} set to 3, the first group will contain all values greater
    * than or equal to 2 and less than 5. The second group will contain all values greater than or equal to 5 and less then 8, and so on.
    */
  var Step: scala.Double
}

