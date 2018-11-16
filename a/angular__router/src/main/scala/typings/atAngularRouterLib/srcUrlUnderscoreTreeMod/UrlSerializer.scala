package typings
package atAngularRouterLib.srcUrlUnderscoreTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/src/url_tree", "UrlSerializer")
@js.native
abstract class UrlSerializer () extends js.Object {
  /** Parse a url into a `UrlTree` */
  def parse(url: java.lang.String): UrlTree = js.native
  /** Converts a `UrlTree` into a url */
  def serialize(tree: UrlTree): java.lang.String = js.native
}

