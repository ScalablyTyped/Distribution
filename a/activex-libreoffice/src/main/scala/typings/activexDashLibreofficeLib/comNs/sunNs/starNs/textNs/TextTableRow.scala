package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the properties of a text table row.
  * @see com.sun.star.TextTable
  */
trait TextTableRow
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies the color of the background. */
  var BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the name of the file filter of a background graphic. */
  var BackGraphicFilter: java.lang.String
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  /** contains the URL of a background graphic. */
  var BackGraphicURL: java.lang.String
  /** If `TRUE` , the background color value in "BackColor" is not visible. */
  var BackTransparent: scala.Boolean
  /** contains the height of the table row. */
  var Height: scala.Double
  /** If the value of this property is `TRUE` , the height of the table row depends on the content of the table cells. */
  var IsAutoHeight: scala.Boolean
  /**
    * If `TRUE` , the row is allowed to be split at page or column breaks.
    * @@since OOo 2.0
    */
  var IsSplitAllowed: scala.Boolean
  /**
    * Grab bag of row properties, used as a string-any map for interop purposes.
    * @since LibreOffice 4.4  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var RowInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** contains the description of the columns in the table row. */
  var TableColumnSeparators: activexDashInteropLib.SafeArray[TableColumnSeparator]
}

