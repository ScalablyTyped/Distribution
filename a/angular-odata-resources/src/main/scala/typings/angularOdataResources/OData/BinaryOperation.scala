package typings.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryOperation extends IExecutable {
  
  def and(propertyOrPredicate: js.Any): BinaryOperation = js.native
  def and(propertyOrPredicate: js.Any, operatorOrValue: js.UndefOr[scala.Nothing], value: js.Any): BinaryOperation = js.native
  def and(propertyOrPredicate: js.Any, operatorOrValue: js.Any): BinaryOperation = js.native
  def and(propertyOrPredicate: js.Any, operatorOrValue: js.Any, value: js.Any): BinaryOperation = js.native
  
  var filterOperator: js.Any = js.native
  
  var operandA: js.Any = js.native
  
  var operandB: js.Any = js.native
  
  def or(propertyOrPredicate: js.Any): BinaryOperation = js.native
  def or(propertyOrPredicate: js.Any, operatorOrValue: js.UndefOr[scala.Nothing], value: js.Any): BinaryOperation = js.native
  def or(propertyOrPredicate: js.Any, operatorOrValue: js.Any): BinaryOperation = js.native
  def or(propertyOrPredicate: js.Any, operatorOrValue: js.Any, value: js.Any): BinaryOperation = js.native
}
