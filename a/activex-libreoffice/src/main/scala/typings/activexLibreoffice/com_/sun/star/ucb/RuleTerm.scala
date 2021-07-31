package typings.activexLibreoffice.com_.sun.star.ucb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a term.
  *
  * A term is used to select objects to which a rule should apply.
  */
trait RuleTerm extends StObject {
  
  /** this flag indicates whether a string "operand" shall be compared case sensitive. */
  var CaseSensitive: Boolean
  
  /** the value of the property used to compare with the document property. */
  var Operand: js.Any
  
  /**
    * the operator used to compare the property of the document with the given value (e.g. "contains" or "greater equal").
    *
    * The value can be one of the {@link RuleOperator} constants.
    */
  var Operator: Double
  
  /** the name of the property used to match the term. */
  var Property: String
  
  /** this flag indicates whether a string "operand" shall be treated as a regular expression. */
  var RegularExpression: Boolean
}
object RuleTerm {
  
  @scala.inline
  def apply(
    CaseSensitive: Boolean,
    Operand: js.Any,
    Operator: Double,
    Property: String,
    RegularExpression: Boolean
  ): RuleTerm = {
    val __obj = js.Dynamic.literal(CaseSensitive = CaseSensitive.asInstanceOf[js.Any], Operand = Operand.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], RegularExpression = RegularExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleTerm]
  }
  
  @scala.inline
  implicit class RuleTermMutableBuilder[Self <: RuleTerm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "CaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperand(value: js.Any): Self = StObject.set(x, "Operand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: Double): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularExpression(value: Boolean): Self = StObject.set(x, "RegularExpression", value.asInstanceOf[js.Any])
  }
}
