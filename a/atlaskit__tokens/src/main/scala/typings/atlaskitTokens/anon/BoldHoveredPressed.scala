package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoldHoveredPressed extends StObject {
  
  var bold: HoveredPressed
}
object BoldHoveredPressed {
  
  inline def apply(bold: HoveredPressed): BoldHoveredPressed = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoldHoveredPressed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoldHoveredPressed] (val x: Self) extends AnyVal {
    
    inline def setBold(value: HoveredPressed): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
  }
}
