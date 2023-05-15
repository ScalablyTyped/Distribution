package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoldBolder extends StObject {
  
  var bold: HoveredPaintToken
  
  var bolder: HoveredPaintToken
  
  var boldest: HoveredPaintToken
}
object BoldBolder {
  
  inline def apply(bold: HoveredPaintToken, bolder: HoveredPaintToken, boldest: HoveredPaintToken): BoldBolder = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], bolder = bolder.asInstanceOf[js.Any], boldest = boldest.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoldBolder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoldBolder] (val x: Self) extends AnyVal {
    
    inline def setBold(value: HoveredPaintToken): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBolder(value: HoveredPaintToken): Self = StObject.set(x, "bolder", value.asInstanceOf[js.Any])
    
    inline def setBoldest(value: HoveredPaintToken): Self = StObject.set(x, "boldest", value.asInstanceOf[js.Any])
  }
}
