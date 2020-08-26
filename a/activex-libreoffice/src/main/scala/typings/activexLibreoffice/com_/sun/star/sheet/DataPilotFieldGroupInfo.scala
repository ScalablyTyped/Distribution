package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the grouping information of a {@link DataPilotField} . */
@js.native
trait DataPilotFieldGroupInfo extends js.Object {
  /** specifies the end value for the grouping if {@link HasAutoEnd} is set to `FALSE` . */
  var End: Double = js.native
  /**
    * specifies the grouping of the date values.
    * @see DataPilotFieldGroupBy
    */
  var GroupBy: Double = js.native
  /**
    * specifies the named groups in this field if there are some.
    *
    * The returned object is an instance of {@link DataPilotFieldGroups} . The collection of groups can be modified by inserting, removing, replacing, or
    * renaming single groups or item names in the groups. When writing back this struct containing such a changed collection of groups to the {@link
    * DataPilotField.GroupInfo} property, the modified grouping settings are applied at the DataPilot field.
    * @see DataPilotField
    * @see DataPilotFieldGroups
    */
  var Groups: XNameAccess = js.native
  /**
    * specifies whether the end value for the grouping is taken automatically from the maximum of the item values.
    *
    * If `FALSE` is set, the value from {@link End} will be used as end value for the grouping.If `TRUE` is set, the end value for the grouping will be
    * calculated automatically from the maximum of all member values of the DataPilot field.
    */
  var HasAutoEnd: Boolean = js.native
  /**
    * specifies whether the start value for the grouping is taken automatically from the minimum of the item values.
    *
    * If `FALSE` is set, the value from {@link Start} will be used as start value for the grouping.If `TRUE` is set, the start value for the grouping will
    * be calculated automatically from the minimum of all member values of the DataPilot field.
    */
  var HasAutoStart: Boolean = js.native
  /**
    * specifies whether date values are grouped by ranges of days.
    *
    * If `FALSE` is set, and {@link GroupBy} contains zero, grouping is performed inplace on the item values.If `FALSE` is set, and {@link GroupBy} contains
    * one or more flags from {@link DataPilotFieldGroupBy} , grouping is performed on date or time.If `TRUE` is set, {@link Step} contains a value greater
    * than or equal to 1, and {@link GroupBy} set to {@link DataPilotFieldGroupBy.DAYS} , grouping is performed on ranges of days (see descriptions for
    * {@link XDataPilotFieldGrouping.createDateGroup()} for more details about day grouping).
    */
  var HasDateValues: Boolean = js.native
  /**
    * contains the source DataPilot field grouping is based on. Will be `NULL` if this field is not grouped or contains numeric grouping.
    * @see DataPilotField
    */
  var SourceField: XDataPilotField = js.native
  /** specifies the start value for the grouping if {@link HasAutoStart} is set to `FALSE` . */
  var Start: Double = js.native
  /**
    * specifies the size of the ranges for numeric or day grouping.
    *
    * Example: With {@link HasAutoStart} set to `FALSE` , {@link Start} set to 2, and {@link Step} set to 3, the first group will contain all values greater
    * than or equal to 2 and less than 5. The second group will contain all values greater than or equal to 5 and less then 8, and so on.
    */
  var Step: Double = js.native
}

object DataPilotFieldGroupInfo {
  @scala.inline
  def apply(
    End: Double,
    GroupBy: Double,
    Groups: XNameAccess,
    HasAutoEnd: Boolean,
    HasAutoStart: Boolean,
    HasDateValues: Boolean,
    SourceField: XDataPilotField,
    Start: Double,
    Step: Double
  ): DataPilotFieldGroupInfo = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], GroupBy = GroupBy.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], HasAutoEnd = HasAutoEnd.asInstanceOf[js.Any], HasAutoStart = HasAutoStart.asInstanceOf[js.Any], HasDateValues = HasDateValues.asInstanceOf[js.Any], SourceField = SourceField.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldGroupInfo]
  }
  @scala.inline
  implicit class DataPilotFieldGroupInfoOps[Self <: DataPilotFieldGroupInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd(value: Double): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupBy(value: Double): Self = this.set("GroupBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroups(value: XNameAccess): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasAutoEnd(value: Boolean): Self = this.set("HasAutoEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasAutoStart(value: Boolean): Self = this.set("HasAutoStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasDateValues(value: Boolean): Self = this.set("HasDateValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceField(value: XDataPilotField): Self = this.set("SourceField", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("Start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("Step", value.asInstanceOf[js.Any])
  }
  
}

