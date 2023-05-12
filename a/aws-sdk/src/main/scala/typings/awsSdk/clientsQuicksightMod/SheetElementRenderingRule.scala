package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetElementRenderingRule extends StObject {
  
  /**
    * The override configuration of the rendering rules of a sheet.
    */
  var ConfigurationOverrides: SheetElementConfigurationOverrides
  
  /**
    * The expression of the rendering rules of a sheet.
    */
  var Expression: typings.awsSdk.clientsQuicksightMod.Expression
}
object SheetElementRenderingRule {
  
  inline def apply(ConfigurationOverrides: SheetElementConfigurationOverrides, Expression: Expression): SheetElementRenderingRule = {
    val __obj = js.Dynamic.literal(ConfigurationOverrides = ConfigurationOverrides.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetElementRenderingRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetElementRenderingRule] (val x: Self) extends AnyVal {
    
    inline def setConfigurationOverrides(value: SheetElementConfigurationOverrides): Self = StObject.set(x, "ConfigurationOverrides", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
  }
}
