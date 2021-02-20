package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count extends StObject {
  
  var count: Double = js.native
  
  var length: Double = js.native
  
  var style: Stroke = js.native
}
object Count {
  
  @scala.inline
  def apply(count: Double, length: Double, style: Stroke): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Stroke): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
