package typings
package angularDashOdataDashResourcesLib.ODataNs

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

@JSGlobal("OData.Predicate")
@js.native
object Predicate extends js.Object {
  def and(andStatements: js.Any): angularDashOdataDashResourcesLib.ODataNs.IExecutable = js.native
  def create(propertyOrPredicate: js.Any): angularDashOdataDashResourcesLib.ODataNs.IExecutable = js.native
  def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any): angularDashOdataDashResourcesLib.ODataNs.IExecutable = js.native
  def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any, value: js.Any): angularDashOdataDashResourcesLib.ODataNs.IExecutable = js.native
  def or(orStatements: js.Array[_]): angularDashOdataDashResourcesLib.ODataNs.IExecutable = js.native
}

