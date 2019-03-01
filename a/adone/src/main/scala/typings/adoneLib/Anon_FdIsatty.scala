package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FdIsatty extends js.Object {
  var ReadStream: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.ttyNs.ReadStream]
  var WriteStream: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.ttyNs.WriteStream]
  def isatty(fd: scala.Double): scala.Boolean
}

object Anon_FdIsatty {
  @scala.inline
  def apply(
    ReadStream: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.ttyNs.ReadStream],
    WriteStream: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.ttyNs.WriteStream],
    isatty: js.Function1[scala.Double, scala.Boolean]
  ): Anon_FdIsatty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ReadStream")(ReadStream)
    __obj.updateDynamic("WriteStream")(WriteStream)
    __obj.updateDynamic("isatty")(isatty)
    __obj.asInstanceOf[Anon_FdIsatty]
  }
}

