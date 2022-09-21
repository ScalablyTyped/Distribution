package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bold extends StObject {
  
  var `[default]`: Default
  
  var bold: Default
  
  var subtle: Default
}
object Bold {
  
  inline def apply(`[default]`: Default, bold: Default, subtle: Default): Bold = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bold]
  }
  
  extension [Self <: Bold](x: Self) {
    
    inline def setBold(value: Default): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setSubtle(value: Default): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: Default): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
