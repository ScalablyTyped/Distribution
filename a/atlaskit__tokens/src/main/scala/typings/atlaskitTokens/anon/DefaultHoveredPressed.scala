package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultHoveredPressed extends StObject {
  
  var `[default]`: HoveredPressed
  
  var bold: HoveredPressed
}
object DefaultHoveredPressed {
  
  inline def apply(`[default]`: HoveredPressed, bold: HoveredPressed): DefaultHoveredPressed = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultHoveredPressed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultHoveredPressed] (val x: Self) extends AnyVal {
    
    inline def setBold(value: HoveredPressed): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: HoveredPressed): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
