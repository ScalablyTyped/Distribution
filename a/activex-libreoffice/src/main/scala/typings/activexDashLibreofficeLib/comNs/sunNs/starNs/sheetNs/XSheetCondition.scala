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
    acquire: () => scala.Unit,
    getFormula1: () => java.lang.String,
    getFormula2: () => java.lang.String,
    getOperator: () => ConditionOperator,
    getSourcePosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFormula1: java.lang.String => scala.Unit,
    setFormula2: java.lang.String => scala.Unit,
    setOperator: ConditionOperator => scala.Unit,
    setSourcePosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress => scala.Unit
  ): XSheetCondition = {
    val __obj = js.Dynamic.literal(Formula1 = Formula1, Formula2 = Formula2, Operator = Operator, SourcePosition = SourcePosition, acquire = js.Any.fromFunction0(acquire), getFormula1 = js.Any.fromFunction0(getFormula1), getFormula2 = js.Any.fromFunction0(getFormula2), getOperator = js.Any.fromFunction0(getOperator), getSourcePosition = js.Any.fromFunction0(getSourcePosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormula1 = js.Any.fromFunction1(setFormula1), setFormula2 = js.Any.fromFunction1(setFormula2), setOperator = js.Any.fromFunction1(setOperator), setSourcePosition = js.Any.fromFunction1(setSourcePosition))
  
    __obj.asInstanceOf[XSheetCondition]
  }
}

