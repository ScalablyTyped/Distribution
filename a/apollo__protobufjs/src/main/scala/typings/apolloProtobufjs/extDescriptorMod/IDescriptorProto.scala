package typings.apolloProtobufjs.extDescriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDescriptorProto extends StObject {
  
  var enumType: js.UndefOr[js.Array[IEnumDescriptorProto]] = js.undefined
  
  var `extension`: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.undefined
  
  var extensionRange: js.UndefOr[js.Array[IDescriptorProtoExtensionRange]] = js.undefined
  
  var field: js.UndefOr[js.Array[IFieldDescriptorProto]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var nestedType: js.UndefOr[js.Array[IDescriptorProto]] = js.undefined
  
  var oneofDecl: js.UndefOr[js.Array[IOneofDescriptorProto]] = js.undefined
  
  var options: js.UndefOr[IMessageOptions] = js.undefined
  
  var reservedName: js.UndefOr[js.Array[String]] = js.undefined
  
  var reservedRange: js.UndefOr[js.Array[IDescriptorProtoReservedRange]] = js.undefined
}
object IDescriptorProto {
  
  inline def apply(): IDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDescriptorProto]
  }
  
  extension [Self <: IDescriptorProto](x: Self) {
    
    inline def setEnumType(value: js.Array[IEnumDescriptorProto]): Self = StObject.set(x, "enumType", value.asInstanceOf[js.Any])
    
    inline def setEnumTypeUndefined: Self = StObject.set(x, "enumType", js.undefined)
    
    inline def setEnumTypeVarargs(value: IEnumDescriptorProto*): Self = StObject.set(x, "enumType", js.Array(value*))
    
    inline def setExtension(value: js.Array[IFieldDescriptorProto]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionRange(value: js.Array[IDescriptorProtoExtensionRange]): Self = StObject.set(x, "extensionRange", value.asInstanceOf[js.Any])
    
    inline def setExtensionRangeUndefined: Self = StObject.set(x, "extensionRange", js.undefined)
    
    inline def setExtensionRangeVarargs(value: IDescriptorProtoExtensionRange*): Self = StObject.set(x, "extensionRange", js.Array(value*))
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setExtensionVarargs(value: IFieldDescriptorProto*): Self = StObject.set(x, "extension", js.Array(value*))
    
    inline def setField(value: js.Array[IFieldDescriptorProto]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFieldVarargs(value: IFieldDescriptorProto*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNestedType(value: js.Array[IDescriptorProto]): Self = StObject.set(x, "nestedType", value.asInstanceOf[js.Any])
    
    inline def setNestedTypeUndefined: Self = StObject.set(x, "nestedType", js.undefined)
    
    inline def setNestedTypeVarargs(value: IDescriptorProto*): Self = StObject.set(x, "nestedType", js.Array(value*))
    
    inline def setOneofDecl(value: js.Array[IOneofDescriptorProto]): Self = StObject.set(x, "oneofDecl", value.asInstanceOf[js.Any])
    
    inline def setOneofDeclUndefined: Self = StObject.set(x, "oneofDecl", js.undefined)
    
    inline def setOneofDeclVarargs(value: IOneofDescriptorProto*): Self = StObject.set(x, "oneofDecl", js.Array(value*))
    
    inline def setOptions(value: IMessageOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setReservedName(value: js.Array[String]): Self = StObject.set(x, "reservedName", value.asInstanceOf[js.Any])
    
    inline def setReservedNameUndefined: Self = StObject.set(x, "reservedName", js.undefined)
    
    inline def setReservedNameVarargs(value: String*): Self = StObject.set(x, "reservedName", js.Array(value*))
    
    inline def setReservedRange(value: js.Array[IDescriptorProtoReservedRange]): Self = StObject.set(x, "reservedRange", value.asInstanceOf[js.Any])
    
    inline def setReservedRangeUndefined: Self = StObject.set(x, "reservedRange", js.undefined)
    
    inline def setReservedRangeVarargs(value: IDescriptorProtoReservedRange*): Self = StObject.set(x, "reservedRange", js.Array(value*))
  }
}
