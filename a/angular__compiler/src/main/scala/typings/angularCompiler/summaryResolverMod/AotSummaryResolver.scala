package typings.angularCompiler.summaryResolverMod

import typings.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import typings.angularCompiler.staticSymbolMod.StaticSymbolCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/aot/summary_resolver", "AotSummaryResolver")
@js.native
class AotSummaryResolver protected () extends SummaryResolver[StaticSymbol] {
  def this(host: AotSummaryResolverHost, staticSymbolCache: StaticSymbolCache) = this()
  
  var _loadSummaryFile: js.Any = js.native
  
  var host: js.Any = js.native
  
  var importAs: js.Any = js.native
  
  var knownFileNameToModuleNames: js.Any = js.native
  
  var loadedFilePaths: js.Any = js.native
  
  var staticSymbolCache: js.Any = js.native
  
  var summaryCache: js.Any = js.native
}
