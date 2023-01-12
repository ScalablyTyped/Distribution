package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InverseHoveredPressed extends StObject {
  
  var inverse: HoveredPressed
}
object InverseHoveredPressed {
  
  inline def apply(inverse: HoveredPressed): InverseHoveredPressed = {
    val __obj = js.Dynamic.literal(inverse = inverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[InverseHoveredPressed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InverseHoveredPressed] (val x: Self) extends AnyVal {
    
    inline def setInverse(value: HoveredPressed): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
  }
}
