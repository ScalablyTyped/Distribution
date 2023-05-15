package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultHovered extends StObject {
  
  var `[default]`: Hovered
  
  var bold: Hovered
}
object DefaultHovered {
  
  inline def apply(`[default]`: Hovered, bold: Hovered): DefaultHovered = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultHovered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultHovered] (val x: Self) extends AnyVal {
    
    inline def setBold(value: Hovered): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: Hovered): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
