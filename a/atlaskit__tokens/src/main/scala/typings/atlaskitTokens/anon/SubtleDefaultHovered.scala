package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtleDefaultHovered extends StObject {
  
  var subtle: DefaultHovered
}
object SubtleDefaultHovered {
  
  inline def apply(subtle: DefaultHovered): SubtleDefaultHovered = {
    val __obj = js.Dynamic.literal(subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtleDefaultHovered]
  }
  
  extension [Self <: SubtleDefaultHovered](x: Self) {
    
    inline def setSubtle(value: DefaultHovered): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
  }
}
