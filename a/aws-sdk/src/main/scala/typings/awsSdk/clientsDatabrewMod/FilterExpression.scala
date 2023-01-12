package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterExpression extends StObject {
  
  /**
    * The expression which includes condition names followed by substitution variables, possibly grouped and combined with other conditions. For example, "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or ends_with :suffix2)". Substitution variables should start with ':' symbol.
    */
  var Expression: typings.awsSdk.clientsDatabrewMod.Expression
  
  /**
    * The map of substitution variable names to their values used in this filter expression.
    */
  var ValuesMap: typings.awsSdk.clientsDatabrewMod.ValuesMap
}
object FilterExpression {
  
  inline def apply(Expression: Expression, ValuesMap: ValuesMap): FilterExpression = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], ValuesMap = ValuesMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterExpression] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setValuesMap(value: ValuesMap): Self = StObject.set(x, "ValuesMap", value.asInstanceOf[js.Any])
  }
}
