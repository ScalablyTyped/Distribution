package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjustX extends js.Object {
  var adjustX: scala.Boolean
  var adjustY: scala.Boolean
}

object Anon_AdjustX {
  @scala.inline
  def apply(adjustX: scala.Boolean, adjustY: scala.Boolean): Anon_AdjustX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adjustX")(adjustX)
    __obj.updateDynamic("adjustY")(adjustY)
    __obj.asInstanceOf[Anon_AdjustX]
  }
}

