package typings.algebraDotJs.algebraDotJsMod.algebra.js

import typings.algebraDotJs.algebraDotJsMod.Term
import typings.algebraDotJs.algebraDotJsMod.Union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  var constants: js.Array[typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction] = js.native
  var terms: js.Array[Term] = js.native
  def add(other: Union): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def add(other: Union, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def add(other: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def add(other: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def constant(): typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction = js.native
  def divide(other: Double): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def divide(other: Double, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def divide(other: typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def divide(other: typings.algebraDotJs.algebraDotJsMod.algebra.js.Fraction, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def eval(p: js.Object): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def eval(p: js.Object, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def multiply(other: Union): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def multiply(other: Union, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def multiply(other: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def multiply(other: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def pow(p: Double): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def pow(p: Double, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def simplify(): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def subtract(other: Union): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def subtract(other: Union, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def subtract(other: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def subtract(other: typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def summation(variable: String, lower: Double, upper: Double): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
  def summation(variable: String, lower: Double, upper: Double, simplify: Boolean): typings.algebraDotJs.algebraDotJsMod.algebra.js.Expression = js.native
}

