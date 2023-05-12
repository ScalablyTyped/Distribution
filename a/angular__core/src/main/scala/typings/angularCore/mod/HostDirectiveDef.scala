package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Runtime information used to configure a host directive. */
trait HostDirectiveDef[T] extends StObject {
  
  /** Class representing the host directive. */
  var directive: Type[T]
  
  /** Directive inputs that have been exposed. */
  var inputs: HostDirectiveBindingMap
  
  /** Directive outputs that have been exposed. */
  var outputs: HostDirectiveBindingMap
}
object HostDirectiveDef {
  
  inline def apply[T](directive: Type[T], inputs: HostDirectiveBindingMap, outputs: HostDirectiveBindingMap): HostDirectiveDef[T] = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostDirectiveDef[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostDirectiveDef[?], T] (val x: Self & HostDirectiveDef[T]) extends AnyVal {
    
    inline def setDirective(value: Type[T]): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: HostDirectiveBindingMap): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: HostDirectiveBindingMap): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
  }
}
