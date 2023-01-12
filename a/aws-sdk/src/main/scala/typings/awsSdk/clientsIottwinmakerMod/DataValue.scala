package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataValue extends StObject {
  
  /**
    * A Boolean value.
    */
  var booleanValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A double value.
    */
  var doubleValue: js.UndefOr[Double] = js.undefined
  
  /**
    * An expression that produces the value.
    */
  var expression: js.UndefOr[Expression] = js.undefined
  
  /**
    * An integer value.
    */
  var integerValue: js.UndefOr[Integer] = js.undefined
  
  /**
    * A list of multiple values.
    */
  var listValue: js.UndefOr[DataValueList] = js.undefined
  
  /**
    * A long value.
    */
  var longValue: js.UndefOr[Long] = js.undefined
  
  /**
    * An object that maps strings to multiple DataValue objects.
    */
  var mapValue: js.UndefOr[DataValueMap] = js.undefined
  
  /**
    * A value that relates a component to another component.
    */
  var relationshipValue: js.UndefOr[RelationshipValue] = js.undefined
  
  /**
    * A string value.
    */
  var stringValue: js.UndefOr[String] = js.undefined
}
object DataValue {
  
  inline def apply(): DataValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataValue] (val x: Self) extends AnyVal {
    
    inline def setBooleanValue(value: Boolean): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setDoubleValue(value: Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setIntegerValue(value: Integer): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setListValue(value: DataValueList): Self = StObject.set(x, "listValue", value.asInstanceOf[js.Any])
    
    inline def setListValueUndefined: Self = StObject.set(x, "listValue", js.undefined)
    
    inline def setListValueVarargs(value: DataValue*): Self = StObject.set(x, "listValue", js.Array(value*))
    
    inline def setLongValue(value: Long): Self = StObject.set(x, "longValue", value.asInstanceOf[js.Any])
    
    inline def setLongValueUndefined: Self = StObject.set(x, "longValue", js.undefined)
    
    inline def setMapValue(value: DataValueMap): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
    
    inline def setMapValueUndefined: Self = StObject.set(x, "mapValue", js.undefined)
    
    inline def setRelationshipValue(value: RelationshipValue): Self = StObject.set(x, "relationshipValue", value.asInstanceOf[js.Any])
    
    inline def setRelationshipValueUndefined: Self = StObject.set(x, "relationshipValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
