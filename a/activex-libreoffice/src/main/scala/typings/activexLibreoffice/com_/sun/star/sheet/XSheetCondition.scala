package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the settings of a condition in a conditional format or data validation.
  * @see com.sun.star.sheet.TableConditionalEntry
  * @see com.sun.star.sheet.TableValidation
  */
trait XSheetCondition
  extends StObject
     with XInterface {
  
  /**
    * returns either the comparison value, which is used in the condition, or the first value if two values are needed for the operator.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  var Formula1: String
  
  /**
    * if two values are needed for the operator, this method returns the second one.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  var Formula2: String
  
  /** returns the operator in the condition. */
  var Operator: ConditionOperator
  
  /** returns the position in the document which is used as a base for relative references in the formulas. */
  var SourcePosition: CellAddress
  
  /**
    * returns either the comparison value, which is used in the condition, or the first value if two values are needed for the operator.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  def getFormula1(): String
  
  /**
    * if two values are needed for the operator, this method returns the second one.
    * @returns a formula, a numeric constant, or a string constant in quotes.
    */
  def getFormula2(): String
  
  /** returns the operator in the condition. */
  def getOperator(): ConditionOperator
  
  /** returns the position in the document which is used as a base for relative references in the formulas. */
  def getSourcePosition(): CellAddress
  
  /**
    * sets either the comparison value, which is used in the condition, or the first value if two values are needed for the operator.
    * @param aFormula1 a formula, a numeric constant, or a string constant in quotes.
    */
  def setFormula1(aFormula1: String): Unit
  
  /**
    * if two values are needed for the operator, this method sets the second one.
    * @param aFormula2 a formula, a numeric constant, or a string constant in quotes.
    */
  def setFormula2(aFormula2: String): Unit
  
  /** sets the operator in the condition. */
  def setOperator(nOperator: ConditionOperator): Unit
  
  /** sets the position in the document which is used as a base for relative references in the formulas. */
  def setSourcePosition(aSourcePosition: CellAddress): Unit
}
object XSheetCondition {
  
  inline def apply(
    Formula1: String,
    Formula2: String,
    Operator: ConditionOperator,
    SourcePosition: CellAddress,
    acquire: () => Unit,
    getFormula1: () => String,
    getFormula2: () => String,
    getOperator: () => ConditionOperator,
    getSourcePosition: () => CellAddress,
    queryInterface: `type` => Any,
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
  implicit open class MutableBuilder[Self <: XSheetCondition] (val x: Self) extends AnyVal {
    
    inline def setFormula1(value: String): Self = StObject.set(x, "Formula1", value.asInstanceOf[js.Any])
    
    inline def setFormula2(value: String): Self = StObject.set(x, "Formula2", value.asInstanceOf[js.Any])
    
    inline def setGetFormula1(value: () => String): Self = StObject.set(x, "getFormula1", js.Any.fromFunction0(value))
    
    inline def setGetFormula2(value: () => String): Self = StObject.set(x, "getFormula2", js.Any.fromFunction0(value))
    
    inline def setGetOperator(value: () => ConditionOperator): Self = StObject.set(x, "getOperator", js.Any.fromFunction0(value))
    
    inline def setGetSourcePosition(value: () => CellAddress): Self = StObject.set(x, "getSourcePosition", js.Any.fromFunction0(value))
    
    inline def setOperator(value: ConditionOperator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setSetFormula1(value: String => Unit): Self = StObject.set(x, "setFormula1", js.Any.fromFunction1(value))
    
    inline def setSetFormula2(value: String => Unit): Self = StObject.set(x, "setFormula2", js.Any.fromFunction1(value))
    
    inline def setSetOperator(value: ConditionOperator => Unit): Self = StObject.set(x, "setOperator", js.Any.fromFunction1(value))
    
    inline def setSetSourcePosition(value: CellAddress => Unit): Self = StObject.set(x, "setSourcePosition", js.Any.fromFunction1(value))
    
    inline def setSourcePosition(value: CellAddress): Self = StObject.set(x, "SourcePosition", value.asInstanceOf[js.Any])
  }
}
