package typings.angularCompilerCli.srcHostMod

import typings.angularCompilerCli.angularCompilerCliNumbers.`2`
import typings.typescript.mod.ImportClause
import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeOnlyImport
  extends StObject
     with UnavailableValue {
  
  var kind: `2`
  
  var node: ImportClause | ImportSpecifier
  
  var typeNode: TypeNode
}
object TypeOnlyImport {
  
  inline def apply(node: ImportClause | ImportSpecifier, typeNode: TypeNode): TypeOnlyImport = {
    val __obj = js.Dynamic.literal(kind = 2, node = node.asInstanceOf[js.Any], typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOnlyImport]
  }
  
  extension [Self <: TypeOnlyImport](x: Self) {
    
    inline def setKind(value: `2`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNode(value: ImportClause | ImportSpecifier): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setTypeNode(value: TypeNode): Self = StObject.set(x, "typeNode", value.asInstanceOf[js.Any])
  }
}
