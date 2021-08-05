package typings.akamaiEdgeworkers.streamsMod

import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ByteLengthQueuingStrategy
  extends StObject
     with QueuingStrategy[ArrayBufferView] {
  
  @JSName("highWaterMark")
  var highWaterMark_ByteLengthQueuingStrategy: Double
  
  @JSName("size")
  def size_MByteLengthQueuingStrategy(chunk: ArrayBufferView): Double
}
object ByteLengthQueuingStrategy {
  
  inline def apply(highWaterMark: Double, size: ArrayBufferView => Double): ByteLengthQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[ByteLengthQueuingStrategy]
  }
  
  extension [Self <: ByteLengthQueuingStrategy](x: Self) {
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setSize(value: ArrayBufferView => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
  }
}
