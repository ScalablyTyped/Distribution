package typings.apolloProtobufjs.descriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOneofDescriptorProto extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[js.Any] = js.undefined
}
object IOneofDescriptorProto {
  
  inline def apply(): IOneofDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOneofDescriptorProto]
  }
  
  extension [Self <: IOneofDescriptorProto](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
