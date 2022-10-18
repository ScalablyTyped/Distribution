package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IndexedComponent
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIndexerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer", "AbsoluteSourceSpan")
  @js.native
  open class AbsoluteSourceSpan protected ()
    extends typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.AbsoluteSourceSpan {
    def this(start: Double, end: Double) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer", "IdentifierKind")
  @js.native
  object IdentifierKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind & Double] = js.native
    
    /* 4 */ val Attribute: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Attribute & Double = js.native
    
    /* 2 */ val Element: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Element & Double = js.native
    
    /* 1 */ val Method: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Method & Double = js.native
    
    /* 0 */ val Property: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Property & Double = js.native
    
    /* 5 */ val Reference: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Reference & Double = js.native
    
    /* 3 */ val Template: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Template & Double = js.native
    
    /* 6 */ val Variable: typings.angularCompilerCli.srcNgtscIndexerSrcApiMod.IdentifierKind.Variable & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer", "IndexingContext")
  @js.native
  open class IndexingContext ()
    extends typings.angularCompilerCli.srcNgtscIndexerSrcContextMod.IndexingContext
  
  inline def generateAnalysis(context: typings.angularCompilerCli.srcNgtscIndexerSrcContextMod.IndexingContext): Map[DeclarationNode, IndexedComponent] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAnalysis")(context.asInstanceOf[js.Any]).asInstanceOf[Map[DeclarationNode, IndexedComponent]]
}
