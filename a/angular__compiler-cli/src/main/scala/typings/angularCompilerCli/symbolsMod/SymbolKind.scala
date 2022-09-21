package typings.angularCompilerCli.symbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolKind extends StObject
@JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api/symbols", "SymbolKind")
@js.native
object SymbolKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolKind & Double] = js.native
  
  @js.native
  sealed trait Binding
    extends StObject
       with SymbolKind
  /* 2 */ val Binding: typings.angularCompilerCli.symbolsMod.SymbolKind.Binding & Double = js.native
  
  @js.native
  sealed trait Directive
    extends StObject
       with SymbolKind
  /* 5 */ val Directive: typings.angularCompilerCli.symbolsMod.SymbolKind.Directive & Double = js.native
  
  @js.native
  sealed trait DomBinding
    extends StObject
       with SymbolKind
  /* 9 */ val DomBinding: typings.angularCompilerCli.symbolsMod.SymbolKind.DomBinding & Double = js.native
  
  @js.native
  sealed trait Element
    extends StObject
       with SymbolKind
  /* 6 */ val Element: typings.angularCompilerCli.symbolsMod.SymbolKind.Element & Double = js.native
  
  @js.native
  sealed trait Expression
    extends StObject
       with SymbolKind
  /* 8 */ val Expression: typings.angularCompilerCli.symbolsMod.SymbolKind.Expression & Double = js.native
  
  @js.native
  sealed trait Input
    extends StObject
       with SymbolKind
  /* 0 */ val Input: typings.angularCompilerCli.symbolsMod.SymbolKind.Input & Double = js.native
  
  @js.native
  sealed trait Output
    extends StObject
       with SymbolKind
  /* 1 */ val Output: typings.angularCompilerCli.symbolsMod.SymbolKind.Output & Double = js.native
  
  @js.native
  sealed trait Pipe
    extends StObject
       with SymbolKind
  /* 10 */ val Pipe: typings.angularCompilerCli.symbolsMod.SymbolKind.Pipe & Double = js.native
  
  @js.native
  sealed trait Reference
    extends StObject
       with SymbolKind
  /* 3 */ val Reference: typings.angularCompilerCli.symbolsMod.SymbolKind.Reference & Double = js.native
  
  @js.native
  sealed trait Template
    extends StObject
       with SymbolKind
  /* 7 */ val Template: typings.angularCompilerCli.symbolsMod.SymbolKind.Template & Double = js.native
  
  @js.native
  sealed trait Variable
    extends StObject
       with SymbolKind
  /* 4 */ val Variable: typings.angularCompilerCli.symbolsMod.SymbolKind.Variable & Double = js.native
}
