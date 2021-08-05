package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryBindingDef extends StObject {
  
  var bindingType: ɵQueryBindingType
  
  var propName: String
}
object QueryBindingDef {
  
  inline def apply(bindingType: ɵQueryBindingType, propName: String): QueryBindingDef = {
    val __obj = js.Dynamic.literal(bindingType = bindingType.asInstanceOf[js.Any], propName = propName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBindingDef]
  }
  
  extension [Self <: QueryBindingDef](x: Self) {
    
    inline def setBindingType(value: ɵQueryBindingType): Self = StObject.set(x, "bindingType", value.asInstanceOf[js.Any])
    
    inline def setPropName(value: String): Self = StObject.set(x, "propName", value.asInstanceOf[js.Any])
  }
}
