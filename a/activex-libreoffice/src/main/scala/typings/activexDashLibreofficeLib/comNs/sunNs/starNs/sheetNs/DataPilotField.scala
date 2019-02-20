package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a single field in a data pilot table.
  *
  * If the data pilot table is based on a spreadsheet cell range, a field is represented by a column of the range and is named using the topmost cell of
  * the column.
  */
trait DataPilotField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XDataPilotField
     with XDataPilotFieldGrouping {
  /** enables the automatic inclusion of only a number of items with the highest or lowest result values. */
  var AutoShowInfo: DataPilotFieldAutoShowInfo
  /**
    * specifies the function used to calculate results for this field.
    *
    * For column and row fields, this is the function for subtotals (GeneralFunction::NONE means no subtotals). For data fields, this is the function shown
    * in the data pilot table.
    */
  var Function: GeneralFunction
  /**
    * specifies the function used to calculate results for this field.
    *
    * For column and row fields, this is the function for subtotals ( {@link GeneralFunction2.NONE} means no subtotals). For data fields, this is the
    * function shown in the data pilot table.
    * @since LibreOffice 5.3
    */
  var Function2: scala.Double
  /**
    * contains the grouping information of the DataPilot field.
    *
    * By changing the value of this property it is possible to modify the grouping settings of this field.
    */
  var GroupInfo: DataPilotFieldGroupInfo
  /** specifies whether this field has auto show information. */
  var HasAutoShowInfo: scala.Boolean
  /** specifies whether this field has layout information. */
  var HasLayoutInfo: scala.Boolean
  /** specifies whether this field has a reference. */
  var HasReference: scala.Boolean
  /** specifies whether this field has sorting information. */
  var HasSortInfo: scala.Boolean
  /** specifies whether this field is a group field. */
  var IsGroupField: scala.Boolean
  /** controls how the field's items are laid out in the result table. */
  var LayoutInfo: DataPilotFieldLayoutInfo
  /**
    * specifies the orientation of the field.
    *
    * If the orientation of a field has been changed using this property, the field will be moved to the last position in the collection of all fields with
    * the specified orientation.
    */
  var Orientation: DataPilotFieldOrientation
  /** controls how the results are shown in relation to a selected reference result. */
  var Reference: DataPilotFieldReference
  /** specifies the selected page which is used to filter the data pilot. */
  var SelectedPage: java.lang.String
  /** specifies whether to show this field also if it is empty or not. */
  var ShowEmpty: scala.Boolean
  /** controls how the field's items are sorted. */
  var SortInfo: DataPilotFieldSortInfo
  /**
    * specifies the functions used to calculate subtotals for this field.
    *
    * This property is supported by column and row fields only.
    *
    * An empty sequence means no subtotals. The same effect can be achieved by setting the property {@link Function} to the value GeneralFunction::NONE. If
    * the length of the sequence is greater then 1, then the sequence MUST NOT contain one of the values GeneralFunction::NONE or GeneralFunction::AUTO.
    *
    * The order of the functions in this sequence is reflected in the DataPilot table. Multiple entries of the same function are ignored when setting the
    * property.
    */
  var Subtotals: activexDashInteropLib.SafeArray[GeneralFunction]
  /**
    * specifies the functions used to calculate subtotals for this field.
    *
    * This property is supported by column and row fields only.
    *
    * An empty sequence means no subtotals. The same effect can be achieved by setting the property {@link Function2} to the value GeneralFunction::NONE. If
    * the length of the sequence is greater then 1, then the sequence MUST NOT contain one of the values {@link GeneralFunction2.NONE} or {@link
    * GeneralFunction2.AUTO} .
    *
    * The order of the functions in this sequence is reflected in the DataPilot table. Multiple entries of the same function are ignored when setting the
    * property.
    * @since LibreOffice 5.3
    */
  var Subtotals2: activexDashInteropLib.SafeArray[scala.Double]
  /** specifies whether to use the selected page to filter the data pilot or show all. */
  var UseSelectedPage: scala.Boolean
  /**
    * specifies which hierarchy of the dimension is used.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  var UsedHierarchy: java.lang.String
}

