package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "PreloadingStrategy")
@js.native
abstract class PreloadingStrategy () extends js.Object {
  def preload(route: Route, fn: js.Function0[Observable_[_]]): Observable_[_] = js.native
}

