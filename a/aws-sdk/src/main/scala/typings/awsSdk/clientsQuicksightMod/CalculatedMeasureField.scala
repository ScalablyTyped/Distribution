package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculatedMeasureField extends StObject {
  
  /**
    * The expression in the table calculation.
    */
  var Expression: typings.awsSdk.clientsQuicksightMod.Expression
  
  /**
    * The custom field ID.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
}
object CalculatedMeasureField {
  
  inline def apply(Expression: Expression, FieldId: FieldId): CalculatedMeasureField = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any], FieldId = FieldId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedMeasureField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculatedMeasureField] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
  }
}
