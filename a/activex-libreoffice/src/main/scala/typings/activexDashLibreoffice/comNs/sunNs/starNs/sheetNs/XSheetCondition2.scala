package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
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
  var ConditionOperator: Double
  /** returns the operator in the condition (new interface). */
  def getConditionOperator(): Double
  /** sets the operator in the condition (new interface). */
  def setConditionOperator(nOperator: Double): Unit
}

object XSheetCondition2 {
  @scala.inline
  def apply(
    ConditionOperator: Double,
    Formula1: String,
    Formula2: String,
    Operator: ConditionOperator,
    SourcePosition: CellAddress,
    acquire: () => Unit,
    getConditionOperator: () => Double,
    getFormula1: () => String,
    getFormula2: () => String,
    getOperator: () => ConditionOperator,
    getSourcePosition: () => CellAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setConditionOperator: Double => Unit,
    setFormula1: String => Unit,
    setFormula2: String => Unit,
    setOperator: ConditionOperator => Unit,
    setSourcePosition: CellAddress => Unit
  ): XSheetCondition2 = {
    val __obj = js.Dynamic.literal(ConditionOperator = ConditionOperator, Formula1 = Formula1, Formula2 = Formula2, Operator = Operator, SourcePosition = SourcePosition, acquire = js.Any.fromFunction0(acquire), getConditionOperator = js.Any.fromFunction0(getConditionOperator), getFormula1 = js.Any.fromFunction0(getFormula1), getFormula2 = js.Any.fromFunction0(getFormula2), getOperator = js.Any.fromFunction0(getOperator), getSourcePosition = js.Any.fromFunction0(getSourcePosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setConditionOperator = js.Any.fromFunction1(setConditionOperator), setFormula1 = js.Any.fromFunction1(setFormula1), setFormula2 = js.Any.fromFunction1(setFormula2), setOperator = js.Any.fromFunction1(setOperator), setSourcePosition = js.Any.fromFunction1(setSourcePosition))
  
    __obj.asInstanceOf[XSheetCondition2]
  }
}

