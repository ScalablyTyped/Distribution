package typings.aureliaDashDependencyDashInjection.aureliaDashDependencyDashInjectionMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerConfiguration extends js.Object {
  var handlers: js.UndefOr[Map[_, _]] = js.undefined
  var onHandlerCreated: js.UndefOr[
    js.Function1[/* handler */ InvocationHandler[_, _, _], InvocationHandler[_, _, _]]
  ] = js.undefined
}

object ContainerConfiguration {
  @scala.inline
  def apply(
    handlers: Map[_, _] = null,
    onHandlerCreated: /* handler */ InvocationHandler[_, _, _] => InvocationHandler[_, _, _] = null
  ): ContainerConfiguration = {
    val __obj = js.Dynamic.literal()
    if (handlers != null) __obj.updateDynamic("handlers")(handlers)
    if (onHandlerCreated != null) __obj.updateDynamic("onHandlerCreated")(js.Any.fromFunction1(onHandlerCreated))
    __obj.asInstanceOf[ContainerConfiguration]
  }
}

