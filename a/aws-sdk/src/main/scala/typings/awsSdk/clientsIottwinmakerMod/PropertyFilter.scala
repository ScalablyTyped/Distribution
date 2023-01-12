package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyFilter extends StObject {
  
  /**
    * The operator associated with this property filter.
    */
  var operator: js.UndefOr[String] = js.undefined
  
  /**
    * The property name associated with this property filter.
    */
  var propertyName: js.UndefOr[String] = js.undefined
  
  /**
    * The value associated with this property filter.
    */
  var value: js.UndefOr[DataValue] = js.undefined
}
object PropertyFilter {
  
  inline def apply(): PropertyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyFilter] (val x: Self) extends AnyVal {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    
    inline def setValue(value: DataValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
