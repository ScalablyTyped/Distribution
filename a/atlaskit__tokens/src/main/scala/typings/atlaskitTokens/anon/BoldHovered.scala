package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoldHovered extends StObject {
  
  var bold: Hovered
}
object BoldHovered {
  
  inline def apply(bold: Hovered): BoldHovered = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoldHovered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoldHovered] (val x: Self) extends AnyVal {
    
    inline def setBold(value: Hovered): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
  }
}
