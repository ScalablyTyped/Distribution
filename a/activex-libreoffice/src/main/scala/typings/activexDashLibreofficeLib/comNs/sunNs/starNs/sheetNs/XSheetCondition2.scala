package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the settings of a condition in a conditional format or data validation.
  * @see com.sun.star.sheet.TableConditionalEntry
  * @see com.sun.star.sheet.TableValidation
  * @see com.sun.star.sheet.XSheetCondition
  */
trait XSheetCondition2 extends XSheetCondition {
  /** returns the operator in the condition (new interface). */
  var ConditionOperator: scala.Double
  /** returns the operator in the condition (new interface). */
  def getConditionOperator(): scala.Double
  /** sets the operator in the condition (new interface). */
  def setConditionOperator(nOperator: scala.Double): scala.Unit
}

object XSheetCondition2 {
  @scala.inline
  def apply(
    ConditionOperator: scala.Double,
    Formula1: java.lang.String,
    Formula2: java.lang.String,
    Operator: ConditionOperator,
    SourcePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    acquire: () => scala.Unit,
    getConditionOperator: () => scala.Double,
    getFormula1: () => java.lang.String,
    getFormula2: () => java.lang.String,
    getOperator: () => ConditionOperator,
    getSourcePosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setConditionOperator: scala.Double => scala.Unit,
    setFormula1: java.lang.String => scala.Unit,
    setFormula2: java.lang.String => scala.Unit,
    setOperator: ConditionOperator => scala.Unit,
    setSourcePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => scala.Unit
  ): XSheetCondition2 = {
    val __obj = js.Dynamic.literal(ConditionOperator = ConditionOperator, Formula1 = Formula1, Formula2 = Formula2, Operator = Operator, SourcePosition = SourcePosition, acquire = js.Any.fromFunction0(acquire), getConditionOperator = js.Any.fromFunction0(getConditionOperator), getFormula1 = js.Any.fromFunction0(getFormula1), getFormula2 = js.Any.fromFunction0(getFormula2), getOperator = js.Any.fromFunction0(getOperator), getSourcePosition = js.Any.fromFunction0(getSourcePosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setConditionOperator = js.Any.fromFunction1(setConditionOperator), setFormula1 = js.Any.fromFunction1(setFormula1), setFormula2 = js.Any.fromFunction1(setFormula2), setOperator = js.Any.fromFunction1(setOperator), setSourcePosition = js.Any.fromFunction1(setSourcePosition))
  
    __obj.asInstanceOf[XSheetCondition2]
  }
}

