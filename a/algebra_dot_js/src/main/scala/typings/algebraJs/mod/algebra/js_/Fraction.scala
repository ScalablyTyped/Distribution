package typings.algebraJs.mod.algebra.js_

import typings.algebraJs.mod._Union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fraction extends _Union {
  
  def abs(): Fraction = js.native
  
  def add(other: Double): Fraction = js.native
  def add(other: Double, simplify: Boolean): Fraction = js.native
  def add(other: Fraction): Fraction = js.native
  def add(other: Fraction, simplify: Boolean): Fraction = js.native
  
  var denom: Double = js.native
  
  def divide(other: Double): Fraction = js.native
  def divide(other: Double, simplify: Boolean): Fraction = js.native
  def divide(other: Fraction): Fraction = js.native
  def divide(other: Fraction, simplify: Boolean): Fraction = js.native
  
  def multiply(other: Double): Fraction = js.native
  def multiply(other: Double, simplify: Boolean): Fraction = js.native
  def multiply(other: Fraction): Fraction = js.native
  def multiply(other: Fraction, simplify: Boolean): Fraction = js.native
  
  var numer: Double = js.native
  
  def subtract(other: Double): Fraction = js.native
  def subtract(other: Double, simplify: Boolean): Fraction = js.native
  def subtract(other: Fraction): Fraction = js.native
  def subtract(other: Fraction, simplify: Boolean): Fraction = js.native
}
