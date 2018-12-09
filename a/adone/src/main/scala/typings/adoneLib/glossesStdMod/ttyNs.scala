package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "tty")
@js.native
object ttyNs extends js.Object {
  @js.native
  class ReadStream ()
    extends nodeLib.ttyMod.ReadStream
  
  @js.native
  class WriteStream ()
    extends nodeLib.ttyMod.WriteStream
  
  def isatty(fd: scala.Double): scala.Boolean = js.native
}

