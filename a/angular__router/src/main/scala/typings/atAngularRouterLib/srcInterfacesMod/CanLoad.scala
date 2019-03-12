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

object CanLoad {
  @scala.inline
  def apply(
    canLoad: (atAngularRouterLib.srcConfigMod.Route, js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment]) => rxjsLib.rxjsMod.Observable[scala.Boolean] | js.Promise[scala.Boolean] | scala.Boolean
  ): CanLoad = {
    val __obj = js.Dynamic.literal(canLoad = js.Any.fromFunction2(canLoad))
  
    __obj.asInstanceOf[CanLoad]
  }
}

