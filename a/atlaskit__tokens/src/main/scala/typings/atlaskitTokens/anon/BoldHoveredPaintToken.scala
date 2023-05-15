package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoldHoveredPaintToken extends StObject {
  
  var `[default]`: HoveredPaintToken
  
  var bold: HoveredPaintToken
}
object BoldHoveredPaintToken {
  
  inline def apply(`[default]`: HoveredPaintToken, bold: HoveredPaintToken): BoldHoveredPaintToken = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoldHoveredPaintToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoldHoveredPaintToken] (val x: Self) extends AnyVal {
    
    inline def setBold(value: HoveredPaintToken): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: HoveredPaintToken): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
