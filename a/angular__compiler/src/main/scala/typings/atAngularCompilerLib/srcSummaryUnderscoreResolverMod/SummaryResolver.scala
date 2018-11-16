package typings
package atAngularCompilerLib.srcSummaryUnderscoreResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/summary_resolver", "SummaryResolver")
@js.native
abstract class SummaryResolver[T] () extends js.Object {
  def addSummary(summary: Summary[T]): scala.Unit = js.native
  def fromSummaryFileName(fileName: java.lang.String, referringLibFileName: java.lang.String): java.lang.String = js.native
  def getImportAs(reference: T): T = js.native
  def getKnownModuleName(fileName: java.lang.String): java.lang.String | scala.Null = js.native
  def getSymbolsOf(filePath: java.lang.String): js.Array[T] | scala.Null = js.native
  def isLibraryFile(fileName: java.lang.String): scala.Boolean = js.native
  def resolveSummary(reference: T): Summary[T] | scala.Null = js.native
  def toSummaryFileName(fileName: java.lang.String, referringSrcFileName: java.lang.String): java.lang.String = js.native
}

