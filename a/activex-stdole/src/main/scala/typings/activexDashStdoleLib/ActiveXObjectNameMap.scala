package typings
package activexDashStdoleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var StdFont: activexDashStdoleLib.stdoleNs.StdFont
  var StdPicture: activexDashStdoleLib.stdoleNs.StdPicture
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    StdFont: activexDashStdoleLib.stdoleNs.StdFont,
    StdPicture: activexDashStdoleLib.stdoleNs.StdPicture
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(StdFont = StdFont, StdPicture = StdPicture)
  
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

