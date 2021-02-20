package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineWidthNumber extends StObject {
  
  var lineWidth: Double = js.native
}
object LineWidthNumber {
  
  @scala.inline
  def apply(lineWidth: Double): LineWidthNumber = {
    val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineWidthNumber]
  }
  
  @scala.inline
  implicit class LineWidthNumberMutableBuilder[Self <: LineWidthNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
  }
}
