package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "UrlResolver")
@js.native
class UrlResolverCls ()
  extends typings.angularCompiler.urlResolverMod.UrlResolver {
  def this(packagePrefix: String) = this()
  /* CompleteClass */
  override def resolve(baseUrl: String, url: String): String = js.native
}

