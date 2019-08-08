package typings.adone

import org.scalablytyped.runtime.Instantiable1
import typings.adone.glossesStdMod.ttyNs.ReadStream
import typings.adone.glossesStdMod.ttyNs.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftty extends js.Object {
  var ReadStream: Instantiable1[/* fd */ Double, typings.adone.glossesStdMod.ttyNs.ReadStream]
  var WriteStream: Instantiable1[/* fd */ Double, typings.adone.glossesStdMod.ttyNs.WriteStream]
  def isatty(fd: Double): Boolean
}

object Typeoftty {
  @scala.inline
  def apply(
    ReadStream: Instantiable1[/* fd */ Double, ReadStream],
    WriteStream: Instantiable1[/* fd */ Double, WriteStream],
    isatty: Double => Boolean
  ): Typeoftty = {
    val __obj = js.Dynamic.literal(ReadStream = ReadStream, WriteStream = WriteStream, isatty = js.Any.fromFunction1(isatty))
  
    __obj.asInstanceOf[Typeoftty]
  }
}

