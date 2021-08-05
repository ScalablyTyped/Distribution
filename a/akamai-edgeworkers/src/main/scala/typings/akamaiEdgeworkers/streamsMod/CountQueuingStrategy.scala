package typings.akamaiEdgeworkers.streamsMod

import typings.akamaiEdgeworkers.akamaiEdgeworkersNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountQueuingStrategy extends StObject {
  
  var highWaterMark: Double
  
  def size(chunk: js.Any): `1`
}
object CountQueuingStrategy {
  
  inline def apply(highWaterMark: Double, size: js.Any => `1`): CountQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[CountQueuingStrategy]
  }
  
  extension [Self <: CountQueuingStrategy](x: Self) {
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setSize(value: js.Any => `1`): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
  }
}
