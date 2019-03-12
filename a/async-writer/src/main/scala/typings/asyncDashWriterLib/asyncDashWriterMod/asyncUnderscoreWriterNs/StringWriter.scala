package typings
package asyncDashWriterLib.asyncDashWriterMod.asyncUnderscoreWriterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringWriter extends js.Object {
  def end(): scala.Unit
  def write(what: java.lang.String): StringWriter
}

object StringWriter {
  @scala.inline
  def apply(end: () => scala.Unit, toString: () => java.lang.String, write: java.lang.String => StringWriter): StringWriter = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), toString = js.Any.fromFunction0(toString), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[StringWriter]
  }
}

