package typings.angularOdataResources.OData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryOperation extends IExecutable {
  var filterOperator: js.Any = js.native
  var operandA: js.Any = js.native
  var operandB: js.Any = js.native
  def and(propertyOrPredicate: js.Any): BinaryOperation = js.native
  def and(propertyOrPredicate: js.Any, operatorOrValue: js.UndefOr[scala.Nothing], value: js.Any): BinaryOperation = js.native
  def and(propertyOrPredicate: js.Any, operatorOrValue: js.Any): BinaryOperation = js.native
  def and(propertyOrPredicate: js.Any, operatorOrValue: js.Any, value: js.Any): BinaryOperation = js.native
  def or(propertyOrPredicate: js.Any): BinaryOperation = js.native
  def or(propertyOrPredicate: js.Any, operatorOrValue: js.UndefOr[scala.Nothing], value: js.Any): BinaryOperation = js.native
  def or(propertyOrPredicate: js.Any, operatorOrValue: js.Any): BinaryOperation = js.native
  def or(propertyOrPredicate: js.Any, operatorOrValue: js.Any, value: js.Any): BinaryOperation = js.native
}

