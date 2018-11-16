package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/util", JSImport.Namespace)
@js.native
object srcAotUtilMod extends js.Object {
  def createLoweredSymbol(id: scala.Double): java.lang.String = js.native
  def isGeneratedFile(filePath: java.lang.String): scala.Boolean = js.native
  def isLoweredSymbol(name: java.lang.String): scala.Boolean = js.native
  def ngfactoryFilePath(filePath: java.lang.String): java.lang.String = js.native
  def ngfactoryFilePath(filePath: java.lang.String, forceSourceFile: scala.Boolean): java.lang.String = js.native
  def normalizeGenFileSuffix(srcFileSuffix: java.lang.String): java.lang.String = js.native
  def splitTypescriptSuffix(path: java.lang.String): js.Array[java.lang.String] = js.native
  def splitTypescriptSuffix(path: java.lang.String, forceSourceFile: scala.Boolean): js.Array[java.lang.String] = js.native
  def stripGeneratedFileSuffix(filePath: java.lang.String): java.lang.String = js.native
  def stripSummaryForJitFileSuffix(filePath: java.lang.String): java.lang.String = js.native
  def stripSummaryForJitNameSuffix(symbolName: java.lang.String): java.lang.String = js.native
  def summaryFileName(fileName: java.lang.String): java.lang.String = js.native
  def summaryForJitFileName(fileName: java.lang.String): java.lang.String = js.native
  def summaryForJitFileName(fileName: java.lang.String, forceSourceFile: scala.Boolean): java.lang.String = js.native
  def summaryForJitName(symbolName: java.lang.String): java.lang.String = js.native
}

