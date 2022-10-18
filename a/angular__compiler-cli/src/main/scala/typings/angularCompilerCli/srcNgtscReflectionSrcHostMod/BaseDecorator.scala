package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseDecorator extends StObject {
  
  /**
    * Arguments of the invocation of the decorator, if the decorator is invoked, or `null`
    * otherwise.
    */
  var args: js.Array[Expression] | Null
  
  /**
    * Identifier which refers to the decorator in the user's code.
    */
  var identifier: DecoratorIdentifier | Null
  
  /**
    * `Import` by which the decorator was brought into the module in which it was invoked, or `null`
    * if the decorator was declared in the same module and not imported.
    */
  var `import`: Import | Null
  
  /**
    * Name by which the decorator was invoked in the user's code.
    *
    * This is distinct from the name by which the decorator was imported (though in practice they
    * will usually be the same).
    */
  var name: String
  
  /**
    * TypeScript reference to the decorator itself, or `null` if the decorator is synthesized (e.g.
    * in ngcc).
    */
  var node: Node | Null
}
object BaseDecorator {
  
  inline def apply(name: String): BaseDecorator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], args = null, identifier = null, node = null)
    __obj.updateDynamic("import")(null)
    __obj.asInstanceOf[BaseDecorator]
  }
  
  extension [Self <: BaseDecorator](x: Self) {
    
    inline def setArgs(value: js.Array[Expression]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsVarargs(value: Expression*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setIdentifier(value: DecoratorIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierNull: Self = StObject.set(x, "identifier", null)
    
    inline def setImport(value: Import): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportNull: Self = StObject.set(x, "import", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeNull: Self = StObject.set(x, "node", null)
  }
}
