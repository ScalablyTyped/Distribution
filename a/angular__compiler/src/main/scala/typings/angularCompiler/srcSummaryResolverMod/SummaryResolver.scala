package typings.angularCompiler.srcSummaryResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/summary_resolver", "SummaryResolver")
@js.native
abstract class SummaryResolver[T] () extends js.Object {
  def addSummary(summary: Summary[T]): Unit = js.native
  def fromSummaryFileName(fileName: String, referringLibFileName: String): String = js.native
  def getImportAs(reference: T): T = js.native
  def getKnownModuleName(fileName: String): String | Null = js.native
  def getSymbolsOf(filePath: String): js.Array[T] | Null = js.native
  def isLibraryFile(fileName: String): Boolean = js.native
  def resolveSummary(reference: T): Summary[T] | Null = js.native
  def toSummaryFileName(fileName: String, referringSrcFileName: String): String = js.native
}

