package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@angular/compiler/src/aot/util", "createLoweredSymbol")
  @js.native
  def createLoweredSymbol(id: Double): String = js.native
  
  @JSImport("@angular/compiler/src/aot/util", "isGeneratedFile")
  @js.native
  def isGeneratedFile(filePath: String): Boolean = js.native
  
  @JSImport("@angular/compiler/src/aot/util", "isLoweredSymbol")
  @js.native
  def isLoweredSymbol(name: String): Boolean = js.native
  
  @JSImport("@angular/compiler/src/aot/util", "ngfactoryFilePath")
  @js.native
  def ngfactoryFilePath(filePath: String): String = js.native
  @JSImport("@angular/compiler/src/aot/util", "ngfactoryFilePath")
  @js.native
  def ngfactoryFilePath(filePath: String, forceSourceFile: Boolean): String = js.native
  
  @JSImport("@angular/compiler/src/aot/util", "normalizeGenFileSuffix")
  @js.native
  def normalizeGenFileSuffix(srcFileSuffix: String): String = js.native
  
  @JSImport("@angular/compiler/src/aot/util", "splitTypescriptSuffix")
  @js.native
  def splitTypescriptSuffix(path: String): js.Array[String] = js.native
  @JSImport("@angular/compiler/src/aot/util", "splitTypescriptSuffix")
  @js.native
  def splitTypescriptSuffix(path: String, forceSourceFile: Boolean): js.Array[String] = js.native
  
  @JSImport("@angular/compiler/src/aot/util", "stripGeneratedFileSuffix")
  @js.native
  def stripGeneratedFileSuffix(filePath: String): String = js.native
  
  @JSImport("@angular/compiler/src/aot/util", "stripSummaryForJitFileSuffix")
  @js.native
  def stripSummaryForJitFileSuffix(filePath: String): String = js.native
  
  @JSImport("@angular/compiler/src/aot/util", "stripSummaryForJitNameSuffix")
  @js.native
  def stripSummaryForJitNameSuffix(symbolName: String): String = js.native
  
  @JSImport("@angular/compiler/src/aot/util", "summaryFileName")
  @js.native
  def summaryFileName(fileName: String): String = js.native
  
  @JSImport("@angular/compiler/src/aot/util", "summaryForJitFileName")
  @js.native
  def summaryForJitFileName(fileName: String): String = js.native
  @JSImport("@angular/compiler/src/aot/util", "summaryForJitFileName")
  @js.native
  def summaryForJitFileName(fileName: String, forceSourceFile: Boolean): String = js.native
  
  @JSImport("@angular/compiler/src/aot/util", "summaryForJitName")
  @js.native
  def summaryForJitName(symbolName: String): String = js.native
}
