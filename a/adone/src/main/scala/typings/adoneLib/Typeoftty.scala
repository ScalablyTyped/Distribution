package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftty extends js.Object {
  var ReadStream: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.ttyNs.ReadStream]
  var WriteStream: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.ttyNs.WriteStream]
  def isatty(fd: scala.Double): scala.Boolean
}

object Typeoftty {
  @scala.inline
  def apply(
    ReadStream: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.ttyNs.ReadStream],
    WriteStream: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.ttyNs.WriteStream],
    isatty: scala.Double => scala.Boolean
  ): Typeoftty = {
    val __obj = js.Dynamic.literal(ReadStream = ReadStream, WriteStream = WriteStream, isatty = js.Any.fromFunction1(isatty))
  
    __obj.asInstanceOf[Typeoftty]
  }
}

