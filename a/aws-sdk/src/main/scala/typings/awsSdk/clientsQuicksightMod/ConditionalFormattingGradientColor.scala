package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalFormattingGradientColor extends StObject {
  
  /**
    * Determines the color.
    */
  var Color: GradientColor
  
  /**
    * The expression that determines the formatting configuration for gradient color.
    */
  var Expression: typings.awsSdk.clientsQuicksightMod.Expression
}
object ConditionalFormattingGradientColor {
  
  inline def apply(Color: GradientColor, Expression: Expression): ConditionalFormattingGradientColor = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingGradientColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormattingGradientColor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: GradientColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
  }
}
