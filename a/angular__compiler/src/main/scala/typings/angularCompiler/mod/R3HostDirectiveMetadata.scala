package typings.angularCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3HostDirectiveMetadata extends StObject {
  
  /** An expression representing the host directive class itself. */
  var directive: R3Reference
  
  /** Inputs from the host directive that will be exposed on the host. */
  var inputs: StringDictionary[String] | Null
  
  /** Whether the expression referring to the host directive is a forward reference. */
  var isForwardReference: Boolean
  
  /** Outputs from the host directive that will be exposed on the host. */
  var outputs: StringDictionary[String] | Null
}
object R3HostDirectiveMetadata {
  
  inline def apply(directive: R3Reference, isForwardReference: Boolean): R3HostDirectiveMetadata = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], isForwardReference = isForwardReference.asInstanceOf[js.Any], inputs = null, outputs = null)
    __obj.asInstanceOf[R3HostDirectiveMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3HostDirectiveMetadata] (val x: Self) extends AnyVal {
    
    inline def setDirective(value: R3Reference): Self = StObject.set(x, "directive", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StringDictionary[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsNull: Self = StObject.set(x, "inputs", null)
    
    inline def setIsForwardReference(value: Boolean): Self = StObject.set(x, "isForwardReference", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: StringDictionary[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsNull: Self = StObject.set(x, "outputs", null)
  }
}
