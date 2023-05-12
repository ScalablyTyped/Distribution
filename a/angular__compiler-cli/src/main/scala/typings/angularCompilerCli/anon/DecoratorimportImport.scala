package typings.angularCompilerCli.anon

import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DecoratorIdentifier
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Import
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection.Decorator & {  import :@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection.Import} */
trait DecoratorimportImport extends StObject {
  
  /**
    * Arguments of the invocation of the decorator, if the decorator is invoked, or `null`
    * otherwise.
    */
  var args: js.Array[Expression] | Null
  
  /**
    * Identifier which refers to the decorator in the user's code.
    */
  var identifier: DecoratorIdentifier
  
  /**
    * `Import` by which the decorator was brought into the module in which it was invoked, or `null`
    * if the decorator was declared in the same module and not imported.
    *
    * Note: this field is declared using computed property syntax to work around a clang-format bug
    * that resulted in inconsistent indentation of this comment block.
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
    * TypeScript reference to the decorator itself.
    */
  var node: Node
}
object DecoratorimportImport {
  
  inline def apply(identifier: DecoratorIdentifier, name: String, node: Node): DecoratorimportImport = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], args = null)
    __obj.updateDynamic("import")(null)
    __obj.asInstanceOf[DecoratorimportImport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecoratorimportImport] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[Expression]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsVarargs(value: Expression*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setIdentifier(value: DecoratorIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setImport(value: Import): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportNull: Self = StObject.set(x, "import", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
