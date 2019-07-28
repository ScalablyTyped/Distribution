package typings.atAngularRouter.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "UrlSerializer")
@js.native
abstract class UrlSerializer () extends js.Object {
  /** Parse a url into a `UrlTree` */
  def parse(url: String): UrlTree = js.native
  /** Converts a `UrlTree` into a url */
  def serialize(tree: UrlTree): String = js.native
}

