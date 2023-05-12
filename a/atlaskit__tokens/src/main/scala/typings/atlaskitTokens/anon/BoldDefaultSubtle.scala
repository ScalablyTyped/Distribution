package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoldDefaultSubtle extends StObject {
  
  var `[default]`: HoveredPressed
  
  var bold: HoveredPressed
  
  var subtle: HoveredPressed
}
object BoldDefaultSubtle {
  
  inline def apply(`[default]`: HoveredPressed, bold: HoveredPressed, subtle: HoveredPressed): BoldDefaultSubtle = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoldDefaultSubtle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoldDefaultSubtle] (val x: Self) extends AnyVal {
    
    inline def setBold(value: HoveredPressed): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setSubtle(value: HoveredPressed): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: HoveredPressed): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
