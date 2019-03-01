package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the settings of a condition in a conditional format or data validation.
  * @see com.sun.star.sheet.TableConditionalEntry
  * @see com.sun.star.sheet.TableValidation
  */
trait XSheetCondition
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns either the comparison value, which is used in the condition, or the first value if two values are needed for the operator.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  var Formula1: java.lang.String
  /**
    * if two values are needed for the operator, this method returns the second one.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  var Formula2: java.lang.String
  /** returns the operator in the condition. */
  var Operator: ConditionOperator
  /** returns the position in the document which is used as a base for relative references in the formulas. */
  var SourcePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /**
    * returns either the comparison value, which is used in the condition, or the first value if two values are needed for the operator.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  def getFormula1(): java.lang.String
  /**
    * if two values are needed for the operator, this method returns the second one.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  def getFormula2(): java.lang.String
  /** returns the operator in the condition. */
  def getOperator(): ConditionOperator
  /** returns the position in the document which is used as a base for relative references in the formulas. */
  def getSourcePosition(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /**
    * sets either the comparison value, which is used in the condition, or the first value if two values are needed for the operator.
    * @param aFormula1 a formula, a numeric constant, or a string constant in quotes.
    */
  def setFormula1(aFormula1: java.lang.String): scala.Unit
  /**
    * if two values are needed for the operator, this method sets the second one.
    * @param aFormula2 a formula, a numeric constant, or a string constant in quotes.
    */
  def setFormula2(aFormula2: java.lang.String): scala.Unit
  /** sets the operator in the condition. */
  def setOperator(nOperator: ConditionOperator): scala.Unit
  /** sets the position in the document which is used as a base for relative references in the formulas. */
  def setSourcePosition(aSourcePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): scala.Unit
}

object XSheetCondition {
  @scala.inline
  def apply(
    Formula1: java.lang.String,
    Formula2: java.lang.String,
    Operator: ConditionOperator,
    SourcePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    acquire: js.Function0[scala.Unit],
    getFormula1: js.Function0[java.lang.String],
    getFormula2: js.Function0[java.lang.String],
    getOperator: js.Function0[ConditionOperator],
    getSourcePosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFormula1: js.Function1[java.lang.String, scala.Unit],
    setFormula2: js.Function1[java.lang.String, scala.Unit],
    setOperator: js.Function1[ConditionOperator, scala.Unit],
    setSourcePosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Unit]
  ): XSheetCondition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Formula1")(Formula1)
    __obj.updateDynamic("Formula2")(Formula2)
    __obj.updateDynamic("Operator")(Operator)
    __obj.updateDynamic("SourcePosition")(SourcePosition)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getFormula1")(getFormula1)
    __obj.updateDynamic("getFormula2")(getFormula2)
    __obj.updateDynamic("getOperator")(getOperator)
    __obj.updateDynamic("getSourcePosition")(getSourcePosition)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setFormula1")(setFormula1)
    __obj.updateDynamic("setFormula2")(setFormula2)
    __obj.updateDynamic("setOperator")(setOperator)
    __obj.updateDynamic("setSourcePosition")(setSourcePosition)
    __obj.asInstanceOf[XSheetCondition]
  }
}

