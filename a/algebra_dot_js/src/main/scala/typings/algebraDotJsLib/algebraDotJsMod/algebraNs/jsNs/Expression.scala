package typings
package algebraDotJsLib.algebraDotJsMod.algebraNs.jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression extends js.Object {
  var constants: js.Array[Fraction] = js.native
  var terms: js.Array[algebraDotJsLib.algebraDotJsMod.Term] = js.native
  def add(other: algebraDotJsLib.algebraDotJsMod.Union): Expression = js.native
  def add(other: algebraDotJsLib.algebraDotJsMod.Union, simplify: scala.Boolean): Expression = js.native
  def add(other: Expression): Expression = js.native
  def add(other: Expression, simplify: scala.Boolean): Expression = js.native
  def constant(): Fraction = js.native
  def divide(other: Fraction): Expression = js.native
  def divide(other: Fraction, simplify: scala.Boolean): Expression = js.native
  def divide(other: scala.Double): Expression = js.native
  def divide(other: scala.Double, simplify: scala.Boolean): Expression = js.native
  def eval(p: js.Object): Expression = js.native
  def eval(p: js.Object, simplify: scala.Boolean): Expression = js.native
  def multiply(other: algebraDotJsLib.algebraDotJsMod.Union): Expression = js.native
  def multiply(other: algebraDotJsLib.algebraDotJsMod.Union, simplify: scala.Boolean): Expression = js.native
  def multiply(other: Expression): Expression = js.native
  def multiply(other: Expression, simplify: scala.Boolean): Expression = js.native
  def pow(p: scala.Double): Expression = js.native
  def pow(p: scala.Double, simplify: scala.Boolean): Expression = js.native
  def simplify(): Expression = js.native
  def subtract(other: algebraDotJsLib.algebraDotJsMod.Union): Expression = js.native
  def subtract(other: algebraDotJsLib.algebraDotJsMod.Union, simplify: scala.Boolean): Expression = js.native
  def subtract(other: Expression): Expression = js.native
  def subtract(other: Expression, simplify: scala.Boolean): Expression = js.native
  def summation(variable: java.lang.String, lower: scala.Double, upper: scala.Double): Expression = js.native
  def summation(variable: java.lang.String, lower: scala.Double, upper: scala.Double, simplify: scala.Boolean): Expression = js.native
}

