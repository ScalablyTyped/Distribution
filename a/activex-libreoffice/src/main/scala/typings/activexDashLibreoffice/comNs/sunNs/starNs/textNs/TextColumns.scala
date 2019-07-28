package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.VerticalAlignment
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to columns in text (e.g., in {@link TextFrames} ). */
trait TextColumns extends XTextColumns {
  /**
    * contains the distance between the columns. It is valid if the property IsAutomatic is set. Half of this distance is set to the left and right margins
    * of all columns, except for the left margin of the first column, and the right margin of the last column.
    */
  var AutomaticDistance: Double
  /**
    * determines whether the columns all have equal width. This flag is set if {@link XTextColumns.setColumnCount()} is called and it is reset if {@link
    * XTextColumns.setColumns()} is called.
    */
  var IsAutomatic: Boolean
  /** determines the color of the separator lines between the columns. */
  var SeparatorLineColor: Color
  /** determines whether separator lines are on. */
  var SeparatorLineIsOn: Boolean
  /** determines the relative height of the separator lines between the columns. */
  var SeparatorLineRelativeHeight: Double
  /**
    * determines the style of the separator lines between the columns.
    * @see com.sun.star.text:ColumnSeparatorStyle for the possible values.
    */
  var SeparatorLineStyle: Double
  /** determines the vertical alignment of the separator lines between the columns. */
  var SeparatorLineVerticalAlignment: VerticalAlignment
  /** determines the width of the separator lines between the columns. */
  var SeparatorLineWidth: Double
}

object TextColumns {
  @scala.inline
  def apply(
    AutomaticDistance: Double,
    ColumnCount: Double,
    Columns: SafeArray[TextColumn],
    IsAutomatic: Boolean,
    ReferenceValue: Double,
    SeparatorLineColor: Color,
    SeparatorLineIsOn: Boolean,
    SeparatorLineRelativeHeight: Double,
    SeparatorLineStyle: Double,
    SeparatorLineVerticalAlignment: VerticalAlignment,
    SeparatorLineWidth: Double,
    acquire: () => Unit,
    getColumnCount: () => Double,
    getColumns: () => SafeArray[TextColumn],
    getReferenceValue: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setColumnCount: Double => Unit,
    setColumns: SeqEquiv[TextColumn] => Unit
  ): TextColumns = {
    val __obj = js.Dynamic.literal(AutomaticDistance = AutomaticDistance, ColumnCount = ColumnCount, Columns = Columns, IsAutomatic = IsAutomatic, ReferenceValue = ReferenceValue, SeparatorLineColor = SeparatorLineColor, SeparatorLineIsOn = SeparatorLineIsOn, SeparatorLineRelativeHeight = SeparatorLineRelativeHeight, SeparatorLineStyle = SeparatorLineStyle, SeparatorLineVerticalAlignment = SeparatorLineVerticalAlignment, SeparatorLineWidth = SeparatorLineWidth, acquire = js.Any.fromFunction0(acquire), getColumnCount = js.Any.fromFunction0(getColumnCount), getColumns = js.Any.fromFunction0(getColumns), getReferenceValue = js.Any.fromFunction0(getReferenceValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setColumnCount = js.Any.fromFunction1(setColumnCount), setColumns = js.Any.fromFunction1(setColumns))
  
    __obj.asInstanceOf[TextColumns]
  }
}

