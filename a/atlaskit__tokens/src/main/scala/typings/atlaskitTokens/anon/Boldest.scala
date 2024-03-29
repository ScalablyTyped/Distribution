package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boldest extends StObject {
  
  var bold: DefaultPaintToken
  
  var bolder: DefaultPaintToken
  
  var boldest: DefaultPaintToken
}
object Boldest {
  
  inline def apply(bold: DefaultPaintToken, bolder: DefaultPaintToken, boldest: DefaultPaintToken): Boldest = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], bolder = bolder.asInstanceOf[js.Any], boldest = boldest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boldest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Boldest] (val x: Self) extends AnyVal {
    
    inline def setBold(value: DefaultPaintToken): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBolder(value: DefaultPaintToken): Self = StObject.set(x, "bolder", value.asInstanceOf[js.Any])
    
    inline def setBoldest(value: DefaultPaintToken): Self = StObject.set(x, "boldest", value.asInstanceOf[js.Any])
  }
}
