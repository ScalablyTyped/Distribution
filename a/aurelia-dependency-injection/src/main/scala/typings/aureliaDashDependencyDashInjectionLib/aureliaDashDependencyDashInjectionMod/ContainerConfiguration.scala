package typings
package aureliaDashDependencyDashInjectionLib.aureliaDashDependencyDashInjectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerConfiguration extends js.Object {
  var handlers: js.UndefOr[stdLib.Map[_, _]] = js.undefined
  /**
    * An optional callback which will be called when any function needs an InvocationHandler created (called once per Function).
    */
  var onHandlerCreated: js.UndefOr[js.Function1[/* handler */ InvocationHandler, InvocationHandler]] = js.undefined
}

object ContainerConfiguration {
  @scala.inline
  def apply(
    handlers: stdLib.Map[_, _] = null,
    onHandlerCreated: js.Function1[/* handler */ InvocationHandler, InvocationHandler] = null
  ): ContainerConfiguration = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers)
    if (onHandlerCreated != null) __obj.updateDynamic("onHandlerCreated")(onHandlerCreated)
    __obj.asInstanceOf[ContainerConfiguration]
  }
}

