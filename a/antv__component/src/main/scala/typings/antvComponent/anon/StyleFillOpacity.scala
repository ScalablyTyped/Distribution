package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleFillOpacity extends StObject {
  
  var style: FillOpacity
}
object StyleFillOpacity {
  
  @scala.inline
  def apply(style: FillOpacity): StyleFillOpacity = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleFillOpacity]
  }
  
  @scala.inline
  implicit class StyleFillOpacityMutableBuilder[Self <: StyleFillOpacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: FillOpacity): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
