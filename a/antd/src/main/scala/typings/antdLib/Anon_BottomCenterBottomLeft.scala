package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomCenterBottomLeft extends js.Object {
  var mouseEnterDelay: scala.Double
  var mouseLeaveDelay: scala.Double
  var placement: antdLib.antdLibStrings.bottomLeft | antdLib.antdLibStrings.bottomRight | antdLib.antdLibStrings.topLeft | antdLib.antdLibStrings.topCenter | antdLib.antdLibStrings.topRight | antdLib.antdLibStrings.bottomCenter
}

object Anon_BottomCenterBottomLeft {
  @scala.inline
  def apply(
    mouseEnterDelay: scala.Double,
    mouseLeaveDelay: scala.Double,
    placement: antdLib.antdLibStrings.bottomLeft | antdLib.antdLibStrings.bottomRight | antdLib.antdLibStrings.topLeft | antdLib.antdLibStrings.topCenter | antdLib.antdLibStrings.topRight | antdLib.antdLibStrings.bottomCenter
  ): Anon_BottomCenterBottomLeft = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay)
    __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay)
    __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomCenterBottomLeft]
  }
}

