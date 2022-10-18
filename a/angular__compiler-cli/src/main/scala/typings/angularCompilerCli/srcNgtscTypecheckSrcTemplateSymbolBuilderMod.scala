package typings.angularCompilerCli

import typings.angularCompiler.mod.AST
import typings.angularCompiler.mod.TmplAstElement
import typings.angularCompiler.mod.TmplAstNode
import typings.angularCompiler.mod.TmplAstReference
import typings.angularCompiler.mod.TmplAstTemplate
import typings.angularCompiler.mod.TmplAstVariable
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ElementSymbol
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.ReferenceSymbol
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.Symbol
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.TemplateSymbol
import typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.VariableSymbol
import typings.angularCompilerCli.srcNgtscTypecheckSrcContextMod.TemplateData
import typings.typescript.mod.Node
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcTemplateSymbolBuilderMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/template_symbol_builder", "SymbolBuilder")
  @js.native
  open class SymbolBuilder protected () extends StObject {
    def this(
      tcbPath: AbsoluteFsPath,
      tcbIsShim: Boolean,
      typeCheckBlock: Node,
      templateData: TemplateData,
      componentScopeReader: ComponentScopeReader,
      getTypeChecker: js.Function0[TypeChecker]
    ) = this()
    
    /* private */ val componentScopeReader: Any = js.native
    
    /* private */ var getDirectiveMeta: Any = js.native
    
    /* private */ var getDirectiveModule: Any = js.native
    
    /* private */ var getDirectiveSymbolForAccessExpression: Any = js.native
    
    /* private */ var getDirectivesOfNode: Any = js.native
    
    def getSymbol(node: AST): Symbol | Null = js.native
    def getSymbol(node: TmplAstElement): TemplateSymbol | ElementSymbol | Null = js.native
    def getSymbol(node: TmplAstNode): Symbol | Null = js.native
    def getSymbol(node: TmplAstReference): ReferenceSymbol | VariableSymbol | Null = js.native
    def getSymbol(node: TmplAstTemplate): TemplateSymbol | ElementSymbol | Null = js.native
    def getSymbol(node: TmplAstVariable): ReferenceSymbol | VariableSymbol | Null = js.native
    
    /* private */ var getSymbolOfAstTemplate: Any = js.native
    
    /* private */ var getSymbolOfBoundEvent: Any = js.native
    
    /* private */ var getSymbolOfElement: Any = js.native
    
    /* private */ var getSymbolOfInputBinding: Any = js.native
    
    /* private */ var getSymbolOfPipe: Any = js.native
    
    /* private */ var getSymbolOfReference: Any = js.native
    
    /* private */ var getSymbolOfTemplateExpression: Any = js.native
    
    /* private */ var getSymbolOfTsNode: Any = js.native
    
    /* private */ var getSymbolOfVariable: Any = js.native
    
    /* private */ var getTcbPositionForNode: Any = js.native
    
    /* private */ val getTypeChecker: Any = js.native
    
    /* private */ var symbolCache: Any = js.native
    
    /* private */ val tcbIsShim: Any = js.native
    
    /* private */ val tcbPath: Any = js.native
    
    /* private */ val templateData: Any = js.native
    
    /* private */ val typeCheckBlock: Any = js.native
  }
}
