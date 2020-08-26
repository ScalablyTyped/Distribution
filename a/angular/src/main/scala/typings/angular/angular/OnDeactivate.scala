package typings.angular.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines route lifecycle method `routerOnDeactivate`, which is called by the router before
  * destroying
  * a component as part of a route change.
  *
  * The `routerOnDeactivate` hook is called with two {@link ComponentInstruction}s as parameters, the
  * first
  * representing the current route being navigated to, and the second parameter representing the
  * previous route.
  *
  * If `routerOnDeactivate` returns a promise, the route change will wait until the promise settles.
  *
  * ### Example
  * {@example router/ts/on_deactivate/on_deactivate_example.ts region='routerOnDeactivate'}
  */
@js.native
trait OnDeactivate extends js.Object {
  @JSName("$routerOnDeactivate")
  def $routerOnDeactivate(): js.Any = js.native
  @JSName("$routerOnDeactivate")
  def $routerOnDeactivate(next: js.UndefOr[scala.Nothing], prev: ComponentInstruction): js.Any = js.native
  @JSName("$routerOnDeactivate")
  def $routerOnDeactivate(next: ComponentInstruction): js.Any = js.native
  @JSName("$routerOnDeactivate")
  def $routerOnDeactivate(next: ComponentInstruction, prev: ComponentInstruction): js.Any = js.native
}

