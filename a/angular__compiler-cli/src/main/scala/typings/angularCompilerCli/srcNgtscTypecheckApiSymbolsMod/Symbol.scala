package typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod

import typings.angularCompiler.mod.TmplAstElement
import typings.angularCompiler.mod.TmplAstReference
import typings.angularCompiler.mod.TmplAstTemplate
import typings.angularCompiler.mod.TmplAstVariable
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Directive
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.DomBinding
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Element
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Expression
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Input
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Output
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Pipe
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Template
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Variable
import typings.angularCompilerCli.srcNgtscUtilSrcTypescriptMod.SymbolWithValueDeclaration
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.InputBindingSymbol
  - typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.OutputBindingSymbol
  - typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ElementSymbol
  - typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ReferenceSymbol
  - typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.VariableSymbol
  - typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ExpressionSymbol
  - typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.DirectiveSymbol
  - typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TemplateSymbol
  - typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.DomBindingSymbol
  - typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.PipeSymbol
*/
trait Symbol extends StObject
object Symbol {
  
  inline def DirectiveSymbolBaseisHost(
    isComponent: Boolean,
    isInScope: Boolean,
    isStructural: Boolean,
    kind: Directive,
    ref: Reference[ClassDeclarationDeclarati],
    tcbLocation: TcbLocation,
    tsSymbol: SymbolWithValueDeclaration,
    tsType: Type
  ): typings.angularCompilerCli.anon.DirectiveSymbolBaseisHost = {
    val __obj = js.Dynamic.literal(isComponent = isComponent.asInstanceOf[js.Any], isHostDirective = false, isInScope = isInScope.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], ngModule = null, selector = null)
    __obj.asInstanceOf[typings.angularCompilerCli.anon.DirectiveSymbolBaseisHost]
  }
  
  inline def DirectiveSymbolBaseisHostExposedInputs(
    isComponent: Boolean,
    isInScope: Boolean,
    isStructural: Boolean,
    kind: Directive,
    ref: Reference[ClassDeclarationDeclarati],
    tcbLocation: TcbLocation,
    tsSymbol: SymbolWithValueDeclaration,
    tsType: Type
  ): typings.angularCompilerCli.anon.DirectiveSymbolBaseisHostExposedInputs = {
    val __obj = js.Dynamic.literal(isComponent = isComponent.asInstanceOf[js.Any], isHostDirective = true, isInScope = isInScope.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], exposedInputs = null, exposedOutputs = null, ngModule = null, selector = null)
    __obj.asInstanceOf[typings.angularCompilerCli.anon.DirectiveSymbolBaseisHostExposedInputs]
  }
  
  inline def DomBindingSymbol(host: ElementSymbol | TemplateSymbol, kind: DomBinding): typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.DomBindingSymbol = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.DomBindingSymbol]
  }
  
  inline def ElementSymbol(
    directives: js.Array[DirectiveSymbol],
    kind: Element,
    tcbLocation: TcbLocation,
    templateNode: TmplAstElement,
    tsType: Type
  ): typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ElementSymbol = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], templateNode = templateNode.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ElementSymbol]
  }
  
  inline def ExpressionSymbol(kind: Expression, tcbLocation: TcbLocation, tsType: Type): typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ExpressionSymbol = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ExpressionSymbol]
  }
  
  inline def InputBindingSymbol(bindings: js.Array[BindingSymbol], kind: Input): typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.InputBindingSymbol = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.InputBindingSymbol]
  }
  
  inline def OutputBindingSymbol(bindings: js.Array[BindingSymbol], kind: Output): typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.OutputBindingSymbol = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.OutputBindingSymbol]
  }
  
  inline def PipeSymbol(classSymbol: ClassSymbol, kind: Pipe, tcbLocation: TcbLocation, tsType: Type): typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.PipeSymbol = {
    val __obj = js.Dynamic.literal(classSymbol = classSymbol.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.PipeSymbol]
  }
  
  inline def ReferenceSymbol(
    declaration: TmplAstReference,
    kind: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Reference,
    referenceVarLocation: TcbLocation,
    target: TmplAstElement | TmplAstTemplate | ClassDeclaration,
    targetLocation: TcbLocation,
    tsSymbol: typings.typescript.mod.Symbol,
    tsType: Type
  ): typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ReferenceSymbol = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], referenceVarLocation = referenceVarLocation.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetLocation = targetLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ReferenceSymbol]
  }
  
  inline def TemplateSymbol(directives: js.Array[DirectiveSymbol], kind: Template, templateNode: TmplAstTemplate): typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TemplateSymbol = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], templateNode = templateNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TemplateSymbol]
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
