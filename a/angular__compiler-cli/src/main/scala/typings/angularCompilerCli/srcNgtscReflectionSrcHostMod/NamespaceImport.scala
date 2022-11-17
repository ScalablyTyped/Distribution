package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.typescript.mod.ImportClause
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamespaceImport extends StObject {
  
  var importClause: ImportClause
  
  var kind: 4
  
  var typeNode: TypeNode
}
object NamespaceImport {
  
  inline def apply(importClause: ImportClause, typeNode: TypeNode): NamespaceImport = {
    val __obj = js.Dynamic.literal(importClause = importClause.asInstanceOf[js.Any], kind = 4, typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceImport]
  }
  
  extension [Self <: NamespaceImport](x: Self) {
    
    inline def setImportClause(value: ImportClause): Self = StObject.set(x, "importClause", value.asInstanceOf[js.Any])
    
    inline def setKind(value: 4): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTypeNode(value: TypeNode): Self = StObject.set(x, "typeNode", value.asInstanceOf[js.Any])
  }
}
