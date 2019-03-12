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

object XSpreadsheets2 {
  @scala.inline
  def apply(
    ElementNames: stdLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: () => scala.Unit,
    copyByName: (java.lang.String, java.lang.String, scala.Double) => scala.Unit,
    getByName: java.lang.String => js.Any,
    getElementNames: () => stdLib.SafeArray[java.lang.String],
    getElementType: () => activexDashLibreofficeLib.`type`,
    hasByName: java.lang.String => scala.Boolean,
    hasElements: () => scala.Boolean,
    importSheet: (XSpreadsheetDocument, java.lang.String, scala.Double) => scala.Double,
    insertByName: (java.lang.String, js.Any) => scala.Unit,
    insertNewByName: (java.lang.String, scala.Double) => scala.Unit,
    moveByName: (java.lang.String, scala.Double) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeByName: java.lang.String => scala.Unit,
    replaceByName: (java.lang.String, js.Any) => scala.Unit
  ): XSpreadsheets2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), copyByName = js.Any.fromFunction3(copyByName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), importSheet = js.Any.fromFunction3(importSheet), insertByName = js.Any.fromFunction2(insertByName), insertNewByName = js.Any.fromFunction2(insertNewByName), moveByName = js.Any.fromFunction2(moveByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), replaceByName = js.Any.fromFunction2(replaceByName))
  
    __obj.asInstanceOf[XSpreadsheets2]
  }
}

