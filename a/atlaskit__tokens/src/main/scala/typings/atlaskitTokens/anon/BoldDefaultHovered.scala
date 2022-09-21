package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoldDefaultHovered extends StObject {
  
  var bold: DefaultHovered
}
object BoldDefaultHovered {
  
  inline def apply(bold: DefaultHovered): BoldDefaultHovered = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoldDefaultHovered]
  }
  
  extension [Self <: BoldDefaultHovered](x: Self) {
    
    inline def setBold(value: DefaultHovered): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
  }
}
