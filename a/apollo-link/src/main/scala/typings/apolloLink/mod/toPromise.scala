package typings.apolloLink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "toPromise")
@js.native
object toPromise extends js.Object {
  def apply[R](observable: typings.zenObservableTs.zenObservableMod.Observable[R]): js.Promise[R] = js.native
}

