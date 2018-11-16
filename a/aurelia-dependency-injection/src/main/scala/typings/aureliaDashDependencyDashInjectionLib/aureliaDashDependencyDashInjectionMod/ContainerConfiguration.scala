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

