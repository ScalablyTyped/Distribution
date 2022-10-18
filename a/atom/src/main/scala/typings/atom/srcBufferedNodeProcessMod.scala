package typings.atom

import typings.atom.mod.BufferedProcess
import typings.atom.srcBufferedProcessMod.NodeProcessOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBufferedNodeProcessMod {
  
  @JSImport("atom/src/buffered-node-process", "BufferedNodeProcess")
  @js.native
  open class BufferedNodeProcess protected () extends BufferedProcess {
    /** Runs the given Node script by spawning a new child process. */
    def this(options: NodeProcessOptions) = this()
  }
}
