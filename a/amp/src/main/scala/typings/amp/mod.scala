package typings.amp

import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amp", "Stream")
  @js.native
  class Stream protected () extends Writable {
    def this(opts: WritableOptions) = this()
    
    def _write(chunk: js.Any, encoding: String, fn: js.Function0[Unit]): Unit = js.native
  }
  
  @JSImport("amp", "decode")
  @js.native
  def decode(buf: Buffer): js.Array[Buffer] = js.native
  
  @JSImport("amp", "encode")
  @js.native
  def encode(args: js.Array[Buffer]): Buffer = js.native
}
