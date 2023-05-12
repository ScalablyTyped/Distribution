package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalFormattingSolidColor extends StObject {
  
  /**
    * Determines the color.
    */
  var Color: js.UndefOr[HexColor] = js.undefined
  
  /**
    * The expression that determines the formatting configuration for solid color.
    */
  var Expression: typings.awsSdk.clientsQuicksightMod.Expression
}
object ConditionalFormattingSolidColor {
  
  inline def apply(Expression: Expression): ConditionalFormattingSolidColor = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingSolidColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormattingSolidColor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: HexColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
  }
}
