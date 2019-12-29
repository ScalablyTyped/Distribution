package typings.atAngularCompiler

import typings.atAngularCompiler.srcUrlUnderscoreResolverMod.UrlResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/style_url_resolver", JSImport.Namespace)
@js.native
object srcStyleUnderscoreUrlUnderscoreResolverMod extends js.Object {
  @js.native
  class StyleWithImports protected () extends js.Object {
    def this(style: String, styleUrls: js.Array[String]) = this()
    var style: String = js.native
    var styleUrls: js.Array[String] = js.native
  }
  
  def extractStyleUrls(resolver: UrlResolver, baseUrl: String, cssText: String): StyleWithImports = js.native
  def isStyleUrlResolvable(url: String): Boolean = js.native
}

