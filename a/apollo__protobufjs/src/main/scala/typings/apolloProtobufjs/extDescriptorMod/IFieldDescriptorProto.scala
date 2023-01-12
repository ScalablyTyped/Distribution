package typings.apolloProtobufjs.extDescriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldDescriptorProto extends StObject {
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var extendee: js.UndefOr[String] = js.undefined
  
  var jsonName: js.UndefOr[Any] = js.undefined
  
  var label: js.UndefOr[IFieldDescriptorProtoLabel] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[Double] = js.undefined
  
  var oneofIndex: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[IFieldOptions] = js.undefined
  
  var `type`: js.UndefOr[IFieldDescriptorProtoType] = js.undefined
  
  var typeName: js.UndefOr[String] = js.undefined
}
object IFieldDescriptorProto {
  
  inline def apply(): IFieldDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldDescriptorProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFieldDescriptorProto] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setExtendee(value: String): Self = StObject.set(x, "extendee", value.asInstanceOf[js.Any])
    
    inline def setExtendeeUndefined: Self = StObject.set(x, "extendee", js.undefined)
    
    inline def setJsonName(value: Any): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    inline def setLabel(value: IFieldDescriptorProtoLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOneofIndex(value: Double): Self = StObject.set(x, "oneofIndex", value.asInstanceOf[js.Any])
    
    inline def setOneofIndexUndefined: Self = StObject.set(x, "oneofIndex", js.undefined)
    
    inline def setOptions(value: IFieldOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setType(value: IFieldDescriptorProtoType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
