package typings
package angularDashScenarioLib.angularScenarioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repeater extends js.Object {
  def column(ngBindingExpression: java.lang.String): Future
  def count(): Future
  def row(index: scala.Double): Future
}

object Repeater {
  @scala.inline
  def apply(column: java.lang.String => Future, count: () => Future, row: scala.Double => Future): Repeater = {
    val __obj = js.Dynamic.literal(column = js.Any.fromFunction1(column), count = js.Any.fromFunction0(count), row = js.Any.fromFunction1(row))
  
    __obj.asInstanceOf[Repeater]
  }
}

