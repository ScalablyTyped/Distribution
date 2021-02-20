package typings.akamaiEdgeworkers.streamsMod

import typings.akamaiEdgeworkers.akamaiEdgeworkersNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountQueuingStrategy extends StObject {
  
  var highWaterMark: Double = js.native
  
  def size(chunk: js.Any): `1` = js.native
}
object CountQueuingStrategy {
  
  @scala.inline
  def apply(highWaterMark: Double, size: js.Any => `1`): CountQueuingStrategy = {
    val __obj = js.Dynamic.literal(highWaterMark = highWaterMark.asInstanceOf[js.Any], size = js.Any.fromFunction1(size))
    __obj.asInstanceOf[CountQueuingStrategy]
  }
  
  @scala.inline
  implicit class CountQueuingStrategyMutableBuilder[Self <: CountQueuingStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.Any => `1`): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
  }
}
