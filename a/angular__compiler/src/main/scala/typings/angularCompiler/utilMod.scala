package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@angular/compiler/src/aot/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createLoweredSymbol(id: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoweredSymbol")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isGeneratedFile(filePath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGeneratedFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isLoweredSymbol(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoweredSymbol")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def ngfactoryFilePath(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ngfactoryFilePath")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def ngfactoryFilePath(filePath: String, forceSourceFile: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ngfactoryFilePath")(filePath.asInstanceOf[js.Any], forceSourceFile.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def normalizeGenFileSuffix(srcFileSuffix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeGenFileSuffix")(srcFileSuffix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def splitTypescriptSuffix(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitTypescriptSuffix")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def splitTypescriptSuffix(path: String, forceSourceFile: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitTypescriptSuffix")(path.asInstanceOf[js.Any], forceSourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def stripGeneratedFileSuffix(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripGeneratedFileSuffix")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def stripSummaryForJitFileSuffix(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripSummaryForJitFileSuffix")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def stripSummaryForJitNameSuffix(symbolName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripSummaryForJitNameSuffix")(symbolName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def summaryFileName(fileName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("summaryFileName")(fileName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def summaryForJitFileName(fileName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("summaryForJitFileName")(fileName.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def summaryForJitFileName(fileName: String, forceSourceFile: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("summaryForJitFileName")(fileName.asInstanceOf[js.Any], forceSourceFile.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def summaryForJitName(symbolName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("summaryForJitName")(symbolName.asInstanceOf[js.Any]).asInstanceOf[String]
}
