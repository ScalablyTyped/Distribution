package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the settings of a condition in a conditional format or data validation.
  * @see com.sun.star.sheet.TableConditionalEntry
  * @see com.sun.star.sheet.TableValidation
  */
@js.native
trait XSheetCondition extends XInterface {
  
  /**
    * returns either the comparison value, which is used in the condition, or the first value if two values are needed for the operator.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  var Formula1: String = js.native
  
  /**
    * if two values are needed for the operator, this method returns the second one.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  var Formula2: String = js.native
  
  /** returns the operator in the condition. */
  var Operator: ConditionOperator = js.native
  
  /** returns the position in the document which is used as a base for relative references in the formulas. */
  var SourcePosition: CellAddress = js.native
  
  /**
    * returns either the comparison value, which is used in the condition, or the first value if two values are needed for the operator.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  def getFormula1(): String = js.native
  
  /**
    * if two values are needed for the operator, this method returns the second one.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  def getFormula2(): String = js.native
  
  /** returns the operator in the condition. */
  def getOperator(): ConditionOperator = js.native
  
  /** returns the position in the document which is used as a base for relative references in the formulas. */
  def getSourcePosition(): CellAddress = js.native
  
  /**
    * sets either the comparison value, which is used in the condition, or the first value if two values are needed for the operator.
    * @param aFormula1 a formula, a numeric constant, or a string constant in quotes.
    */
  def setFormula1(aFormula1: String): Unit = js.native
  
  /**
    * if two values are needed for the operator, this method sets the second one.
    * @param aFormula2 a formula, a numeric constant, or a string constant in quotes.
    */
  def setFormula2(aFormula2: String): Unit = js.native
  
  /** sets the operator in the condition. */
  def setOperator(nOperator: ConditionOperator): Unit = js.native
  
  /** sets the position in the document which is used as a base for relative references in the formulas. */
  def setSourcePosition(aSourcePosition: CellAddress): Unit = js.native
}
object XSheetCondition {
  
  @scala.inline
  def apply(
    Formula1: String,
    Formula2: String,
    Operator: ConditionOperator,
    SourcePosition: CellAddress,
    acquire: () => Unit,
    getFormula1: () => String,
    getFormula2: () => String,
    getOperator: () => ConditionOperator,
    getSourcePosition: () => CellAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFormula1: String => Unit,
    setFormula2: String => Unit,
    setOperator: ConditionOperator => Unit,
    setSourcePosition: CellAddress => Unit
  ): XSheetCondition = {
    val __obj = js.Dynamic.literal(Formula1 = Formula1.asInstanceOf[js.Any], Formula2 = Formula2.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], SourcePosition = SourcePosition.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFormula1 = js.Any.fromFunction0(getFormula1), getFormula2 = js.Any.fromFunction0(getFormula2), getOperator = js.Any.fromFunction0(getOperator), getSourcePosition = js.Any.fromFunction0(getSourcePosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormula1 = js.Any.fromFunction1(setFormula1), setFormula2 = js.Any.fromFunction1(setFormula2), setOperator = js.Any.fromFunction1(setOperator), setSourcePosition = js.Any.fromFunction1(setSourcePosition))
    __obj.asInstanceOf[XSheetCondition]
  }
  
  @scala.inline
  implicit class XSheetConditionOps[Self <: XSheetCondition] (val x: Self) extends AnyVal {
    
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
    def setFormula1(value: String): Self = this.set("Formula1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormula2(value: String): Self = this.set("Formula2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: ConditionOperator): Self = this.set("Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePosition(value: CellAddress): Self = this.set("SourcePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFormula1(value: () => String): Self = this.set("getFormula1", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormula2(value: () => String): Self = this.set("getFormula2", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOperator(value: () => ConditionOperator): Self = this.set("getOperator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSourcePosition(value: () => CellAddress): Self = this.set("getSourcePosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFormula1(value: String => Unit): Self = this.set("setFormula1", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFormula2(value: String => Unit): Self = this.set("setFormula2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOperator(value: ConditionOperator => Unit): Self = this.set("setOperator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSourcePosition(value: CellAddress => Unit): Self = this.set("setSourcePosition", js.Any.fromFunction1(value))
  }
}
