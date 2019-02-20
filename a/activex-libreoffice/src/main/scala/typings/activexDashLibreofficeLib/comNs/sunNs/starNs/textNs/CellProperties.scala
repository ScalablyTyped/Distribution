package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * service that holds all cell properties of a text table cell in a text document.
  * @see com.sun.star.text.Cell
  */
trait CellProperties
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier {
  /** contains the background color. */
  var BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the name of the graphic filter of the background graphic. */
  var BackGraphicFilter: java.lang.String
  /** determines the position of the background graphic. */
  var BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  /** contains the URL to the background graphic. */
  var BackGraphicURL: java.lang.String
  /** determines whether the background is transparent. */
  var BackTransparent: scala.Boolean
  /** contains the bottom border line. */
  var BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance of the bottom border. */
  var BottomBorderDistance: scala.Double
  /** contains the cell name, see SwXTextTable::getCellByName for more information */
  var CellName: java.lang.String
  /** determines whether the cell is write protected or not. */
  var IsProtected: scala.Boolean
  /** contains the left border line. */
  var LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance of the left border. */
  var LeftBorderDistance: scala.Double
  /** contains the number format. */
  var NumberFormat: scala.Double
  /** contains the right border line. */
  var RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance of the right border. */
  var RightBorderDistance: scala.Double
  /** contains the text section the text table is contained in if there is any. */
  var TextSection: XTextSection
  /** contains the top border line. */
  var TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance of the top border. */
  var TopBorderDistance: scala.Double
  /**
    * the vertical orientation of the text inside of the table cells in this row.
    * @see VertOrientation
    */
  var VertOrient: scala.Double
}

