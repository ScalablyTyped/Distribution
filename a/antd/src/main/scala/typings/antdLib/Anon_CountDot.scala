package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountDot extends js.Object {
  var count: scala.Null
  var dot: scala.Boolean
  var overflowCount: scala.Double
  var showZero: scala.Boolean
}

object Anon_CountDot {
  @scala.inline
  def apply(count: scala.Null, dot: scala.Boolean, overflowCount: scala.Double, showZero: scala.Boolean): Anon_CountDot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("dot")(dot)
    __obj.updateDynamic("overflowCount")(overflowCount)
    __obj.updateDynamic("showZero")(showZero)
    __obj.asInstanceOf[Anon_CountDot]
  }
}

