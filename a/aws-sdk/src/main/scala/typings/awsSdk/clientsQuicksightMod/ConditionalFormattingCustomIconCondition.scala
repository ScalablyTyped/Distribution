package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalFormattingCustomIconCondition extends StObject {
  
  /**
    * Determines the color of the icon.
    */
  var Color: js.UndefOr[HexColor] = js.undefined
  
  /**
    * Determines the icon display configuration.
    */
  var DisplayConfiguration: js.UndefOr[ConditionalFormattingIconDisplayConfiguration] = js.undefined
  
  /**
    * The expression that determines the condition of the icon set.
    */
  var Expression: typings.awsSdk.clientsQuicksightMod.Expression
  
  /**
    * Custom icon options for an icon set.
    */
  var IconOptions: ConditionalFormattingCustomIconOptions
}
object ConditionalFormattingCustomIconCondition {
  
  inline def apply(Expression: Expression, IconOptions: ConditionalFormattingCustomIconOptions): ConditionalFormattingCustomIconCondition = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], IconOptions = IconOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingCustomIconCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormattingCustomIconCondition] (val x: Self) extends AnyVal {
    
    inline def setColor(value: HexColor): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    inline def setDisplayConfiguration(value: ConditionalFormattingIconDisplayConfiguration): Self = StObject.set(x, "DisplayConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDisplayConfigurationUndefined: Self = StObject.set(x, "DisplayConfiguration", js.undefined)
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setIconOptions(value: ConditionalFormattingCustomIconOptions): Self = StObject.set(x, "IconOptions", value.asInstanceOf[js.Any])
  }
}
