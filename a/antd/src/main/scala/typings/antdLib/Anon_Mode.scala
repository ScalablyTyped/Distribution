package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: java.lang.String
  var reverse: scala.Boolean
}

object Anon_Mode {
  @scala.inline
  def apply(mode: java.lang.String, reverse: scala.Boolean): Anon_Mode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("reverse")(reverse)
    __obj.asInstanceOf[Anon_Mode]
  }
}

