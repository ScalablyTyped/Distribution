package typings.angularCompilerCli.symbolsMod

import typings.angularCompiler.mod.TmplAstElement
import typings.angularCompiler.mod.TmplAstReference
import typings.angularCompiler.mod.TmplAstTemplate
import typings.angularCompiler.mod.TmplAstVariable
import typings.angularCompilerCli.srcTypescriptMod.SymbolWithValueDeclaration
import typings.angularCompilerCli.symbolsMod.SymbolKind.Directive
import typings.angularCompilerCli.symbolsMod.SymbolKind.DomBinding
import typings.angularCompilerCli.symbolsMod.SymbolKind.Element
import typings.angularCompilerCli.symbolsMod.SymbolKind.Expression
import typings.angularCompilerCli.symbolsMod.SymbolKind.Input
import typings.angularCompilerCli.symbolsMod.SymbolKind.Output
import typings.angularCompilerCli.symbolsMod.SymbolKind.Pipe
import typings.angularCompilerCli.symbolsMod.SymbolKind.Reference
import typings.angularCompilerCli.symbolsMod.SymbolKind.Template
import typings.angularCompilerCli.symbolsMod.SymbolKind.Variable
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.angularCompilerCli.symbolsMod.InputBindingSymbol
  - typings.angularCompilerCli.symbolsMod.OutputBindingSymbol
  - typings.angularCompilerCli.symbolsMod.ElementSymbol
  - typings.angularCompilerCli.symbolsMod.ReferenceSymbol
  - typings.angularCompilerCli.symbolsMod.VariableSymbol
  - typings.angularCompilerCli.symbolsMod.ExpressionSymbol
  - typings.angularCompilerCli.symbolsMod.DirectiveSymbol
  - typings.angularCompilerCli.symbolsMod.TemplateSymbol
  - typings.angularCompilerCli.symbolsMod.DomBindingSymbol
  - typings.angularCompilerCli.symbolsMod.PipeSymbol
*/
trait Symbol extends StObject
object Symbol {
  
  inline def DirectiveSymbol(
    isComponent: Boolean,
    isStructural: Boolean,
    kind: Directive,
    selector: String,
    tcbLocation: TcbLocation,
    tsSymbol: SymbolWithValueDeclaration,
    tsType: Type
  ): typings.angularCompilerCli.symbolsMod.DirectiveSymbol = {
    val __obj = js.Dynamic.literal(isComponent = isComponent.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], ngModule = null)
    __obj.asInstanceOf[typings.angularCompilerCli.symbolsMod.DirectiveSymbol]
  }
  
  inline def DomBindingSymbol(host: ElementSymbol | TemplateSymbol, kind: DomBinding): typings.angularCompilerCli.symbolsMod.DomBindingSymbol = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.symbolsMod.DomBindingSymbol]
  }
  
  inline def ElementSymbol(
    directives: js.Array[DirectiveSymbol],
    kind: Element,
    tcbLocation: TcbLocation,
    templateNode: TmplAstElement,
    tsType: Type
  ): typings.angularCompilerCli.symbolsMod.ElementSymbol = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], templateNode = templateNode.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[typings.angularCompilerCli.symbolsMod.ElementSymbol]
  }
  
  inline def ExpressionSymbol(kind: Expression, tcbLocation: TcbLocation, tsType: Type): typings.angularCompilerCli.symbolsMod.ExpressionSymbol = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[typings.angularCompilerCli.symbolsMod.ExpressionSymbol]
  }
  
  inline def InputBindingSymbol(bindings: js.Array[BindingSymbol], kind: Input): typings.angularCompilerCli.symbolsMod.InputBindingSymbol = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.symbolsMod.InputBindingSymbol]
  }
  
  inline def OutputBindingSymbol(bindings: js.Array[BindingSymbol], kind: Output): typings.angularCompilerCli.symbolsMod.OutputBindingSymbol = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.symbolsMod.OutputBindingSymbol]
  }
  
  inline def PipeSymbol(classSymbol: ClassSymbol, kind: Pipe, tcbLocation: TcbLocation, tsType: Type): typings.angularCompilerCli.symbolsMod.PipeSymbol = {
    val __obj = js.Dynamic.literal(classSymbol = classSymbol.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], tcbLocation = tcbLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[typings.angularCompilerCli.symbolsMod.PipeSymbol]
  }
  
  inline def ReferenceSymbol(
    declaration: TmplAstReference,
    kind: Reference,
    referenceVarLocation: TcbLocation,
    target: TmplAstElement | TmplAstTemplate | ClassDeclaration,
    targetLocation: TcbLocation,
    tsSymbol: typings.typescript.mod.Symbol,
    tsType: Type
  ): typings.angularCompilerCli.symbolsMod.ReferenceSymbol = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], referenceVarLocation = referenceVarLocation.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetLocation = targetLocation.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.symbolsMod.ReferenceSymbol]
  }
  
  inline def TemplateSymbol(directives: js.Array[DirectiveSymbol], kind: Template, templateNode: TmplAstTemplate): typings.angularCompilerCli.symbolsMod.TemplateSymbol = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], templateNode = templateNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.angularCompilerCli.symbolsMod.TemplateSymbol]
  }
  
  inline def VariableSymbol(
    declaration: TmplAstVariable,
    initializerLocation: TcbLocation,
    kind: Variable,
    localVarLocation: TcbLocation,
    tsType: Type
  ): typings.angularCompilerCli.symbolsMod.VariableSymbol = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], initializerLocation = initializerLocation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], localVarLocation = localVarLocation.asInstanceOf[js.Any], tsType = tsType.asInstanceOf[js.Any], tsSymbol = null)
    __obj.asInstanceOf[typings.angularCompilerCli.symbolsMod.VariableSymbol]
  }
}
