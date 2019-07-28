package typings.atAngularCompiler.srcUrlUnderscoreResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlResolver extends js.Object {
  def resolve(baseUrl: String, url: String): String
}

@JSImport("@angular/compiler/src/url_resolver", "UrlResolver")
@js.native
class UrlResolverCls () extends UrlResolver {
  def this(packagePrefix: String) = this()
  /* CompleteClass */
  override def resolve(baseUrl: String, url: String): String = js.native
}

object UrlResolver {
  @scala.inline
  def apply(resolve: (String, String) => String): UrlResolver = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction2(resolve))
  
    __obj.asInstanceOf[UrlResolver]
  }
}

