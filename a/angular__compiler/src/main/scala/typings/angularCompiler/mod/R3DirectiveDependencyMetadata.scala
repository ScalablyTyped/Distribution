package typings.angularCompiler.mod

import typings.angularCompiler.mod.R3TemplateDependencyKind.Directive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DirectiveDependencyMetadata
  extends StObject
     with R3TemplateDependency {
  
  /**
    * Name under which the directive is exported, if any (exportAs in Angular). Null otherwise.
    */
  var exportAs: js.Array[String] | Null
  
  /**
    * The binding property names of the inputs of the directive.
    */
  var inputs: js.Array[String]
  
  /**
    * If true then this directive is actually a component; otherwise it is not.
    */
  var isComponent: Boolean
  
  @JSName("kind")
  var kind_R3DirectiveDependencyMetadata: Directive
  
  /**
    * The binding property names of the outputs of the directive.
    */
  var outputs: js.Array[String]
  
  /**
    * The selector of the directive.
    */
  var selector: String
}
object R3DirectiveDependencyMetadata {
  
  inline def apply(
    inputs: js.Array[String],
    isComponent: Boolean,
    kind: Directive,
    outputs: js.Array[String],
    selector: String,
    `type`: Expression
  ): R3DirectiveDependencyMetadata = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], exportAs = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DirectiveDependencyMetadata]
  }
  
  extension [Self <: R3DirectiveDependencyMetadata](x: Self) {
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsNull: Self = StObject.set(x, "exportAs", null)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value*))
    
    inline def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
    
    inline def setKind(value: Directive): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
