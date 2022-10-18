package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscImportsSrcFindExportMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/imports/src/find_export", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findExportedNameOfNode(target: Node, file: SourceFile, reflector: ReflectionHost): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExportedNameOfNode")(target.asInstanceOf[js.Any], file.asInstanceOf[js.Any], reflector.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
