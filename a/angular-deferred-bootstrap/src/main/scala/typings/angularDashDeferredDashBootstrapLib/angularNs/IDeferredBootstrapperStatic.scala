package typings
package angularDashDeferredDashBootstrapLib.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeferredBootstrapperStatic extends js.Object {
  def bootstrap(configParam: IConfigParam): angularLib.angularMod.angularNs.IPromise[scala.Boolean]
}

object IDeferredBootstrapperStatic {
  @scala.inline
  def apply(bootstrap: js.Function1[IConfigParam, angularLib.angularMod.angularNs.IPromise[scala.Boolean]]): IDeferredBootstrapperStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bootstrap")(bootstrap)
    __obj.asInstanceOf[IDeferredBootstrapperStatic]
  }
}

