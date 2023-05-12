package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtleHoveredPressed extends StObject {
  
  var subtle: HoveredPressed
}
object SubtleHoveredPressed {
  
  inline def apply(subtle: HoveredPressed): SubtleHoveredPressed = {
    val __obj = js.Dynamic.literal(subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtleHoveredPressed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtleHoveredPressed] (val x: Self) extends AnyVal {
    
    inline def setSubtle(value: HoveredPressed): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
  }
}
