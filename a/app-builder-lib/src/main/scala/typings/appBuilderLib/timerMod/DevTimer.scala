package typings.appBuilderLib.timerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/timer", "DevTimer")
@js.native
class DevTimer protected () extends Timer {
  def this(label: String) = this()
  val label: js.Any = js.native
  var start: js.Any = js.native
  def endAndGet(): String = js.native
}

