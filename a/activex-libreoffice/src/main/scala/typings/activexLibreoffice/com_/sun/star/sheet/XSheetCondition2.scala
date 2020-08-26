package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the settings of a condition in a conditional format or data validation.
  * @see com.sun.star.sheet.TableConditionalEntry
  * @see com.sun.star.sheet.TableValidation
  * @see com.sun.star.sheet.XSheetCondition
  */
@js.native
trait XSheetCondition2 extends XSheetCondition {
  /** returns the operator in the condition (new interface). */
  var ConditionOperator: Double = js.native
  /** returns the operator in the condition (new interface). */
  def getConditionOperator(): Double = js.native
  /** sets the operator in the condition (new interface). */
  def setConditionOperator(nOperator: Double): Unit = js.native
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
    val __obj = js.Dynamic.literal(ConditionOperator = ConditionOperator.asInstanceOf[js.Any], Formula1 = Formula1.asInstanceOf[js.Any], Formula2 = Formula2.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], SourcePosition = SourcePosition.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getConditionOperator = js.Any.fromFunction0(getConditionOperator), getFormula1 = js.Any.fromFunction0(getFormula1), getFormula2 = js.Any.fromFunction0(getFormula2), getOperator = js.Any.fromFunction0(getOperator), getSourcePosition = js.Any.fromFunction0(getSourcePosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setConditionOperator = js.Any.fromFunction1(setConditionOperator), setFormula1 = js.Any.fromFunction1(setFormula1), setFormula2 = js.Any.fromFunction1(setFormula2), setOperator = js.Any.fromFunction1(setOperator), setSourcePosition = js.Any.fromFunction1(setSourcePosition))
    __obj.asInstanceOf[XSheetCondition2]
  }
  @scala.inline
  implicit class XSheetCondition2Ops[Self <: XSheetCondition2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConditionOperator(value: Double): Self = this.set("ConditionOperator", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetConditionOperator(value: () => Double): Self = this.set("getConditionOperator", js.Any.fromFunction0(value))
    @scala.inline
    def setSetConditionOperator(value: Double => Unit): Self = this.set("setConditionOperator", js.Any.fromFunction1(value))
  }
  
}

