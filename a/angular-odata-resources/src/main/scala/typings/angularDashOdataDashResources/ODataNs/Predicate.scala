package typings.angularDashOdataDashResources.ODataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OData.Predicate")
@js.native
class Predicate protected () extends BinaryOperation {
  def this(propertyOrValueOrPredicate: js.Any) = this()
  def this(propertyOrValueOrPredicate: js.Any, valueOrOperator: js.Any) = this()
  def this(propertyOrValueOrPredicate: js.Any, valueOrOperator: js.Any, value: js.Any) = this()
}

/* static members */
@JSGlobal("OData.Predicate")
@js.native
object Predicate extends js.Object {
  def and(andStatements: js.Any): IExecutable = js.native
  def create(propertyOrPredicate: js.Any): IExecutable = js.native
  def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any): IExecutable = js.native
  def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any, value: js.Any): IExecutable = js.native
  def or(orStatements: js.Array[_]): IExecutable = js.native
}

