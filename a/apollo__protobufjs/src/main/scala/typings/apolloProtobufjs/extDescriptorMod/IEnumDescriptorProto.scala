package typings.apolloProtobufjs.extDescriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEnumDescriptorProto extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[IEnumOptions] = js.undefined
  
  var value: js.UndefOr[js.Array[IEnumValueDescriptorProto]] = js.undefined
}
object IEnumDescriptorProto {
  
  inline def apply(): IEnumDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnumDescriptorProto]
  }
  
  extension [Self <: IEnumDescriptorProto](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: IEnumOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setValue(value: js.Array[IEnumValueDescriptorProto]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: IEnumValueDescriptorProto*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
