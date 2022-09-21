package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typecheckApiMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api", "CompletionKind")
  @js.native
  object CompletionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.apiCompletionMod.CompletionKind & Double] = js.native
    
    /* 0 */ val Reference: typings.angularCompilerCli.apiCompletionMod.CompletionKind.Reference & Double = js.native
    
    /* 1 */ val Variable: typings.angularCompilerCli.apiCompletionMod.CompletionKind.Variable & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api", "OptimizeFor")
  @js.native
  object OptimizeFor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.checkerMod.OptimizeFor & Double] = js.native
    
    /* 0 */ val SingleFile: typings.angularCompilerCli.checkerMod.OptimizeFor.SingleFile & Double = js.native
    
    /* 1 */ val WholeProgram: typings.angularCompilerCli.checkerMod.OptimizeFor.WholeProgram & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api", "SymbolKind")
  @js.native
  object SymbolKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.symbolsMod.SymbolKind & Double] = js.native
    
    /* 2 */ val Binding: typings.angularCompilerCli.symbolsMod.SymbolKind.Binding & Double = js.native
    
    /* 5 */ val Directive: typings.angularCompilerCli.symbolsMod.SymbolKind.Directive & Double = js.native
    
    /* 9 */ val DomBinding: typings.angularCompilerCli.symbolsMod.SymbolKind.DomBinding & Double = js.native
    
    /* 6 */ val Element: typings.angularCompilerCli.symbolsMod.SymbolKind.Element & Double = js.native
    
    /* 8 */ val Expression: typings.angularCompilerCli.symbolsMod.SymbolKind.Expression & Double = js.native
    
    /* 0 */ val Input: typings.angularCompilerCli.symbolsMod.SymbolKind.Input & Double = js.native
    
    /* 1 */ val Output: typings.angularCompilerCli.symbolsMod.SymbolKind.Output & Double = js.native
    
    /* 10 */ val Pipe: typings.angularCompilerCli.symbolsMod.SymbolKind.Pipe & Double = js.native
    
    /* 3 */ val Reference: typings.angularCompilerCli.symbolsMod.SymbolKind.Reference & Double = js.native
    
    /* 7 */ val Template: typings.angularCompilerCli.symbolsMod.SymbolKind.Template & Double = js.native
    
    /* 4 */ val Variable: typings.angularCompilerCli.symbolsMod.SymbolKind.Variable & Double = js.native
  }
}
