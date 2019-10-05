package typings.atAngularCompiler.publicUnderscoreApiMod

import typings.atAngularCompiler.srcUrlUnderscoreResolverMod.UrlResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/public_api", "UrlResolver")
@js.native
class UrlResolverCls () extends UrlResolver {
  def this(packagePrefix: String) = this()
  /* CompleteClass */
  override def resolve(baseUrl: String, url: String): String = js.native
}

