package typings.angularCompilerCli

import typings.angularCompilerCli.contextMod.IndexingContext
import typings.angularCompilerCli.indexerSrcApiMod.IndexedComponent
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/indexer/src/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateAnalysis(context: IndexingContext): Map[DeclarationNode, IndexedComponent] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateAnalysis")(context.asInstanceOf[js.Any]).asInstanceOf[Map[DeclarationNode, IndexedComponent]]
}
