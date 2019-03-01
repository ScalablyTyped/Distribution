package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access cell annotations via index and to insert and remove annotations.
  * @see com.sun.star.sheet.CellAnnotation
  * @see com.sun.star.sheet.SheetCell
  */
trait XSheetAnnotations
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * creates a new annotation.
    *
    * This method creates a new annotation object, attaches it to the specified cell and inserts it into the collection.
    * @param aPosition contains the address of the cell that will contain the annotation.
    * @param aText contains the annotation text.
    */
  def insertNew(
    aPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    aText: java.lang.String
  ): scala.Unit
  /**
    * removes a cell annotation from the collection.
    *
    * This method removes the annotation from its cell and from the collection.
    * @param nIndex is the index of the annotation in the collection.
    */
  def removeByIndex(nIndex: scala.Double): scala.Unit
}

object XSheetAnnotations {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    insertNew: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, 
      java.lang.String, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit]
  ): XSheetAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insertNew")(insertNew)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeByIndex")(removeByIndex)
    __obj.asInstanceOf[XSheetAnnotations]
  }
}

