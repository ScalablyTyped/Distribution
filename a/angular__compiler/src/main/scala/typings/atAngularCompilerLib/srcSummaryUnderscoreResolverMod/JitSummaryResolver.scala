package typings
package atAngularCompilerLib.srcSummaryUnderscoreResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/summary_resolver", "JitSummaryResolver")
@js.native
class JitSummaryResolver ()
  extends SummaryResolver[atAngularCompilerLib.srcCoreMod.Type] {
  var _summaries: js.Any = js.native
  def fromSummaryFileName(fileName: java.lang.String): java.lang.String = js.native
  def getSymbolsOf(): js.Array[atAngularCompilerLib.srcCoreMod.Type] = js.native
  def isLibraryFile(): scala.Boolean = js.native
  def toSummaryFileName(fileName: java.lang.String): java.lang.String = js.native
}

