package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.typescript.mod.ImportClause
import typings.typescript.mod.ImportSpecifier
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnsupportedType
  - typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.NoValueDeclaration
  - typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.TypeOnlyImport
  - typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.NamespaceImport
  - typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnknownReference
  - typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.MissingType
*/
trait UnavailableValue extends StObject
object UnavailableValue {
  
  inline def MissingType(): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.MissingType = {
    val __obj = js.Dynamic.literal(kind = 0)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.MissingType]
  }
  
  inline def NamespaceImport(importClause: ImportClause, typeNode: TypeNode): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.NamespaceImport = {
    val __obj = js.Dynamic.literal(importClause = importClause.asInstanceOf[js.Any], kind = 4, typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.NamespaceImport]
  }
  
  inline def NoValueDeclaration(typeNode: TypeNode): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.NoValueDeclaration = {
    val __obj = js.Dynamic.literal(kind = 1, typeNode = typeNode.asInstanceOf[js.Any], decl = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.NoValueDeclaration]
  }
  
  inline def TypeOnlyImport(node: ImportClause | ImportSpecifier, typeNode: TypeNode): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.TypeOnlyImport = {
    val __obj = js.Dynamic.literal(kind = 2, node = node.asInstanceOf[js.Any], typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.TypeOnlyImport]
  }
  
  inline def UnknownReference(typeNode: TypeNode): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnknownReference = {
    val __obj = js.Dynamic.literal(kind = 3, typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnknownReference]
  }
  
  inline def UnsupportedType(typeNode: TypeNode): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnsupportedType = {
    val __obj = js.Dynamic.literal(kind = 5, typeNode = typeNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnsupportedType]
  }
}
