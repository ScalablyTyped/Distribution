package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckApiMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api", "CompletionKind")
  @js.native
  object CompletionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.CompletionKind & Double
      ] = js.native
    
    /* 0 */ val Reference: typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.CompletionKind.Reference & Double = js.native
    
    /* 1 */ val Variable: typings.angularCompilerCli.srcNgtscTypecheckApiCompletionMod.CompletionKind.Variable & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api", "OptimizeFor")
  @js.native
  object OptimizeFor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.OptimizeFor & Double] = js.native
    
    /* 0 */ val SingleFile: typings.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.OptimizeFor.SingleFile & Double = js.native
    
    /* 1 */ val WholeProgram: typings.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.OptimizeFor.WholeProgram & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api", "PotentialImportKind")
  @js.native
  object PotentialImportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.PotentialImportKind & Double
      ] = js.native
    
    /* 0 */ val NgModule: typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.PotentialImportKind.NgModule & Double = js.native
    
    /* 1 */ val Standalone: typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.PotentialImportKind.Standalone & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api", "PotentialImportMode")
  @js.native
  object PotentialImportMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.PotentialImportMode & Double
      ] = js.native
    
    /* 1 */ val ForceDirect: typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.PotentialImportMode.ForceDirect & Double = js.native
    
    /* 0 */ val Normal: typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.PotentialImportMode.Normal & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api", "SymbolKind")
  @js.native
  object SymbolKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind & Double] = js.native
    
    /* 2 */ val Binding: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Binding & Double = js.native
    
    /* 5 */ val Directive: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Directive & Double = js.native
    
    /* 9 */ val DomBinding: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.DomBinding & Double = js.native
    
    /* 6 */ val Element: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Element & Double = js.native
    
    /* 8 */ val Expression: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Expression & Double = js.native
    
    /* 0 */ val Input: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Input & Double = js.native
    
    /* 1 */ val Output: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Output & Double = js.native
    
    /* 10 */ val Pipe: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Pipe & Double = js.native
    
    /* 3 */ val Reference: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Reference & Double = js.native
    
    /* 7 */ val Template: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Template & Double = js.native
    
    /* 4 */ val Variable: typings.angularCompilerCli.srcNgtscTypecheckApiSymbolsMod.SymbolKind.Variable & Double = js.native
  }
}
