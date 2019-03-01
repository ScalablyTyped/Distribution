package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Custom extends js.Object {
  val custom: js.Symbol
}

object Anon_Custom {
  @scala.inline
  def apply(custom: js.Symbol): Anon_Custom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("custom")(custom)
    __obj.asInstanceOf[Anon_Custom]
  }
}

