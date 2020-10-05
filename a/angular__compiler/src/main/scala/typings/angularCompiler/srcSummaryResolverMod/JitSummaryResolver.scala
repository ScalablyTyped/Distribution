package typings.angularCompiler.srcSummaryResolverMod

import typings.angularCompiler.coreMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/summary_resolver", "JitSummaryResolver")
@js.native
class JitSummaryResolver () extends SummaryResolver[Type] {
  var _summaries: js.Any = js.native
  def fromSummaryFileName(fileName: String): String = js.native
  def getSymbolsOf(): js.Array[Type] = js.native
  def isLibraryFile(): Boolean = js.native
  def toSummaryFileName(fileName: String): String = js.native
}

