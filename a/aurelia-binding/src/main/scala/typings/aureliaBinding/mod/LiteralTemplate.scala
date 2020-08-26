package typings.aureliaBinding.mod

import typings.aureliaBinding.anon.ArraystringrawArraystring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "LiteralTemplate")
@js.native
class LiteralTemplate protected () extends Expression {
  def this(cooked: js.Array[String]) = this()
  def this(cooked: js.Array[String], expressions: js.Array[Expression]) = this()
  def this(cooked: js.Array[String], expressions: js.UndefOr[scala.Nothing], raw: js.Array[String]) = this()
  def this(cooked: js.Array[String], expressions: js.Array[Expression], raw: js.Array[String]) = this()
  def this(
    cooked: js.Array[String],
    expressions: js.UndefOr[scala.Nothing],
    raw: js.UndefOr[scala.Nothing],
    func: AccessKeyed
  ) = this()
  def this(
    cooked: js.Array[String],
    expressions: js.UndefOr[scala.Nothing],
    raw: js.UndefOr[scala.Nothing],
    func: AccessMember
  ) = this()
  def this(
    cooked: js.Array[String],
    expressions: js.UndefOr[scala.Nothing],
    raw: js.UndefOr[scala.Nothing],
    func: AccessScope
  ) = this()
  def this(
    cooked: js.Array[String],
    expressions: js.UndefOr[scala.Nothing],
    raw: js.Array[String],
    func: AccessKeyed
  ) = this()
  def this(
    cooked: js.Array[String],
    expressions: js.UndefOr[scala.Nothing],
    raw: js.Array[String],
    func: AccessMember
  ) = this()
  def this(
    cooked: js.Array[String],
    expressions: js.UndefOr[scala.Nothing],
    raw: js.Array[String],
    func: AccessScope
  ) = this()
  def this(
    cooked: js.Array[String],
    expressions: js.Array[Expression],
    raw: js.UndefOr[scala.Nothing],
    func: AccessKeyed
  ) = this()
  def this(
    cooked: js.Array[String],
    expressions: js.Array[Expression],
    raw: js.UndefOr[scala.Nothing],
    func: AccessMember
  ) = this()
  def this(
    cooked: js.Array[String],
    expressions: js.Array[Expression],
    raw: js.UndefOr[scala.Nothing],
    func: AccessScope
  ) = this()
  def this(
    cooked: js.Array[String],
    expressions: js.Array[Expression],
    raw: js.Array[String],
    func: AccessKeyed
  ) = this()
  def this(
    cooked: js.Array[String],
    expressions: js.Array[Expression],
    raw: js.Array[String],
    func: AccessMember
  ) = this()
  def this(
    cooked: js.Array[String],
    expressions: js.Array[Expression],
    raw: js.Array[String],
    func: AccessScope
  ) = this()
  /**
    * The cooked (escaped) string parts of the template.
    * The first item is the TemplateHead. If there is only one item,
    * then this counts as a NoSubstituteTemplate - functionally equivalent
    * to a LiteralString, unless it's tagged.
    */
  var cooked: ArraystringrawArraystring = js.native
  /**
    * The expressions within the template (the parts between `${` and `}`)
    */
  var expressions: js.Array[Expression] = js.native
  /**
    * The tag (function) to be invoked with the LiteralTemplate arguments.
    * The first argument is LiteralTemplate.cooked.
    * The following arguments are the results of evaluating LiteralTemplate.expressions.
    */
  var func: js.UndefOr[AccessScope | AccessMember | AccessKeyed] = js.native
}

