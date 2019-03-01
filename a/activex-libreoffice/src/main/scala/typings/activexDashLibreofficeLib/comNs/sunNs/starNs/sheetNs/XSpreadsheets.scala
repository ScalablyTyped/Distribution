package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the spreadsheets by name and to insert, copy, remove and rearrange spreadsheets.
  * @see com.sun.star.sheet.Spreadsheets
  */
trait XSpreadsheets
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer {
  /**
    * copies a sheet within the collection.
    * @param aName the name of the spreadsheet to copy.
    * @param aCopy the name of the copy of the spreadsheet.
    * @param nDestination the index of the copy in the collection.
    */
  def copyByName(aName: java.lang.String, aCopy: java.lang.String, nDestination: scala.Double): scala.Unit
  /**
    * inserts a new sheet into the collection.
    * @param aName the name of the new spreadsheet.
    * @param nPosition the index of the new spreadsheet in the collection.
    */
  def insertNewByName(aName: java.lang.String, nPosition: scala.Double): scala.Unit
  /**
    * moves a sheet within the collection.
    * @param aName the name of the spreadsheet to move.
    * @param nDestination the new index of the spreadsheet in the collection.
    */
  def moveByName(aName: java.lang.String, nDestination: scala.Double): scala.Unit
}

object XSpreadsheets {
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
    insertByName: js.Function2[java.lang.String, js.Any, scala.Unit],
    insertNewByName: js.Function2[java.lang.String, scala.Double, scala.Unit],
    moveByName: js.Function2[java.lang.String, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByName: js.Function1[java.lang.String, scala.Unit],
    replaceByName: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XSpreadsheets = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ElementNames")(ElementNames)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("copyByName")(copyByName)
    __obj.updateDynamic("getByName")(getByName)
    __obj.updateDynamic("getElementNames")(getElementNames)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasByName")(hasByName)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insertByName")(insertByName)
    __obj.updateDynamic("insertNewByName")(insertNewByName)
    __obj.updateDynamic("moveByName")(moveByName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByName")(removeByName)
    __obj.updateDynamic("replaceByName")(replaceByName)
    __obj.asInstanceOf[XSpreadsheets]
  }
}

