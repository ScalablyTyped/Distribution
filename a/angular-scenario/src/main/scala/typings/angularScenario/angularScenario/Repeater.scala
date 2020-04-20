package typings.angularScenario.angularScenario

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Repeater extends js.Object {
  def column(ngBindingExpression: String): Future
  def count(): Future
  def row(index: Double): Future
}

object Repeater {
  @scala.inline
  def apply(column: String => Future, count: () => Future, row: Double => Future): Repeater = {
    val __obj = js.Dynamic.literal(column = js.Any.fromFunction1(column), count = js.Any.fromFunction0(count), row = js.Any.fromFunction1(row))
    __obj.asInstanceOf[Repeater]
  }
}

