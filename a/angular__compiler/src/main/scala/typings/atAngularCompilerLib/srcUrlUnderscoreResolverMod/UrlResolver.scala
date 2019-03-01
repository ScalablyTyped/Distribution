package typings
package atAngularCompilerLib.srcUrlUnderscoreResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlResolver extends js.Object {
  def resolve(baseUrl: java.lang.String, url: java.lang.String): java.lang.String
}

object UrlResolver {
  @scala.inline
  def apply(resolve: js.Function2[java.lang.String, java.lang.String, java.lang.String]): UrlResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[UrlResolver]
  }
}

