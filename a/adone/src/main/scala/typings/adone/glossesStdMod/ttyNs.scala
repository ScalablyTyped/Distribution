package typings.adone.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "tty")
@js.native
object ttyNs extends js.Object {
  @js.native
  class ReadStream ()
    extends typings.node.ttyMod.ReadStream
  
  @js.native
  class WriteStream ()
    extends typings.node.ttyMod.WriteStream
  
  def isatty(fd: Double): Boolean = js.native
}

