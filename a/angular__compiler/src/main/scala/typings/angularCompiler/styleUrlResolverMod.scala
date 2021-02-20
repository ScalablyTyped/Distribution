package typings.angularCompiler

import typings.angularCompiler.urlResolverMod.UrlResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleUrlResolverMod {
  
  @JSImport("@angular/compiler/src/style_url_resolver", "StyleWithImports")
  @js.native
  class StyleWithImports protected () extends StObject {
    def this(style: String, styleUrls: js.Array[String]) = this()
    
    var style: String = js.native
    
    var styleUrls: js.Array[String] = js.native
  }
  
  @JSImport("@angular/compiler/src/style_url_resolver", "extractStyleUrls")
  @js.native
  def extractStyleUrls(resolver: UrlResolver, baseUrl: String, cssText: String): StyleWithImports = js.native
  
  @JSImport("@angular/compiler/src/style_url_resolver", "isStyleUrlResolvable")
  @js.native
  def isStyleUrlResolvable(url: String): Boolean = js.native
}
