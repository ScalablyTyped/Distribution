package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleStroke extends StObject {
  
  var style: Stroke = js.native
}
object StyleStroke {
  
  @scala.inline
  def apply(style: Stroke): StyleStroke = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleStroke]
  }
  
  @scala.inline
  implicit class StyleStrokeMutableBuilder[Self <: StyleStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: Stroke): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
