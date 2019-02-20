package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an AutoFormat, containing exactly 16 AutoFormat fields.
  *
  * Each of the 16 fields contain formatting properties for a table cell at a specific position in the AutoFormat range. The rows of the range are divided
  * into a header row, a footer row and 2 data rows (repeated in turn between header and footer row). The columns are divided similar. This results in 16
  * different types of cells in the range. The AutoFormats are numbered row by row, then column by column.
  * @see com.sun.star.sheet.TableAutoFormatField
  */
trait TableAutoFormat
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /** specifies whether the background settings from the fields are used. */
  var IncludeBackground: scala.Boolean
  /** specifies whether the border settings from the fields are used. */
  var IncludeBorder: scala.Boolean
  /** specifies whether the font settings from the fields are used. */
  var IncludeFont: scala.Boolean
  /** specifies whether the justification settings from the fields are used. */
  var IncludeJustify: scala.Boolean
  /** specifies whether the number format settings from the fields are used. */
  var IncludeNumberFormat: scala.Boolean
  /** specifies whether the column widths and row heights should be updated after applying the format. */
  var IncludeWidthAndHeight: scala.Boolean
}

