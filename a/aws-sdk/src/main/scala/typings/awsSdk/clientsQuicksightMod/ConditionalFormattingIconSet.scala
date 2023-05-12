package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalFormattingIconSet extends StObject {
  
  /**
    * The expression that determines the formatting configuration for the icon set.
    */
  var Expression: typings.awsSdk.clientsQuicksightMod.Expression
  
  /**
    * Determines the icon set type.
    */
  var IconSetType: js.UndefOr[ConditionalFormattingIconSetType] = js.undefined
}
object ConditionalFormattingIconSet {
  
  inline def apply(Expression: Expression): ConditionalFormattingIconSet = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingIconSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormattingIconSet] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setIconSetType(value: ConditionalFormattingIconSetType): Self = StObject.set(x, "IconSetType", value.asInstanceOf[js.Any])
    
    inline def setIconSetTypeUndefined: Self = StObject.set(x, "IconSetType", js.undefined)
  }
}
