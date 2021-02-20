package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line extends StObject {
  
  var line: Length = js.native
  
  var point: Display = js.native
  
  var text: Content = js.native
}
object Line {
  
  @scala.inline
  def apply(line: Length, point: Display, text: Content): Line = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit class LineMutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: Length): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Display): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Content): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
