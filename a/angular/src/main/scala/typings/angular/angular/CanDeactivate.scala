package typings.angular.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines route lifecycle method `routerCanDeactivate`, which is called by the router to determine
  * if a component can be removed as part of a navigation.
  *
  * The `routerCanDeactivate` hook is called with two {@link ComponentInstruction}s as parameters,
  * the
  * first representing the current route being navigated to, and the second parameter
  * representing the previous route.
  *
  * If `routerCanDeactivate` returns or resolves to `false`, the navigation is cancelled. If it
  * returns or
  * resolves to `true`, then the navigation continues, and the component will be deactivated
  * (the {@link OnDeactivate} hook will be run) and removed.
  *
  * If `routerCanDeactivate` throws or rejects, the navigation is also cancelled.
  *
  * ### Example
  * {@example router/ts/can_deactivate/can_deactivate_example.ts region='routerCanDeactivate'}
  */
@js.native
trait CanDeactivate extends js.Object {
  
  @JSName("$routerCanDeactivate")
  def $routerCanDeactivate(): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ js.Any) = js.native
  @JSName("$routerCanDeactivate")
  def $routerCanDeactivate(next: js.UndefOr[scala.Nothing], prev: ComponentInstruction): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ js.Any) = js.native
  @JSName("$routerCanDeactivate")
  def $routerCanDeactivate(next: ComponentInstruction): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ js.Any) = js.native
  @JSName("$routerCanDeactivate")
  def $routerCanDeactivate(next: ComponentInstruction, prev: ComponentInstruction): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ js.Any) = js.native
}
