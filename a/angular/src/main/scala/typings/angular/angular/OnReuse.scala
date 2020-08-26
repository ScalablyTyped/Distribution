package typings.angular.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines route lifecycle method `routerOnReuse`, which is called by the router at the end of a
  * successful route navigation when {@link CanReuse} is implemented and returns or resolves to true.
  *
  * For a single component's navigation, only one of either {@link OnActivate} or {@link OnReuse}
  * will be called, depending on the result of {@link CanReuse}.
  *
  * The `routerOnReuse` hook is called with two {@link ComponentInstruction}s as parameters, the
  * first
  * representing the current route being navigated to, and the second parameter representing the
  * previous route or `null`.
  *
  * ### Example
  * {@example router/ts/reuse/reuse_example.ts region='reuseCmp'}
  */
@js.native
trait OnReuse extends js.Object {
  @JSName("$routerOnReuse")
  def $routerOnReuse(): js.Any = js.native
  @JSName("$routerOnReuse")
  def $routerOnReuse(next: js.UndefOr[scala.Nothing], prev: ComponentInstruction): js.Any = js.native
  @JSName("$routerOnReuse")
  def $routerOnReuse(next: ComponentInstruction): js.Any = js.native
  @JSName("$routerOnReuse")
  def $routerOnReuse(next: ComponentInstruction, prev: ComponentInstruction): js.Any = js.native
}

