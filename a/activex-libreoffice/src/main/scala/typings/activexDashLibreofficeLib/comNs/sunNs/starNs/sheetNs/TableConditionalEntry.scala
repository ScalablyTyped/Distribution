package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a single condition in a conditional format.
  * @see com.sun.star.sheet.TableConditionalFormat
  */
trait TableConditionalEntry
  extends XSheetCondition
     with XSheetConditionalEntry

object TableConditionalEntry {
  @scala.inline
  def apply(
    Formula1: java.lang.String,
    Formula2: java.lang.String,
    Operator: ConditionOperator,
    SourcePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    StyleName: java.lang.String,
    acquire: () => scala.Unit,
    getFormula1: () => java.lang.String,
    getFormula2: () => java.lang.String,
    getOperator: () => ConditionOperator,
    getSourcePosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    getStyleName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFormula1: java.lang.String => scala.Unit,
    setFormula2: java.lang.String => scala.Unit,
    setOperator: ConditionOperator => scala.Unit,
    setSourcePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => scala.Unit,
    setStyleName: java.lang.String => scala.Unit
  ): TableConditionalEntry = {
    val __obj = js.Dynamic.literal(Formula1 = Formula1, Formula2 = Formula2, Operator = Operator, SourcePosition = SourcePosition, StyleName = StyleName, acquire = js.Any.fromFunction0(acquire), getFormula1 = js.Any.fromFunction0(getFormula1), getFormula2 = js.Any.fromFunction0(getFormula2), getOperator = js.Any.fromFunction0(getOperator), getSourcePosition = js.Any.fromFunction0(getSourcePosition), getStyleName = js.Any.fromFunction0(getStyleName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormula1 = js.Any.fromFunction1(setFormula1), setFormula2 = js.Any.fromFunction1(setFormula2), setOperator = js.Any.fromFunction1(setOperator), setSourcePosition = js.Any.fromFunction1(setSourcePosition), setStyleName = js.Any.fromFunction1(setStyleName))
  
    __obj.asInstanceOf[TableConditionalEntry]
  }
}

