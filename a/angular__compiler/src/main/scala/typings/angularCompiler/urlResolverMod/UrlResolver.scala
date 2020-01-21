package typings.angularCompiler.urlResolverMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlResolver extends js.Object {
  def resolve(baseUrl: String, url: String): String
}

@JSImport("@angular/compiler/src/url_resolver", "UrlResolver")
@js.native
object UrlResolver extends TopLevel[UrlResolverCtor]

