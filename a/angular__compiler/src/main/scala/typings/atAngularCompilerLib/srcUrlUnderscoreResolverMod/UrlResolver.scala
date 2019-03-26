package typings
package atAngularCompilerLib.srcUrlUnderscoreResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlResolver extends js.Object {
  def resolve(baseUrl: java.lang.String, url: java.lang.String): java.lang.String
}

@JSImport("@angular/compiler/src/url_resolver", "UrlResolver")
@js.native
class UrlResolverCls () extends UrlResolver {
  def this(packagePrefix: java.lang.String) = this()
  /* CompleteClass */
  override def resolve(baseUrl: java.lang.String, url: java.lang.String): java.lang.String = js.native
}

object UrlResolver {
  @scala.inline
  def apply(resolve: (java.lang.String, java.lang.String) => java.lang.String): UrlResolver = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction2(resolve))
  
    __obj.asInstanceOf[UrlResolver]
  }
}

