package typings.antvG2.anon

import typings.antvG2.libGeometryElementMod.default
import typings.antvG2.libInteractionActionElementLinkByColorMod.LinkActiveStyle
import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleLinkActiveStyle extends StObject {
  
  var style: LinkActiveStyle
}
object StyleLinkActiveStyle {
  
  inline def apply(style: LinkActiveStyle): StyleLinkActiveStyle = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleLinkActiveStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleLinkActiveStyle] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: LinkActiveStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction2(value: (/* style */ ShapeAttrs, /* Element */ default) => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction2(value))
  }
}
