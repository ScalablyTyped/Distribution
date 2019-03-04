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
  def apply(
    column: js.Function1[java.lang.String, Future],
    count: js.Function0[Future],
    row: js.Function1[scala.Double, Future]
  ): Repeater = {
    val __obj = js.Dynamic.literal(column = column, count = count, row = row)
  
    __obj.asInstanceOf[Repeater]
  }
}

