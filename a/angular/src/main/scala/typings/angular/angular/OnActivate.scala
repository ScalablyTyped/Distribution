package typings.angular.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines route lifecycle method `routerOnActivate`, which is called by the router at the end of a
  * successful route navigation.
  *
  * For a single component's navigation, only one of either {@link OnActivate} or {@link OnReuse}
  * will be called depending on the result of {@link CanReuse}.
  *
  * The `routerOnActivate` hook is called with two {@link ComponentInstruction}s as parameters, the
  * first
  * representing the current route being navigated to, and the second parameter representing the
  * previous route or `null`.
  *
  * If `routerOnActivate` returns a promise, the route change will wait until the promise settles to
  * instantiate and activate child components.
  *
  * ### Example
  * {@example router/ts/on_activate/on_activate_example.ts region='routerOnActivate'}
  */
@js.native
trait OnActivate extends js.Object {
  @JSName("$routerOnActivate")
  def $routerOnActivate(): js.Any = js.native
  @JSName("$routerOnActivate")
  def $routerOnActivate(next: js.UndefOr[scala.Nothing], prev: ComponentInstruction): js.Any = js.native
  @JSName("$routerOnActivate")
  def $routerOnActivate(next: ComponentInstruction): js.Any = js.native
  @JSName("$routerOnActivate")
  def $routerOnActivate(next: ComponentInstruction, prev: ComponentInstruction): js.Any = js.native
}

