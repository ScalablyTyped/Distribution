package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to add and remove conditions of a conditional format.
  * @see com.sun.star.sheet.TableConditionalFormat
  * @see com.sun.star.sheet.TableConditionalEntry
  */
trait XSheetConditionalEntries
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * adds a conditional entry to the format.
    *
    * Supported properties are:
    *
    * **ConditionOperator Operator **: contains the operation to perform for this condition.;
    *
    * **string Formula1 **: contains the value or formula for the operation.;
    *
    * **string Formula2 **: contains the second value or formula for the operation (used with ConditionOperator::BETWEEN or ConditionOperator::NOT_BETWEEN
    * operations).;
    *
    * **com::sun::star::table::CellAddress SourcePosition **: contains the base address for relative cell references in formulas.;
    *
    * **string StyleName **: contains the name of the cell style used by this condition.
    * @see com.sun.star.sheet.TableConditionalFormat
    */
  def addNew(
    aConditionalEntry: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
  /** clears all condition entries. */
  def clear(): scala.Unit
  /** removes a conditional entry from the format. */
  def removeByIndex(nIndex: scala.Double): scala.Unit
}

object XSheetConditionalEntries {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    addNew: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    clear: js.Function0[scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeByIndex: js.Function1[scala.Double, scala.Unit]
  ): XSheetConditionalEntries = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, addNew = addNew, clear = clear, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, queryInterface = queryInterface, release = release, removeByIndex = removeByIndex)
  
    __obj.asInstanceOf[XSheetConditionalEntries]
  }
}

