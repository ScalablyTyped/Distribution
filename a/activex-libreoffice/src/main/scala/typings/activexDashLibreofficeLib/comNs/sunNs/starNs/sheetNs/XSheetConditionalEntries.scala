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

