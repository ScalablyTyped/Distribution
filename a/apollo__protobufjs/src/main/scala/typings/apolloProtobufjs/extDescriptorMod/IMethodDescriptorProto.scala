package typings.apolloProtobufjs.extDescriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMethodDescriptorProto extends StObject {
  
  var clientStreaming: js.UndefOr[Boolean] = js.undefined
  
  var inputType: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[IMethodOptions] = js.undefined
  
  var outputType: js.UndefOr[String] = js.undefined
  
  var serverStreaming: js.UndefOr[Boolean] = js.undefined
}
object IMethodDescriptorProto {
  
  inline def apply(): IMethodDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMethodDescriptorProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMethodDescriptorProto] (val x: Self) extends AnyVal {
    
    inline def setClientStreaming(value: Boolean): Self = StObject.set(x, "clientStreaming", value.asInstanceOf[js.Any])
    
    inline def setClientStreamingUndefined: Self = StObject.set(x, "clientStreaming", js.undefined)
    
    inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: IMethodOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOutputType(value: String): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
    
    inline def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
    
    inline def setServerStreaming(value: Boolean): Self = StObject.set(x, "serverStreaming", value.asInstanceOf[js.Any])
    
    inline def setServerStreamingUndefined: Self = StObject.set(x, "serverStreaming", js.undefined)
  }
}
