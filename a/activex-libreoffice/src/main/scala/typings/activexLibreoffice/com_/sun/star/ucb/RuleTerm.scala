package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a term.
  *
  * A term is used to select objects to which a rule should apply.
  */
@js.native
trait RuleTerm extends js.Object {
  /** this flag indicates whether a string "operand" shall be compared case sensitive. */
  var CaseSensitive: Boolean = js.native
  /** the value of the property used to compare with the document property. */
  var Operand: js.Any = js.native
  /**
    * the operator used to compare the property of the document with the given value (e.g. "contains" or "greater equal").
    *
    * The value can be one of the {@link RuleOperator} constants.
    */
  var Operator: Double = js.native
  /** the name of the property used to match the term. */
  var Property: String = js.native
  /** this flag indicates whether a string "operand" shall be treated as a regular expression. */
  var RegularExpression: Boolean = js.native
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
  implicit class RuleTermOps[Self <: RuleTerm] (val x: Self) extends AnyVal {
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
    def setCaseSensitive(value: Boolean): Self = this.set("CaseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperand(value: js.Any): Self = this.set("Operand", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: Double): Self = this.set("Operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: String): Self = this.set("Property", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegularExpression(value: Boolean): Self = this.set("RegularExpression", value.asInstanceOf[js.Any])
  }
  
}

