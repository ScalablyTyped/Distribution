package typings.angularCompilerCli

import typings.angularCompilerCli.indexerSrcApiMod.IndexedComponent
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer", "AbsoluteSourceSpan")
  @js.native
  open class AbsoluteSourceSpan protected ()
    extends typings.angularCompilerCli.indexerSrcApiMod.AbsoluteSourceSpan {
    def this(start: Double, end: Double) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer", "IdentifierKind")
  @js.native
  object IdentifierKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind & Double] = js.native
    
    /* 4 */ val Attribute: typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Attribute & Double = js.native
    
    /* 2 */ val Element: typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Element & Double = js.native
    
    /* 1 */ val Method: typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Method & Double = js.native
    
    /* 0 */ val Property: typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Property & Double = js.native
    
    /* 5 */ val Reference: typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Reference & Double = js.native
    
    /* 3 */ val Template: typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Template & Double = js.native
    
    /* 6 */ val Variable: typings.angularCompilerCli.indexerSrcApiMod.IdentifierKind.Variable & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer", "IndexingContext")
  @js.native
  open class IndexingContext ()
    extends typings.angularCompilerCli.contextMod.IndexingContext
  
  inline def generateAnalysis(context: typings.angularCompilerCli.contextMod.IndexingContext): Map[DeclarationNode, IndexedComponent] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAnalysis")(context.asInstanceOf[js.Any]).asInstanceOf[Map[DeclarationNode, IndexedComponent]]
}
