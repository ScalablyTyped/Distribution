package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeConditionalFormat extends StObject {
  
  /**
    * The conditional formatting for the shape background color of a filled map visual.
    */
  var BackgroundColor: ConditionalFormattingColor
}
object ShapeConditionalFormat {
  
  inline def apply(BackgroundColor: ConditionalFormattingColor): ShapeConditionalFormat = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeConditionalFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeConditionalFormat] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: ConditionalFormattingColor): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
  }
}
