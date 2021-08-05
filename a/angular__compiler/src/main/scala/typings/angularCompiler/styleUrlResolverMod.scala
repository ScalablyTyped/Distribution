package typings.angularCompiler

import typings.angularCompiler.urlResolverMod.UrlResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleUrlResolverMod {
  
  @JSImport("@angular/compiler/src/style_url_resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/style_url_resolver", "StyleWithImports")
  @js.native
  class StyleWithImports protected () extends StObject {
    def this(style: String, styleUrls: js.Array[String]) = this()
    
    var style: String = js.native
    
    var styleUrls: js.Array[String] = js.native
  }
  
  inline def extractStyleUrls(resolver: UrlResolver, baseUrl: String, cssText: String): StyleWithImports = (^.asInstanceOf[js.Dynamic].applyDynamic("extractStyleUrls")(resolver.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any], cssText.asInstanceOf[js.Any])).asInstanceOf[StyleWithImports]
  
  inline def isStyleUrlResolvable(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyleUrlResolvable")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
