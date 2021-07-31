package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var size: Double
  
  var style: FillStroke
}
object Size {
  
  @scala.inline
  def apply(size: Double, style: FillStroke): Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: FillStroke): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
