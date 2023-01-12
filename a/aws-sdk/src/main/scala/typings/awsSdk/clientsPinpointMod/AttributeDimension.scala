package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeDimension extends StObject {
  
  /**
    * The type of segment dimension to use. Valid values are: INCLUSIVE - endpoints that have attributes matching the values are included in the segment.EXCLUSIVE - endpoints that have attributes matching the values are excluded in the segment.CONTAINS - endpoints that have attributes' substrings match the values are included in the segment.BEFORE - endpoints with attributes read as ISO_INSTANT datetimes before the value are included in the segment.AFTER - endpoints with attributes read as ISO_INSTANT datetimes after the value are included in the segment.ON - endpoints with attributes read as ISO_INSTANT dates on the value are included in the segment. Time is ignored in this comparison.BETWEEN - endpoints with attributes read as ISO_INSTANT datetimes between the values are included in the segment.
    */
  var AttributeType: js.UndefOr[typings.awsSdk.clientsPinpointMod.AttributeType] = js.undefined
  
  /**
    * The criteria values to use for the segment dimension. Depending on the value of the AttributeType property, endpoints are included or excluded from the segment if their attribute values match the criteria values.
    */
  var Values: ListOfString
}
object AttributeDimension {
  
  inline def apply(Values: ListOfString): AttributeDimension = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeDimension] (val x: Self) extends AnyVal {
    
    inline def setAttributeType(value: AttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    inline def setAttributeTypeUndefined: Self = StObject.set(x, "AttributeType", js.undefined)
    
    inline def setValues(value: ListOfString): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: string*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
