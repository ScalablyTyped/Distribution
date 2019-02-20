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

