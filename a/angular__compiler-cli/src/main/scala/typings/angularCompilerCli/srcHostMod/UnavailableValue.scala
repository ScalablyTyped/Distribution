package typings.angularCompilerCli.srcHostMod

import typings.typescript.mod.ImportClause
import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompilerCli.srcHostMod.UnsupportedType
  - typings.angularCompilerCli.srcHostMod.NoValueDeclaration
  - typings.angularCompilerCli.srcHostMod.TypeOnlyImport
  - typings.angularCompilerCli.srcHostMod.NamespaceImport
  - typings.angularCompilerCli.srcHostMod.UnknownReference
  - typings.angularCompilerCli.srcHostMod.MissingType
*/
trait UnavailableValue extends StObject
object UnavailableValue {
  
  inline def MissingType(): typings.angularCompilerCli.srcHostMod.MissingType = {
    val __obj = js.Dynamic.literal(kind = 0)
    __obj.asInstanceOf[typings.angularCompilerCli.srcHostMod.MissingType]
  }
  
  inline def NamespaceImport(importClause: ImportClause, typeNode: TypeNode): typings.angularCompilerCli.srcHostMod.NamespaceImport = {
    val __obj = js.Dynamic.literal(importClause = importClause.asInstanceOf[js.Any], kind = 4, typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcHostMod.NamespaceImport]
  }
  
  inline def NoValueDeclaration(typeNode: TypeNode): typings.angularCompilerCli.srcHostMod.NoValueDeclaration = {
    val __obj = js.Dynamic.literal(kind = 1, typeNode = typeNode.asInstanceOf[js.Any], decl = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcHostMod.NoValueDeclaration]
  }
  
  inline def TypeOnlyImport(node: ImportClause | ImportSpecifier, typeNode: TypeNode): typings.angularCompilerCli.srcHostMod.TypeOnlyImport = {
    val __obj = js.Dynamic.literal(kind = 2, node = node.asInstanceOf[js.Any], typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcHostMod.TypeOnlyImport]
  }
  
  inline def UnknownReference(typeNode: TypeNode): typings.angularCompilerCli.srcHostMod.UnknownReference = {
    val __obj = js.Dynamic.literal(kind = 3, typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcHostMod.UnknownReference]
  }
  
  inline def UnsupportedType(typeNode: TypeNode): typings.angularCompilerCli.srcHostMod.UnsupportedType = {
    val __obj = js.Dynamic.literal(kind = 5, typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcHostMod.UnsupportedType]
  }
}
