package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectiveMeta extends StObject {
  
  /**
    * The name of animations that the user defines in the component.
    * Only includes the animation names.
    */
  var animationTriggerNames: AnimationTriggerNames | Null
  
  /**
    * Name under which the directive is exported, if any (exportAs in Angular).
    *
    * Null otherwise
    */
  var exportAs: js.Array[String] | Null
  
  /**
    * Set of inputs which this directive claims.
    *
    * Goes from property names to field names.
    */
  var inputs: InputOutputPropertySet
  
  /**
    * Whether the directive is a component.
    */
  var isComponent: Boolean
  
  var isStructural: Boolean
  
  /**
    * Name of the directive class (used for debugging).
    */
  var name: String
  
  /**
    * Set of outputs which this directive claims.
    *
    * Goes from property names to field names.
    */
  var outputs: InputOutputPropertySet
  
  /** The selector for the directive or `null` if there isn't one. */
  var selector: String | Null
}
object DirectiveMeta {
  
  inline def apply(
    inputs: InputOutputPropertySet,
    isComponent: Boolean,
    isStructural: Boolean,
    name: String,
    outputs: InputOutputPropertySet
  ): DirectiveMeta = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], animationTriggerNames = null, exportAs = null, selector = null)
    __obj.asInstanceOf[DirectiveMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectiveMeta] (val x: Self) extends AnyVal {
    
    inline def setAnimationTriggerNames(value: AnimationTriggerNames): Self = StObject.set(x, "animationTriggerNames", value.asInstanceOf[js.Any])
    
    inline def setAnimationTriggerNamesNull: Self = StObject.set(x, "animationTriggerNames", null)
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsNull: Self = StObject.set(x, "exportAs", null)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value*))
    
    inline def setInputs(value: InputOutputPropertySet): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
    
    inline def setIsStructural(value: Boolean): Self = StObject.set(x, "isStructural", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: InputOutputPropertySet): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
  }
}
