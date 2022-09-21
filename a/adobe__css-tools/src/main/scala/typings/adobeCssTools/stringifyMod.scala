package typings.adobeCssTools

import typings.adobeCssTools.typeMod.CssStylesheetAST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyMod {
  
  @JSImport("@adobe/css-tools/dist/cjs/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: CssStylesheetAST): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def default_0(
    node: CssStylesheetAST,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (options : @adobe/css-tools.anon.Compress | undefined): @adobe/css-tools.@adobe/css-tools/dist/cjs/stringify/compiler.default>[0] */ js.Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
