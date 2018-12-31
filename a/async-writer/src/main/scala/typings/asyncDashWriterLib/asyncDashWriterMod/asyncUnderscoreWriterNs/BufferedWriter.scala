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

