package typings
package asyncDashWriterLib.asyncDashWriterMod.asyncUnderscoreWriterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferedWriter extends js.Object {
  def clear(): scala.Unit
  def end(): scala.Unit
  def flush(): scala.Unit
  def on(event: java.lang.String, callback: js.Function): BufferedWriter
  def once(event: java.lang.String, callback: js.Function): BufferedWriter
  def write(what: java.lang.String): BufferedWriter
}

object BufferedWriter {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    end: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    on: js.Function2[java.lang.String, js.Function, BufferedWriter],
    once: js.Function2[java.lang.String, js.Function, BufferedWriter],
    write: js.Function1[java.lang.String, BufferedWriter]
  ): BufferedWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("flush")(flush)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("once")(once)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[BufferedWriter]
  }
}

