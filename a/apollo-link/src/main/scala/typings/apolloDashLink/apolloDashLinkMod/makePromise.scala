package typings.apolloDashLink.apolloDashLinkMod

import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "makePromise")
@js.native
object makePromise extends js.Object {
  def apply[R](observable: Observable[R]): js.Promise[R] = js.native
}

