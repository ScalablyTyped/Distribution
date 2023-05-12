package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtleHovered extends StObject {
  
  var subtle: Hovered
}
object SubtleHovered {
  
  inline def apply(subtle: Hovered): SubtleHovered = {
    val __obj = js.Dynamic.literal(subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtleHovered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtleHovered] (val x: Self) extends AnyVal {
    
    inline def setSubtle(value: Hovered): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
  }
}
