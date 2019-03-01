package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to columns in text (e.g., in {@link TextFrames} ). */
trait TextColumns extends XTextColumns {
  /**
    * contains the distance between the columns. It is valid if the property IsAutomatic is set. Half of this distance is set to the left and right margins
    * of all columns, except for the left margin of the first column, and the right margin of the last column.
    */
  var AutomaticDistance: scala.Double
  /**
    * determines whether the columns all have equal width. This flag is set if {@link XTextColumns.setColumnCount()} is called and it is reset if {@link
    * XTextColumns.setColumns()} is called.
    */
  var IsAutomatic: scala.Boolean
  /** determines the color of the separator lines between the columns. */
  var SeparatorLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** determines whether separator lines are on. */
  var SeparatorLineIsOn: scala.Boolean
  /** determines the relative height of the separator lines between the columns. */
  var SeparatorLineRelativeHeight: scala.Double
  /**
    * determines the style of the separator lines between the columns.
    * @see com.sun.star.text:ColumnSeparatorStyle for the possible values.
    */
  var SeparatorLineStyle: scala.Double
  /** determines the vertical alignment of the separator lines between the columns. */
  var SeparatorLineVerticalAlignment: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment
  /** determines the width of the separator lines between the columns. */
  var SeparatorLineWidth: scala.Double
}

object TextColumns {
  @scala.inline
  def apply(
    AutomaticDistance: scala.Double,
    ColumnCount: scala.Double,
    Columns: activexDashInteropLib.SafeArray[TextColumn],
    IsAutomatic: scala.Boolean,
    ReferenceValue: scala.Double,
    SeparatorLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    SeparatorLineIsOn: scala.Boolean,
    SeparatorLineRelativeHeight: scala.Double,
    SeparatorLineStyle: scala.Double,
    SeparatorLineVerticalAlignment: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment,
    SeparatorLineWidth: scala.Double,
    acquire: js.Function0[scala.Unit],
    getColumnCount: js.Function0[scala.Double],
    getColumns: js.Function0[activexDashInteropLib.SafeArray[TextColumn]],
    getReferenceValue: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setColumnCount: js.Function1[scala.Double, scala.Unit],
    setColumns: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TextColumn], scala.Unit]
  ): TextColumns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutomaticDistance")(AutomaticDistance)
    __obj.updateDynamic("ColumnCount")(ColumnCount)
    __obj.updateDynamic("Columns")(Columns)
    __obj.updateDynamic("IsAutomatic")(IsAutomatic)
    __obj.updateDynamic("ReferenceValue")(ReferenceValue)
    __obj.updateDynamic("SeparatorLineColor")(SeparatorLineColor)
    __obj.updateDynamic("SeparatorLineIsOn")(SeparatorLineIsOn)
    __obj.updateDynamic("SeparatorLineRelativeHeight")(SeparatorLineRelativeHeight)
    __obj.updateDynamic("SeparatorLineStyle")(SeparatorLineStyle)
    __obj.updateDynamic("SeparatorLineVerticalAlignment")(SeparatorLineVerticalAlignment)
    __obj.updateDynamic("SeparatorLineWidth")(SeparatorLineWidth)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getColumnCount")(getColumnCount)
    __obj.updateDynamic("getColumns")(getColumns)
    __obj.updateDynamic("getReferenceValue")(getReferenceValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setColumnCount")(setColumnCount)
    __obj.updateDynamic("setColumns")(setColumns)
    __obj.asInstanceOf[TextColumns]
  }
}

