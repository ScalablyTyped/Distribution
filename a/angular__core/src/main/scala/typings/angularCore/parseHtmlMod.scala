package typings.angularCore

import typings.angularCompiler.r3AstMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseHtmlMod {
  
  @JSImport("@angular/core/schematics/utils/parse_html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseHtmlGracefully(htmlContent: String, filePath: String): js.Array[Node] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlGracefully")(htmlContent.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node] | Null]
}
