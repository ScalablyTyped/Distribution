package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atom", "BufferedNodeProcess")
@js.native
class BufferedNodeProcess protected () extends BufferedProcess {
  /** Runs the given Node script by spawning a new child process. */
  def this(options: NodeProcessOptions) = this()
}

