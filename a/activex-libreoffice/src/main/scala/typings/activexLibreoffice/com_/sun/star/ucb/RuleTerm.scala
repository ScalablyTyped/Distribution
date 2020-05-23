package typings.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a term.
  *
  * A term is used to select objects to which a rule should apply.
  */
trait RuleTerm extends js.Object {
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
}

