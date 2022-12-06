package typings.angularCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsParseHtmlMod {
  
  @JSImport("@angular/core/schematics/utils/parse_html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseHtmlGracefully(
    htmlContent: String,
    filePath: String,
    compilerModule: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_compiler */ Any
  ): (js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstNode */ Any
  ]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHtmlGracefully")(htmlContent.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], compilerModule.asInstanceOf[js.Any])).asInstanceOf[(js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TmplAstNode */ Any
  ]) | Null]
}
