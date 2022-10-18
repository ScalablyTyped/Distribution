package typings.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.LocalTypeValueReference
  - typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ImportedTypeValueReference
  - typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnavailableTypeValueReference
*/
trait TypeValueReference extends StObject
object TypeValueReference {
  
  inline def ImportedTypeValueReference(importedName: String, moduleName: String, valueDeclaration: DeclarationNode): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ImportedTypeValueReference = {
    val __obj = js.Dynamic.literal(importedName = importedName.asInstanceOf[js.Any], kind = 1, moduleName = moduleName.asInstanceOf[js.Any], valueDeclaration = valueDeclaration.asInstanceOf[js.Any], nestedPath = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ImportedTypeValueReference]
  }
  
  inline def LocalTypeValueReference(expression: Expression): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.LocalTypeValueReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], kind = 0, defaultImportStatement = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.LocalTypeValueReference]
  }
  
  inline def UnavailableTypeValueReference(reason: UnavailableValue): typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnavailableTypeValueReference = {
    val __obj = js.Dynamic.literal(kind = 2, reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.UnavailableTypeValueReference]
  }
}
