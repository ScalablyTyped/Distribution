package typings.angularCompilerCli.anon

import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DecoratorIdentifier
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Import
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection.Decorator> */
trait ReadonlyDecorator extends StObject {
  
  val args: js.UndefOr[js.Array[Expression] | Null] = js.undefined
  
  val identifier: DecoratorIdentifier
  
  val `import`: js.UndefOr[Import | Null] = js.undefined
  
  val name: String
  
  val node: Node
}
object ReadonlyDecorator {
  
  inline def apply(identifier: DecoratorIdentifier, name: String, node: Node): ReadonlyDecorator = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyDecorator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyDecorator] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[Expression]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Expression*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setIdentifier(value: DecoratorIdentifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setImport(value: Import): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportNull: Self = StObject.set(x, "import", null)
    
    inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
