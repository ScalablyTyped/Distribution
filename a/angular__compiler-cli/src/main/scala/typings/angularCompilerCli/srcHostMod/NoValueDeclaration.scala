package typings.angularCompilerCli.srcHostMod

import typings.angularCompilerCli.angularCompilerCliInts.`1`
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoValueDeclaration
  extends StObject
     with UnavailableValue {
  
  var decl: typings.typescript.mod.Declaration | Null
  
  var kind: `1`
  
  var typeNode: TypeNode
}
object NoValueDeclaration {
  
  inline def apply(typeNode: TypeNode): NoValueDeclaration = {
    val __obj = js.Dynamic.literal(kind = 1, typeNode = typeNode.asInstanceOf[js.Any], decl = null)
    __obj.asInstanceOf[NoValueDeclaration]
  }
  
  extension [Self <: NoValueDeclaration](x: Self) {
    
    inline def setDecl(value: typings.typescript.mod.Declaration): Self = StObject.set(x, "decl", value.asInstanceOf[js.Any])
    
    inline def setDeclNull: Self = StObject.set(x, "decl", null)
    
    inline def setKind(value: `1`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTypeNode(value: TypeNode): Self = StObject.set(x, "typeNode", value.asInstanceOf[js.Any])
  }
}
