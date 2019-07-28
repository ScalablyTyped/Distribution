package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/util", JSImport.Namespace)
@js.native
object srcAotUtilMod extends js.Object {
  def createLoweredSymbol(id: Double): String = js.native
  def isGeneratedFile(filePath: String): Boolean = js.native
  def isLoweredSymbol(name: String): Boolean = js.native
  def ngfactoryFilePath(filePath: String): String = js.native
  def ngfactoryFilePath(filePath: String, forceSourceFile: Boolean): String = js.native
  def normalizeGenFileSuffix(srcFileSuffix: String): String = js.native
  def splitTypescriptSuffix(path: String): js.Array[String] = js.native
  def splitTypescriptSuffix(path: String, forceSourceFile: Boolean): js.Array[String] = js.native
  def stripGeneratedFileSuffix(filePath: String): String = js.native
  def stripSummaryForJitFileSuffix(filePath: String): String = js.native
  def stripSummaryForJitNameSuffix(symbolName: String): String = js.native
  def summaryFileName(fileName: String): String = js.native
  def summaryForJitFileName(fileName: String): String = js.native
  def summaryForJitFileName(fileName: String, forceSourceFile: Boolean): String = js.native
  def summaryForJitName(symbolName: String): String = js.native
}

