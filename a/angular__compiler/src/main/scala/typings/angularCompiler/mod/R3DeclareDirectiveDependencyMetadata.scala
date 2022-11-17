package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareDirectiveDependencyMetadata extends StObject {
  
  /**
    * Names by which this directive exports itself for references.
    */
  var exportAs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Property names of the directive's inputs.
    */
  var inputs: js.UndefOr[js.Array[String]] = js.undefined
  
  var kind: "directive" | "component"
  
  /**
    * Event names of the directive's outputs.
    */
  var outputs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Selector of the directive.
    */
  var selector: String
  
  /**
    * Reference to the directive class (possibly a forward reference wrapped in a `forwardRef`
    * invocation).
    */
  var `type`: Expression | js.Function0[Expression]
}
object R3DeclareDirectiveDependencyMetadata {
  
  inline def apply(kind: "directive" | "component", selector: String, `type`: Expression | js.Function0[Expression]): R3DeclareDirectiveDependencyMetadata = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareDirectiveDependencyMetadata]
  }
  
  extension [Self <: R3DeclareDirectiveDependencyMetadata](x: Self) {
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value*))
    
    inline def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setKind(value: "directive" | "component"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setType(value: Expression | js.Function0[Expression]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction0(value: () => Expression): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
  }
}
