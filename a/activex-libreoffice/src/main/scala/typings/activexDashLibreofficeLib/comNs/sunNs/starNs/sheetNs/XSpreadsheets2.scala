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
    ElementNames: activexDashInteropLib.SafeArray[java.lang.String],
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    copyByName: js.Function3[java.lang.String, java.lang.String, scala.Double, scala.Unit],
    getByName: js.Function1[java.lang.String, js.Any],
    getElementNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasByName: js.Function1[java.lang.String, scala.Boolean],
    hasElements: js.Function0[scala.Boolean],
    importSheet: js.Function3[XSpreadsheetDocument, java.lang.String, scala.Double, scala.Double],
    insertByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    insertNewByName: js.Function2[java.lang.String, scala.Double, scala.Unit],
    moveByName: js.Function2[java.lang.String, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    replaceByName: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XSpreadsheets2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames, ElementType = ElementType, acquire = acquire, copyByName = copyByName, getByName = getByName, getElementNames = getElementNames, getElementType = getElementType, hasByName = hasByName, hasElements = hasElements, importSheet = importSheet, insertByName = insertByName, insertNewByName = insertNewByName, moveByName = moveByName, queryInterface = queryInterface, release = release, removeByName = removeByName, replaceByName = replaceByName)
  
    __obj.asInstanceOf[XSpreadsheets2]
  }
}

