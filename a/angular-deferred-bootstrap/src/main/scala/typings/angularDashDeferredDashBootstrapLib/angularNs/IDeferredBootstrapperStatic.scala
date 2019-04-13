package typings
package angularDashDeferredDashBootstrapLib.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeferredBootstrapperStatic extends js.Object {
  def bootstrap(configParam: IConfigParam): angularLib.angularMod.IPromise[scala.Boolean]
}

object IDeferredBootstrapperStatic {
  @scala.inline
  def apply(bootstrap: IConfigParam => angularLib.angularMod.IPromise[scala.Boolean]): IDeferredBootstrapperStatic = {
    val __obj = js.Dynamic.literal(bootstrap = js.Any.fromFunction1(bootstrap))
  
    __obj.asInstanceOf[IDeferredBootstrapperStatic]
  }
}

