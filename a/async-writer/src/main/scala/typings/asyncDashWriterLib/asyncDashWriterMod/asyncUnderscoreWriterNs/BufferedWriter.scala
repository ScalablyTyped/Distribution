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
    clear: () => scala.Unit,
    end: () => scala.Unit,
    flush: () => scala.Unit,
    on: (java.lang.String, js.Function) => BufferedWriter,
    once: (java.lang.String, js.Function) => BufferedWriter,
    write: java.lang.String => BufferedWriter
  ): BufferedWriter = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), end = js.Any.fromFunction0(end), flush = js.Any.fromFunction0(flush), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[BufferedWriter]
  }
}

