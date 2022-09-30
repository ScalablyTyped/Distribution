package typings.apolloProtobufjs.mod.common

import typings.apolloProtobufjs.apolloProtobufjsInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.Value message. */
trait IValue extends StObject {
  
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var listValue: js.UndefOr[IListValue] = js.undefined
  
  var nullValue: js.UndefOr[`0`] = js.undefined
  
  var numberValue: js.UndefOr[Double] = js.undefined
  
  var stringValue: js.UndefOr[String] = js.undefined
  
  var structValue: js.UndefOr[IStruct] = js.undefined
}
object IValue {
  
  inline def apply(): IValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValue]
  }
  
  extension [Self <: IValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setListValue(value: IListValue): Self = StObject.set(x, "listValue", value.asInstanceOf[js.Any])
    
    inline def setListValueUndefined: Self = StObject.set(x, "listValue", js.undefined)
    
    inline def setNullValue(value: `0`): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    inline def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    inline def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    inline def setStructValue(value: IStruct): Self = StObject.set(x, "structValue", value.asInstanceOf[js.Any])
    
    inline def setStructValueUndefined: Self = StObject.set(x, "structValue", js.undefined)
  }
}
