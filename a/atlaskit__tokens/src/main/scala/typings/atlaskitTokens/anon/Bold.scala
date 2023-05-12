package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bold extends StObject {
  
  var `[default]`: Hovered
  
  var bold: Hovered
  
  var subtle: Hovered
}
object Bold {
  
  inline def apply(`[default]`: Hovered, bold: Hovered, subtle: Hovered): Bold = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bold]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bold] (val x: Self) extends AnyVal {
    
    inline def setBold(value: Hovered): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setSubtle(value: Hovered): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: Hovered): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
