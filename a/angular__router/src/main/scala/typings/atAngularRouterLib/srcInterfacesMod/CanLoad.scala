package typings
package atAngularRouterLib.srcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanLoad extends js.Object {
  def canLoad(
    route: atAngularRouterLib.srcConfigMod.Route,
    segments: js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment]
  ): rxjsLib.rxjsMod.Observable[scala.Boolean] | js.Promise[scala.Boolean] | scala.Boolean
}

