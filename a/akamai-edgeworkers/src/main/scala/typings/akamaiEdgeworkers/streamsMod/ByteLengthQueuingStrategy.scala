package typings.akamaiEdgeworkers.streamsMod

import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
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
object ByteLengthQueuingStrategy {
  
  @scala.inline
  def apply(highWaterMark: Double, size: ArrayBufferView => Double): ByteLengthQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[ByteLengthQueuingStrategy]
  }
  
  @scala.inline
  implicit class ByteLengthQueuingStrategyMutableBuilder[Self <: ByteLengthQueuingStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: ArrayBufferView => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
  }
}
