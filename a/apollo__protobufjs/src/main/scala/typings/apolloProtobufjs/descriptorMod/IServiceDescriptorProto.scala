package typings.apolloProtobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServiceDescriptorProto extends StObject {
  
  var method: js.UndefOr[js.Array[IMethodDescriptorProto]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[IServiceOptions] = js.undefined
}
object IServiceDescriptorProto {
  
  inline def apply(): IServiceDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServiceDescriptorProto]
  }
  
  extension [Self <: IServiceDescriptorProto](x: Self) {
    
    inline def setMethod(value: js.Array[IMethodDescriptorProto]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMethodVarargs(value: IMethodDescriptorProto*): Self = StObject.set(x, "method", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: IServiceOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
