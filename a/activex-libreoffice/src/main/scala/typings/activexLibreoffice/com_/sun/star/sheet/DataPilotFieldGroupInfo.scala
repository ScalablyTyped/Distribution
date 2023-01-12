package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains the grouping information of a {@link DataPilotField} . */
trait DataPilotFieldGroupInfo extends StObject {
  
  /** specifies the end value for the grouping if {@link HasAutoEnd} is set to `FALSE` . */
  var End: Double
  
  /**
    * specifies the grouping of the date values.
    * @see DataPilotFieldGroupBy
    */
  var GroupBy: Double
  
  /**
    * specifies the named groups in this field if there are some.
    *
    * The returned object is an instance of {@link DataPilotFieldGroups} . The collection of groups can be modified by inserting, removing, replacing, or
    * renaming single groups or item names in the groups. When writing back this struct containing such a changed collection of groups to the {@link
    * DataPilotField.GroupInfo} property, the modified grouping settings are applied at the DataPilot field.
    * @see DataPilotField
    * @see DataPilotFieldGroups
    */
  var Groups: XNameAccess
  
  /**
    * specifies whether the end value for the grouping is taken automatically from the maximum of the item values.
    *
    * If `FALSE` is set, the value from {@link End} will be used as end value for the grouping.If `TRUE` is set, the end value for the grouping will be
    * calculated automatically from the maximum of all member values of the DataPilot field.
    */
  var HasAutoEnd: Boolean
  
  /**
    * specifies whether the start value for the grouping is taken automatically from the minimum of the item values.
    *
    * If `FALSE` is set, the value from {@link Start} will be used as start value for the grouping.If `TRUE` is set, the start value for the grouping will
    * be calculated automatically from the minimum of all member values of the DataPilot field.
    */
  var HasAutoStart: Boolean
  
  /**
    * specifies whether date values are grouped by ranges of days.
    *
    * If `FALSE` is set, and {@link GroupBy} contains zero, grouping is performed inplace on the item values.If `FALSE` is set, and {@link GroupBy} contains
    * one or more flags from {@link DataPilotFieldGroupBy} , grouping is performed on date or time.If `TRUE` is set, {@link Step} contains a value greater
    * than or equal to 1, and {@link GroupBy} set to {@link DataPilotFieldGroupBy.DAYS} , grouping is performed on ranges of days (see descriptions for
    * {@link XDataPilotFieldGrouping.createDateGroup()} for more details about day grouping).
    */
  var HasDateValues: Boolean
  
  /**
    * contains the source DataPilot field grouping is based on. Will be `NULL` if this field is not grouped or contains numeric grouping.
    * @see DataPilotField
    */
  var SourceField: XDataPilotField
  
  /** specifies the start value for the grouping if {@link HasAutoStart} is set to `FALSE` . */
  var Start: Double
  
  /**
    * specifies the size of the ranges for numeric or day grouping.
    *
    * Example: With {@link HasAutoStart} set to `FALSE` , {@link Start} set to 2, and {@link Step} set to 3, the first group will contain all values greater
    * than or equal to 2 and less than 5. The second group will contain all values greater than or equal to 5 and less then 8, and so on.
    */
  var Step: Double
}
object DataPilotFieldGroupInfo {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: DataPilotFieldGroupInfo] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setGroupBy(value: Double): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setGroups(value: XNameAccess): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setHasAutoEnd(value: Boolean): Self = StObject.set(x, "HasAutoEnd", value.asInstanceOf[js.Any])
    
    inline def setHasAutoStart(value: Boolean): Self = StObject.set(x, "HasAutoStart", value.asInstanceOf[js.Any])
    
    inline def setHasDateValues(value: Boolean): Self = StObject.set(x, "HasDateValues", value.asInstanceOf[js.Any])
    
    inline def setSourceField(value: XDataPilotField): Self = StObject.set(x, "SourceField", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Double): Self = StObject.set(x, "Step", value.asInstanceOf[js.Any])
  }
}
