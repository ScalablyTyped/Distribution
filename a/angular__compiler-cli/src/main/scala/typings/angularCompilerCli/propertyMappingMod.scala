package typings.angularCompilerCli

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.mod.InputOutputPropertySet
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertyMappingMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/property_mapping", "ClassPropertyMapping")
  @js.native
  /* private */ open class ClassPropertyMapping ()
    extends StObject
       with InputOutputPropertySet {
    
    /**
      * All class property names mapped in this mapping.
      */
    def classPropertyNames: js.Array[ClassPropertyName] = js.native
    
    /**
      * Mapping from class property names to the single `InputOrOutput` for that class property.
      */
    /* private */ var forwardMap: Any = js.native
    
    /**
      * Lookup all `InputOrOutput`s that use this `propertyName`.
      */
    def getByBindingPropertyName(propertyName: String): js.Array[InputOrOutput] | Null = js.native
    
    /**
      * Lookup the `InputOrOutput` associated with a `classPropertyName`.
      */
    def getByClassPropertyName(classPropertyName: String): InputOrOutput | Null = js.native
    
    /* CompleteClass */
    override def hasBindingPropertyName(propertyName: String): Boolean = js.native
    
    /**
      * Implement the iterator protocol and return entry objects which contain the class and binding
      * property names (and are useful for destructuring).
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[ClassPropertyName, BindingPropertyName]]] = js.native
    
    /**
      * All binding property names mapped in this mapping.
      */
    def propertyNames: js.Array[BindingPropertyName] = js.native
    
    /**
      * Mapping from property names to one or more `InputOrOutput`s which share that name.
      */
    /* private */ var reverseMap: Any = js.native
    
    /**
      * Convert this mapping to a primitive JS object which maps each class property directly to the
      * binding property name associated with it.
      */
    def toDirectMappedObject(): StringDictionary[BindingPropertyName] = js.native
    
    /**
      * Convert this mapping to a primitive JS object which maps each class property either to itself
      * (for cases where the binding property name is the same) or to an array which contains both
      * names if they differ.
      *
      * This object format is used when mappings are serialized (for example into .d.ts files).
      */
    def toJointMappedObject(): StringDictionary[BindingPropertyName | (js.Tuple2[BindingPropertyName, ClassPropertyName])] = js.native
  }
  /* static members */
  object ClassPropertyMapping {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/metadata/src/property_mapping", "ClassPropertyMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Construct a `ClassPropertyMapping` with no entries.
      */
    inline def empty(): ClassPropertyMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[ClassPropertyMapping]
    
    /**
      * Construct a `ClassPropertyMapping` from a primitive JS object which maps class property names
      * to either binding property names or an array that contains both names, which is used in on-disk
      * metadata formats (e.g. in .d.ts files).
      */
    inline def fromMappedObject(obj: StringDictionary[BindingPropertyName | (js.Tuple2[ClassPropertyName, BindingPropertyName])]): ClassPropertyMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMappedObject")(obj.asInstanceOf[js.Any]).asInstanceOf[ClassPropertyMapping]
    
    /**
      * Merge two mappings into one, with class properties from `b` taking precedence over class
      * properties from `a`.
      */
    inline def merge(a: ClassPropertyMapping, b: ClassPropertyMapping): ClassPropertyMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[ClassPropertyMapping]
  }
  
  type BindingPropertyName = String
  
  type ClassPropertyName = String
  
  trait InputOrOutput extends StObject {
    
    /**
      * The property name used to bind this input or output in an Angular template.
      */
    val bindingPropertyName: BindingPropertyName
    
    /**
      * The name of the JavaScript property on the component or directive instance for this input or
      * output.
      */
    val classPropertyName: ClassPropertyName
  }
  object InputOrOutput {
    
    inline def apply(bindingPropertyName: BindingPropertyName, classPropertyName: ClassPropertyName): InputOrOutput = {
      val __obj = js.Dynamic.literal(bindingPropertyName = bindingPropertyName.asInstanceOf[js.Any], classPropertyName = classPropertyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputOrOutput]
    }
    
    extension [Self <: InputOrOutput](x: Self) {
      
      inline def setBindingPropertyName(value: BindingPropertyName): Self = StObject.set(x, "bindingPropertyName", value.asInstanceOf[js.Any])
      
      inline def setClassPropertyName(value: ClassPropertyName): Self = StObject.set(x, "classPropertyName", value.asInstanceOf[js.Any])
    }
  }
}
