package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleTextAlign extends StObject {
  
  var style: TextAlign = js.native
}
object StyleTextAlign {
  
  @scala.inline
  def apply(style: TextAlign): StyleTextAlign = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleTextAlign]
  }
  
  @scala.inline
  implicit class StyleTextAlignMutableBuilder[Self <: StyleTextAlign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: TextAlign): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
