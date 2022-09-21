package typings.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryOperation
  extends StObject
     with IExecutable {
  
  def and(propertyOrPredicate: Any): BinaryOperation = js.native
  def and(propertyOrPredicate: Any, operatorOrValue: Any): BinaryOperation = js.native
  def and(propertyOrPredicate: Any, operatorOrValue: Any, value: Any): BinaryOperation = js.native
  def and(propertyOrPredicate: Any, operatorOrValue: Unit, value: Any): BinaryOperation = js.native
  
  /* private */ var filterOperator: Any = js.native
  
  /* private */ var operandA: Any = js.native
  
  /* private */ var operandB: Any = js.native
  
  def or(propertyOrPredicate: Any): BinaryOperation = js.native
  def or(propertyOrPredicate: Any, operatorOrValue: Any): BinaryOperation = js.native
  def or(propertyOrPredicate: Any, operatorOrValue: Any, value: Any): BinaryOperation = js.native
  def or(propertyOrPredicate: Any, operatorOrValue: Unit, value: Any): BinaryOperation = js.native
}
