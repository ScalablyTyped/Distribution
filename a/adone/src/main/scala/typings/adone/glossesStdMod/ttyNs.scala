package typings.adone.glossesStdMod

import typings.node.netMod.SocketConstructorOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "tty")
@js.native
object ttyNs extends js.Object {
  @js.native
  class ReadStream protected ()
    extends typings.node.ttyMod.ReadStream {
    def this(fd: Double) = this()
    def this(fd: Double, options: SocketConstructorOpts) = this()
  }
  
  @js.native
  class WriteStream protected ()
    extends typings.node.ttyMod.WriteStream {
    def this(fd: Double) = this()
  }
  
  def isatty(fd: Double): Boolean = js.native
}

