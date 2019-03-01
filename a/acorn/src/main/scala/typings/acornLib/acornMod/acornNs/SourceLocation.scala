package typings
package acornLib.acornMod.acornNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation
  extends estreeLib.estreeMod.SourceLocation {
  @JSName("end")
  var end_SourceLocation: Position
  @JSName("start")
  var start_SourceLocation: Position
}

object SourceLocation {
  @scala.inline
  def apply(end: Position, start: Position, source: java.lang.String = null): SourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SourceLocation]
  }
}

