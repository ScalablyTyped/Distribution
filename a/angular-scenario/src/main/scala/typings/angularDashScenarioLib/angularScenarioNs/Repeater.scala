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

