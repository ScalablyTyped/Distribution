package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "PreloadingStrategy")
@js.native
abstract class PreloadingStrategy () extends js.Object {
  def preload(route: Route, fn: js.Function0[rxjsLib.rxjsMod.Observable[_]]): rxjsLib.rxjsMod.Observable[_] = js.native
}

