package typings.antDashDesignDashPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAuthorizedAuthorizedRouteMod {
  import typings.react.reactMod.Component

  type AuthorizedRoute = Component[IAuthorizedRouteProps, js.Any, js.Any]
  type authority = String | js.Array[String] | authorityFN | js.Promise[js.Any]
  type authorityFN = js.Function1[/* currentAuthority */ js.UndefOr[String], Boolean]
}
