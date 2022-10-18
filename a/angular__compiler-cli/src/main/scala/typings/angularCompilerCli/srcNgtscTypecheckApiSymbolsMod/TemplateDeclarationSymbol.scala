package typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typings.angularCompiler.mod.TmplAstElement
import typings.angularCompiler.mod.TmplAstReference
import typings.angularCompiler.mod.TmplAstTemplate
import typings.angularCompiler.mod.TmplAstVariable
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Reference
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Variable
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ReferenceSymbol
  - typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.VariableSymbol
*/
trait TemplateDeclarationSymbol extends StObject
object TemplateDeclarationSymbol {
  
  inline def ReferenceSymbol(
    declaration: TmplAstReference,
    kind: Reference,
    referenceVarLocation: TcbLocation,
    target: TmplAstElement | TmplAstTemplate | ClassDeclaration,
    targetLocation: TcbLocation,
    tsSymbol: typings.typescript.mod.Symbol,
    tsType: Type
  ): typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ReferenceSymbol = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], referenceVarLocation = referenceVarLocation.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetLocation = targetLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ReferenceSymbol]
  }
  
  inline def VariableSymbol(
    declaration: TmplAstVariable,
    initializerLocation: TcbLocation,
    kind: Variable,
    localVarLocation: TcbLocation,
    tsType: Type
  ): typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.VariableSymbol = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], initializerLocation = initializerLocation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], localVarLocation = localVarLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.VariableSymbol]
  }
}
