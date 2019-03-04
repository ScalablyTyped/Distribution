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
    acquire: js.Function0[scala.Unit],
    getConditionOperator: js.Function0[scala.Double],
    getFormula1: js.Function0[java.lang.String],
    getFormula2: js.Function0[java.lang.String],
    getOperator: js.Function0[ConditionOperator],
    getSourcePosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setConditionOperator: js.Function1[scala.Double, scala.Unit],
    setFormula1: js.Function1[java.lang.String, scala.Unit],
    setFormula2: js.Function1[java.lang.String, scala.Unit],
    setOperator: js.Function1[ConditionOperator, scala.Unit],
    setSourcePosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Unit]
  ): XSheetCondition2 = {
    val __obj = js.Dynamic.literal(ConditionOperator = ConditionOperator, Formula1 = Formula1, Formula2 = Formula2, Operator = Operator, SourcePosition = SourcePosition, acquire = acquire, getConditionOperator = getConditionOperator, getFormula1 = getFormula1, getFormula2 = getFormula2, getOperator = getOperator, getSourcePosition = getSourcePosition, queryInterface = queryInterface, release = release, setConditionOperator = setConditionOperator, setFormula1 = setFormula1, setFormula2 = setFormula2, setOperator = setOperator, setSourcePosition = setSourcePosition)
  
    __obj.asInstanceOf[XSheetCondition2]
  }
}

