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
  def apply(
    end: js.Function0[scala.Unit],
    toString: js.Function0[java.lang.String],
    write: js.Function1[java.lang.String, StringWriter]
  ): StringWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[StringWriter]
  }
}

