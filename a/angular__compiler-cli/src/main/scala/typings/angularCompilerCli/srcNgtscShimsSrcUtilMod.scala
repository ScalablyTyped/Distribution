package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscShimsSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/shims/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generatedModuleName(originalModuleName: String, originalFileName: String, genSuffix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generatedModuleName")(originalModuleName.asInstanceOf[js.Any], originalFileName.asInstanceOf[js.Any], genSuffix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def makeShimFileName(fileName: AbsoluteFsPath, suffix: String): AbsoluteFsPath = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShimFileName")(fileName.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[AbsoluteFsPath]
}
