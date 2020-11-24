package typings.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.Instantiable1
import typings.akamaiEdgeworkers.anon.HighWaterMark
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ByteLengthQueuingStrategy extends QueuingStrategy[ArrayBufferView] {
  
  @JSName("highWaterMark")
  var highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: ArrayBufferView): Double = js.native
}
@JSImport("streams", "ByteLengthQueuingStrategy")
@js.native
object ByteLengthQueuingStrategy extends Instantiable1[/* options */ HighWaterMark, ByteLengthQueuingStrategy]
