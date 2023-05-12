package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoldDefaultPaintToken extends StObject {
  
  var `[default]`: DefaultPaintToken
  
  var bold: DefaultPaintToken
}
object BoldDefaultPaintToken {
  
  inline def apply(`[default]`: DefaultPaintToken, bold: DefaultPaintToken): BoldDefaultPaintToken = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoldDefaultPaintToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoldDefaultPaintToken] (val x: Self) extends AnyVal {
    
    inline def setBold(value: DefaultPaintToken): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: DefaultPaintToken): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
