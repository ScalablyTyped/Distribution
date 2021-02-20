package typings.apolloProtobufjs.mod.common

import typings.apolloProtobufjs.apolloProtobufjsNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a google.protobuf.Value message. */
@js.native
trait IValue extends StObject {
  
  var boolValue: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var listValue: js.UndefOr[IListValue] = js.native
  
  var nullValue: js.UndefOr[`0`] = js.native
  
  var numberValue: js.UndefOr[Double] = js.native
  
  var stringValue: js.UndefOr[String] = js.native
  
  var structValue: js.UndefOr[IStruct] = js.native
}
object IValue {
  
  @scala.inline
  def apply(): IValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IValue]
  }
  
  @scala.inline
  implicit class IValueMutableBuilder[Self <: IValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setListValue(value: IListValue): Self = StObject.set(x, "listValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListValueUndefined: Self = StObject.set(x, "listValue", js.undefined)
    
    @scala.inline
    def setNullValue(value: `0`): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    @scala.inline
    def setNumberValue(value: Double): Self = StObject.set(x, "numberValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberValueUndefined: Self = StObject.set(x, "numberValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    
    @scala.inline
    def setStructValue(value: IStruct): Self = StObject.set(x, "structValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructValueUndefined: Self = StObject.set(x, "structValue", js.undefined)
  }
}
