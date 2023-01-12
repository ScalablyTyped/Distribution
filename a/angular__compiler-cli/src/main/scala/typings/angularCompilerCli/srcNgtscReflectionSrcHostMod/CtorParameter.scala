package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.typescript.mod.BindingName
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtorParameter extends StObject {
  
  /**
    * Any `Decorator`s which are present on the parameter, or `null` if none are present.
    */
  var decorators: js.Array[Decorator] | Null
  
  /**
    * Name of the parameter, if available.
    *
    * Some parameters don't have a simple string name (for example, parameters which are destructured
    * into multiple variables). In these cases, `name` can be `null`.
    */
  var name: String | Null
  
  /**
    * TypeScript `ts.BindingName` representing the name of the parameter.
    *
    * The `nameNode` is useful in writing references to this member that will be correctly source-
    * mapped back to the original file.
    */
  var nameNode: BindingName
  
  /**
    * TypeScript `ts.TypeNode` representing the type node found in the type position.
    *
    * This field can be used for diagnostics reporting if `typeValueReference` is `null`.
    *
    * Can be null, if the param has no type declared.
    */
  var typeNode: TypeNode | Null
  
  /**
    * Reference to the value of the parameter's type annotation, if it's possible to refer to the
    * parameter's type as a value.
    *
    * This can either be a reference to a local value, a reference to an imported value, or no
    * value if no is present or cannot be represented as an expression.
    */
  var typeValueReference: TypeValueReference
}
object CtorParameter {
  
  inline def apply(nameNode: BindingName, typeValueReference: TypeValueReference): CtorParameter = {
    val __obj = js.Dynamic.literal(nameNode = nameNode.asInstanceOf[js.Any], typeValueReference = typeValueReference.asInstanceOf[js.Any], decorators = null, name = null, typeNode = null)
    __obj.asInstanceOf[CtorParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CtorParameter] (val x: Self) extends AnyVal {
    
    inline def setDecorators(value: js.Array[Decorator]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsVarargs(value: Decorator*): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNode(value: BindingName): Self = StObject.set(x, "nameNode", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setTypeNode(value: TypeNode): Self = StObject.set(x, "typeNode", value.asInstanceOf[js.Any])
    
    inline def setTypeNodeNull: Self = StObject.set(x, "typeNode", null)
    
    inline def setTypeValueReference(value: TypeValueReference): Self = StObject.set(x, "typeValueReference", value.asInstanceOf[js.Any])
  }
}
