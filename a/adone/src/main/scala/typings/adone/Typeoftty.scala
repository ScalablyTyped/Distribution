package typings.adone

import org.scalablytyped.runtime.Instantiable0
import typings.adone.glossesStdMod.ttyNs.ReadStream
import typings.adone.glossesStdMod.ttyNs.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftty extends js.Object {
  var ReadStream: Instantiable0[typings.adone.glossesStdMod.ttyNs.ReadStream]
  var WriteStream: Instantiable0[typings.adone.glossesStdMod.ttyNs.WriteStream]
  def isatty(fd: Double): Boolean
}

object Typeoftty {
  @scala.inline
  def apply(
    ReadStream: Instantiable0[ReadStream],
    WriteStream: Instantiable0[WriteStream],
    isatty: Double => Boolean
  ): Typeoftty = {
    val __obj = js.Dynamic.literal(ReadStream = ReadStream, WriteStream = WriteStream, isatty = js.Any.fromFunction1(isatty))
  
    __obj.asInstanceOf[Typeoftty]
  }
}

