package typings.apolloProtobufjs.extDescriptorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDescriptorProtoExtensionRange extends StObject {
  
  var end: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object IDescriptorProtoExtensionRange {
  
  inline def apply(): IDescriptorProtoExtensionRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDescriptorProtoExtensionRange]
  }
  
  extension [Self <: IDescriptorProtoExtensionRange](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
