package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculatedField extends StObject {
  
  /**
    * The data set that is used in this calculated field.
    */
  var DataSetIdentifier: typings.awsSdk.clientsQuicksightMod.DataSetIdentifier
  
  /**
    * The expression of the calculated field.
    */
  var Expression: CalculatedFieldExpression
  
  /**
    * The name of the calculated field.
    */
  var Name: ColumnName
}
object CalculatedField {
  
  inline def apply(DataSetIdentifier: DataSetIdentifier, Expression: CalculatedFieldExpression, Name: ColumnName): CalculatedField = {
    val __obj = js.Dynamic.literal(DataSetIdentifier = DataSetIdentifier.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculatedField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculatedField] (val x: Self) extends AnyVal {
    
    inline def setDataSetIdentifier(value: DataSetIdentifier): Self = StObject.set(x, "DataSetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: CalculatedFieldExpression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setName(value: ColumnName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
