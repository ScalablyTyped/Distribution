package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends {@link XSpreadsheets} interface to import external sheets.
  * @see com.sun.star.sheet.Spreadsheets
  */
trait XSpreadsheets2 extends XSpreadsheets {
  /**
    * copies a sheet from a source document.
    * @param srcDoc a valid {@link XSpreadsheetDocument} reference to source doc
    * @param srcName the source sheet name. Throw IllegalArgumentException if not valid
    * @param nDestPosition the destination sheet position. Throw IndexOutOfBoundsException if not valid
    * @returns the position of the imported sheet
    * @since LibreOffice 3.5
    * @throws com::sun::star::lang::IllegalArgumentException
    * @throws com::sun::star::lang::IndexOutOfBoundsException
    */
  def importSheet(srcDoc: XSpreadsheetDocument, srcName: java.lang.String, nDestPosition: scala.Double): scala.Double
}

