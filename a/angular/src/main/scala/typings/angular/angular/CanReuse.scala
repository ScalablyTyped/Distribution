package typings.angular.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines route lifecycle method `routerCanReuse`, which is called by the router to determine
  * whether a
  * component should be reused across routes, or whether to destroy and instantiate a new component.
  *
  * The `routerCanReuse` hook is called with two {@link ComponentInstruction}s as parameters, the
  * first
  * representing the current route being navigated to, and the second parameter representing the
  * previous route.
  *
  * If `routerCanReuse` returns or resolves to `true`, the component instance will be reused and the
  * {@link OnDeactivate} hook will be run. If `routerCanReuse` returns or resolves to `false`, a new
  * component will be instantiated, and the existing component will be deactivated and removed as
  * part of the navigation.
  *
  * If `routerCanReuse` throws or rejects, the navigation will be cancelled.
  *
  * ### Example
  * {@example router/ts/reuse/reuse_example.ts region='reuseCmp'}
  */
@js.native
trait CanReuse extends js.Object {
  
  @JSName("$routerCanReuse")
  def $routerCanReuse(): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ js.Any) = js.native
  @JSName("$routerCanReuse")
  def $routerCanReuse(next: js.UndefOr[scala.Nothing], prev: ComponentInstruction): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ js.Any) = js.native
  @JSName("$routerCanReuse")
  def $routerCanReuse(next: ComponentInstruction): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ js.Any) = js.native
  @JSName("$routerCanReuse")
  def $routerCanReuse(next: ComponentInstruction, prev: ComponentInstruction): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ js.Any) = js.native
}
