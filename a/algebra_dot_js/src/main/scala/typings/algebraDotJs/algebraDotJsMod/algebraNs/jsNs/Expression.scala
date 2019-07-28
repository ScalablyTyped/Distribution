package typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs

import typings.algebraDotJs.algebraDotJsMod.Term
import typings.algebraDotJs.algebraDotJsMod.Union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  var constants: js.Array[typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Fraction] = js.native
  var terms: js.Array[Term] = js.native
  def add(other: Union): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def add(other: Union, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def add(other: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def add(other: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def constant(): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Fraction = js.native
  def divide(other: Double): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def divide(other: Double, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def divide(other: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Fraction): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def divide(other: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Fraction, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def eval(p: js.Object): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def eval(p: js.Object, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def multiply(other: Union): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def multiply(other: Union, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def multiply(other: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def multiply(other: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def pow(p: Double): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def pow(p: Double, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def simplify(): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def subtract(other: Union): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def subtract(other: Union, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def subtract(other: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def subtract(other: typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def summation(variable: String, lower: Double, upper: Double): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
  def summation(variable: String, lower: Double, upper: Double, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebraNs.jsNs.Expression = js.native
}

