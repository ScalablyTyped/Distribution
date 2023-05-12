package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilledMapConditionalFormattingOption extends StObject {
  
  /**
    * The conditional formatting that determines the shape of the filled map.
    */
  var Shape: FilledMapShapeConditionalFormatting
}
object FilledMapConditionalFormattingOption {
  
  inline def apply(Shape: FilledMapShapeConditionalFormatting): FilledMapConditionalFormattingOption = {
    val __obj = js.Dynamic.literal(Shape = Shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilledMapConditionalFormattingOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilledMapConditionalFormattingOption] (val x: Self) extends AnyVal {
    
    inline def setShape(value: FilledMapShapeConditionalFormatting): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
  }
}
