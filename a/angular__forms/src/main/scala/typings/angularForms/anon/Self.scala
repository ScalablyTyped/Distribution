package typings.angularForms.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Self extends StObject {
  
  var optional: true
  
  var self: true
}
object Self {
  
  inline def apply(): Self = {
    val __obj = js.Dynamic.literal(optional = true, self = true)
    __obj.asInstanceOf[Self]
  }
  
  extension [Self_ <: Self](x: Self_) {
    
    inline def setOptional(value: true): Self_ = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setSelf(value: true): Self_ = StObject.set(x, "self", value.asInstanceOf[js.Any])
  }
}
