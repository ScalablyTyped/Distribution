package typings.angularDashDeferredDashBootstrap.angular

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeferredBootstrapperStatic extends js.Object {
  def bootstrap(configParam: IConfigParam): IPromise[Boolean]
}

object IDeferredBootstrapperStatic {
  @scala.inline
  def apply(bootstrap: IConfigParam => IPromise[Boolean]): IDeferredBootstrapperStatic = {
    val __obj = js.Dynamic.literal(bootstrap = js.Any.fromFunction1(bootstrap))
  
    __obj.asInstanceOf[IDeferredBootstrapperStatic]
  }
}

