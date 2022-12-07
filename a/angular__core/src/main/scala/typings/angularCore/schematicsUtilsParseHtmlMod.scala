package typings.angularCore

import typings.angularCompiler.mod.TmplAstNode
import typings.angularCore.anon.TypeofimportedCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsParseHtmlMod {
  
  @JSImport("@angular/core/schematics/utils/parse_html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseHtmlGracefully(htmlContent: String, filePath: String, compilerModule: TypeofimportedCompiler): js.Array[TmplAstNode] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlGracefully")(htmlContent.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], compilerModule.asInstanceOf[js.Any])).asInstanceOf[js.Array[TmplAstNode] | Null]
}
